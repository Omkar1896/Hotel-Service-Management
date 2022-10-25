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

import com.assesment.HotelService.Management.entity.Users;
import com.assesment.HotelService.Management.service.UsersService;

@RestController
public class UsersController {
	
	@Autowired
	UsersService usersService;
	
	@PostMapping("/users")
	public Users createusersById(@RequestBody Users users)
	{
		return usersService.createUsersById(users);
	}
	
	@GetMapping("/users/{id}")
	public Users getUsersById(@PathVariable Long id,Users users)
	{
		return usersService.findUsersByIds(id);
	}

	@PutMapping("/users")
	public Users updateUsersByIds(@RequestBody Users users,@RequestParam Long id)
	{
		return usersService.updateUsersById(users,id);
	}
	
	@DeleteMapping("/users")
	public String deleteUsersById(@RequestParam Long id)
	{
		return usersService.deleteUsersByids(id);
	}
	
}
