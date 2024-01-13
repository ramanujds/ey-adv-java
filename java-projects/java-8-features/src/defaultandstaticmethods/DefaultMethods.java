package defaultandstaticmethods;

interface Printable {
   void print();

   default void scan(){
       System.out.println("This Printer does not support scanning");
   }

}

class Printer implements Printable {
    public void print() {
        System.out.println("Print method");
    }

}

class PrinterWithScan implements Printable {
    public void print() {
        System.out.println("Print method");
    }

    public void scan() {
        System.out.println("Scan method");
    }
}

public class DefaultMethods {

   public static void main(String[] args) {
        Printable printer1 = new Printer();
        printer1.print();
        printer1.scan();

        Printable printer2 = new PrinterWithScan();
        printer2.print();
        printer2.scan();


   }

}
