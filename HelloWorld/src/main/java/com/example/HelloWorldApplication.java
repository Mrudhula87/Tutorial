package com.example;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import org.assertj.core.internal.Strings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		{
			LocalDate today = LocalDate.now();
			System.out.println("Current Date="+today);
			
			LocalDate firstDay_2016 = LocalDate.of(2016, Month.JANUARY, 1);
			System.out.println("Specific Date="+firstDay_2016);	
		}
		{
			LocalTime time = LocalTime.now();
			System.out.println("Current Time="+time);
			
			LocalTime specificTime = LocalTime.of(12,20,25,40);
			System.out.println("Specific Time of Day="+specificTime);
			
		}
		SpringApplication.run(HelloWorldApplication.class, args);
		HelloWorld helloWorld = (String name) -> { return "Hello " + name; };
	      
	      System.out.println(helloWorld.sayHello("Gorthy"));
	}
}


