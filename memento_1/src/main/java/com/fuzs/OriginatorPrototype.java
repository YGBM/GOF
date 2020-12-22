package com.fuzs;

public class OriginatorPrototype implements Cloneable{

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // public OriginatorPrototype createMemento(){
    //     return (OriginatorPrototype) this.clone();
    // }
    
}
