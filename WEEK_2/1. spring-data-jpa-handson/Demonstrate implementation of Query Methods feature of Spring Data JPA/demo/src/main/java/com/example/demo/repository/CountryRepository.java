package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

    Country findByCountryCode(String countryCode);

    Country findByCountryName(String countryName);

}