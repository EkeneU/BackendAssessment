package com.assessment.BackendAssessment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CausesRestController {

    @Autowired
    public CausesService causesService;

    @GetMapping("/causes")
    public List<Causes> findAll() {
        return causesService.findAll();
    }
    @GetMapping("/causes/{causes_id}")
    public Causes getCause(@PathVariable int causes_id) {
        Causes cause = causesService.findById(causes_id);

        if (cause==null) {
            throw new RuntimeException("Patient ID not found" + causes_id);
        }
        else {
            return cause;
        }
    }
    @PostMapping("/causes")
    public Causes addCauses(@RequestBody Causes cause) {
        cause.setId(0);

        return causesService.save(cause);
    }
    @PutMapping("/causes")
    public Causes updateCauses(@RequestBody Causes cause) {
        return causesService.save(cause);
    }
    @DeleteMapping("/causes/{causes_id}")
    public String deleteCauses(@PathVariable int causes_id) {
        Causes cause = causesService.findById(causes_id);

        if (cause==null) {
            throw new RuntimeException("ID not recognised on the database" + causes_id);
        }
        else {
            causesService.deleteById(causes_id);
            return "Causes with ID " + causes_id + " has been deleted" ;
        }
    }
}
