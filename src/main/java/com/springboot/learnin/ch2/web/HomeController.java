package com.springboot.learnin.ch2.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import com.springboot.learnin.ch2.dto.Video;
import com.springboot.learnin.ch2.services.VideoService;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    private final VideoService videoService;

    public HomeController(VideoService videoService){
        this.videoService=videoService;
    }
    @GetMapping("/")
    public String index(Model model) {
      model.addAttribute("videos",videoService.getVideos());
      return "index";
    }
    @PostMapping("/new-video")
    public String newVideo(@ModelAttribute Video newVideo){
        videoService.create(newVideo);
        return "redirect:/";
    }
    @GetMapping("/react-app")
    public String ui(){
        return "react";
    }


}
