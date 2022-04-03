package PoSlojniProverki;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double price = 0.0;
        String category = "";
        if (group.equals("boys") && season.equals("Winter")) {
            price = students * (nights * 9.60);
            category = "Judo";
        }
        if (group.equals("girls") && season.equals("Winter")) {
            price = students * (nights * 9.60);
            category = "Gymnastics";
        }
        if (group.equals("mixed") && season.equals("Winter")) {
            price = students * (nights * 10);
            category = "Ski";
        }
        if (group.equals("boys") && season.equals("Spring")) {
            price = students * (nights * 7.20);
            category = "Tennis";
        }
        if (group.equals("girls") && season.equals("Spring")) {
            price = students * (nights * 7.20);
            category = "Athletics";
        }
        if (group.equals("mixed") && season.equals("Spring")) {
            price = students * (nights * 9.50);
            category = "Cycling";
        }
        if (group.equals("boys") && season.equals("Summer")) {
            price = students * (nights * 15);
            category = "Football";
        }
        if (group.equals("girls") && season.equals("Summer")) {
            price = students * (nights * 15);
            category = "Volleyball";
        }
        if (group.equals("mixed") && season.equals("Summer")) {
            price = students * (nights * 20);
            category = "Swimming";
        }
        if (students >= 50) {
            price = price - price * 0.50;
        } else if (students >= 20) {
            price = price - price * 0.15;
        } else if (students >= 10) {
            price = price - price * 0.05;
        }
        System.out.printf("%s %.2f lv.", category, price);
    }
}
