package com.example.realworddemo.api.user;

import com.example.realworddemo.core.user.User;
import com.example.realworddemo.core.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findUserById(String id) {
        return userRepository.findUserById(id);
    }

    public User findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    public User findUserByEmailAndPassword(String email, String password) {
        return userRepository.findUserByEmailAndPassword(email, password);
    }
}
