package com.skaryszewski.services;

import org.springframework.stereotype.Service;

import com.skaryszewski.externaljarsimulator.NumberGenerator;

import lombok.Data;

@Service
@Data
public class NumberGeneratorService {
	
	private final NumberGenerator numberGenerator;
	
	public int generateNumber() {
		return numberGenerator.generateNumber();
	}
}
