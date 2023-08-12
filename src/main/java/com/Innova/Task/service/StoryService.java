package com.Innova.Task.service;

import com.Innova.Task.models.Story;
import com.Innova.Task.repositoty.StoryRepo;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StoryService {
    private final StoryRepo storyRepo;

    public Story addStory(Story story){
        return storyRepo.save(story);
    }

    public Page<Story> getAllUserStories(String userId , int pageNo,int pageSize){
        PageRequest paging = PageRequest.of(pageNo, pageSize);
        return storyRepo.findAllByUserId(userId,paging);
    }

    public Page<Story> getTopStories(int pageNo,int pageSize){
        PageRequest paging = PageRequest.of(pageNo, pageSize);
        return storyRepo.findAllByOrderByCreatedAtDesc(paging);
    }


}
