package com.Innova.Task.repositoty;

import com.Innova.Task.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, String> {}
