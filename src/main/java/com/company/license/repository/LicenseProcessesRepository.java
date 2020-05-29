package com.company.license.repository;

import com.company.license.entity.LicenseProcesses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LicenseProcessesRepository extends JpaRepository<LicenseProcesses, Long> {
}
