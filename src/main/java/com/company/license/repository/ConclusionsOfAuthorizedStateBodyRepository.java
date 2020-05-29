package com.company.license.repository;

import com.company.license.entity.ConclusionsOfAuthorizedStateBody;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConclusionsOfAuthorizedStateBodyRepository extends JpaRepository<ConclusionsOfAuthorizedStateBody, Long> {
}
