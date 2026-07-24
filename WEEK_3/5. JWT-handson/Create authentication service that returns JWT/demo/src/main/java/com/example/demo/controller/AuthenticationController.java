package com.example.demo.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.JwtService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtService jwtService;

    @GetMapping("/authenticate")
    public String authenticate(HttpServletRequest request) {

        String header = request.getHeader(HttpHeaders.AUTHORIZATION);

        if (header == null || !header.startsWith("Basic ")) {
            return "{\"message\":\"Authorization header missing\"}";
        }

        String base64Credentials = header.substring(6);

        byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);

        String credentials = new String(decodedBytes);

        String[] values = credentials.split(":", 2);

        String username = values[0];
        String password = values[1];

        // simple validation
        if (!username.equals("user") || !password.equals("pwd")) {
            return "{\"message\":\"Invalid Credentials\"}";
        }

        String token = jwtService.generateToken(username);

        return "{\"token\":\"" + token + "\"}";
    }

}