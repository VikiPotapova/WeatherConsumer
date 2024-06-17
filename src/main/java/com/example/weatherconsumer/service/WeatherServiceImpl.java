package com.example.weatherconsumer.service;

import com.example.weatherconsumer.model.Weather;
import com.example.weatherconsumer.repository.WeatherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WeatherServiceImpl implements WeatherService {

    private final WeatherRepository weatherRepository;

    @Override
    public Weather saveMessage(Weather weather) {
        return weatherRepository.save(weather);
    }
}
