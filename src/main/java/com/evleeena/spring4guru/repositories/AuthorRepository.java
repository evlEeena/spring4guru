package com.evleeena.spring4guru.repositories;

import com.evleeena.spring4guru.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
