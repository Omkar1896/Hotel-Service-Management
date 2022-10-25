package com.assesment.HotelService.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assesment.HotelService.Management.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
	
	

}
