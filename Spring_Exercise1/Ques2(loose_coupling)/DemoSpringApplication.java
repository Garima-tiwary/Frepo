package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringApplication {


	public static void main(String[] args) {
     Traveller tc=new Traveller(new Scooty());
	 tc.choice();


	 SpringApplication.run(DemoSpringApplication.class,args);
	 
}

}
