package com.company.license.bootstrap;

import com.company.license.config.BCryptSingleton;
import com.company.license.entity.Role;
import com.company.license.entity.User;
import com.company.license.repository.UserRepository;
import com.company.license.service.RoleService;
import com.company.license.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Component
public class Bootstrap implements CommandLineRunner {

    UserRepository userRepository;
    RoleService roleService;


    @Override
    public void run(String... args) throws Exception {
        Role adminRole = checkAndSaveExistingRole("ROLE_ADMIN");
        Role userRole = checkAndSaveExistingRole("ROLE_USER");

        User admin = userRepository.findByUsername("admin");
        if (admin == null) {
            admin = new User("admin", BCryptSingleton.getInstance().encode("123"));
            admin.setRoles(new HashSet<>(Arrays.asList(adminRole,userRole)));
            userRepository.save(admin);
        }
    }

    private Role checkAndSaveExistingRole(String roleName) {
        Role role = roleService.findRoleByName(roleName);
        if (role == null) {
            role = new Role(roleName);
            roleService.save(role);
        }
        return role;
    }
}
