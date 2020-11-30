package com.cg.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity

@Table(name="cap_flight")
public class Flight {
	
	@Id
	@Column(name="flight_number", length=30)
	private String flightNumber;
	
	@Column(name="carrier_name")
	private String carrierName;
	
	@Column(name="flight_model")
	private String flightModel;
	
	@Column(name="seat_capacity")
	private Integer seatCapacity;
	
	
public String getFlightNumber() {
	return flightNumber;
}

public void setFlightNumber(String flightNumber) {
	this.flightNumber = flightNumber;
}

public String getCarrierName() {
	return carrierName;
}

public void setCarrierName(String carrierName) {
	this.carrierName = carrierName;
}

public String getFlightModel() {
	return flightModel;
}

public void setFlightModel(String flightModel) {
	this.flightModel = flightModel;
}

public Integer getSeatCapacity() {
	return seatCapacity;
}

public void setSeatCapacity(Integer seatCapacity) {
	this.seatCapacity = seatCapacity;
}




}
