package com.cg.service;

import java.time.LocalDate;
import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.CheckAvailableDao;

import com.cg.entity.Schedule;

import com.cg.exception.FlightAvailablityNotFoundException;
import com.cg.util.CgConstants;


@Service
@Transactional
public class CheckAvailableServiceImp implements CheckAvailableService{
	  @Autowired 
	  private CheckAvailableDao availdao;
	@Override
	public List<Schedule> availabilty(String sourceAirport, String destinationAirport, LocalDate arrivalTime)
			throws FlightAvailablityNotFoundException{	
		List<Schedule> sclist = availdao.availabilty(sourceAirport, destinationAirport, arrivalTime);
		if(sclist.isEmpty())
			throw new FlightAvailablityNotFoundException(CgConstants.FLIGHT_AAVALIABILITY__NOT_FOUND);		
		else
		{
			Schedule sc=new Schedule();
			sc.getSourceAirport();
			sc.getDestinationAirport();
			sc.getArrivalTime();
			sc.getDepartureTime();
			sc.getAvailableSeat();
			sc.getFlight();	
	}
		return sclist;
	}
	}
