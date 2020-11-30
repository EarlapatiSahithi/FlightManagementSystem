package com.cg.dao;

import java.time.LocalDate;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.entity.Schedule;

@Repository
public interface CheckAvailableDao extends JpaRepository<Schedule, String>{
	@Query("from Schedule sh where sh.sourceAirport >= :soair and sh.destinationAirport >=:desair and sh.arrivalTime >= :fromDt")
	public List<Schedule> availabilty(@Param("soair") String sourceAirport,@Param("desair") String destinationAirport,@Param("fromDt") LocalDate  arrivalTime);
}

	
