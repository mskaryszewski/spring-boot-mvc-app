package com.skaryszewski.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skaryszewski.services.NumberGeneratorService;

import lombok.Data;

/**
 * It is a {@link RestController}, not {@link org.springframework.stereotype.Controller} because it's not used with thymeleaf
 * and Spring MVC. It's just to show how {@link NumberGeneratorService} 
 * collaborates with  injected {@link com.skaryszewski.externaljarsimulator.NumberGenerator} from external jar file.
 * 
 * @author Michal Skaryszewski
 *
 */
@RestController
@Data
public class RandomNumberController {
	
	private final NumberGeneratorService numberGeneratorService;
	
	@GetMapping("random-number")
	public int randomNumber() {
		return numberGeneratorService.generateNumber();
	}
}
