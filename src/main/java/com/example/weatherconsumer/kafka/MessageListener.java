package com.example.weatherconsumer.kafka;

import com.example.weatherconsumer.model.Weather;
import com.example.weatherconsumer.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MessageListener {

    private final WeatherService weatherService;

    @KafkaListener(topics = "${kafka.topic.name}", containerFactory = "kafkaListenerContainerFactory")
    public void listen(Weather weather) {
        System.out.println("Recieved message: " + weather.toString());
        weatherService.saveMessage(weather);
    }
}
