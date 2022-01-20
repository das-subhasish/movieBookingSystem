package com.subhu.movieBookingSystem.validators;

import org.springframework.stereotype.Component;

import com.subhu.movieBookingSystem.dtos.MovieDTO;
import com.subhu.movieBookingSystem.exceptions.MovieInvalidNameException;

@Component
public class MovieDTOValidator {
	public void validate(MovieDTO movieDTO) throws MovieInvalidNameException {
		if (movieDTO.getMovieName() == null || movieDTO.getMovieName().equals("")) {
			throw new MovieInvalidNameException("Invalid Movie Name");
		}
	}
}
