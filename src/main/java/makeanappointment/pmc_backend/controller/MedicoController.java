package makeanappointment.pmc_backend.controller;

import makeanappointment.pmc_backend.model.Medico;
import makeanappointment.pmc_backend.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicos")
public class MedicoController {
    @Autowired
    private MedicoService medicoService;

    @GetMapping
    public List<Medico> getAll() {
        return medicoService.findAll();
    }

    @GetMapping("/{id}")
    public Medico getById(@PathVariable Long id) {
        return medicoService.findById(id);
    }

    @PostMapping
    public Medico create(@RequestBody Medico medico) {
        return medicoService.save(medico);
    }

    @PutMapping("/{id}")
    public Medico update(@PathVariable Long id, @RequestBody Medico medico) {
        medico.setId(id);
        return medicoService.save(medico);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        medicoService.deleteById(id);
    }
}
