package com.subhu.movieBookingSystem.services;

import java.util.List;

import com.subhu.movieBookingSystem.entities.UserType;
import com.subhu.movieBookingSystem.exceptions.UserTypeDetailsNotFoundException;

public interface UserTypeService {
	public UserType acceptUserTypeDetails(UserType userType);

	public UserType getUserTypeDetails(int id) throws UserTypeDetailsNotFoundException;

	public UserType getUserTypeDetailsFromUserTypeName(String userType) throws UserTypeDetailsNotFoundException;

	public boolean deleteUserType(int id) throws UserTypeDetailsNotFoundException;

	public List<UserType> getAllUserTypeDetails();

}
