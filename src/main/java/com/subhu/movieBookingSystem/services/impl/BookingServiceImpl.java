package com.subhu.movieBookingSystem.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subhu.movieBookingSystem.dao.BookingDao;
import com.subhu.movieBookingSystem.entities.Booking;
import com.subhu.movieBookingSystem.exceptions.BookingDetailsNotFoundException;
import com.subhu.movieBookingSystem.exceptions.MovieTheatreDetailsNotFoundException;
import com.subhu.movieBookingSystem.exceptions.UserDetailsNotFoundException;
import com.subhu.movieBookingSystem.services.BookingService;
import com.subhu.movieBookingSystem.services.MovieTheatreService;
import com.subhu.movieBookingSystem.services.UserService;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	public MovieTheatreService movieTheatreService;

	@Autowired
	public UserService userService;

	@Autowired
	public BookingDao bookingDao;

	@Override
	public Booking acceptBookingDetails(Booking booking)
			throws MovieTheatreDetailsNotFoundException, UserDetailsNotFoundException {
		movieTheatreService.getMovieTheatreDetails(booking.getMovieTheatre().getMovieTheatreId());
		userService.getUserDetails(booking.getUser().getCustomerId());
		bookingDao.save(booking);
		return booking;
	}

	@Override
	public Booking getBookingDetails(int id) throws BookingDetailsNotFoundException {
		return bookingDao.findById(id)
				.orElseThrow(() -> new BookingDetailsNotFoundException("Booking not found for id: " + id));
	}

	@Override
	public boolean deleteBooking(int id) throws BookingDetailsNotFoundException {
		Booking booking = getBookingDetails(id);
		bookingDao.delete(booking);
		return true;
	}

	@Override
	public List<Booking> getAllBookingDetails() {
		return bookingDao.findAll();
	}
}
