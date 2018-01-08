package com.neo.detector.dto;

import java.io.Serializable;
import java.util.Date;

public class NeoDetectorResponse implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3465315504090671441L;
	private Date dayToLaunch;
	private String message;
	
	
	public Date getDayToLaunch() {
		return dayToLaunch;
	}
	public void setDayToLaunch(Date dayToLaunch) {
		this.dayToLaunch = dayToLaunch;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
