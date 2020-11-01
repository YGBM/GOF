package com.fuzs;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        Context c = new Context();
        Strategy s = new ConcreteStrategyA();
        c.setStrategy(s);
        c.strategyMethod();

        System.out.println("-------------------------");
        s = new ConcreteStrategyB();

        c.setStrategy(s);
        c.strategyMethod();
    }
}
