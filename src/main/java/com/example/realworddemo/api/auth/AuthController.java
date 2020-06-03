package com.example.realworddemo.api.auth;

import com.example.realworddemo.api.user.UserService;
import com.example.realworddemo.core.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthController {
    @Autowired
    private AuthService authService;

    @Autowired
    private UserService userService;

    @PostMapping("/auth/login")
    public @ResponseBody User login(@RequestBody User user) {
        System.out.println(user);
        return authService.login(user.getEmail(), user.getPassword());
    }
}
