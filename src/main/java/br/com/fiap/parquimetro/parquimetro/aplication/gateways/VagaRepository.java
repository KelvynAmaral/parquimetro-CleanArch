package br.com.fiap.parquimetro.parquimetro.aplication.gateways;

import br.com.fiap.parquimetro.parquimetro.domain.entities.vaga.Vaga;

import java.util.List;
import java.util.Optional;

public interface VagaRepository {
    List<Vaga> listarTodos();
    Optional<Vaga> buscarPorId(long idVaga);
    Vaga salvar(Vaga vaga);
    void deletarPorId(long idVaga);
}
