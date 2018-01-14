package com.skaryszewski.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skaryszewski.repositories.AuthorRepository;

import lombok.Data;

@Controller
@Data
public class AuthorController {
	
	private final AuthorRepository authorRepository;
	
	@RequestMapping("/authors")
	public String getAuthors(Model model) {
		model.addAttribute("authors", authorRepository.findAll());
		return "authors";
	}
}
