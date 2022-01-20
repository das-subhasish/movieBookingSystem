package com.subhu.movieBookingSystem.controllers;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subhu.movieBookingSystem.dtos.MovieDTO;
import com.subhu.movieBookingSystem.entities.Movie;
import com.subhu.movieBookingSystem.exceptions.MovieDetailsNotFoundException;
import com.subhu.movieBookingSystem.exceptions.MovieInvalidNameException;
import com.subhu.movieBookingSystem.services.MovieService;
import com.subhu.movieBookingSystem.validators.MovieDTOValidator;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private MovieService movieService;

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private MovieDTOValidator movieDTOValidator;

	private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);

	@GetMapping("/greetings")
	public ResponseEntity helloWorld() {
		LOGGER.info("Inside the helloWorld() methos");

		return new ResponseEntity("Hello People", HttpStatus.OK);
	}

	@GetMapping
	public ResponseEntity getAllMovies() {
		List<Movie> movies = movieService.getAllMoviesDetails();
		List<MovieDTO> movieDTOS = new ArrayList<>();
		for (Movie movie : movies)
			movieDTOS.add(convertToMovieDTO(movie));
		return new ResponseEntity(movieDTOS, HttpStatus.OK);
	}

	@GetMapping("/{movieId}")
	public ResponseEntity getMovieById(@PathVariable(name = "movieId") int movieId)
			throws MovieDetailsNotFoundException {
		Movie movie = movieService.getMovieDetails(movieId);
		MovieDTO movieDTO = convertToMovieDTO(movie);
		return new ResponseEntity(movieDTO, HttpStatus.OK);
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity createMovie(@RequestBody MovieDTO movieDTO) throws MovieInvalidNameException {

		/*
		 * Validate movieDTO
		 */
		movieDTOValidator.validate(movieDTO);

		Movie movie = modelMapper.map(movieDTO, Movie.class);
		Movie savedMovie = movieService.acceptMovieDetails(movie);
		MovieDTO savedMovieDTO = modelMapper.map(savedMovie, MovieDTO.class);
		return new ResponseEntity(savedMovieDTO, HttpStatus.CREATED);
	}

	@PutMapping(value = "/{movieId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity updateMovie(@PathVariable(name = "movieId") int movieId, @RequestBody MovieDTO movieDTO)
			throws MovieDetailsNotFoundException {

		movieService.getMovieDetails(movieId);

		Movie movie = modelMapper.map(movieDTO, Movie.class);
		Movie savedMovie = movieService.updateMovieDetails(movieId, movie);
		MovieDTO savedMovieDTO = modelMapper.map(savedMovie, MovieDTO.class);
		return new ResponseEntity(savedMovieDTO, HttpStatus.ACCEPTED);
	}

	@DeleteMapping(value = "/{movieId}")
	public ResponseEntity deletemovie(@PathVariable(name = "movieId") int movieId)
			throws MovieDetailsNotFoundException {

		movieService.deleteMovie(movieId);

		return new ResponseEntity("Deleted", HttpStatus.OK);
	}

	private MovieDTO convertToMovieDTO(Movie movie) {
//		MovieDTO movieDTO = new MovieDTO();
//		movieDTO.setMovieId(movie.getMovieId());
//		movieDTO.setMovieName(movie.getMovieName());
//		movieDTO.setMovieDescription(movie.getMovieDescription());
//		movieDTO.setDuration(movie.getDuration());
//		movieDTO.setCoverPhotoUrl(movie.getCoverPhotoUrl());
//		movieDTO.setReleaseDate(movie.getReleaseDate());
//		movieDTO.setTrailerUrl(movie.getTrailerUrl());
//		movieDTO.setStatusId(movie.getStatus().getStatusId());

		MovieDTO movieDTO = modelMapper.map(movie, MovieDTO.class);

		return movieDTO;

	}
}
