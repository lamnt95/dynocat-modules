package com.example.realworddemo.api.user;

import com.example.realworddemo.core.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public @ResponseBody User findUserByUsername(@RequestParam String username) {
        return userService.findUserByUsername(username);
    }
}
