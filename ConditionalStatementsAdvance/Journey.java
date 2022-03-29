package ConditionalStatementsAdvance.Exercises;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        String place = "";

        if (budget <= 100) {
            destination = "Bulgaria";

            if (season.equals("summer")) {
                budget = budget * 0.3; // *= 0.3;
                place = "Camp";

            } else if (season.equals("winter")) {
                budget *= 0.7;
                place = "Hotel";
            }

        } else if (budget <= 1000) {
            destination = "Balkans";

            if (season.equals("summer")) {
                budget *= 0.4;
                place = "Camp";

            } else if (season.equals("winter")) {
                place = "Hotel";
                budget *= 0.8;
            }

        } else if (budget > 1000) {
            destination = "Europe";
            place = "Hotel";
            budget *= 0.9;

        }
        System.out.println("Somewhere in " + destination);
        System.out.printf("%s - %.2f", place, budget);
    }
}

