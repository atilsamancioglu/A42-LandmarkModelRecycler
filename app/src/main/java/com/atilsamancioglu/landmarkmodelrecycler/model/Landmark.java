package com.atilsamancioglu.landmarkmodelrecycler.model;

import java.io.Serializable;

public class Landmark implements Serializable {
    public String name;
    public String country;
    public Integer drawableId;

    public Landmark(String name, String country, Integer drawableId) {
        this.name = name;
        this.country = country;
        this.drawableId = drawableId;

    }
}
