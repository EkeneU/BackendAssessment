package com.assessment.BackendAssessment;

import java.util.List;

public interface ContributionsService {
    List<Contributions> findAll();

    Contributions findById(int contribution_id);

    Contributions save(Contributions contributions);

    void deleteById(int contributions_id);
}
