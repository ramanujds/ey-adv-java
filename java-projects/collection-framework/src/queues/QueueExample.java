package queues;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> persons = new LinkedList<>();

        persons.add("John");
        persons.add("Steve");
        persons.add("John");
        persons.add("Mark");
        persons.add("Rahul");
        persons.add("Amit");

        while(!persons.isEmpty()){
            System.out.println(persons.peek());
            persons.remove();
        }


    }
}
