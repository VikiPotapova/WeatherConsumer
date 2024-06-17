package com.example.weatherconsumer.repository;

import com.example.weatherconsumer.model.Weather;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WeatherRepository extends MongoRepository<Weather, String> {
}
