package com.example.weatherconsumer.kafka;

import com.example.weatherconsumer.model.WeatherDto;
import com.example.weatherconsumer.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MessageListener {

    private final WeatherService weatherService;

    @KafkaListener(topics = "${kafka.topic.name}", containerFactory = "kafkaListenerContainerFactory")
    public void listen(WeatherDto weatherDto) {
        System.out.println("Recieved message: " + weatherDto.toString());
        weatherService.saveMessage(weatherDto);
    }
}
