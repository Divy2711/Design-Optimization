package com.upgrad.EmployeeService.cacheData;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.upgrad.EmployeeService.entities.Employee;

@Configuration
public class CacheStoreBean {

	@Bean
	public CacheStore<Employee> employeeCache(){
		return new CacheStore<Employee>(120,TimeUnit.SECONDS);
	}
}
