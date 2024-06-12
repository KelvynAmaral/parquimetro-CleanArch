package br.com.fiap.parquimetro.parquimetro.infra.persistense.vaga;

import br.com.fiap.parquimetro.parquimetro.domain.entities.vaga.Vaga;
import br.com.fiap.parquimetro.parquimetro.aplication.gateways.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VagaJpaRepository implements VagaRepository{

    private final SpringDataJpaVagaRepository repository;

    @Autowired
    public VagaJpaRepository(SpringDataJpaVagaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Vaga> listarTodos() {
        return repository.findAll();
    }

    @Override
    public Optional<Vaga> buscarPorId(long idVaga) {
        return repository.findById(idVaga);
    }

    @Override
    public Vaga salvar(Vaga vaga) {
        return repository.save(vaga);
    }

    @Override
    public void deletarPorId(long idVaga) {
        repository.deleteById(idVaga);
    }
}
