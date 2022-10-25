package com.assesment.HotelService.Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assesment.HotelService.Management.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
	
	

}
