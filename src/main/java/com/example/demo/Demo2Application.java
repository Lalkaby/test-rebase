package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@EnableAutoConfiguration
@ComponentScan
@SpringBootConfiguration
@EnableConfigurationProperties
@PropertySource("classpath:app2-filtered.properties")
public class Demo2Application {

	public static void main(String[] args) {
		var context =	SpringApplication.run(Demo2Application.class, args);

		System.out.println(context.getBean(Compon.class).arr);
	}

}
