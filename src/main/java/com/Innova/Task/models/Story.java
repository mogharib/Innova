package com.Innova.Task.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Story {
    @Id
    private String storyId;

    @NonNull
    private String title;

    @NonNull
    private String body;
    @NonNull
    private String userId;
    private long createdAt = System.currentTimeMillis();
}
