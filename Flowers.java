package PoSlojniProverki;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countChrysanthemum = Integer.parseInt(scanner.nextLine());
        int countRouses = Integer.parseInt(scanner.nextLine());
        int countLale = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double chrysanthemum = 0.0;
        double rouses = 0.0;
        double lale = 0.0;
        int allFlowers = countChrysanthemum + countLale + countRouses;

        switch (season) {
            case "Spring":
                chrysanthemum = 2.00;
                rouses = 4.10;
                lale = 2.50;
            case "Summer":
                chrysanthemum = 2.00;
                rouses = 4.10;
                lale = 2.50;
                break;
            case "Autumn":
                chrysanthemum = 3.75;
                rouses = 4.50;
                lale = 4.15;
            case "Winter":
                chrysanthemum = 3.75;
                rouses = 4.50;
                lale = 4.15;
                break;
        }
        double allSum = (chrysanthemum * countChrysanthemum) + (rouses * countRouses) + (lale * countLale);
        if (holiday.equals("Y")) {
            allSum += allSum * 0.15;
        }
        if (countLale > 7 && season.equals("Spring")) {
            allSum -= allSum * 0.05;
        }
        if (countRouses >= 10 && season.equals("Winter")) {
            allSum -= allSum * 0.10;
        }
        if (allFlowers > 20) {
            allSum -= allSum * 0.20;
        }
        System.out.printf("%.2f", allSum+2);
    }
}
