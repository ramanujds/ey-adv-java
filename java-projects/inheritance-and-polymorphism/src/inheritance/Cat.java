package inheritance;

public class Cat extends Animal {

    String catBreed;

    public void makeSound() {
        System.out.println("Cat is making sound...");
    }

    public void eat() {
        System.out.println("Cat is eating...");
    }

    public void sleep() {
        System.out.println("Cat is sleeping...");
    }

    public void run() {
        System.out.println("Cat is running...");
    }

    public void scratch() {
        System.out.println("Cat is scratching...");
    }

}
