package com.fuzs;

public class ConcreteSubject extends Subject{

	@Override
	public  void notifyObservers(String everyThings){

		for(Observer obs:observers){
			obs.update(everyThings);
		}
	}
}