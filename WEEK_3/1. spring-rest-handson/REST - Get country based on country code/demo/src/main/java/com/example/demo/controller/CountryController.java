package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Country;

@RestController
public class CountryController {

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {

        if (code.equalsIgnoreCase("IN")) {
            return new Country("IN", "India", "New Delhi");
        }
        else if (code.equalsIgnoreCase("US")) {
            return new Country("US", "United States", "Washington D.C.");
        }
        else if (code.equalsIgnoreCase("JP")) {
            return new Country("JP", "Japan", "Tokyo");
        }

        return null;
    }
}