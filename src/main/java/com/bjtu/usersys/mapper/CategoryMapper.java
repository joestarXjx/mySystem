package com.bjtu.usersys.mapper;

import com.bjtu.usersys.entity.Book;
import com.bjtu.usersys.entity.BookCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface CategoryMapper {
    @Select("SELECT * FROM BookCategory")
    List<BookCategory> getAllCategory();

    @Select("SELECT * FROM BookCategory WHERE id=#{id}")
    BookCategory getCategory(int id);
}
