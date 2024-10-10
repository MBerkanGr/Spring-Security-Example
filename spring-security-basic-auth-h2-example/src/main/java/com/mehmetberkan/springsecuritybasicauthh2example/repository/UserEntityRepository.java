package com.mehmetberkan.springsecuritybasicauthh2example.repository;

import com.mehmetberkan.springsecuritybasicauthh2example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntityRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
