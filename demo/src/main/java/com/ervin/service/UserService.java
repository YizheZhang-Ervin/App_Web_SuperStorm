package com.ervin.service;

import com.ervin.po.User;
import com.ervin.dao.UserMapper;
import com.ervin.query.UserQuery;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    @Cacheable(value="users",key="#userId")
    public User getUser(Integer userId){
        return userMapper.getUser(userId);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void addUser(User user){
        userMapper.addUser(user);
    }

    @CachePut(value="users",key="#user.userId")
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateUser(User user){
        userMapper.updateUser(user);
    }

    @CacheEvict(value="users",key="#userId",allEntries = false,beforeInvocation = false)
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteUser(Integer userId){
        userMapper.deleteUser(userId);
    }

    @Cacheable(value="users",key="#userQuery.pageNum+'-'+#userQuery.pageSize+'-'+#userQuery.userName")
    // 多个查询条件则key = "#xx.a +‘-’+ xx.b",根据任意一个条件查都会缓存
    public PageInfo<User> queryUserByParams(UserQuery userQuery){
        PageHelper.startPage(userQuery.getPageNum(),userQuery.getPageSize());// 分页
        List<User> userList = userMapper.queryUserByParams(userQuery); // 查询
        PageInfo<User> pageInfo = new PageInfo<>(userList);
        return pageInfo;
    }
}
