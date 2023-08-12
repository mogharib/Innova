package com.Innova.Task.models;

import javax.validation.constraints.Max;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {
    @Id
    private String reviewId;

    @Max(5)
    @NonNull
    private double rate;

    @NonNull
    private String comment;
    @NonNull
    private String storyId;
}
