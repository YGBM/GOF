package com.fuzs;


public abstract class AbstractState {
    protected ScoreContext hj;
    protected String stateName;
    protected int score;
    
    public abstract void checkState();

    public void addScore(int x){
        score += x;
        System.out.print("加上： "+x+"分\t 当前分数: "+score);
        checkState();
        System.out.println("分  \t 当前状态: "+hj.getState().stateName);
    }
}
