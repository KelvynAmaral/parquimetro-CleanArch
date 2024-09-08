package br.com.fiap.parquimetro.parquimetro.aplication.usecases;

import br.com.fiap.parquimetro.parquimetro.adapters.VeiculoRepository;
import br.com.fiap.parquimetro.parquimetro.domain.veiculo.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarVeiculoUseCase {

    private final VeiculoRepository veiculoRepository;

    @Autowired
    public ListarVeiculoUseCase(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public List<Veiculo> listarVeiculos() {
        return veiculoRepository.listarTodos();
    }



}
