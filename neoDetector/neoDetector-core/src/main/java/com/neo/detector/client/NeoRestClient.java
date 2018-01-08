package com.neo.detector.client;

import java.util.Date;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.neo.detector.dto.NeoNasaApiRespone;

@FeignClient(name = "neo-service", url = "${feign.neo.url}")
public interface NeoRestClient {

	  @RequestMapping(method = RequestMethod.GET, path = "/neo/rest/v1/feed")
	  ResponseEntity<NeoNasaApiRespone> getNeoResponse(
	      @RequestParam("start_date") Date startDate,
	      @RequestParam("end_date") Date endDate,
	      @RequestParam("api_key") String apiKey
	      );

}
