package com.Innova.Task.service;

import com.Innova.Task.models.Review;
import com.Innova.Task.repositoty.ReviewRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReviewService {
    private final ReviewRepo reviewRepo;

    public Review addReview(Review review){
        return reviewRepo.save(review);
    }
}
