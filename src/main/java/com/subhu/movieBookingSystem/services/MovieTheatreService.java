package com.subhu.movieBookingSystem.services;

import java.util.List;

import com.subhu.movieBookingSystem.entities.MovieTheatre;
import com.subhu.movieBookingSystem.exceptions.MovieDetailsNotFoundException;
import com.subhu.movieBookingSystem.exceptions.MovieTheatreDetailsNotFoundException;
import com.subhu.movieBookingSystem.exceptions.TheatreDetailsNotFoundException;

public interface MovieTheatreService {
	public MovieTheatre acceptMovieTheatreDetails(MovieTheatre movieTheatre)
			throws MovieDetailsNotFoundException, TheatreDetailsNotFoundException;

	public MovieTheatre getMovieTheatreDetails(int id) throws MovieTheatreDetailsNotFoundException;

	public boolean deleteMovieTheatre(int id) throws MovieTheatreDetailsNotFoundException;

	public List<MovieTheatre> getAllMovieTheatreDetails();
}
