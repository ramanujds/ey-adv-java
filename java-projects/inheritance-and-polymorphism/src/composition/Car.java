package composition;

class Car {
    Engine carEngine;

    String model;
    String color;

    Car() {
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
        carEngine.start();
        System.out.println("Car started");
    }

    public void showCarDetails() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        carEngine.showEngineDetails();
    }
}