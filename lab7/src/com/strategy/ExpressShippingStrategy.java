package com.strategy;

public class ExpressShippingStrategy implements IShippingStrategy{
    public double CalculateShippingCost(double weight, double distance) {
        return weight * 0.75 + distance * 0.2;
    }

}
