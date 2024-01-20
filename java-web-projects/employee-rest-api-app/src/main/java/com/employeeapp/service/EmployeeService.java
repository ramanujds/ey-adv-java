package com.employeeapp.service;

import com.employeeapp.model.Employee;
import com.employeeapp.respository.EmployeeRepository;

import java.util.List;

public class EmployeeService {

    private EmployeeRepository employeeRepo = new EmployeeRepository();

    public List<Employee> getAllEmployees(){
      return employeeRepo.getAllEmployees();
    }

    public Employee getEmployeeById(int id){
     return  employeeRepo.getEmployeeById(id);
    }

    public Employee saveEmployee(Employee employee){
      return employeeRepo.saveEmployee(employee);
    }

    public void deleteEmployee(int id){
        employeeRepo.deleteEmployee(id);
    }

    public Employee updateEmployee(Employee employee){
       return employeeRepo.updateEmployee(employee);
    }

}
