package com.assesment.HotelService.Management.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.HotelService.Management.entity.Users;
import com.assesment.HotelService.Management.repository.UsersRepository;

@Service
public class UsersService {
	
	@Autowired
	UsersRepository usersRepository;

	public Users createUsersById(Users users) {

		return usersRepository.save(users);
	}

	public Users findUsersByIds(Long id) {

		Optional<Users> opUsers = usersRepository.findById(id); // find airport details by id
		Users us=opUsers.get();
		
		return us;
	}

	public Users updateUsersById(Users users, Long id) {
		
		Optional<Users> opUsers = usersRepository.findById(id); // find airport details by id
		Users us=opUsers.get();
		
		us.setLocation(users.getLocation());

		return usersRepository.save(us);
	}

	public String deleteUsersByids(Long id) {

		Optional<Users> opUsers = usersRepository.findById(id);
		Users us = null;
		
		if(opUsers.isPresent())
		{
			us=opUsers.get();
			usersRepository.deleteById(id);
			return "Record Deleted succesfully";
		}
		else
		{
			return "Record Not Found";
		}
		
		}
	}
	
	


