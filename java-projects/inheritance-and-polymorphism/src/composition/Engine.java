package composition;

class Engine {
    private String engineType;
    private int engineCapacity;

    public Engine(String engineType, int engineCapacity) {
        this.engineType = engineType;
        this.engineCapacity = engineCapacity;
    }

    public Engine() { }


    void start() {
        System.out.println("Engine started");
    }

    public void showEngineDetails() {
        System.out.println("Engine Type: " + engineType);
        System.out.println("Engine Capacity: " + engineCapacity);
    }
}