package Test;

import Burger.Burger;

public class Main {
    public static void main(String[] args) {
        // 1. Basic Burger: Only mandatory attributes (Bread and Meat)
        Burger basicBurger = new Burger.Builder("White", "Beef").build();

        // 2. Premium Burger: Mandatory + Optional attributes (Cheese and Extras)
        Burger premiumBurger = new Burger.Builder("Brioche", "Lamb").addCheese("Cheddar").addExtras("Bacon and Caramelized Onions").build();

        // 3. Display results in console
        // Meets the requirement for clear, verifiable output
        System.out.println("--- Order 1: Basic Option ---");
        System.out.println(basicBurger);

        System.out.println("\n--- Order 2: Premium Option ---");
        System.out.println(premiumBurger);
    }
}
