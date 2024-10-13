package com.SpringPractise.P1SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//This component provide metadata to JVM to create and manage beans automatically.
@Component
public class Laptop {

    @Autowired
    Cpu cpu;

    public void compile(){

        cpu.process();
        System.out.println("Compiling");
    }
}
