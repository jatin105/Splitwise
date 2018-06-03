package com.priv.main;

import com.priv.models.Group;
import com.priv.models.User;

public class Main {
    public static void main(String[] args){
        Group testGroup = new Group("Test Group");
        User testUser1 = new User("Test User1");
        User testUser2 = new User("Test User2");
        User testUser3 = new User("Test User3");
        testGroup.addUSer(testUser1);
        testGroup.addUSer(testUser2);
        testGroup.addUSer(testUser3);
        testGroup.addBill(30,testUser1);

        System.out.println("User 1 Summary");
        testUser1.displaySummary();
        System.out.println("User 2 Summary");
        testUser2.displaySummary();
        System.out.println("User 3 Summary");
        testUser3.displaySummary();
        System.out.println("Group Summary");
        testGroup.displaySummary();
    }
}
