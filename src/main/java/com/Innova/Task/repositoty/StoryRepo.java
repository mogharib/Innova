package com.Innova.Task.repositoty;

import com.Innova.Task.models.Story;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoryRepo extends MongoRepository<Story,String> {

    Page<Story> findAllByUserId(String userId, Pageable pageable);
    Page<Story> findAllByOrderByCreatedAtDesc( Pageable pageable);

}
