package com.cg.entity;


import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity

@Table(name="cap_passenger")

public class Passenger {
	
	@Id
	@Column(name = "pnr_number",length = 30)
	private String pnrNumber;
	
	@Column(name = "passenger_name",length = 30)
	private String passengerName;
	
	@Column(name = "passenger_age")
	private Integer passengerAge;
	
	@Column(name = "passenger_uin")
	private BigInteger passengerUIN;
	
	@Column(name = "passenger_luggage")
	private Integer passengerLuggage;
	
	
	
	
public Passenger(String pnrNumber, String passengerName, Integer passengerAge, BigInteger passengerUIN,
			Integer passengerLuggage) {
		super();
		this.pnrNumber = pnrNumber;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerUIN = passengerUIN;
		this.passengerLuggage = passengerLuggage;
	}

public Passenger() {
		
	}

public String getPnrNumber() {
	return pnrNumber;
}

public void setPnrNumber(String pnrNumber) {
	this.pnrNumber = pnrNumber;
}

public String getPassengerName() {
	return passengerName;
}

public void setPassengerName(String passengerName) {
	this.passengerName = passengerName;
}

public Integer getPassengerAge() {
	return passengerAge;
}

public void setPassengerAge(Integer passengerAge) {
	this.passengerAge = passengerAge;
}

public BigInteger getPassengerUIN() {
	return passengerUIN;
}

public void setPassengerUIN(BigInteger passengerUIN) {
	this.passengerUIN = passengerUIN;
}

public Integer getPassengerLuggage() {
	return passengerLuggage;
}

public void setPassengerLuggage(Integer passengerLuggage) {
	this.passengerLuggage = passengerLuggage;
}
	

	

}
