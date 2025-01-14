package com.assessment.BackendAssessment;

import java.util.List;

public interface CausesService {

    List<Causes> findAll();

    Causes findById(int causes_id);

    Causes save(Causes causes);

    void deleteById(int causes_id);
}
