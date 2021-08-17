package com.subhu.movieBookingSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhu.movieBookingSystem.entities.MovieTheatre;

public interface MovieTheatreDao extends JpaRepository<MovieTheatre, Integer> {
}
