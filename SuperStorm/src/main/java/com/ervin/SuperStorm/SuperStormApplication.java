package com.ervin.SuperStorm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ervin.SuperStorm.dao")
public class SuperStormApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperStormApplication.class, args);
	}

}
