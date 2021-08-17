package com.subhu.movieBookingSystem.services;

import java.util.List;

import com.subhu.movieBookingSystem.entities.Movie;
import com.subhu.movieBookingSystem.exceptions.MovieDetailsNotFoundException;

public interface MovieService {
	public Movie acceptMovieDetails(Movie movie);

	public Movie getMovieDetails(int id) throws MovieDetailsNotFoundException;

	public Movie updateMovieDetails(int id, Movie movie) throws MovieDetailsNotFoundException;

	public boolean deleteMovie(int id) throws MovieDetailsNotFoundException;

	public List<Movie> getAllMoviesDetails();
}
