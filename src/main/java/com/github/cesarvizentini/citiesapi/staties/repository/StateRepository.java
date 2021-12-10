package com.github.cesarvizentini.citiesapi.staties.repository;

import com.github.cesarvizentini.citiesapi.staties.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
