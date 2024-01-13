package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {
    public static void main(String[] args) {

        Set<String> users = new TreeSet<>();

        users.add("John");
        users.add("Steve");
        users.add("John");
        users.add("Mark");
        users.add("Rahul");
        users.add("Amit");

        for(String user:users){
            System.out.println(user);
        }

    }
}
