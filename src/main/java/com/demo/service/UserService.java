package com.demo.service;

import com.demo.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component("userService")
public interface UserService {

    public User getUserById(Integer userId);

    boolean addUser(User record);

}