package com.example.weatherconsumer.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "weather")
public class Weather {

    @Id
    private Long id;
    private String city;
    private Integer temperature;
    private LocalDateTime localDateTime;
}
