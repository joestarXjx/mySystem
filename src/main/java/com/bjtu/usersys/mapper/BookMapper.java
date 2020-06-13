package com.bjtu.usersys.mapper;

import com.bjtu.usersys.entity.Book;
import com.bjtu.usersys.entity.BookCategory;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface BookMapper {
    @Select("SELECT * FROM Book WHERE cid=#{id}")
    List<Book> findAllByCategory(BookCategory category);

    @Select("SELECT * FROM Book")
    List<Book> getAllBooks();

    @Select("SELECT * FROM Book WHERE author like #{keyword1} or title like #{keyword2}")
    List<Book> findBooksByKeyWork(String keyword1,String keyword2);

    @Select("SELECT * FROM Book WHERE id=#{bookId}")
    Book findBookById(int bookId);

    @Insert("INSERT INTO Book(cover,title,author,date,press,abouts,cid) VALUES " +
            "(#{cover},#{title},#{author},#{date},#{press},#{abouts},#{bookCategoryId})")
    void addBook(Book book);

    @Update("Update Book SET cover=#{cover},title=#{title},author=#{author},date=#{date}," +
            "press=#{press},abouts=#{abouts},cid=#{bookCategoryId} WHERE id=#{bookId}")
    void updateBook(Book book);

    @Delete("Delete From Book WHERE id=#{bookId}")
    void deleteBook(int bookId);

}
