package com.fuzs;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        File file = new File("Photo/貂蝉.jpg");
        System.out.println(file.getAbsolutePath());

    }
}
