package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfNumbers {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        int []arr = {10,20,30,40,50};

        List<Integer> items = Arrays.asList(10,20,30,40,50);

        List<Integer> moreItems = new ArrayList<>(items);

    }

}
