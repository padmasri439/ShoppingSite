package com.example.BackEnd.Contoller;


import com.example.BackEnd.Entity.User;
import com.example.BackEnd.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class UserController
{
    @Autowired
    UserService userService;
    @PostMapping("/user/add")
    public void addUser(@RequestBody User U)
    {
        userService.saveUser(U);
        System.out.println("in user controller");
    }

    @GetMapping("/user/fetch")
    public List<User> getUsers()
    {
        return userService.getAllUsers();
    }

    @GetMapping("/user/fetchByUserName/{uname}")
    public Optional<User> getUserId(@PathVariable String uname)
    {
        return userService.getUserById(uname);
    }
}
