package com.fuzs;

public class ConcreteCommandA implements Command{

	private Receiver receiver;

	public ConcreteCommandA(){
		receiver = new Receiver();
	}

	@Override
	public  void execute(){
		System.out.println("加载jdbc驱动A");
		System.out.println("创建连接");
		System.out.println("构建SQL语句");
		System.out.println("查询数据库");
		System.out.println("解析结果集");
		System.out.println("END......");
		receiver.action();
	}
} 