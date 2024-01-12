package composition;
public class CompositionExample {
    public static void main(String[] args) {
        Engine engine1 = new Engine("V8", 5000);
        Engine engine2 = new Engine("Petrol", 8000);
        Car car = new Car(engine2, "BMW", "Black");
        car.startCar();
        car.showCarDetails();
    }
}
