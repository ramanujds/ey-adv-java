package maps;

import java.util.HashMap;
import java.util.Map;

public class MapExamples {

    public static void main(String[] args){

    Map<Integer, String> numMap = new HashMap<>();
    numMap.put(1, "One");
    numMap.put(2,"Two");
    numMap.put(3,"Three");
    numMap.put(4,"Four");
    numMap.put(5,"Five");
    numMap.put(6,"Six");
    numMap.put(7,"Seven");
    numMap.put(8,"Eight");
    numMap.put(9,"Nine");
    numMap.put(0,"Zero");

    System.out.println(numMap.get(5));


}


}
