package com.minkov.factories;

import com.minkov.models.City;
import com.minkov.models.Country;

import java.util.HashMap;
import java.util.Map;

public class CitiesFactory {
  private final Map<String, City> citiesMap;

  public CitiesFactory() {
    citiesMap = new HashMap<>();
  }

  public City getCity(String name, Country country) {
    if (!citiesMap.containsKey(name.toLowerCase())) {
      citiesMap.put(name.toLowerCase(), new City(name, country));
    }

    return citiesMap.get(name.toLowerCase());
  }
}
