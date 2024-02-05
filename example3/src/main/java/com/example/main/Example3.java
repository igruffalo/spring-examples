package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example3 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Supplier<Vehicle> volkswagonSupplier = () -> {
            Vehicle volkswagon = new Vehicle();
            volkswagon.setName("volkswagon");
            return volkswagon;
        };

        Vehicle audi = new Vehicle();
        audi.setName("audi");
        Supplier<Vehicle> audiSupplier = () -> audi;

        Random random = new Random();
        int randomNumber = random.nextInt(10);

        System.out.println("Random number generated is " + randomNumber);

        if((randomNumber%2) == 0) {
            context.registerBean("volkswagon", Vehicle.class, volkswagonSupplier);
        } else {
            context.registerBean("audi", Vehicle.class, audiSupplier);
        }

        Vehicle volksVehicle = null;
        Vehicle audiVehicle = null;

        try {
            volksVehicle = context.getBean("volkswagon", Vehicle.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error while volkswagon vehicle");
        }

        try {
            audiVehicle = context.getBean("audi", Vehicle.class);
        } catch (NoSuchBeanDefinitionException noSuchBeanDefinitionException) {
            System.out.println("Error while audi vehicle");
        }

        if(null != volksVehicle) {
            System.out.println("Programming vehicle name from spring context is " + volksVehicle.getName());
        } else if (null != audiVehicle){
            System.out.println("Programming vehicle name from Spring Context is " + audiVehicle.getName());
        }


    }

}
