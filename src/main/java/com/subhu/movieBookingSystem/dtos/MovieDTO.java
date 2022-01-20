package com.subhu.movieBookingSystem.dtos;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieDTO {

	@JsonProperty("movie_id")
	private int movieId;

	@JsonProperty("movie_name")
	private String movieName;

	@JsonProperty("movie_desc")
	private String movieDescription;

	@JsonProperty("release_data")
	private LocalDateTime releaseDate;

	private int duration;

	@JsonProperty("cover_photo_url")
	private String coverPhotoUrl;

	@JsonProperty("trailer_url")
	private String trailerUrl;

	@JsonProperty("status_id")
	private int statusId;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDescription() {
		return movieDescription;
	}

	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}

	public LocalDateTime getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDateTime releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getCoverPhotoUrl() {
		return coverPhotoUrl;
	}

	public void setCoverPhotoUrl(String coverPhotoUrl) {
		this.coverPhotoUrl = coverPhotoUrl;
	}

	public String getTrailerUrl() {
		return trailerUrl;
	}

	public void setTrailerUrl(String trailerUrl) {
		this.trailerUrl = trailerUrl;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	@Override
	public String toString() {
		return "MovieDTO [movieId=" + movieId + ", movieName=" + movieName + ", movieDescription=" + movieDescription
				+ ", releaseDate=" + releaseDate + ", duration=" + duration + ", coverPhotoUrl=" + coverPhotoUrl
				+ ", trailerUrl=" + trailerUrl + ", statusId=" + statusId + ", getMovieId()=" + getMovieId()
				+ ", getMovieName()=" + getMovieName() + ", getMovieDescription()=" + getMovieDescription()
				+ ", getReleaseDate()=" + getReleaseDate() + ", getDuration()=" + getDuration()
				+ ", getCoverPhotoUrl()=" + getCoverPhotoUrl() + ", getTrailerUrl()=" + getTrailerUrl()
				+ ", getStatusId()=" + getStatusId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
