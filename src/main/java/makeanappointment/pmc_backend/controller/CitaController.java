package makeanappointment.pmc_backend.controller;

import makeanappointment.pmc_backend.model.Cita;
import makeanappointment.pmc_backend.service.CitaService;
import makeanappointment.pmc_backend.service.MedicoService;
import makeanappointment.pmc_backend.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/citas")
public class CitaController {
    @Autowired
    private CitaService citaService;

    @Autowired
    private PacienteService pacienteService;

    @Autowired
    private MedicoService medicoService;

    @GetMapping
    public List<Cita> getAll() {
        return citaService.findAll();
    }

    @GetMapping("/{id}")
    public Cita getById(@PathVariable Long id) {
        return citaService.findById(id);
    }

    @PostMapping
    public Cita create(@RequestBody Cita cita) {
        cita.setPaciente(pacienteService.findById(cita.getPaciente().getId()));
        cita.setMedico(medicoService.findById(cita.getMedico().getId()));
        return citaService.save(cita);
    }

    @PutMapping("/{id}")
    public Cita update(@PathVariable Long id, @RequestBody Cita cita) {
        cita.setId(id);
        cita.setPaciente(pacienteService.findById(cita.getPaciente().getId()));
        cita.setMedico(medicoService.findById(cita.getMedico().getId()));
        return citaService.save(cita);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        citaService.deleteById(id);
    }
}
