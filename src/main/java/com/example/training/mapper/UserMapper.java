package com.example.training.mapper;

import com.example.training.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserMapper {


    String insert(User user);

    @Select("Select * From user_info_ Where username = #{username}")
//    @Results({
//            @Result(property = "id", column = "id"),
//            @Result(property = "username", column = "account_"),
//            @Result(property = "password", column = "password")
//    })
    User findUserByAccount(String username);

    @Update("update user_info_ " +
            "set id = #{id}," +
            "username = #{username}," +
            "password = #{password} " +
            "where id = #{id}")
    void update(User user);

    @Select("Select * From user_info_")
//    @Results({
//            @Result(property = "id", column = "id"),
//            @Result(property = "username", column = "username"),
//            @Result(property = "password", column = "password")
//    })
    List<User> findAll();
}
