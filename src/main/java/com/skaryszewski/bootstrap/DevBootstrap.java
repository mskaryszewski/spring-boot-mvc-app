package com.skaryszewski.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.skaryszewski.model.Author;
import com.skaryszewski.model.Book;
import com.skaryszewski.model.Publisher;
import com.skaryszewski.repositories.AuthorRepository;
import com.skaryszewski.repositories.BookRepository;
import com.skaryszewski.repositories.PublisherRepository;

import lombok.RequiredArgsConstructor;

/**
 * DB initialization
 * @author Michal Skaryszewski
 *
 */
@Component
@RequiredArgsConstructor
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		initData();
	}
	
	private void initData() {
		Author author1 = new Author("Name1", "SecondName1");
		Publisher publisher1 = new Publisher("P1", "a1");
		publisherRepository.save(publisher1);
		
		Book book1 = new Book("Book 1", "111", publisher1);
		book1.getAuthors().add(author1);
		authorRepository.save(author1);
		bookRepository.save(book1);
		
		Author author2 = new Author("Name2", "SecondName2");
		Publisher publisher2 = new Publisher("P2", "a2");
		publisherRepository.save(publisher2);
		
		Book book2 = new Book("Book 2", "222", publisher2);
		book2.getAuthors().add(author2);
		authorRepository.save(author2);
		bookRepository.save(book2);
	}
}
