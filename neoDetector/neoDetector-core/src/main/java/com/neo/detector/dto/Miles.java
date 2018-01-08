package com.neo.detector.dto;

import java.io.Serializable;

public class Miles implements Serializable {


	private Double estimatedDiameterMin;

	private Double estimatedDiameterMax;

	private final static long serialVersionUID = 6452436440963515674L;

	public Double getEstimatedDiameterMin() {
		return estimatedDiameterMin;
	}

	public void setEstimatedDiameterMin(Double estimatedDiameterMin) {
		this.estimatedDiameterMin = estimatedDiameterMin;
	}

	public Double getEstimatedDiameterMax() {
		return estimatedDiameterMax;
	}

	public void setEstimatedDiameterMax(Double estimatedDiameterMax) {
		this.estimatedDiameterMax = estimatedDiameterMax;
	}


}
