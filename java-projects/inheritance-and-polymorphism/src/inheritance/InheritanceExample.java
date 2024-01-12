package inheritance;

public class InheritanceExample {

    public static void main(String[] args) {

      Animal animal = new Cat();

    animal.makeSound();
 //   animal.scratch();

    animal = new Pug();
    animal.makeSound();

    // animal.bark();
    animal.run();




    }

}
