package interfaceexample;

public class InterfaceExample {

    public static void main(String[] args) {

        Printable printer = new CanonPrinter();
        printer.print();

        printer = new HpPrinter();
        printer.print();

    }
}
