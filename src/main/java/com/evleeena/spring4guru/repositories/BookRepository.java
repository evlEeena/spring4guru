package com.evleeena.spring4guru.repositories;

import com.evleeena.spring4guru.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
