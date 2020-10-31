package com.fuzs;

public class ConcreteObserver implements Observer{

	@Override
	public void update(String fromSubject){
		System.out.println("the subject will change something of this observer:  "+fromSubject);
	}
}