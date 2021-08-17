package com.subhu.movieBookingSystem.services;

import com.subhu.movieBookingSystem.entities.User;
import com.subhu.movieBookingSystem.exceptions.UserDetailsNotFoundException;
import com.subhu.movieBookingSystem.exceptions.UserNameAlreadyExistsException;
import com.subhu.movieBookingSystem.exceptions.UserTypeDetailsNotFoundException;

public interface UserService {

	public User acceptUserDetails(User user) throws UserNameAlreadyExistsException, UserTypeDetailsNotFoundException;

	public User getUserDetails(int id) throws UserDetailsNotFoundException;

	public User getUserDetailsByUsername(String username) throws UserDetailsNotFoundException;

	public User updateUserDetails(int id, User user)
			throws UserNameAlreadyExistsException, UserDetailsNotFoundException, UserTypeDetailsNotFoundException;
}
