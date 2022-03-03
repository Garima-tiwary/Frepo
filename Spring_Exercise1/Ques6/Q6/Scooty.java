package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Scooty implements Vehicle {
    public String vehicle()
    {
        return  "Want to travel by Scooty";
    }
}
