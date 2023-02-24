package com.upgrad.EmployeeService.controller;

import com.upgrad.EmployeeService.cacheData.CacheStore;
import com.upgrad.EmployeeService.entities.Employee;
import com.upgrad.EmployeeService.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    EmployeeService employeeService;
    
    @Autowired
    CacheStore<Employee> employeeCache;

    @GetMapping("/employee/{id}")
    public Employee searchEmployeeByID(@PathVariable int id) {
        System.out.println("Searching Employee by ID  : " + id);
        
        // search for employee in cache
        Employee cachedEmployee = employeeCache.get(id);
        if(cachedEmployee!=null) {
        	return cachedEmployee;
        }
        
        // if not , get the employee from service layer and add it to employee cache.
        Employee savedEmployee = employeeService.getEmployeeByID(id);
        employeeCache.add(savedEmployee.getId(), savedEmployee);
        return savedEmployee;
    }


}
