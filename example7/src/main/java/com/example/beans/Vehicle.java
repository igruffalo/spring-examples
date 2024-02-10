package com.example.beans;

import org.springframework.stereotype.Component;


public class Vehicle {

    private String name = "toyota";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }

    public void printHello() {
        System.out.println("Printing Hello from Component Vehicle Bean");
    }

}
