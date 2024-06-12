package br.com.fiap.parquimetro.parquimetro.infra.persistense.veiculo;

import br.com.fiap.parquimetro.parquimetro.domain.entities.veiculo.Veiculo;
import br.com.fiap.parquimetro.parquimetro.aplication.gateways.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VeiculoJpaRepository implements VeiculoRepository {

    private final SpringDataJpaVeiculoRepository repository;

    @Autowired
    public VeiculoJpaRepository(SpringDataJpaVeiculoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Veiculo> listarTodos() {
        return repository.findAll();
    }
    @Override
    public Optional<Veiculo> buscarPorPlaca(String placa) {
        return repository.findById(placa);
    }
    @Override
    public Veiculo salvar(Veiculo veiculo) {
        return repository.save(veiculo);
    }
    @Override
    public void deletarPorPlaca(String placa) {
        repository.deleteById(placa);
    }



}
