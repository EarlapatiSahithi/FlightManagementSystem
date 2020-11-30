package com.cg.web;


import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Schedule;
import com.cg.exception.FlightAvailablityNotFoundException;
import com.cg.service.CheckAvailableService;


@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class CheckAvailableController {
@Autowired
private CheckAvailableService service;

@GetMapping("searchavailabilty/{soair}/{desair}/{fromDt}")
public List<Schedule> getService(@PathVariable("soair") String sourceAirport,
		@PathVariable("desair") String destinationAirport,@PathVariable("fromDt") @DateTimeFormat(pattern="yyyy-MM-dd")LocalDate arrivalTime) throws FlightAvailablityNotFoundException{
			return service.availabilty(sourceAirport, destinationAirport, arrivalTime);
	
	
}


}


