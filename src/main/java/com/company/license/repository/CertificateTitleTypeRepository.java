package com.company.license.repository;

import com.company.license.entity.CertificateTitleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificateTitleTypeRepository extends JpaRepository<CertificateTitleType, Long> {

}
