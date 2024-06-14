package com.example.weatherconsumer.repository;

import com.example.weatherconsumer.model.WeatherDto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface WeatherRepository extends MongoRepository<WeatherDto, String> {
}
