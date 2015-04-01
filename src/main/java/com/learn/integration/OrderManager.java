package com.learn.integration;

public class OrderManager {
    public Order billOrder(Order order) {
        System.out.println("Bill Order " + order);
        order.setBilled(true);
        return order;
    }

    public Order updateInventory(Order order) {
        System.out.println("Update inventory for " + order);
        order.setInvUpdated(true);
        return order;
    }

    public void emailOrderConfirmation(Order order) {
        order.setEmailSent(true);
        System.out.println("Email order confirmation " + order);
    }
}
