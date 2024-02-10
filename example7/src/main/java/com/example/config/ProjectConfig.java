package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {

    @Bean
    Vehicle vehicle1() {
        Vehicle veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean
    Vehicle vehicle2() {
        Vehicle veh = new Vehicle();
        veh.setName("Mercedes");
        return veh;
    }

    @Bean
    Vehicle vehicle3() {
        Vehicle veh = new Vehicle();
        veh.setName("Kia");
        return veh;
    }
}
