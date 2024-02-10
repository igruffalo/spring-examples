package com.example.main;

import com.example.beans.Person;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example8 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);

        System.out.println("person name from Spring context is: " + person.getName());

        System.out.println("Vehicle that Person owns is: " + person.getVehicle());

        person.getVehicle().getVehicleService().moveVehicle();
        person.getVehicle().getVehicleService().makeSound();
    }

}
