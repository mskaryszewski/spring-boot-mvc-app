package com.skaryszewski.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skaryszewski.repositories.BookRepository;

import lombok.Data;

@Controller
@Data
public class BookController {
	
	private final BookRepository bookRepository;
	
	@RequestMapping("/books")
	public String getBooks(Model model) {
		model.addAttribute("books", bookRepository.findAll());
		return "books";
	}
}
