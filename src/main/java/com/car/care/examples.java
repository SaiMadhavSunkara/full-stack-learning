package com.car.care;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class examples {
    public static void main(String[] args) {

        //manual example
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanSetter.xml");
        Car Car = (Car) context.getBean("myCar");
        Car.showDetails();

        //autowiring by name
        ApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContextAutowire.xml");
        Car Car1 = (Car) context1.getBean("myCar");
        Car1.showDetails();


        //autowiring by type
        ApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContextAutowireType.xml");
        Car Car2 = (Car) context2.getBean("myCar");
        Car2.showDetails();


    }
}
