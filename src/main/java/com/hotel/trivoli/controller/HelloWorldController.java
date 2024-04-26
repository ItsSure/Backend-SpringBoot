package com.hotel.trivoli.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/test")
@Tag(name = "Hola mundo", description = "Endpoints para saludar al mundo :v")
public class HelloWorldController {

    @Operation(summary = "Obtener saludo")
    @GetMapping("/Hello")
    // @GetMapping("/")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hola bb");
    }
}
