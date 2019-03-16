package com.company;

public class LivingRoom {

    private Windows windows;
    private TV tv;
    private Cupboard cupboard;

    public LivingRoom(Windows windows, TV tv, Cupboard cupboard) {
        this.windows = windows;
        this.tv = tv;
        this.cupboard = cupboard;
    }

    public Windows getWindows() {
        return windows;
    }

    public TV getTv() {
        return tv;
    }

    public Cupboard getCupboard() {
        return cupboard;
    }

    public void openW() {

        windows.openWindows();

    }

    private void openT() {
        tv.openTV();
    }
}
