package PoSlojniProverki;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmForMonths = Double.parseDouble(scanner.nextLine());

        double price = 0.0;

        if (kmForMonths <= 5000 && season.equals("Spring")) {
            price = 4 * (kmForMonths * 0.75);

        } else if (kmForMonths <= 5000 && season.equals("Autumn")) {
            price = 4 * (kmForMonths * 0.75);

        } else if (kmForMonths <= 10000 && season.equals("Autumn")) {
            price = 4 * (kmForMonths * 0.95);

        } else if (kmForMonths <= 10000 && season.equals("Spring")) {
            price = 4 * (kmForMonths * 0.95);

        } else if (kmForMonths <= 5000 && season.equals("Summer")) {
            price = 4 * (kmForMonths * 0.90);

        } else if (kmForMonths <= 10000 && season.equals("Summer")) {
            price = 4 * (kmForMonths * 1.10);

        } else if (kmForMonths <= 5000 && season.equals("Winter")) {
            price = 4 * (kmForMonths * 1.05);

        } else if (kmForMonths <= 10000 & season.equals("Winter")) {
            price = 4 * (kmForMonths * 1.25);

        } else {
            price = 4 * (kmForMonths * 1.45);
        }
        price = price - price * 0.10;
        System.out.printf("%.2f", price);
    }
}
