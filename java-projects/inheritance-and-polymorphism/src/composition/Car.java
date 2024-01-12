package composition;

class Car {
    Engine carEngine; // Composition (Has-A relationship)

    String model;
    String color;

    Car() {
        this.carEngine = new Engine(); // Creating an Engine object when Car is instantiated
    }

    public Car(Engine carEngine) {
        this.carEngine = carEngine;
    }

    public Car(Engine carEngine, String model, String color) {
        this.carEngine = carEngine;
        this.model = model;
        this.color = color;
    }

    void startCar() {
        carEngine.start(); // Delegating the start operation to the Engine object
        System.out.println("Car started");
    }

    public void showCarDetails() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        carEngine.showEngineDetails();
    }
}