package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Country;

@RestController
public class CountryController {

    private List<Country> countries = new ArrayList<>();

    public CountryController() {

        countries.add(new Country(1, "India", "New Delhi"));
        countries.add(new Country(2, "USA", "Washington D.C."));
        countries.add(new Country(3, "Japan", "Tokyo"));
    }

    @GetMapping("/countries")
    public List<Country> getCountries() {
        return countries;
    }

    @GetMapping("/countries/{id}")
    public Country getCountry(@PathVariable int id) {

        for (Country c : countries) {
            if (c.getId() == id) {
                return c;
            }
        }

        return null;
    }
}