package com.example.main;

import com.example.beans.Person;
import com.example.config.ProjectConfig;
import com.example.services.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example10 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleService vehicleService1 = context.getBean(VehicleService.class);
        VehicleService vehicleService2 = context.getBean("vehicleService",VehicleService.class);
        System.out.println("Hashcode of object vehicleService1 : " + vehicleService1.hashCode());
        System.out.println("Hashcode of object vehicleService2 : " + vehicleService2.hashCode());
    }

}
