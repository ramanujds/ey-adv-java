package com.abc.carinfo;

public class Car {
        // Fields (properties)
        private String model;
        private int year;
        private boolean availability;

        public Car(){
            System.out.println("Car object created");
        }


    public Car(String model, int year, boolean availability) {
        this.model = model;
        this.year = year;
        this.availability = availability;
    }

    // Method
        public void start() {
            System.out.println("The car is starting.");
        }

        public void showCarInfo() {
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
            System.out.println("Available: "+availability);
        }

        public void finalize(){
            System.out.println("Garbage collection done");
        }

    }


