package com.github.cesarvizentini.citiesapi.staties.controller;

import com.github.cesarvizentini.citiesapi.staties.model.State;
import com.github.cesarvizentini.citiesapi.staties.repository.StateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/staties")
public class StateController {

    private final StateRepository repository;

    public StateController(final StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> staties() {
        return repository.findAll();
    }

}
