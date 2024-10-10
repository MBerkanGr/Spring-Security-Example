package com.mehmetberkan.springsecuritybasicauthh2example.repository;

import com.mehmetberkan.springsecuritybasicauthh2example.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
