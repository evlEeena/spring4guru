package com.evleeena.spring4guru.bootstrap;

import com.evleeena.spring4guru.model.Author;
import com.evleeena.spring4guru.model.Book;
import com.evleeena.spring4guru.model.Publisher;
import com.evleeena.spring4guru.repositories.AuthorRepository;
import com.evleeena.spring4guru.repositories.BookRepository;
import com.evleeena.spring4guru.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BootStrapData implements CommandLineRunner {
    @Resource
    private AuthorRepository authorRepository;
    @Resource
    private BookRepository bookRepository;
    @Resource
    private PublisherRepository publisherRepository;

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "124441");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development  without EJB", "56754624");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of books: " + bookRepository.count());

        Publisher publisher = new Publisher("Addison-Wesley Professional", "Boston", "Massachusetts");
        publisherRepository.save(publisher);
        System.out.println("Publisher: " + publisherRepository.findAll());
    }
}
