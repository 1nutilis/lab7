package com.strategy;

public class StandardShippingStrategy implements IShippingStrategy{
    public double CalculateShippingCost(double weight, double distance) {
        return weight * 0.5 + distance * 0.1;
    }
}
