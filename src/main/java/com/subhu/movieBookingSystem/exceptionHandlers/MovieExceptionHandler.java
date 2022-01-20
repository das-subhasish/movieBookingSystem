package com.subhu.movieBookingSystem.exceptionHandlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.subhu.movieBookingSystem.dtos.InvalidResponseDTO;
import com.subhu.movieBookingSystem.exceptions.MovieDetailsNotFoundException;
import com.subhu.movieBookingSystem.exceptions.MovieInvalidNameException;

@ControllerAdvice
public class MovieExceptionHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(MovieExceptionHandler.class);

	@ExceptionHandler(value = MovieDetailsNotFoundException.class)
	public ResponseEntity handleMovieNotFoundException() {
		LOGGER.error("Exception happened, movieId is not available");
		return new ResponseEntity("movieId passed is not avaialable", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = MovieInvalidNameException.class)
	public ResponseEntity handleMovieInvalidNameException() {
		LOGGER.error("Exception happened, movie name is Invalid");

//		InvalidResponseDTO iRD = new InvalidResponseDTO("invalid movie name", HttpStatus.BAD_REQUEST.toString(),
//				"Movie Resource");
		return new ResponseEntity("Invalid Movie Name", HttpStatus.BAD_REQUEST);
	}
}
