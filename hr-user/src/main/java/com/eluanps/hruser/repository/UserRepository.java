package com.eluanps.hruser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eluanps.hruser.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}