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

 //  Exercise 2  Add an extra charge for a loaded sandwich

        System.out.print("Would you like it loaded? (yes/no): ");
        String loaded = scanner.nextLine();

        if (loaded.equalsIgnoreCase("yes")) {
            if (size == 1) {
                price = price + 1.00;
            } else {
                price = price + 1.75;
            }
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
