package com.github.cesarvizentini.citiesapi.countries.controller;

import com.github.cesarvizentini.citiesapi.countries.model.Country;
import com.github.cesarvizentini.citiesapi.countries.repository.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private final CountryRepository repository;

    public CountryController(final CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Country> cities() {
        return repository.findAll();
    }

}
