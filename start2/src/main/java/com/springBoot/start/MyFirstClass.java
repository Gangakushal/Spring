package com.springBoot.start;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


public class MyFirstClass {
    String name;

    public MyFirstClass(String name) {
        this.name = name;
    }

    public void displayMessage(){
        System.out.println(" Hello "+this.name+" I am First Class Calling ");
    }
}
