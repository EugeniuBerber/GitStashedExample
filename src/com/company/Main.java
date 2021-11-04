package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car();
        car.make= "Lincoln";
        car.model="Aviator";
        car.color="White";
        car.price=110000;
        System.out.println(car.make+" "+car.model);
    }
}
