package com.fuzs;

import java.util.Observable;

public class OilFutures extends Observable{
	private float price;

	private float getPrice(){
		return this.price;
	}

	public void setPrice(float price){
		super.setChanged();
		super.notifyObservers(price);
		this.price = price;
	}
}