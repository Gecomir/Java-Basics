package examp1;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int night = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int cost = Integer.parseInt(scanner.nextLine());

        double totalNight = 0.0;

        if (night > 7) {
            totalNight = night * (pricePerNight - pricePerNight * 0.05);
        } else {
            totalNight = night * pricePerNight;
        }
        double otherCost = budget * cost / 100;
        double totalPrice = otherCost + totalNight;

        if (budget >= totalPrice) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalPrice);
        } else {
            System.out.printf("%.2f leva needed.", totalPrice - budget);
        }
    }
}
