package com.mehmetberkan.springsecurityjwtexample.repository;

import com.mehmetberkan.springsecurityjwtexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
