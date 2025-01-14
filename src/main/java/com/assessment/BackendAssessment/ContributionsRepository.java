package com.assessment.BackendAssessment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContributionsRepository extends JpaRepository<Contributions, Integer> {
}
