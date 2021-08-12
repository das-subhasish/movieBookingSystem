package com.subhu.movieBookingSystem;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.subhu.movieBookingSystem.dao.MovieDao;
import com.subhu.movieBookingSystem.entities.Movie;

@SpringBootApplication
public class MovieBookingSystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MovieBookingSystemApplication.class, args);
		MovieDao movieDao = (MovieDao) appContext.getBean("movieDao");

		Movie movie1 = new Movie();
		movie1.setMovieName("Mission Mangal");
		movie1.setMovieDescription("This is a nice movie");
		movie1.setDuration(150);
		movie1.setReleaseDate(LocalDateTime.of(2020, 4, 22, 5, 30));
		movie1.setCoverPhotoUrl("http://photourl");
		movie1.setTrailerUrl("http://trailerurl");

		Movie movie2 = new Movie();
		movie2.setMovieName("Dangal");
		movie2.setMovieDescription("This is a nice movie again");
		movie2.setDuration(150);
		movie2.setReleaseDate(LocalDateTime.of(2019, 6, 17, 7, 30));
		movie2.setCoverPhotoUrl("http://photourl1");
		movie2.setTrailerUrl("http://trailerurl1");

		Movie savedMovie1 = movieDao.save(movie1);
		Movie savedMovie2 = movieDao.save(movie2);

		System.out.println("Saved movie 1 "+savedMovie1);
		System.out.println("Saved movie 2 "+savedMovie2);
		
	  

		

	}

}
