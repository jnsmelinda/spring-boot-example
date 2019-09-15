package com.example.demo.controller;

import com.example.demo.model.EchoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
    @GetMapping("/echo/{msg}")
    public EchoResponse echo(
            @PathVariable String msg,
            @RequestParam(required = false, defaultValue = "false") boolean reverse) {
        if (reverse) {
            return EchoResponse.builder()
                    .message(new StringBuilder(msg).reverse().toString())
                    .reversed(reverse)
                    .build();
        }

        else {
            return EchoResponse.builder()
                    .message(msg)
                    .reversed(reverse)
                    .build();
        }
    }
}
