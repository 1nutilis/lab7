package com.strategy;

public class NightShippingStrategy {
    public double CalculateShippingCost(double weight, double distance) {
        return weight * 0.5 + distance * 0.1 + 30;
    }

}
