package com.subhu.movieBookingSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhu.movieBookingSystem.entities.Booking;


public interface BookingDao extends JpaRepository<Booking, Integer> {
}
