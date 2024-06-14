package com.example.weatherconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class WeatherConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(WeatherConsumerApplication.class, args);
    }
}
