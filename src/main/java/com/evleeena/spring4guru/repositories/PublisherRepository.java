package com.evleeena.spring4guru.repositories;

import com.evleeena.spring4guru.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
