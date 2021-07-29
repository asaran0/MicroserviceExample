package com.amar.springcloud.controller;

import com.amar.springcloud.entity.User;
import com.amar.springcloud.service.UserService;
import com.amar.springcloud.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/")
    public List<User> findAll() {
        return userService.findAllUsers();
    }

//    @GetMapping("/{id}")
//    public Optional<User> findById(@PathVariable Long id) {
//        return userService.findById(id);
//    }

    @GetMapping("/{userId}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable Long userId) {
        return userService.getUserWithDepartment(userId);
    }


}
