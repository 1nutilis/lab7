package com.strategy;

public class InternationalShippingStrategy implements IShippingStrategy{
    public double CalculateShippingCost(double weight, double distance) {
        return weight * 1 + distance * 0.5 + 15;
    }
}
