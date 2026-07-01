package com.example.model;

public class Country {

    private String name;
    private String capital;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void display() {
        System.out.println("Country Name: " + name);
        System.out.println("Capital: " + capital);
    }
}