package examp;

import java.util.Scanner;

public class MovieRating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countFilm = Integer.parseInt(scanner.nextLine());

        double minRating = Double.MAX_VALUE;
        double maxRating = Double.MIN_VALUE;
        double averageSum = 0.0;
        String highFilm = "";
        String lowFilm = "";

        for (int i = 1; i <= countFilm; i++) {
            String filmName = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            averageSum += rating;

            if (rating > maxRating) {
                maxRating = rating;
                highFilm = filmName;
            }
            if (rating < minRating) {
                minRating = rating;
                lowFilm = filmName;
            }
        }
        System.out.printf("%s is with highest rating: %.1f%n", highFilm, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", lowFilm, minRating);
        System.out.printf("Average rating: %.1f%n", averageSum / countFilm);
    }
}

