package com.priv.models;

public class User extends ConsumerI implements Comparable{
    public double debt;

    @Override
    public void displaySummary(){
        String output;
        if(debt > 0)
            output = "You owe Rs. " + debt;
        else if(debt < 0)
            output = "You are owed Rs. " + (-1)*debt;
        else
            output = "all expenses balanced";
        System.out.println(output);
    }

    public User(String name){
        this.name = name;
        this.debt = 0;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof User){
            User other = (User) o;
            if(this.debt > other.debt)
                return 1;
            if(this.debt < other.debt)
                return -1;
            return 0;
        }else{
            throw new ClassCastException("class not matched");
        }
    }
}
