package com.ekimbasoglu2019230496;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class Ekimbasoglu2019230496Application {

	public static void main(String[] args) {
		SpringApplication.run(Ekimbasoglu2019230496Application.class, args);
	}

}
