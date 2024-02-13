package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.example.beans", "com.example.implementations", "com.example.services",
                "com.example.aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {

}
