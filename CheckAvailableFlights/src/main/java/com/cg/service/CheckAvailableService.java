package com.cg.service;


import java.time.LocalDate;
import java.util.List;

import com.cg.entity.Schedule;
import com.cg.exception.FlightAvailablityNotFoundException;

public interface CheckAvailableService {

	
public List<Schedule> availabilty(String sourceAirport, String destinationAirport, LocalDate arrivalTime)throws FlightAvailablityNotFoundException;
	
}
