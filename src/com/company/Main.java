package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dimensions dimensions = new Dimensions(30,10,5);
        Windows windows = new Windows("Termopan",4,new Dimensions(50,100,30));

        TV tv = new TV("Samsung", dimensions);
        Cupboard cupboard = new Cupboard("wood",new Dimensions(10,10,10),"black");

        LivingRoom room = new LivingRoom(windows,tv,cupboard);
        room.openW();


    }
}
