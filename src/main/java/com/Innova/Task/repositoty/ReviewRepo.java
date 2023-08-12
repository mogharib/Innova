package com.Innova.Task.repositoty;

import com.Innova.Task.models.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewRepo extends MongoRepository<Review,String> {}
