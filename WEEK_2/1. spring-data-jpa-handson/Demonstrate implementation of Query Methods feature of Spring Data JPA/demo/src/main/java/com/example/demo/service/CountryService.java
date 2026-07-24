package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Country;
import com.example.demo.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;

    public Country getCountryByCode(String code) {
        return repository.findByCountryCode(code);
    }

    public Country getCountryByName(String name) {
        return repository.findByCountryName(name);
    }

}