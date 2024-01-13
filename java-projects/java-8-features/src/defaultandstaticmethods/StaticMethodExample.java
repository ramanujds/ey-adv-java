package defaultandstaticmethods;

interface Showable {
    static void show(){
        System.out.println("Static show method");
    }
}

class ShowableImpl implements Showable {

}
public class StaticMethodExample {

    public static void main(String[] args) {
        Showable.show();
    }

}
