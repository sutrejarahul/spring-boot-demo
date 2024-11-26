package com.example;

import com.example.model.Laptop;
import com.example.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	 ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		LaptopService laptopService = applicationContext.getBean(LaptopService.class);

		Laptop laptop = applicationContext.getBean(Laptop.class);
		laptopService.addLaptop(laptop);;

	}

}
