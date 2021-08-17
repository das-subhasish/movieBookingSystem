package com.subhu.movieBookingSystem.services;

import java.util.List;

import com.subhu.movieBookingSystem.entities.Status;
import com.subhu.movieBookingSystem.exceptions.StatusDetailsNotFoundException;

public interface StatusService {
	public Status acceptStatusDetails(Status status);

	public Status getStatusDetails(int id) throws StatusDetailsNotFoundException;

	public Status getStatusDetailsByStatusName(String statusName) throws StatusDetailsNotFoundException;

	public boolean deleteStatus(int id) throws StatusDetailsNotFoundException;

	public List<Status> getAllStatusDetails();
}
