package com.isaccanedo.jwt.api.repository;

import com.isaccanedo.jwt.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
