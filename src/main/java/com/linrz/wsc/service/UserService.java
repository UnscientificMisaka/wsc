package com.linrz.wsc.service;

import com.linrz.wsc.domain.User;
import com.linrz.wsc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findOne (String email) {
        return userRepository.findOne(email);
    }

    public void insertOne () {
        User user = new User();
        user.setUsername("linrz");
        user.setEmail("linrunze@youzan.com");
        user.setPassword("123456");
        userRepository.save(user);
    }
}
