import java.util.Scanner;

public class StringArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String []users = new String[5];

        System.out.println("Enter 5 names: ");
        for(int index=0; index<users.length; index++){
            users[index] = scan.next();
        }

        System.out.println("Entered names are: ");
        for(String user:users){
            System.out.println(user);
        }


    }

}
