package com.global.hr.data;

import java.util.ArrayList;

import org.explicit.bean.config.ServiceConfig;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan(basePackages = {"com.global.hr.data", "org.explicit.bean"})


@Import(ServiceConfig.class)

public class DataInitializerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataInitializerApplication.class, args);
	}}



