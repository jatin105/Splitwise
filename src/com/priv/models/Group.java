package com.priv.models;

import com.priv.services.DebtMajorStratergy;
import com.priv.services.DistributionStrategyI;

import java.util.*;

public class Group extends ConsumerI {
    public List<User> users;

    public DistributionStrategyI strategy = new DebtMajorStratergy();

    public Group(String name){
        this.name = name;
        users = new ArrayList<>();
    }

    public void addUSer(User u){
        users.add(u);
    }

    public void addBill(double amount, User paidBy){
        double dist = amount/users.size();
        for(User u : users){
            u.debt += dist;
        }
        paidBy.debt-=amount;
    }

    @Override
    public void displaySummary(){
        strategy.distributeNDisplay(users);
    }
}
