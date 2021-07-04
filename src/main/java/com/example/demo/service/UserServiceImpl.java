package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    public UserMapper userMapper;

    @Override
    public User getUserInfo(String name, String password) {
        return userMapper.getUserInfo(name,password);
    }
}
