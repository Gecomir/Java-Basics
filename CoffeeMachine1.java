package examp1;

import java.util.Scanner;

public class CoffeeMachine1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int countDrink = Integer.parseInt(scanner.nextLine());

        double price = 0.0;
        switch (drink) {
            case "Espresso":
                switch (sugar) {
                    case "Without":
                        price = countDrink * 0.90;
                        price -= price * 0.35;
                        break;
                    case "Normal":
                        price = countDrink * 1.00;
                        break;
                    case "Extra":
                        price = countDrink * 1.20;
                        break;
                }
                break;
            case "Cappuccino":
                switch (sugar) {
                    case "Without":
                        price = countDrink * 1.00;
                        price -= price * 0.35;
                        break;
                    case "Normal":
                        price = countDrink * 1.20;
                        break;
                    case "Extra":
                        price = countDrink * 1.60;
                        break;
                }
                break;
            case "Tea":
                switch (sugar) {
                    case "Without":
                        price = countDrink * 0.50;
                        price -= price * 0.35;
                        break;
                    case "Normal":
                        price = countDrink * 0.60;
                        break;
                    case "Extra":
                        price = countDrink * 0.70;
                        break;
                }
                break;
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
