package com.fuzs;

import java.util.Observer;
import java.util.Observable;
/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        System.out.println( "Hello World!" );

        OilFutures oil = new OilFutures();
        Observer bear = new Bear();
        Observer bull = new Bull();
        oil.addObserver(bull);
        oil.addObserver(bear);
        oil.setPrice(10);
        oil.setPrice(-8);
    }
}
