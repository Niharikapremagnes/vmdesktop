package com.SpringBoot.Department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@SpringBootApplication
@EnableEurekaClient
public class DepartmentDataApplication
{	
	public static void main(String[] args) 
	{
		SpringApplication.run(DepartmentDataApplication.class, args);
	}

}
