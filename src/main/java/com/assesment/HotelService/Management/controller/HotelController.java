package com.assesment.HotelService.Management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.HotelService.Management.entity.Hotel;
import com.assesment.HotelService.Management.service.HotelService;

@RestController
public class HotelController {
	
	@Autowired
	HotelService hotelservice;
	
	
	@PostMapping("/hotel")
	public Hotel createHotelById(@RequestBody Hotel hotel)
	{
		return hotelservice.createHotelbyId(hotel);
	}
	
	@GetMapping("/hotel/{id}")
	public Hotel getHotelById(@PathVariable Long id, Hotel hotel)
	{
		return hotelservice.findHotelById(id);
	}
	
	@PutMapping("/hotel")
	public Hotel upateHotelById(@RequestBody Hotel hotel,@RequestParam Long id)
	{
		return hotelservice.updateHotelById(hotel,id);
	}
	
	@DeleteMapping("/hotels")
	public String DeleteHotelById(@RequestParam Long id)
	{
		return hotelservice.deleteHotelById(id);
	}

}
