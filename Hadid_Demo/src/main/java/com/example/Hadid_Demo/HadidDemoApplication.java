package com.example.Hadid_Demo;

import com.example.Hadid_Demo.domain.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class HadidDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HadidDemoApplication.class, args);
	}

}
