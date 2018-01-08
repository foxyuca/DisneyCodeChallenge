package com.neo.detector.dto;

import java.io.Serializable;

public class EstimatedDiameter implements Serializable {


	private Kilometers kilometers;

	private Meters meters;

	private Miles miles;

	private Feet feet;

	private final static long serialVersionUID = 7264376641931964572L;

	public Kilometers getKilometers() {
		return kilometers;
	}

	public void setKilometers(Kilometers kilometers) {
		this.kilometers = kilometers;
	}

	public Meters getMeters() {
		return meters;
	}

	public void setMeters(Meters meters) {
		this.meters = meters;
	}

	public Miles getMiles() {
		return miles;
	}

	public void setMiles(Miles miles) {
		this.miles = miles;
	}

	public Feet getFeet() {
		return feet;
	}

	public void setFeet(Feet feet) {
		this.feet = feet;
	}
	
	
}
