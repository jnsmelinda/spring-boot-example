package com.example.demo.controller;

import com.example.demo.model.AddingResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddingController {
    @GetMapping("/add")
    public AddingResponse add(
            @RequestParam(required = false, defaultValue = "0") int a,
            @RequestParam(required = false, defaultValue = "0") int b) {
        return AddingResponse.builder()
                .result(a + b)
                .build();
    }
}
