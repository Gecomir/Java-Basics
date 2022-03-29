package ForLoops.exercises;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String artist = scanner.nextLine();
        double pointsOfAcademy = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        // double totalPoints = 0.0;

        for (int i = 1; i <= n; i++) {
            String nameOfEvaluating = scanner.nextLine();
            double pointsOfEvaluating = Double.parseDouble(scanner.nextLine());

            int a = nameOfEvaluating.length();
            pointsOfAcademy = pointsOfAcademy + ((a * pointsOfEvaluating)) / 2;

            if (pointsOfAcademy > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", artist, pointsOfAcademy);
                return;
            }
        }

        System.out.printf("Sorry, %s you need %.1f more!", artist, 1250.5 - pointsOfAcademy);

    }
}

