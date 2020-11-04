package com.fuzs;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        ScoreContext account = new ScoreContext();
        account.add(39);
        account.add(40);
        account.add(35);
        account.add(-17);
        account.add(-50);
    }
}
