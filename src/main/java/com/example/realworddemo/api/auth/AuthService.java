package com.example.realworddemo.api.auth;

import com.example.realworddemo.api.user.UserService;
import com.example.realworddemo.core.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserService userService;

    public User login(String email, String password) {
        return userService.findUserByEmailAndPassword(email, password);
    }
}
