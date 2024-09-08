package br.com.fiap.parquimetro.parquimetro.adapters;

import br.com.fiap.parquimetro.parquimetro.domain.veiculo.Veiculo;

import java.util.List;
import java.util.Optional;

public interface VeiculoRepository {

    List<Veiculo> listarTodos();
    Optional<Veiculo> buscarPorPlaca(String placa);
    Veiculo salvar(Veiculo veiculo);
    void deletarPorPlaca(String placa);

}
