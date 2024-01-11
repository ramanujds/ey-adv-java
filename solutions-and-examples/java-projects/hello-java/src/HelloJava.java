public class HelloJava {

    public static void main(String []args){

        Employee emp1 = new Employee();
        emp1.setId(-10);
        emp1.setName("Harsh");
        emp1.setEmail("harsh@gmail.com");

        Employee emp2 = new Employee();
        emp2.setId(2);
        emp2.setName("Karan");
        emp2.setEmail("karan@yahoo.com");

        emp1.printEmployee();
        emp2.printEmployee();

        System.out.println("Employee id of emp1 = "+emp1.getId());

    }

}
