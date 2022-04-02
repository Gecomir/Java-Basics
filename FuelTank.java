package proverki;

import java.util.Locale;
import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuel = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if (fuel.equals("Diesel") || fuel.equals("Gasoline") || fuel.equals("Gas")) {

            if (quantity >= 25) {
                System.out.printf("You have enough %s.", fuel.toLowerCase(Locale.ROOT));
            } else {
                System.out.printf("Fill your tank with %s!", fuel.toLowerCase(Locale.ROOT));
            }
        } else {
            System.out.println("Invalid fuel!");
        }
    }
}
