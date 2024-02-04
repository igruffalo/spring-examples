package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
        Vehicle veh = new Vehicle();
        veh.setName("Honda");
        System.out.println("Non context vehicle bean name is " + veh.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle contextVehicle = context.getBean(Vehicle.class);
        System.out.println("context vehicle bean name is " + contextVehicle.getName());

        contextVehicle.setName("Range rover");
        System.out.println("After setname : context vehicle bean name is " + contextVehicle.getName());
    }
}
