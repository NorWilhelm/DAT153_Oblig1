package com.example.oblig1.Model;

import android.graphics.Bitmap;


public class Person {
    private String name;
    private Bitmap image;

    public Person(String n, Bitmap i){
        this.name = n;
        this.image = i;
    }

    public Bitmap getImage() {
        return image;
    }

    public String getName() {
        return name;
    }
}
