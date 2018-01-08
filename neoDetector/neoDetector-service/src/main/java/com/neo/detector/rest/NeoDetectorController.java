package com.neo.detector.rest;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neo.detector.dto.NeoDetectorRequest;
import com.neo.detector.dto.NeoDetectorResponse;
import com.neo.detector.facade.RetrieveNeoFacade;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/neoDetector")
@Api(basePath = "/neoDetector", description = "get Neo Resource")
public class NeoDetectorController {

	@Autowired
	private RetrieveNeoFacade retrieveNeoFacade;
	
	@PostMapping(value = "/dayToLaunch")
	@ApiOperation(value = "Post ArtVu processor", notes = "Return best Day to launch according to Neo detection",
			 produces = MediaType.APPLICATION_JSON_VALUE,
		      consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<NeoDetectorResponse> getBestDayToLaunch(@RequestBody NeoDetectorRequest neoDetectorRequest){
		Date bestDate  = retrieveNeoFacade.getBestDayToLaunch(neoDetectorRequest.getStartDate(), neoDetectorRequest.getStartDate(), "H7V98iNStSoR1hRBQJgIMHWee0W6Pf5qvfyVLk4X");
		NeoDetectorResponse detectorResponse = new NeoDetectorResponse();
		detectorResponse.setDayToLaunch(bestDate);
		detectorResponse.setMessage("This is the best day to execute the Launch");
		return new ResponseEntity<NeoDetectorResponse>(
		        HttpStatus.OK);
	}
}
