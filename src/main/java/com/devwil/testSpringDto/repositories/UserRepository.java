package com.devwil.testSpringDto.repositories;

import com.devwil.testSpringDto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
