package com.subhu.movieBookingSystem.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhu.movieBookingSystem.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {
	public Optional<User> findByUsername(String username);
}