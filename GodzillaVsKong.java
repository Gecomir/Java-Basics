package examp;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int countStatist = Integer.parseInt(scanner.nextLine());
        double pricePerStatist = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double priceForClothing = countStatist * pricePerStatist;
        if (countStatist > 150) {
            priceForClothing -= priceForClothing * 0.10;
        }
        double allSum = priceForClothing + decor;
        if (allSum > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", allSum - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - allSum);
        }
    }
}