package com.example.Deezer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@SpringBootApplication
@EnableDiscoveryClient

public class DeezerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeezerApplication.class, args);
	}

}
