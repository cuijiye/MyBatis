package com.example.mybatis.mapper;

import com.example.mybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper //表示为Spring的的Mapper类
@Repository
public interface UserMapper {

    List<User> queryUserList();

    User queryUserByID(int id);

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
}
