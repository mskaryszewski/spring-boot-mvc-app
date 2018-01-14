package com.skaryszewski.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.skaryszewski.externaljarsimulator.NumberGenerator;

@Configuration
public class RandomNumberConfig {
	
	@Bean
	public NumberGenerator numberGenerator() {
		return new NumberGenerator();
	}
}
