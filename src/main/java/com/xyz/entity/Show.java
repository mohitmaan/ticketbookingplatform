package com.xyz.entity;

import java.util.Date;

public class Show {

	private Integer showId;
	private Date showDate;
	private Date startTime;
	private Date endTime;
	private Integer movieId;
	private Integer screenId;

	public Integer getShowId() {

		return showId;
	}

	public void setShowId(Integer showId) {

		this.showId = showId;
	}

	public Date getShowDate() {

		return showDate;
	}

	public void setShowDate(Date showDate) {

		this.showDate = showDate;
	}

	public Date getStartTime() {

		return startTime;
	}

	public void setStartTime(Date startTime) {

		this.startTime = startTime;
	}

	public Date getEndTime() {

		return endTime;
	}

	public void setEndTime(Date endTime) {

		this.endTime = endTime;
	}

	public Integer getMovieId() {

		return movieId;
	}

	public void setMovieId(Integer movieId) {

		this.movieId = movieId;
	}

	public Integer getScreenId() {

		return screenId;
	}

	public void setScreenId(Integer screenId) {

		this.screenId = screenId;
	}

}
