package proverki;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodInKg = Integer.parseInt(scanner.nextLine());
        double foodPerDayForDog = Double.parseDouble(scanner.nextLine());
        double foodPerDayForCat = Double.parseDouble(scanner.nextLine());
        double foodPerDayForTurtle = Double.parseDouble(scanner.nextLine());

        double foodDog = days * foodPerDayForDog;
        double foodCat = days * foodPerDayForCat;
        double foodTurtle = days * foodPerDayForTurtle / 1000;
        double allFood = foodDog + foodCat + foodTurtle;
        if (foodInKg >= allFood) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodInKg - allFood));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(allFood - foodInKg));
        }
    }
}
