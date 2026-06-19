package com.car.care.cons;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void showDetails() {
        System.out.println("Car Details:"+specification.toString());
    }
}
