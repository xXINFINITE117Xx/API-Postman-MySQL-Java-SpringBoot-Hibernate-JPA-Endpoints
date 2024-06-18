package makeanappointment.pmc_backend.repository;

import makeanappointment.pmc_backend.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
