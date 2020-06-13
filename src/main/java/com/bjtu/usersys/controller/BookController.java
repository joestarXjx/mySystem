package com.bjtu.usersys.controller;

import com.bjtu.usersys.entity.Book;
import com.bjtu.usersys.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @CrossOrigin
    @GetMapping("/api/books")
    public List<Book> list() throws Exception {
        return bookService.getAllBooks();
    }

    @CrossOrigin
    @PostMapping("/api/books")
    public Book add(@RequestBody Book book) throws Exception {
        bookService.addBook(book);
        return book;
    }

    @CrossOrigin
    @PostMapping("/api/delete")
    public void delete(@RequestBody Book book) throws Exception {
        bookService.deleteBook(book.getBookId());
    }

    @CrossOrigin
    @GetMapping("/api/categories/{cid}/books")
    public List<Book> listByCategory(@PathVariable("cid") int cid) throws Exception {
        if (0 != cid) {
            return bookService.findAllByCategory(cid);
        } else {
            return list();
        }
    }

    @CrossOrigin
    @GetMapping("/api/search")
    public List<Book> searchResult(@RequestParam("keywords") String keywords) {
        // 关键词为空时查询出所有书籍
        if ("".equals(keywords)) {
            return bookService.getAllBooks();
        } else {
            return bookService.findBooksByKeyWork('%' + keywords + '%','%' + keywords + '%');
        }
    }
}
