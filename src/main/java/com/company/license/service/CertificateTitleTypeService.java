package com.company.license.service;

import com.company.license.entity.CertificateTitleType;
import com.company.license.repository.CertificateTitleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificateTitleTypeService {

    @Autowired
    private CertificateTitleTypeRepository certificateTitleTypeRepository;

    public void save(CertificateTitleType certificateTitleType){
        certificateTitleTypeRepository.save(certificateTitleType);
    }

    public boolean delete(Long id){
        if(certificateTitleTypeRepository.findById(id).isPresent()){
            certificateTitleTypeRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<CertificateTitleType> findAll(){
        return certificateTitleTypeRepository.findAll();
    }

    public CertificateTitleType findById(Long id){
        return certificateTitleTypeRepository.findById(id).orElse(new CertificateTitleType());
    }
}
