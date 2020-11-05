package com.fuzs;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        Aggregate ag = new ConcreteAggregate();
        ag.add("中山大学");
        ag.add("华南理工");
        ag.add("韶关学院");
        System.out.print("聚合的内容有: ");
        Iterator it = ag.getIterator();

        while(it.hadNext()){
            Object obj = it.next();
            System.out.print(obj.toString()+"\t");
        }
        Object ob = it.first();
        System.out.println("\n first: "+ob.toString());

    }
}
