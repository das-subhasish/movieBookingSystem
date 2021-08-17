package com.subhu.movieBookingSystem.services;

import java.util.List;

import com.subhu.movieBookingSystem.entities.City;
import com.subhu.movieBookingSystem.exceptions.CityDetailsNotFoundException;


public interface CityService {

  public City acceptCityDetails(City city);
  public List<City> acceptMultipleCityDetails(List<City> cities);
  public City updateCityDetails(int id, City city) throws CityDetailsNotFoundException;
  public City getCityDetails(int id) throws CityDetailsNotFoundException;
  public City getCityDetailsByCityName(String cityName) throws CityDetailsNotFoundException;
  public boolean deleteCity(int id) throws CityDetailsNotFoundException;
  public List<City> getAllCityDetails();
}
