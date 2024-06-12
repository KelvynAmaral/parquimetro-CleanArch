package br.com.fiap.parquimetro.parquimetro.infra.controller;

import br.com.fiap.parquimetro.parquimetro.infra.persistense.veiculo.VeiculoJpaRepository;
import br.com.fiap.parquimetro.parquimetro.aplication.usecases.ListarVeiculoUseCase;
import br.com.fiap.parquimetro.parquimetro.aplication.usecases.RegistrarVeiculoUseCase;
import br.com.fiap.parquimetro.parquimetro.domain.entities.veiculo.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    private final ListarVeiculoUseCase listarVeiculoUseCase;
    private final RegistrarVeiculoUseCase registrarVeiculoUseCase;
    private final VeiculoJpaRepository veiculoJpaRepository;

    @Autowired
    public VeiculoController(ListarVeiculoUseCase listarVeiculoUseCase, RegistrarVeiculoUseCase registrarVeiculoUseCase, VeiculoJpaRepository veiculoJpaRepository) {
        this.listarVeiculoUseCase = listarVeiculoUseCase;
        this.registrarVeiculoUseCase = registrarVeiculoUseCase;
        this.veiculoJpaRepository = veiculoJpaRepository;
    }

    @GetMapping
    public List<Veiculo> listarTodos() {
        return listarVeiculoUseCase.listarVeiculos();
    }

    @PostMapping
    public ResponseEntity<Veiculo> salvar(@RequestBody Veiculo veiculo) {
        Veiculo novoVeiculo = registrarVeiculoUseCase.registrarVeiculo(veiculo);
        return new ResponseEntity<>(novoVeiculo, HttpStatus.CREATED);
    }
    @GetMapping("/{placa}")
    public ResponseEntity<Veiculo> obterVeiculo(@PathVariable String placa) {
        return veiculoJpaRepository.buscarPorPlaca(placa)
                .map(veiculo -> new ResponseEntity<>(veiculo, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
