package makeanappointment.pmc_backend.repository;

import makeanappointment.pmc_backend.model.Cita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitaRepository extends JpaRepository<Cita, Long> {
}
