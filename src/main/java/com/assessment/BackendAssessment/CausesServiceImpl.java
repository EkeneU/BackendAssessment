package com.assessment.BackendAssessment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CausesServiceImpl implements CausesService {
    @Autowired
    private CausesRepository repository;


    @Override
    public List<Causes> findAll() {
        return List.of();
    }

    @Override
    public Causes findById(int causes_id) {
        Optional<Causes> result = repository.findById(causes_id);
        Causes causes;
        if (result.isPresent()) {
            causes = result.get();
        }
        else {
            throw new RuntimeException("ID not found or incompatible" + causes_id);
        }
        return causes;
    }

    @Override
    public Causes save(Causes causes) {
        return repository.save(causes);
    }

    @Override
    public void deleteById(int causes_id) {
        repository.deleteById(causes_id);

    }
}
