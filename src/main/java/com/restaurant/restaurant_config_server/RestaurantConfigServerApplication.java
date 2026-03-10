package com.restaurant.restaurant_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RestaurantConfigServerApplication {

	public static void main(String[] args) {

        SpringApplication.run(RestaurantConfigServerApplication.class, args);
	}

}
