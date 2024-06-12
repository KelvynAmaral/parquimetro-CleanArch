package br.com.fiap.parquimetro.parquimetro.aplication.gateways;

import br.com.fiap.parquimetro.parquimetro.domain.entities.veiculo.Veiculo;

import java.util.List;
import java.util.Optional;

public interface VeiculoRepository {

    List<Veiculo> listarTodos();
    Optional<Veiculo> buscarPorPlaca(String placa);
    Veiculo salvar(Veiculo veiculo);
    void deletarPorPlaca(String placa);

}
