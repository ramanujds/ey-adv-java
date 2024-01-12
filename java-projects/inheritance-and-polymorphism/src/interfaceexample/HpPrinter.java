package interfaceexample;

public class HpPrinter implements Printable, Scannable {

        public void print() {
            System.out.println("Printing...");
        }

        public void scan() {
            System.out.println("Scanning...");
        }
}
