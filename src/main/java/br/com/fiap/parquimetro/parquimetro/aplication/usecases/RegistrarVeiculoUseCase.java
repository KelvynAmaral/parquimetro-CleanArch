package br.com.fiap.parquimetro.parquimetro.aplication.usecases;

import br.com.fiap.parquimetro.parquimetro.adapters.VeiculoRepository;
import br.com.fiap.parquimetro.parquimetro.domain.veiculo.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrarVeiculoUseCase {

    private final VeiculoRepository veiculoRepository;

    @Autowired
    public RegistrarVeiculoUseCase(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public Veiculo registrarVeiculo(Veiculo veiculo) {
        return veiculoRepository.salvar(veiculo);
    }
}
