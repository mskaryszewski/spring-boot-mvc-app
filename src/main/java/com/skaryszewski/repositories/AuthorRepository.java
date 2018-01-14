package com.skaryszewski.repositories;

import org.springframework.data.repository.CrudRepository;

import com.skaryszewski.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
