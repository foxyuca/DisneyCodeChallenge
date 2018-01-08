package com.neo.detector.dto;

import java.io.Serializable;
import java.util.List;

public class NeoNasaApiRespone implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9030604929233233348L;
	private Links links;
	private Integer elementCount;
	private List<Result> results;
	
	
	public Links getLinks() {
		return links;
	}
	public void setLinks(Links links) {
		this.links = links;
	}
	public Integer getElementCount() {
		return elementCount;
	}
	public void setElementCount(Integer elementCount) {
		this.elementCount = elementCount;
	}
	public List<Result> getResults() {
		return results;
	}
	public void setResults(List<Result> results) {
		this.results = results;
	}
	
	

}
