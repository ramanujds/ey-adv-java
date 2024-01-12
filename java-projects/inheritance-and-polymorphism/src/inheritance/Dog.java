package inheritance;

public abstract class Dog extends Animal {

    String dogBreed;


    public void bark() {
        System.out.println("Dog is barking...");
    }

    public void eat() {
        System.out.println("Dog is eating...");
    }

    public void sleep() {
        System.out.println("Dog is sleeping...");
    }

    public void run() {
        System.out.println("Dog is running...");
    }
}
