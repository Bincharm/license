package com.company.license.repository;

import com.company.license.entity.InstitutionalLegalForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstitutionalLegalFormRepository extends JpaRepository<InstitutionalLegalForm, Long> {
}
