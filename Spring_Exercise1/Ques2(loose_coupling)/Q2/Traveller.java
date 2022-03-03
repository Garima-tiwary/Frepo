package com.example.demo;

public class Traveller {
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
