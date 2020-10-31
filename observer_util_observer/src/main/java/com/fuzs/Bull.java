package com.fuzs;

import java.util.Observer;
import java.util.Observable;

public class Bull implements Observer{


	public void update(Observable o,Object arg){
		Float price = ((Float)arg).floatValue();
		if(price > 0){
            System.out.println("油价上涨"+price+"元，多方高兴了！");
		}else{
            System.out.println("油价下跌"+(-price)+"元，多方伤心了！");
		}
	}
}