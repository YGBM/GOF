package com.fuzs;


public class ConcreteStateA extends State{
    public  void Handler(Context context){
        System.out.println("ConcreteStateA: ");
        context.setState(new ConcreteStateB());
    }
}
