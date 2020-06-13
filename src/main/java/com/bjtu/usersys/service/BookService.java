package com.bjtu.usersys.service;

import com.bjtu.usersys.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> findAllByCategory(int cid);
    List<Book> getAllBooks();
    Book findBookById(int bookId);
    List<Book> findBooksByKeyWork(String keyword1,String keyword2);
    void addBook(Book book);
    void updateBook(Book book);
    void deleteBook(int bookId);
}
