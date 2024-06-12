package br.com.fiap.parquimetro.parquimetro.infra.persistense.veiculo;

import br.com.fiap.parquimetro.parquimetro.domain.entities.veiculo.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataJpaVeiculoRepository extends JpaRepository<Veiculo, String> {

}
