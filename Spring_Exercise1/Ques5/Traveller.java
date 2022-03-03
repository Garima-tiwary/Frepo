package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Traveller {
    @Autowired
    private Vehicle vh;

    public Traveller(Vehicle vh) {
        this.vh= vh;
    }

    public void choice()
    {
        String str=vh.vehicle();
        System.out.println(str);
        System.out.println(vh);

    }
}
