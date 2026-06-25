package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Country;
import com.example.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Country getCountryById(int id) {
        return countryRepository.findById(id).orElse(null);
    }

    public void deleteCountry(int id) {
        countryRepository.deleteById(id);
    }
}