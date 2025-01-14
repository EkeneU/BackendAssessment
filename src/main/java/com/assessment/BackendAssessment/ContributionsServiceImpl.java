package com.assessment.BackendAssessment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ContributionsServiceImpl implements ContributionsService{

    @Autowired
    public ContributionsRepository contributionsRepository;


    @Override
    public List<Contributions> findAll() {
        return List.of();
    }

    @Override
    public Contributions findById(int contribution_id) {
        Optional<Contributions> result = contributionsRepository.findById(contribution_id);
        Contributions contributions;
        if (result.isPresent()) {
            contributions = result.get();
        }
        else {
            throw new RuntimeException("ID not found or incompatible" + contribution_id);
        }
        return contributions;
    }

    @Override
    public Contributions save(Contributions contributions) {
        return contributionsRepository.save(contributions);
    }

    @Override
    public void deleteById(int contributions_id) {
            contributionsRepository.deleteById(contributions_id);
    }
}
