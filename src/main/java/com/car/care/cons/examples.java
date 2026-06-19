package com.car.care.cons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class examples {
    public static void main(String[] args) {




        //autowiring by constructor
        ApplicationContext context3 = new ClassPathXmlApplicationContext("applicationContextAutowireCons.xml");
        Car Car3 = (Car) context3.getBean("myCar");
        Car3.showDetails();

    }
}
