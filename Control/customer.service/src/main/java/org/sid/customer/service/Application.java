package org.sid.customer.service;

import org.sid.customer.service.entities.Customer;
import org.sid.customer.service.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return  args -> {
				customerRepository.save(new Customer(null,"Mhammed","mhammed@gmail.com"));
				customerRepository.save(new Customer(null,"Ali","Ali@gmail.com"));
				customerRepository.save(new Customer(null,"Ishaq","Ishaq@gmail.com"));

				customerRepository.findAll().forEach(customer ->{
					System.out.println(customer.toString());
				});
		};
	}
}
