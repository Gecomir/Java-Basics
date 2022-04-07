package PoSlojniProverki;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int countPeople = Integer.parseInt(scanner.nextLine());

        double sum = 0.0;
        double tickets = 0.0;
        if (countPeople >= 1 && countPeople <= 4) {
            sum = budget - budget * 0.75;
        } else if (countPeople >= 5 && countPeople <= 9) {
            sum = budget - budget * 0.60;
        } else if (countPeople >= 10 && countPeople <= 24) {
            sum = budget - budget * 0.50;
        } else if (countPeople >= 25 && countPeople <= 49) {
            sum = budget - budget * 0.40;
        } else {
            sum = budget - budget * 0.25;
        }
        switch (category) {
            case "Vip":
                tickets = 499.99 * countPeople;
                break;
            case "Normal":
                tickets = 249.99 * countPeople;
                break;
        }
        if (sum >= tickets) {
            System.out.printf("Yes! You have %.2f leva left.", sum - tickets);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", tickets - sum);
        }
    }
}
