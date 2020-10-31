package com.fuzs;


import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        
        System.out.println( "Hello World!" );
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();

        subject.add(observer);

        //for(;;){
            Scanner scanner = new Scanner(System.in);
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                subject.notifyObservers(line); 
            }
                       
       // }

    }
}
