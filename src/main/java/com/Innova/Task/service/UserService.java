package com.Innova.Task.service;

import com.Innova.Task.models.User;
import com.Innova.Task.repositoty.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepo userRepo;
    public User addUser(User user){
        return userRepo.save(user);
    }
}
