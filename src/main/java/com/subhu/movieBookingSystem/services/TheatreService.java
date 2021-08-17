package com.subhu.movieBookingSystem.services;

import java.util.List;

import com.subhu.movieBookingSystem.entities.Theatre;
import com.subhu.movieBookingSystem.exceptions.TheatreDetailsNotFoundException;

public interface TheatreService {
	public Theatre acceptTheatreDetails(Theatre theatre);

	public Theatre getTheatreDetails(int id) throws TheatreDetailsNotFoundException;

	public Theatre updateTheatreDetails(int id, Theatre theatre) throws TheatreDetailsNotFoundException;

	public boolean deleteTheatre(int id) throws TheatreDetailsNotFoundException;

	public List<Theatre> getAllTheatreDetails();
}
