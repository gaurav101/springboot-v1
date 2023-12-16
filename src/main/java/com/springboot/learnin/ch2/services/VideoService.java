package com.springboot.learnin.ch2.services;

import org.springframework.stereotype.Service;
import com.springboot.learnin.ch2.dto.Video;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideoService {
    List<Video> videos = List.of(
            new Video("Need Help with your SPRING BOOT"),
            new Video("SECRETS to fix Broken Code"),
            new Video("Dont't do this to your own code")

    );
    public List<Video> getVideos(){
        return videos;
    }
    public Video create(Video newVideo){
        List<Video> extended=new ArrayList<>(videos);
        extended.add(newVideo);
        this.videos=List.copyOf(extended);
        return newVideo;
    }
}
