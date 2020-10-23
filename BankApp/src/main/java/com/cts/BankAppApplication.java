package com.cts;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cts.dao.BankDAO;
import com.cts.model.Bank;


@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class BankAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankAppApplication.class, args);
	}
	
	@Bean
	CommandLineRunner initDatabase(final BankDAO repository) {

		
		return args -> {
			repository.save(new Bank(1, "HDFC Bank", "Kharadi", "Pune", 80000));
			repository.save(new Bank(2, "HDFC Bank", "Viman Nagar", "Pune", 160000));
			repository.save(new Bank(3, "HDFC Bank", "Hinjewadi", "Pune", 60000));
			repository.save(new Bank(4, "HDFC Bank", "Hadapsar", "Pune", 90000));
			repository.save(new Bank(5, "HDFC Bank", "Magarpatta", "Pune", 80000));
			repository.save(new Bank(6, "HDFC Bank", "Pimpri", "Pune", 80000));
			
		};
	}
	

}
