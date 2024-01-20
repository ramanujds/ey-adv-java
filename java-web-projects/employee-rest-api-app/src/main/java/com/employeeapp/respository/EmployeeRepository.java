package com.employeeapp.respository;

import com.employeeapp.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeRepository {

    private static List<Employee> employeeDb = new ArrayList<>(
            Arrays.asList(
                    new Employee(1, "John", 1000),
                    new Employee(2, "Steve", 2000),
                    new Employee(3, "Mary", 1500),
                    new Employee(4, "Jane", 2000),
                    new Employee(5, "Steve", 3000)

            )
    );

    public List<Employee> getAllEmployees(){
        return employeeDb;
    }

    public Employee getEmployeeById(int id){
        Employee emp = null;
        for(Employee e:employeeDb){
            if (e.getId()==id){
                emp = e;
            }
        }
        return emp;
    }

    public Employee saveEmployee(Employee employee){
        employeeDb.add(employee);
        return employee;
    }

    public void deleteEmployee(int id){
        Employee emp = getEmployeeById(id);
        employeeDb.remove(emp);
    }

    public Employee updateEmployee(Employee newEmployee){
        Employee oldEmployee = getEmployeeById(newEmployee.getId());
        if(oldEmployee!=null){
            oldEmployee.setName(newEmployee.getName());
            oldEmployee.setSalary(newEmployee.getSalary());
        }
        return oldEmployee;
    }




}
