package com.neo.detector.dto;

import java.io.Serializable;
import java.util.List;

public class NearEarthObjects implements Serializable {

	private List<Result> result = null;
	private final static long serialVersionUID = 4369792749977517381L;

	public List<Result> getResult() {
		return result;
	}

	public void setResult(List<Result> result) {
		this.result = result;
	}


}