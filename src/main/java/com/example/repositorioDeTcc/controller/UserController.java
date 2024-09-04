package com.example.repositorioDeTcc.controller;

import com.example.repositorioDeTcc.dto.LoginRequestDTO;
import com.example.repositorioDeTcc.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private AuthService authService;

    @GetMapping("/hello")
    public ResponseEntity getUser(){
        return ResponseEntity.ok("Hello World");
    }
}
