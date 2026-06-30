package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Country;
import com.example.demo.service.CountryService;

@RestController
public class CountryController {

    @Autowired
    private CountryService service;

    @GetMapping("/country/code/{code}")
    public Country getByCode(@PathVariable String code) {
        return service.getCountryByCode(code);
    }

    @GetMapping("/country/name/{name}")
    public Country getByName(@PathVariable String name) {
        return service.getCountryByName(name);
    }
}