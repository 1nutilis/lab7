package com.strategy;

public interface IShippingStrategy {
    double CalculateShippingCost(double weight, double distance);
}
