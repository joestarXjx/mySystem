package com.bjtu.usersys.mapper;

import com.bjtu.usersys.entity.User;
import org.apache.ibatis.annotations.*;


import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {

	// Find user by name
	@Select("select * from user where username = #{username}")
	User getUserByName(String username);

	@Select("select * from user where phone=#{phone}")
	User getUserByPhone(String phone);

	@Select("select * form user where mail=#{mail}")
	User getUserByMail(String mail);

	@Select("select * from user where id = #{userId}")
	public User getUserById(int userId);

    @Insert("insert into user values(#{username},#{password},#{mail}," +
			"#{phone})")
	public void addNewUser(User user);

	@Update("update user set name=#{name},sex=#{sex},school=#{school},major=#{major}," +
			"education=#{education},birth=#{birth},description=#{description} where id = #{userId}")
	public void detailUser(User user);
}
