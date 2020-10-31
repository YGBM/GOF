package com.fuzs;

/**
 * Hello world!
 *
 */
public class App {

    public static void main( String[] args ) {

        System.out.println( "Hello World!" );

        EventSource eventSource = new EventSource();

        eventSource.addObserver(event ->{
            System.out.println("Received response: "+event);
        });

        eventSource.scanSystemIn();
    }
}
