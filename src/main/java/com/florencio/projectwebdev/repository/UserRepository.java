package com.florencio.projectwebdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.florencio.projectwebdev.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
