package com.example.weatherconsumer.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "weather")
public class WeatherDto {

    @NotBlank
    private String city;

    @NotNull
    private Integer temperature;

    @NotNull
    private LocalDateTime localDateTime;
}
