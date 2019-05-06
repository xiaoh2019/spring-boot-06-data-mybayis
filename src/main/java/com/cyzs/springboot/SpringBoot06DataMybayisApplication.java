package com.cyzs.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.cyzs.springboot.mapper")
@SpringBootApplication
public class SpringBoot06DataMybayisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot06DataMybayisApplication.class, args);
	}

}
