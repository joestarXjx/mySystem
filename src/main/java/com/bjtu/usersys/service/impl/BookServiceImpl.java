package com.bjtu.usersys.service.impl;

import com.bjtu.usersys.entity.Book;
import com.bjtu.usersys.entity.BookCategory;
import com.bjtu.usersys.mapper.BookMapper;
import com.bjtu.usersys.mapper.CategoryMapper;
import com.bjtu.usersys.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookMapper bookMapper;

    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Book> findAllByCategory(int cid) {
        BookCategory bookCategory=categoryMapper.getCategory(cid);
        return bookMapper.findAllByCategory(bookCategory);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }

    @Override
    public Book findBookById(int bookId) {
        return bookMapper.findBookById(bookId);
    }

    @Override
    public List<Book> findBooksByKeyWork(String keyword1,String keyword2) {
        return bookMapper.findBooksByKeyWork(keyword1,keyword2);
    }

    @Override
    public void addBook(Book book) {
        bookMapper.addBook(book);
    }

    @Override
    public void updateBook(Book book) {
        bookMapper.updateBook(book);
    }

    @Override
    public void deleteBook(int bookId) {
        bookMapper.deleteBook(bookId);
    }
}
