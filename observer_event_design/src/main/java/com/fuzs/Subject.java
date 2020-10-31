package com.fuzs;

import java.util.List;
import java.util.ArrayList;


public abstract class Subject{
	//maintains a list of its dependents
	public List<Observer> observers = new ArrayList<>();

	public void add(Observer o){
		observers.add(o);
	}

	public void remove(Observer o){
		observers.remove(o);
	}

	//notifies all observers automatically
	public abstract void notifyObservers(String everyThings);

}