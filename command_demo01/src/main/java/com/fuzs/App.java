package com.fuzs;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        Command cmd = new ConcreteCommandA();
        Invoker ir = new Invoker(cmd);
        System.out.println("客户端访问调用者的call方法");
        ir.call();
    }
}
