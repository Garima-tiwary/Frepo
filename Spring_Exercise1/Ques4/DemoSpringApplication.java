package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringApplication {


	public static void main(String[] args) {
//     Traveller tc=new Traveller(new Scooty());

//	 tc.choice();


//Use of Application context-it manages the beans
		SpringApplication.run(DemoSpringApplication.class,args);
	 ApplicationContext applicationContext=SpringApplication.run(DemoSpringApplication.class);
	 Traveller tc =applicationContext.getBean(Traveller.class);
	 tc.choice();


}

}
