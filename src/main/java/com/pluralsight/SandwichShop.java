package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter sandwich size (1 = Regular, 2 = Large): ");
        String userText = scanner.nextLine();
        int size = Integer.parseInt(userText);

        double price;

        if (size == 1) {
            price = 5.45;
        } else if (size == 2) {
            price = 8.95;
        } else {
            System.out.println("Invalid sandwich size.");
            return;
        }

        System.out.print("Enter your age: ");
        userText = scanner.nextLine();
        int age = Integer.parseInt(userText);

        if (age <= 17) {
            price = price * 0.90;
        } else if (age >= 65) {
            price = price * 0.80;
        }

        System.out.printf("Sandwich price: $%.2f%n", price);
        scanner.close();
    }
}
