package com.strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DeliveryContext context = new DeliveryContext();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип доставки : 1 - Стандартная ,2 - Экспресс, 3 - Международная, 4 - Ночная");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                context.SetShippingStrategy(new StandardShippingStrategy());
                break;
            case 2:
                context.SetShippingStrategy(new ExpressShippingStrategy());
                break;
            case 3:
                context.SetShippingStrategy(new InternationalShippingStrategy());
                break;
            default:
                System.out.println("Неверный выбор.");
                return;
        }

        System.out.println("Введите вес посылки (в кг):");
        double weight = scanner.nextDouble();

        System.out.println("Введите расстояние доставки (в км):");
        double distance = scanner.nextDouble();

        double cost = context.calculateCost(weight, distance);
        System.out.println("Стоимость доставки: $" + cost);
    }
}