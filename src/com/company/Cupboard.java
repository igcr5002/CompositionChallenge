package com.company;

public class Cupboard {

    private String material;
    private Dimensions cupboardDimensions;
    private String color;

    public Cupboard(String material, Dimensions dimensions, String color) {
        this.material = material;
        this.cupboardDimensions = dimensions;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public Dimensions getDimensions() {
        return cupboardDimensions;
    }

    public String getColor() {
        return color;
    }
}
