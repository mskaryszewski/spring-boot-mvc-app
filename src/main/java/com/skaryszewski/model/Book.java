package com.skaryszewski.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.google.common.collect.Sets;

import lombok.Data;

/**
 * ManyToMany relationship: Books to Authors
 * OneToOne relationship:  Book to Publisher
 * @author Michal Skaryszewski
 *
 */
@Entity
@Data
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String title;
	private String isbn;
	
	@OneToOne
	private Publisher publisher;
	
	public Book() {}
	
	public Book(String title, String isbn, Publisher publisher) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.publisher = publisher;
	}

	@ManyToMany
	@JoinTable(name               = "AUTHOR_BOOK",
			   joinColumns        = @JoinColumn(name = "book_id"),   // define column name in join table instead of using a default one
			   inverseJoinColumns = @JoinColumn(name = "author_id")) // define column name in join table instead of using a default one
	private Set<Author> authors  = Sets.newHashSet();

}
