package com.skaryszewski.repositories;

import org.springframework.data.repository.CrudRepository;

import com.skaryszewski.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
