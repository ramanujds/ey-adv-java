
public class Program{
	int count = 5;

	public void method(){
		System.out.println(count);
	}



	// public static void main(String []args){
	// 	// String firstName = args[0];
	// 	// String lastName = args[1];
	// 	// System.out.println("Hey "+firstName+" "+lastName);
	// 	// Program p1 = new Program();
	// 	// System.out.println(p1.count);
	// 	// p1.method();
	// }


	public static void main(String[] args) {
		
		Student.id = 1;
		Student.name = "John";

		Student.printStudent();
	}

}

		
class Student {

    static int id;
    static String name;

 
    public static void printStudent() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
    
}
