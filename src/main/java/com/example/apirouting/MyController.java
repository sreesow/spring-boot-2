package com.example.apirouting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import com.example.apirouting.MyService;

@RestController
public class MyController {
    MyService myService = new MyService();

    @GetMapping("/")
    public String getHome() {
        return myService.getHome();
    }
    @GetMapping("/about")
    public String getAbout() {
        return myService.getAbout();
    }
}
