package com.example.autowire.name;

public class Car {
    private Specification carSpecification;

    public void setCarSpecification(Specification carSpecification) {
        this.carSpecification = carSpecification;
    }

    public void showCarSpecificationDetails(){
        System.out.println("Car Details : " + carSpecification.toString());
    }
}
