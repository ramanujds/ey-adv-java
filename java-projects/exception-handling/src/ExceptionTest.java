import java.util.Scanner;

public class ExceptionTest {

    public static void main(String[] args) {

        System.out.println("Welcome to our app");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input two numbers : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("Performing the calculation..");
        try {
            int result = num1 / num2;
            System.out.println("Result = " + result);
        }
        catch(ArithmeticException ex){
           System.out.println("Oh..Oh..Sorry an exception occurred");
           System.out.println("Please input a non zero number");
        }

        System.out.println("Thank You");
        System.out.println("Do you want to do more task?(y/n)");
        char choice = scan.next().charAt(0);


    }

}
