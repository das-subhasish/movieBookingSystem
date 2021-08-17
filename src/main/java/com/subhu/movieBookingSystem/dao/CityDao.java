package com.subhu.movieBookingSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subhu.movieBookingSystem.entities.City;

public interface CityDao extends JpaRepository<City, Integer> {
	public City findByCityName(String cityName);
}