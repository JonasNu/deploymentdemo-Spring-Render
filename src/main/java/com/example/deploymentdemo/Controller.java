package com.example.deploymentdemo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.deploymentdemo.Results;

@RestController
@RequestMapping
public class Controller {

    @PostMapping("/test")
    public String test(){
        return "success";
    }

    @PostMapping("/test2")
    @ResponseBody
    public Results getTestInt(){
        System.out.print("Request recreived");
        return new Results(600);
    }
}