package com.subhu.movieBookingSystem.dtos;

public class InvalidResponseDTO {
	private String errorMessage;
	private String status;
	private String resourceName;

	public InvalidResponseDTO(String errorMessage, String status, String resourceName) {
		this.errorMessage = errorMessage;
		this.status = status;
		this.resourceName = resourceName;
	}

	@Override
	public String toString() {
		return "InvalidResponseDTO [errorMessage=" + errorMessage + ", status=" + status + ", resourceName="
				+ resourceName + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
