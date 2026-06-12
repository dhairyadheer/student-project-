package com.example.studyplanner.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class homecontroller {
    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/add-task")
    public String addTask() {
        return "add-task";
    }
}
