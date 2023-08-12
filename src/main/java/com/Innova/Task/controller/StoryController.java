package com.Innova.Task.controller;

import com.Innova.Task.models.Story;
import com.Innova.Task.service.StoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/stories")

public class StoryController {

    private final StoryService storyService;


    @Operation(description = "Add New Story")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201")})
    @PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Story> addNewStory(
        @RequestBody @Valid Story story) {
        return new ResponseEntity<>(storyService.addStory(story), HttpStatus.CREATED);
    }

    @Operation(description = "Get Top Posts")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200")})
    @GetMapping(path = "/top", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Page<Story>> getTopStories(
        @RequestParam(defaultValue = "0") Integer pageNo,
        @RequestParam(defaultValue = "10") Integer pageSize) {
        return new ResponseEntity<>(storyService.getTopStories(pageNo, pageSize), HttpStatus.OK);
    }

    @Operation(description = "Get Top Posts")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200")})
    @GetMapping(path = "/users/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Page<Story>> getAllUserStories(
        @PathVariable String userId,@RequestParam(defaultValue = "0") Integer pageNo,
        @RequestParam(defaultValue = "10") Integer pageSize) {
        return new ResponseEntity<>(storyService.getAllUserStories(userId,pageNo, pageSize),
            HttpStatus.OK);
    }
}
