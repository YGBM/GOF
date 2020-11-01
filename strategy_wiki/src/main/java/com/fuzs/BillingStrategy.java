package com.fuzs;

public abstract class  BillingStrategy{
	public abstract int getActPrice(int rawPrice);

	static  BillingStrategy normalStrategy(){
		return rawPrice -> rawPrice;
	}
}