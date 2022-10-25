package com.assesment.HotelService.Management.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CascadeType;

@Entity
public class Users {
	
	
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Id
	Long id;
	
	String name;
	
	String location;
	
	@OneToMany(targetEntity = Hotel.class, cascade = javax.persistence.CascadeType.ALL)
	@JoinColumn(name = "cp_fk",referencedColumnName = "id")
	
	public List<Hotel> hotels;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	
	

}
