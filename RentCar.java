package PoSlojniProverki;

import java.util.Scanner;

public class RentCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String type = "";
        String category = "";
        double price = 0.0;


        if (budget <= 100 && season.equals("Summer")) {
            category = "Economy class";
            type = "Cabrio";
            price = budget * 0.35;

        } else if (budget <= 100 && season.equals("Winter")) {
            category = "Economy class";
            type = "Jeep";
            price = budget * 0.65;

        } else if (budget <= 500 && season.equals("Summer")) {
            category = "Compact class";
            type = "Cabrio";
            price = budget * 0.45;

        } else if (budget <= 500 && season.equals("Winter")) {
            category = "Compact class";
            type = "Jeep";
            price = budget * 0.80;
        } else {
            category = "Luxury class";
            type = "Jeep";
            price = budget * 0.90;
        }
        System.out.println(category);
        System.out.printf("%s - %.2f", type, price);
    }
}
