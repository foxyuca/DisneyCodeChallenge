package com.neo.detector.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class NeoDetectorRequest {

	@JsonFormat(pattern = "MM-dd-yyyy")
	private Date startDate;

	@JsonFormat(pattern = "MM-dd-yyyy")
	private Date endDate;

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
