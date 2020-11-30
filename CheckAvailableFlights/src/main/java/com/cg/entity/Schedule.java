package com.cg.entity;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name="cap_schedule")
public class Schedule{
	@Id
	@Column(name="arrival_date_time")
	private LocalDate arrivalTime;
	
	@Column(name="departure_date_time")
	private LocalDate  departureTime;
	
	@Column(name="source_airport")
	private String sourceAirport;
	
	@Column(name="destination_airport")
	private String destinationAirport;
	@Column(name = "available_seat")
	private Integer availableSeat;

	@ManyToOne
	@JoinColumn(name="flightNumber", referencedColumnName = "flight_number")
	private Flight Flight = new Flight();

	public LocalDate getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalDate arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public LocalDate getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalDate departureTime) {
		this.departureTime = departureTime;
	}

	public String getSourceAirport() {
		return sourceAirport;
	}

	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}

	public String getDestinationAirport() {
		return destinationAirport;
	}

	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}

	public Integer getAvailableSeat() {
		return availableSeat;
	}

	public void setAvailableSeat(Integer availableSeat) {
		this.availableSeat = availableSeat;
	}

	public Flight getFlight() {
		return Flight;
	}

	public void setFlight(Flight flight) {
		Flight = flight;
	}


	
	
}
