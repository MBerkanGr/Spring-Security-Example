package com.mehmetberkan.springsecuritybasicauthh2example.util;

import com.mehmetberkan.springsecuritybasicauthh2example.model.Role;
import com.mehmetberkan.springsecuritybasicauthh2example.model.User;
import com.mehmetberkan.springsecuritybasicauthh2example.repository.RoleRepository;
import com.mehmetberkan.springsecuritybasicauthh2example.repository.UserEntityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final UserEntityRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public DataLoader(UserEntityRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {
        Role adminRole = new Role("ADMIN");
        roleRepository.save(adminRole);

        Role userRole = new Role("USER");
        roleRepository.save(userRole);

        User admin = new User();
        admin.setUsername("admin");
        admin.setPassword(passwordEncoder.encode("123"));
        admin.setRoles(List.of(adminRole));
        userRepository.save(admin);

        User user = new User();
        user.setUsername("user");
        user.setPassword(passwordEncoder.encode("123"));
        user.setRoles(List.of(userRole));
        userRepository.save(user);
    }
}
