package com.example.boot.hellobootdemo.repository;

import com.example.boot.hellobootdemo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
