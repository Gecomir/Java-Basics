package proverki;

import java.util.Scanner;

public class FuelTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();

        double price = 0.0;
        if (fuel.equals("Gasoline") && card.equals("Yes")) {
            price = 2.22 - 0.18;
        } else if (fuel.equals("Gasoline") && card.equals("No")) {
            price = 2.22;
        }
        if (fuel.equals("Diesel") && card.equals("Yes")) {
            price = 2.33 - 0.12;
        } else if (fuel.equals("Diesel") && card.equals("No")) {
            price = 2.33;
        }
        if (fuel.equals("Gas") && card.equals("Yes")) {
            price = 0.93 - 0.08;
        } else if (fuel.equals("Gas") && card.equals("No")) {
            price = 0.93;
        }
        if (quantity > 20 && quantity <= 25) {
            price = price - price * 0.08;
        } else if (quantity > 25) {
            price = price - price * 0.10;
        }
        double result = price * quantity;
        System.out.printf("%.2f lv.", result);
    }
}
