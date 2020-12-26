package com.orm;

import com.orm.entity.Car;
import com.orm.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class OrmApplication {

	@Autowired
	CarRepository carRepository;

	public static void main(String[] args) {
		SpringApplication.run(OrmApplication.class, args);
	}

	@PostConstruct
	public void dataIinit(){

		Car c1 = new Car("BMW", "M5");
		Car c2 = new Car("Kia", "Sorento");
		Car c3 = new Car("Mercedes", "S500");

		carRepository.save(c1);
		carRepository.save(c2);
		carRepository.save(c3);
	}

}
