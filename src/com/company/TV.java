package com.company;

public class TV {

    private String model;
    private Dimensions TVdimensions;

    public TV(String model, Dimensions dimensions) {
        this.model = model;
        this.TVdimensions = dimensions;
    }

    public void openTV() {
        System.out.println("Tv has been turned on.");
    }

    public String getModel() {
        return model;
    }

    public Dimensions getDimensions() {
        return TVdimensions;
    }
}
