package com.priv.models;

public abstract class ConsumerI {
    protected String name;
    public void displaySummary(){
        System.out.println("This is sample output");
    }

    public String getName() {
        return name;
    }
}
