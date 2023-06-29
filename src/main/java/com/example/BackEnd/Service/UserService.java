package com.example.BackEnd.Service;

import com.example.BackEnd.Entity.User;
import com.example.BackEnd.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    public UserRepo userRepo;

    public void saveUser(User u){
        userRepo.save(u);
    }
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }
    public Optional<User> getUserById(String uname){
        return userRepo.findById(uname);
    }
}
