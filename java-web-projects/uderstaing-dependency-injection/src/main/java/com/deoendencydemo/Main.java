package com.deoendencydemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        MyService myService = appContext.getBean(MyService.class);
        myService.doSomeApiCall();
    }
}