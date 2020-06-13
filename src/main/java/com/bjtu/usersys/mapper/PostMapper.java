package com.bjtu.usersys.mapper;

import com.bjtu.usersys.entity.Post;
import com.bjtu.usersys.entity.PostReview;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface PostMapper {
    @Select("SELECT * FROM post")
    List<Post> getAllPost();

    @Select("SELECT * FROM post WHERE id=#{id}")
    Post getPostById(int id);

    @Select("SELECT * FROM postReview WHERE pid=#{pid}")
    List<PostReview> getReview(int pid);
}
