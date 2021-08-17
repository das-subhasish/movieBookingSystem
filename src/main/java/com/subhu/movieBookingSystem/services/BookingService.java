package com.subhu.movieBookingSystem.services;

import java.util.List;

import com.subhu.movieBookingSystem.entities.Booking;
import com.subhu.movieBookingSystem.exceptions.BookingDetailsNotFoundException;
import com.subhu.movieBookingSystem.exceptions.MovieTheatreDetailsNotFoundException;
import com.subhu.movieBookingSystem.exceptions.UserDetailsNotFoundException;

public interface BookingService {

	public Booking acceptBookingDetails(Booking booking)
			throws MovieTheatreDetailsNotFoundException, UserDetailsNotFoundException;

	public Booking getBookingDetails(int id) throws BookingDetailsNotFoundException;

	public boolean deleteBooking(int id) throws BookingDetailsNotFoundException;

	public List<Booking> getAllBookingDetails();

}
