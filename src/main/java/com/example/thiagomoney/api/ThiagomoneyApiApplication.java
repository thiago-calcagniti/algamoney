package com.example.thiagomoney.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.thiagomoney.api.config.propety.AlgamoneyApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(AlgamoneyApiProperty.class)
public class ThiagomoneyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThiagomoneyApiApplication.class, args);
	}

}
