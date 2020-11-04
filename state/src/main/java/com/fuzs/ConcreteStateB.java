package com.fuzs;

public class ConcreteStateB extends State{
    public  void Handler(Context context){
        System.out.println("ConcreteStateB: ");
        context.setState(new ConcreteStateA());
    }
}
