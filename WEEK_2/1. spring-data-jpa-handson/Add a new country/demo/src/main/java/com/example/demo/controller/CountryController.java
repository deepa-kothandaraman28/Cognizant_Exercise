package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Country;
import com.example.demo.service.CountryService;

@RestController
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code) {
        return service.getCountryByCode(code);
    }

    @PostMapping("/country")
    public Country addCountry(@RequestBody Country country) {
        return service.addCountry(country);
    }
}