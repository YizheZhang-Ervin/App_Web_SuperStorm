package com.ervin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.cache.annotation.EnableCaching;

// ./mvnw spring-boot:run

@SpringBootApplication
@EnableCaching
@MapperScan("com.ervin.dao") //扫描的mapper
public class StarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarterApplication.class, args);
	}


}