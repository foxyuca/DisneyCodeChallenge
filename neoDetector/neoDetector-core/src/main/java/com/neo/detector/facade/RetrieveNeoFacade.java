package com.neo.detector.facade;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.neo.detector.client.NeoRestClient;
import com.neo.detector.dto.NeoNasaApiRespone;
import com.neo.detector.dto.Result;

@Service
public class RetrieveNeoFacade {

	@Autowired
	private NeoRestClient neoRestClient;
	
	public Date getBestDayToLaunch(Date initDate, Date endDate, String apiKey){
		//TODO Search how to add a custom mapping for the response dynamically date attribute
		ResponseEntity<NeoNasaApiRespone> response = neoRestClient.getNeoResponse(initDate, endDate, apiKey);
		List<Result> results =  response.getBody().getResults();
		
		return getBestDateAccordingToResult(results);
	}
	
	//TODO Implement Logic to review and get the best Date
	private Date getBestDateAccordingToResult(List<Result> results){
		
		return new Date();
	}
}
