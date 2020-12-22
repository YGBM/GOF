package com.fuzs;

import lombok.Data;

@Data
public abstract class ApproveApply {
    private ApproveApply next;
    
    public abstract void  handleRequest(Worker worker);
}
