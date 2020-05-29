package com.company.license.service;

import com.company.license.entity.Role;
import com.company.license.repository.RoleRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Service
public class RoleService {

    RoleRepository roleRepository;

    public Role findRoleByName(String roleName) {
        return roleRepository.findFirstByName(roleName);
    }

    public Role save (Role role) {
        return roleRepository.save(role);
    }
}
