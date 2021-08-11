package Labs.relogioDePontoRest.repository;

import Labs.relogioDePontoRest.model.JornadaDeTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaDeTrabalho, Long> {
}
