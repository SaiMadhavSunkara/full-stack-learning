package com.car;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class example {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanCar.xml");
        Car Car = (Car) context.getBean("myCar");
        Car.showDetails();
    }
}
