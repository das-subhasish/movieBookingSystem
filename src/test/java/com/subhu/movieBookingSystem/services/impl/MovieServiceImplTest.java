package com.subhu.movieBookingSystem.services.impl;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.subhu.movieBookingSystem.entities.Movie;
import com.subhu.movieBookingSystem.entities.Status;
import com.subhu.movieBookingSystem.services.MovieService;
import com.subhu.movieBookingSystem.services.StatusService;

@SpringBootTest
public class MovieServiceImplTest {
	@Autowired
	private MovieService movieService;

	@Autowired
	private StatusService statusService;

	Movie movie;

	@BeforeEach
	public void beforeTest() {
		Status status = new Status();
		status.setStatusName("UPCOMING");
		statusService.acceptStatusDetails(status);

		movie = new Movie();
		movie.setMovieName("Movie1_Name");
		movie.setTrailerUrl("Movie1_T_URL");
		movie.setStatus(status);
		movie.setMovieDescription("Movie1 description");
		movie.setDuration(120);
		movie.setTrailerUrl("Movie1_T_URL");
		movie.setReleaseDate(LocalDateTime.of(2018, 4, 27, 5, 30));
		movie.setCoverPhotoUrl("Movie1_C_URL");
	}

	@Test
	public void testAcceptMovieDetails() {
		Movie savedMovie = movieService.acceptMovieDetails(movie);
		Assertions.assertNotNull(savedMovie);
		Assertions.assertNotNull(savedMovie.getMovieId());
	}

}
