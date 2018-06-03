package com.priv.services;

import com.priv.models.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DebtMajorStratergy implements DistributionStrategyI {
    @Override
    public void distributeNDisplay(List<User> users){
        List<User> users_ = new ArrayList<>(users);
        Collections.sort(users_,Collections.reverseOrder());
        User a,b;
        while((!users_.isEmpty()) && (users_.get(0).debt > 0 )){
            a = users_.get(0);
            b = users_.get(users_.size()-1);
            if((a.debt + b.debt) > 0){
                System.out.println(a.getName() + " pays Rs. " + (-1)*b.debt + " to " + b.getName());
                users_.remove(b);
                a.debt = a.debt + b.debt;
            }else {
                System.out.println(a.getName() + " pays Rs. " + a.debt + " to " + b.getName());
                users_.remove(a);
                if((a.debt + b.debt) < 0)
                    b.debt = a.debt + b.debt;
                else
                    users_.remove(b);
            }
        }
    }
}
