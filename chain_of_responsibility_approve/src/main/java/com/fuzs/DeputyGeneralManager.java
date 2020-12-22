package com.fuzs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeputyGeneralManager extends ApproveApply{
    private String name;


    public void ratify(Worker worker){
        System.out.println("部门领导人 "+name+" 批注 "+worker.getName()+" 的工作请假: "+worker.getLeaveDay());
    }

    @Override
    public void handleRequest(Worker worker) {
        if(worker.getLeaveDay()>= 10 && worker.getLeaveDay()  < 30){
            ratify( worker);
        }else{
            getNext().handleRequest(worker);
        }
    }

}
