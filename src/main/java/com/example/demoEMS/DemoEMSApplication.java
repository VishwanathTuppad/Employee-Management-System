package com.example.demoEMS;

import com.example.demoEMS.model.Employee;
import com.example.demoEMS.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoEMSApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEMSApplication.class, args);
	}

//	@Autowired
//	private EmployeeRepository employeeRepository;
//
//	@Override
//	public void run(String... args) throws Exception {

//		Employee employee=new Employee();
//		employee.setFirstName("John11");
//		employee.setLastName("sena11");
//		employee.setEmailId("js@RCB.com");
//		employeeRepository.save(employee);

//		Employee employee1=new Employee();
//		employee1.setFirstName("Rohit");
//		employee1.setLastName("Sharma");
//		employee1.setEmailId("RS@MI.com");
//		employeeRepository.save(employee1);
//	}
}
