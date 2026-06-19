package com.car.care;

public class Car {
    private Specification specification;


    public void setSpecification(Specification specification) {
        this.specification = specification;
    }


    public void showDetails() {
        System.out.println("Car Details:"+specification.toString());
    }
}
