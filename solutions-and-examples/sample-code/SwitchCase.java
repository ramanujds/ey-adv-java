import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        int day;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter day number: ");
        day = input.nextInt();

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesay");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursay");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturay");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
        input.close();
    }
    
}
