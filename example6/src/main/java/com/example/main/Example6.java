package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example6 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("person name from Spring context is: " + person.getName());
        System.out.println("Vehicle name from Spring context is: " + vehicle.getName());
        System.out.println("Vehicle that Person owns is: " + person.getVehicle());
    }

}
