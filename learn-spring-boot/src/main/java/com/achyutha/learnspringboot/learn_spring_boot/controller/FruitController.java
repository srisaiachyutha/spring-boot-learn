package com.achyutha.learnspringboot.learn_spring_boot.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class FruitController {
    
    @GetMapping("/fruits")
    public List<String> getAllFruits() {
        return  List.of("apple", "papaya", "grapes");
    }


}
