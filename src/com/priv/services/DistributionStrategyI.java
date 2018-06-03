package com.priv.services;

import com.priv.models.User;

import java.util.*;

public interface DistributionStrategyI {
    void distributeNDisplay(List<User> users);
}
