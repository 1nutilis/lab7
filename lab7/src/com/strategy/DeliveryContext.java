package com.strategy;

public class DeliveryContext {
    private IShippingStrategy shippingStrategy;

    public void SetShippingStrategy(IShippingStrategy strategy) {
        this.shippingStrategy = strategy;
    }

    public double calculateCost(double weight, double distance) {
        if (shippingStrategy == null) {
            throw new IllegalStateException("Стратегия доставки не установлена.");
        }
        return shippingStrategy.CalculateShippingCost(weight, distance);
    }
}