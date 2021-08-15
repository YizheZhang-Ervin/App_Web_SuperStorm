package com.ervin.dao;

import com.ervin.po.User;
import com.ervin.query.UserQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User getUser(Integer userId);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Integer userId);

    List<User> queryUserByParams(UserQuery userQuery);
}