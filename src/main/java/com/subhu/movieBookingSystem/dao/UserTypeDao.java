package com.subhu.movieBookingSystem.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhu.movieBookingSystem.entities.UserType;

public interface UserTypeDao extends JpaRepository<UserType, Integer> {
	public Optional<UserType> findByUserTypeName(String userTypeName);
}