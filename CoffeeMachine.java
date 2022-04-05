package examp1;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int countDrink = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        if (drink.equals("Espresso") && sugar.equals("Without")) {
            price = countDrink * 0.90;
            price -= price * 0.35;
        } else if (drink.equals("Espresso") && sugar.equals("Normal")) {
            price = countDrink * 1.00;
        } else if (drink.equals("Espresso") && sugar.equals("Extra")) {
            price = countDrink * 1.20;
        }
        if (drink.equals("Cappuccino") && sugar.equals("Without")) {
            price = countDrink * 1.00;
            price -= price * 0.35;
        } else if (drink.equals("Cappuccino") && sugar.equals("Normal")) {
            price = countDrink * 1.20;
        } else if (drink.equals("Cappuccino") && sugar.equals("Extra")) {
            price = countDrink * 1.60;
        }
        if (drink.equals("Tea") && sugar.equals("Without")) {
            price = countDrink * 0.50;
            price -= price * 0.35;
        } else if (drink.equals("Tea") && sugar.equals("Normal")) {
            price = countDrink * 0.60;
        } else if (drink.equals("Tea") && sugar.equals("Extra")) {
            price = countDrink * 0.70;
        }
        if (drink.equals("Espresso") && countDrink >= 5) {
            price -= price * 0.25;
        }
        if (price > 15) {
            price -= price * 0.20;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", countDrink, drink, price);
    }
}
