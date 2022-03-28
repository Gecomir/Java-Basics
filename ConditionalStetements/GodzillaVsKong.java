package ConditionalStetements.exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        //1. Четене от конзолата - 3 реда
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceClothing = Double.parseDouble(scanner.nextLine());
        //2. Изчисления
        // Декорът за филма е на стойност 10% от бюджета.
        // При повече от 150 статиста, има отстъпка за облеклото на стойност 10%.
        double dekor = budget * 0.10;
        if (statists > 150) {
            priceClothing = priceClothing - priceClothing * 0.10;
        }
        double needMoney = dekor + statists * priceClothing;
        double notMoney = needMoney - budget;
        double moneyLeft = budget - needMoney;
        if (needMoney <= budget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", notMoney);
        }
    }
}
