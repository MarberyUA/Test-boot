package com.example.boot.hellobootdemo.controller;

import com.example.boot.hellobootdemo.entity.Book;
import com.example.boot.hellobootdemo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public String test() {
        Book book = new Book("Kobzar", 100.0, 2019);
        Book savedBook = bookRepository.save(book);
        System.out.println(bookRepository.findById(1L).get());
        return "books";
    }

}
