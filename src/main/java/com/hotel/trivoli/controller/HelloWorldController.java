package com.hotel.trivoli.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class HelloWorldController {

    @GetMapping("/Hello")
    // @GetMapping("/")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hola bb");
    }
}