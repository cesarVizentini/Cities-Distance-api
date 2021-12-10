package com.github.cesarvizentini.citiesapi.countries.repository;

import com.github.cesarvizentini.citiesapi.countries.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
