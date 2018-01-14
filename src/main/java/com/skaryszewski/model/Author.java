package com.skaryszewski.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.google.common.collect.Sets;

import lombok.Data;

/**
 * ManyToMany relationship: Authors to Books
 * @author Michal Skaryszewski
 *
 */
@Entity
@Data
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String firstName;
	private String lastName;
	
	public Author() {}
	
	public Author(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@ManyToMany(mappedBy="authors")
	private Set<Book> books = Sets.newHashSet();

}
