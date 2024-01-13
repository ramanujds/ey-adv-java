package defaultandstaticmethods;

interface Greeting {
    void greet(String message);
    default void sayBye(){

    }
}

interface Calculator{
    int calculate(int a, int b);
}

class GreetingImpl implements Greeting {
    public void greet(String message) {
        System.out.println(message);
    }
    public void sayBye(){

    }
}

public class FunctionalInterfaceExample {

    public static void main(String[] args) {
//        Greeting greeting1 = new GreetingImpl();
//        greeting1.greet("Good Morning");

        // Anonymous class
        Greeting greeting2 = new Greeting(){
            public void greet(String message){
                System.out.println(message);
            }
            public void sayBye(){

            }
        };
//
//        greeting2.greet("Happy Weekend");

        // Lambda Expression

        Greeting greet3 = msg -> System.out.println(msg);

        greet3.greet("Happy Makar Sankranti");

        Calculator calc = (a,b) -> a * b;

        int result = calc.calculate(10,5);

        System.out.println(result);

    }

}
