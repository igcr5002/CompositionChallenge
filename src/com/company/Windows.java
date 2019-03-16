package com.company;

public class Windows {

    private String model;
    private int numberOfWindows;
    private Dimensions windowDimensions;

    public Windows(String model, int numberOfWindows, Dimensions dimensions) {
        this.model = model;
        this.numberOfWindows = numberOfWindows;
        this.windowDimensions = dimensions;
    }

    public void openWindows() {
        System.out.println(numberOfWindows + " windows are opened.");
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public Dimensions getDimensions() {
        return windowDimensions;
    }
}
