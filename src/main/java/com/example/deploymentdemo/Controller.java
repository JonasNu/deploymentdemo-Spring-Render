package com.example.deploymentdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        System.out.println("userData: ");
        System.out.println(userData);
        return new Results(600);
    }
}