package com.example.deploymentdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.deploymentdemo.Results;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/test")
    public String test(){
        return "success";
    }

    @GetMapping("/test2")
    @ResponseBody
    public Results getTestInt(){
        return new Results(600);
    }
}