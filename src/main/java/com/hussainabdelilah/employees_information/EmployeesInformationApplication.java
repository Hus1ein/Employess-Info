package com.hussainabdelilah.employees_information;

import org.jsondoc.spring.boot.starter.EnableJSONDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJSONDoc
public class EmployeesInformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeesInformationApplication.class, args);
	}
}
