package com.fuzs;

public class Invoker{

	private Command command;

	public Invoker(Command command){
		this.command = command;
	}

	public void setCommand(Command command){
		this.command = command;
	}

	public void call(){
		System.out.println("invoker call command action....");
		command.execute();
	}
}