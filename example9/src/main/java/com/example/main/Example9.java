package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example9 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Before retrieving Person bean from spring context");
        Person person = context.getBean(Person.class);
        System.out.println("After retrieving Person bean from spring context");
        System.out.println("Vehicle that Person owns is: " + person.getVehicle());
    }

}
