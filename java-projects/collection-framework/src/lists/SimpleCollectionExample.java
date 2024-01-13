package lists;

import java.util.*;

public class SimpleCollectionExample {
    public static void main(String[] args) {

        List<String> items = new ArrayList<>();

        items.add("Laptop");
        items.add("Phone");
        items.add("Watch");
        items.add("iPad");
        items.add("Phone");
        items.add("Watch");
        items.add(2,"Charger");

        int totalItems = items.size();
        int index = items.lastIndexOf("Phone");
        items.set(4,"Samsung Tab");
        System.out.println(index);


        for(String item:items){
            System.out.println(item);
        }




    }
}
