package br.com.fiap.parquimetro.parquimetro.infra.persistense.vaga;

import br.com.fiap.parquimetro.parquimetro.domain.entities.vaga.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataJpaVagaRepository extends JpaRepository<Vaga, Long> {

}
