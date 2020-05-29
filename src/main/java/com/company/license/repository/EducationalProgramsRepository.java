package com.company.license.repository;

import com.company.license.entity.EducationalPrograms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationalProgramsRepository extends JpaRepository<EducationalPrograms, Long> {
}
