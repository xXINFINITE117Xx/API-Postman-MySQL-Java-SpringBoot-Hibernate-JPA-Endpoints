package makeanappointment.pmc_backend.repository;

import makeanappointment.pmc_backend.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
