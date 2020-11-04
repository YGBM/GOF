package com.fuzs;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        ThreadContext ctx = new ThreadContext();
        ctx.start();
        ctx.getCPU();
        ctx.suspend();
        ctx.resume();
        ctx.getCPU();
        ctx.stop();
    }
}
