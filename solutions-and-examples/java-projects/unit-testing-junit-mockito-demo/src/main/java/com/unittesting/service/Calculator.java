package com.unittesting.service;

public class Calculator {

    private AdvanceCalculatorService service;

    public void setService(AdvanceCalculatorService service) {
        this.service = service;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public int getStringLength(String str){
        return service.getStringLength(str);
    }

    public boolean findIfEven(int num){
        return service.chekIfEven(num);
    }

}
