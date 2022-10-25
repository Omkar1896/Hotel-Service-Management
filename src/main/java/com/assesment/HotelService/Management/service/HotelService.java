package com.assesment.HotelService.Management.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.HotelService.Management.entity.Hotel;
import com.assesment.HotelService.Management.repository.HotelRepository;

@Service
public class HotelService {


	@Autowired
	HotelRepository hotelRepository;
	
	public Hotel createHotelbyId(Hotel hotel) {

		return hotelRepository.save(hotel);
	}

	public Hotel findHotelById(Long id) {

		Optional<Hotel> opHotel= hotelRepository.findById(id);
		Hotel ho = opHotel.get();
		
		return ho;
	}

	public Hotel updateHotelById(Hotel hotel, Long id) {

		Optional<Hotel> opHotel= hotelRepository.findById(id);
		Hotel ho = opHotel.get();
		
		ho.setLocation(hotel.getLocation());
		ho.setType(hotel.getType());
		
		return hotelRepository.save(ho);
	}

	public String deleteHotelById(Long id) {

		Optional<Hotel> opHotel= hotelRepository.findById(id);
		Hotel ho = null;
		
		if(opHotel.isPresent())
		{
			ho = opHotel.get();
			hotelRepository.deleteById(id);
			return "Record Deleted Succesfully";
		}
		else
		{
			return "record not found";
		}
		
	}
	
	
	
	

}
