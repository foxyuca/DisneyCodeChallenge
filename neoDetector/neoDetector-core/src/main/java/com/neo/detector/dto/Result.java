package com.neo.detector.dto;

import java.io.Serializable;
import java.util.List;

public class Result implements Serializable {
	
//TODO sEE IF THE MAPPING WITH THE DYNAMICALLY PARAM NAME WORKS PROPERLY WITH THIS OBJECT OR IF WE NEED A CUSTOM MAPPING
	private Links links;

	private String neoReferenceId;

	private String name;

	private String nasaJplUrl;

	private Double absoluteMagnitudeH;

	private EstimatedDiameter estimatedDiameter;

	private Boolean isPotentiallyHazardousAsteroid;

	private List<CloseApproachDatum> closeApproachData = null;


	private final static long serialVersionUID = -2122162428387014407L;


	public Links getLinks() {
		return links;
	}


	public void setLinks(Links links) {
		this.links = links;
	}


	public String getNeoReferenceId() {
		return neoReferenceId;
	}


	public void setNeoReferenceId(String neoReferenceId) {
		this.neoReferenceId = neoReferenceId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNasaJplUrl() {
		return nasaJplUrl;
	}


	public void setNasaJplUrl(String nasaJplUrl) {
		this.nasaJplUrl = nasaJplUrl;
	}


	public Double getAbsoluteMagnitudeH() {
		return absoluteMagnitudeH;
	}


	public void setAbsoluteMagnitudeH(Double absoluteMagnitudeH) {
		this.absoluteMagnitudeH = absoluteMagnitudeH;
	}


	public EstimatedDiameter getEstimatedDiameter() {
		return estimatedDiameter;
	}


	public void setEstimatedDiameter(EstimatedDiameter estimatedDiameter) {
		this.estimatedDiameter = estimatedDiameter;
	}


	public Boolean getIsPotentiallyHazardousAsteroid() {
		return isPotentiallyHazardousAsteroid;
	}


	public void setIsPotentiallyHazardousAsteroid(Boolean isPotentiallyHazardousAsteroid) {
		this.isPotentiallyHazardousAsteroid = isPotentiallyHazardousAsteroid;
	}


	public List<CloseApproachDatum> getCloseApproachData() {
		return closeApproachData;
	}


	public void setCloseApproachData(List<CloseApproachDatum> closeApproachData) {
		this.closeApproachData = closeApproachData;
	}
	
	
	

}
