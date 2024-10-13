package com.SpringPractise.P1SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Creating a stereotype component to access their beans
@Component
public class Alien {

    //Injecting a dependent object to target class
    //@Autowired is an annotation provides metadata to jvm to take care its beans
    @Autowired
    /*Field injection - this field helps to access all members of Laptop class.Because we
    are getting a bean from IOC container which will be injecting during run time.
     */
    Laptop laptop;


    public void code(){
        //Accessing a member of Laptop class.
        laptop.compile();
        System.out.println("Coding");
    }
}
