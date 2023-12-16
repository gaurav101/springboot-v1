package com.springboot.learnin.ch2.controllers.rest;

import com.springboot.learnin.ch2.dto.Video;
import com.springboot.learnin.ch2.services.VideoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {
    public final VideoService videoService;
    public ApiController(VideoService videoService){
        this.videoService=videoService;
    }
    @GetMapping("/api/videos")
    public List<Video> all(){
        return videoService.getVideos();
    }
    @PostMapping("/api/videos")
    public Video add(@RequestBody Video newVideo){
        videoService.create(newVideo);
        return newVideo;
    }
}
