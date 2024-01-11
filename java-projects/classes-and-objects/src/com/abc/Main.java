package com.abc;

import com.abc.carinfo.Car;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car car ;

        car = new Car("XUV700",2023,false);

        car.showCarInfo();


//        car = null;

        System.gc();



    }

    static void fun(){
        int count = 10;
        if(count>5){
            String msg = "Hello";
            System.out.println(msg);
            count = 50;
        }
    }
}