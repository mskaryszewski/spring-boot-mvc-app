package com.skaryszewski.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Publisher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	private String address;
	
	public Publisher() { }
	
	public Publisher(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
}
