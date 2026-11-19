// TODO: 
// RollNumber >> 202510418.
// Name: Mujtaba Mohammed Zakaria.

import java.util.Scanner;

public class SmartRestaurantOrder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double DRINK_PRICE = 15.50;

        String name;
        int age;
        double mealPrice;
        int drinks;
        boolean student;
        int rating;

        System.out.print("Enter customer name: ");
        name = input.nextLine();

        System.out.print("Enter customer age: ");
        age = input.nextInt();

        System.out.print("Enter meal price: ");
        mealPrice = input.nextDouble();

        System.out.print("Enter number of drinks: ");
        drinks = input.nextInt();

        System.out.print("Is the customer a student? true/false: ");
        student = input.nextBoolean();

        System.out.print("Enter service rating (1-5): ");
        rating = input.nextInt();

        double drinksCost = drinks * DRINK_PRICE;
        double subtotal = mealPrice + drinksCost;
        double discount = 0;
        double tip = 0;

        if (student == true) {
            discount = subtotal * 0.10;
        } else if (age >= 60) {
            discount = subtotal * 0.05;
        } else {
            discount = 0;
        }

        if (rating >= 4 && rating <= 5) {
            tip = subtotal * 0.10;
        } else if (rating >= 1 && rating < 4) {
            tip = 0;
        }

        if (rating < 1 || rating > 5) {
            System.out.println("Invalid service rating!");
        } else {

            double finalBill = subtotal - discount + tip;
            int wholeAmount = (int) finalBill;

            System.out.println("\n===== SMART RESTAURANT =====");
            System.out.println("Customer: " + name);
            System.out.printf("Meal: $%.2f%n", mealPrice);
            System.out.printf("Drinks: $%.2f%n", drinksCost);
            System.out.printf("Discount: $%.2f%n", discount);
            System.out.printf("Tip: $%.2f%n", tip);
            System.out.printf("Final bill: $%.2f%n", finalBill);
            System.out.println("Whole amount: $" + wholeAmount);
        }

        input.close();
    }
}