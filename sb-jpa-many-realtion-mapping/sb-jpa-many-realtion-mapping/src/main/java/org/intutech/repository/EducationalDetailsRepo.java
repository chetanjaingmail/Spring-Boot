package org.intutech.repository;

import org.intutech.bean.EducationalDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationalDetailsRepo extends JpaRepository<EducationalDetails, Integer> {
}
