package com.SpringPractise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        System.out.println( "Hello World!" );
        Alien alien = context.getBean(Alien.class);
        alien.code();

    }
}
