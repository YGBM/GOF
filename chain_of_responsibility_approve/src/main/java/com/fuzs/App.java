package com.fuzs;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) { 

        Worker worker = new Worker("张三",32);

        DepartmentLeader departLeader  = new DepartmentLeader("老李");
        DeputyGeneralManager deputyGenaralManager = new DeputyGeneralManager("李副总");
        GeneralManager genaralManager = new GeneralManager("张总");

        departLeader.setNext(deputyGenaralManager);
        deputyGenaralManager.setNext(genaralManager);

        departLeader.handleRequest(worker);

    }
}
