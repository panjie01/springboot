package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

public interface UserService {
    public User getUserById(int userId);
    boolean addUser(User record);

}
