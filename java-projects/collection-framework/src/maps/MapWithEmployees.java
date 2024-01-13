package maps;

import model.Employee;

import java.util.HashMap;
import java.util.Map;

public class MapWithEmployees {

    public static void main(String[] args) {

        Map<Integer, Employee> empMap = new HashMap<>();
        Employee e1 = new Employee(1,"Javed",65000);
        Employee e2 = new Employee(2,"Rahul",75000);
        Employee e3 = new Employee(3,"Raj",85000);
        Employee e4 = new Employee(4,"Ravi",95000);
        Employee e5 = new Employee(5,"Rahim",105000);
        Employee e6 = new Employee(5,"Karan",78000);

        empMap.put(e1.getId(),e1);
        empMap.put(e2.getId(),e2);
        empMap.put(e3.getId(),e3);
        empMap.put(e4.getId(),e4);
        empMap.put(e5.getId(),e5);
        empMap.put(e6.getId(),e6);

        int id = 5;
        Employee e = empMap.get(id);

        System.out.println(e);



    }

}
