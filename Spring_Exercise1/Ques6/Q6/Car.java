package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car implements Vehicle{
    public  String vehicle()
    {
        return  "Want to Travell by car";


     }

}
