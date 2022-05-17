package PoSlojniProverki;

import java.util.Scanner;

public class Holiday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0.0;
        String place = "";
        String location = "";

        if (budget <= 1000 && season.equals("Summer")) {
            place = "Camp";
            location = "Alaska";
            price = budget * 0.65;

        } else if (budget <= 1000 && season.equals("Winter")) {
            place = "Camp";
            location = "Morocco";
            price = budget * 0.45;

        } else if (budget > 1000 && budget <= 3000 && season.equals("Summer")) {
            place = "Hut";
            location = "Alaska";
            price = budget * 0.80;

        } else if (budget > 1000 && budget <= 3000 && season.equals("Winter")) {
            place = "Hut";
            location = "Morocco";
            price = budget * 0.60;

        } else if (budget > 3000 && season.equals("Summer")) {
            place = "Hotel";
            location = "Alaska";
            price = budget * 0.90;

        } else if (budget > 3000 && season.equals("Winter")) {
            place = "Hotel";
            location = "Morocco";
            price = budget * 0.90;
        }
        System.out.printf("%s - %s - %.2f", location, place, price);
    }
}
