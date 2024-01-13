import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class CheckedExceptionTest {


    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(new File("data.txt"));
            String data = scan.nextLine();
            System.out.println(data);
        }
        catch (FileNotFoundException ex){
            System.out.println("Sorry.. File not Found");
        }
        finally {
            System.out.println("Execution completed");
        }


    }

}
