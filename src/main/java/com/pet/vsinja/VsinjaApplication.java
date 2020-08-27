package com.pet.vsinja;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value={"com.pet.vsinja.mapper"})
public class VsinjaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VsinjaApplication.class, args);
	}

}
