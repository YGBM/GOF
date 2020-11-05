package com.fuzs;

import java.util.List;

public class ConcreteIterator implements Iterator {

    private List<Object> list = null;
    private int index = -1;

    public ConcreteIterator(List<Object> list){
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        Object obj = list.get(index);
        return obj;
    }

    @Override
    public Object next() {
        Object obj = null;
        if(this.hadNext()){
            obj = list.get(++index);
        }
        return obj;
    }

    @Override
    public boolean hadNext() {
        if(index < list.size() - 1){
            return true;
        }else{
            return false;
        }
        
    }
    
}
