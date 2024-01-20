package com.employeeapp.api;

import com.employeeapp.model.Employee;
import com.employeeapp.respository.EmployeeRepository;
import com.employeeapp.service.EmployeeService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("employees")
public class EmployeeResources {

    private EmployeeService employeeService = new EmployeeService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmployee(@PathParam("id") int id){
        return employeeService.getEmployeeById(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Employee addEmployee(Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Employee updateEmployee(Employee employee){
        return employeeService.updateEmployee(employee);
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteEmployee(@PathParam("id") int id){
        employeeService.deleteEmployee(id);
    }


}
