package com.fuzs;

public class ConcreteHandler2 extends Handler{

    
    public  void handleRequest(String request){
        if(request.equals("two")){
            System.out.println("具体处理者w负责处理该就请");
        }else{
            if(getNext() != null){
                getNext().handleRequest(request);
            }else{
                System.out.println("没有人处理该请求");
            }
        }
    }

}
