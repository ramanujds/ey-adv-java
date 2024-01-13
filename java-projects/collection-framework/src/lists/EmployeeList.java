package lists;

import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();

        Employee e1 = new Employee(1,"Javed",65000);
        Employee e2 = new Employee(2,"Rahul",75000);
        Employee e3 = new Employee(3,"Raj",85000);
        Employee e4 = new Employee(4,"Ravi",95000);
        Employee e5 = new Employee(5,"Rahim",105000);
        Employee e6 = new Employee(5,"Rahim",105000);

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        empList.add(e6);

        for(Employee emp:empList){
            System.out.println(emp);
        }


    }

}
