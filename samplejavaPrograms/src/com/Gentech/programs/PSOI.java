package com.Gentech.programs;

class Product {
    String name;
    int price;
}

class Sales {
    String name;
    int price;
}

class Order {
    String name;
    int price;
}

class Inventory {
    String name;
    int price;
}

public class PSOI {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Desktop";
        product.price = 111000;
        System.out.println("Product Name: " + product.name);
        System.out.println("Product Price: " + product.price);
        System.out.println();

        Sales sales = new Sales();
        sales.name = "Electronics";
        sales.price = 120000;
        System.out.println("Sales Name: " + sales.name);
        System.out.println("Sales Price: " + sales.price);
        System.out.println();

        Order order = new Order();
        order.name = "Online";
        order.price = 500000;
        System.out.println("Order Name: " + order.name);
        System.out.println("Order Price: " + order.price);
        System.out.println();

        Inventory inventory = new Inventory();
        inventory.name = "Warehouse";
        inventory.price = 600000;
        System.out.println("Inventory Name: " + inventory.name);
        System.out.println("Inventory Price: " + inventory.price);
    }
}


