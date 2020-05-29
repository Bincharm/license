package com.company.license.repository;

import com.company.license.entity.LicenseType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseTypeRepository extends JpaRepository<LicenseType, Long> {
}
