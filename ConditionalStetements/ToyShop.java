package ConditionalStetements.exercises;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        //1. Четене от конзолата - 6 реда
        Scanner scanner = new Scanner(System.in);
        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        //2. Изчисляване на общата сума
        double totalPrice = puzzles * 2.6 + dolls * 3.0 + bears * 4.10 + minions * 8.20 + trucks * 2.0;
        //Ако поръчаните играчки са 50 или повече магазинът прави отстъпка 25% от общата цена
        int toyCount = puzzles + dolls + bears + minions + trucks;
        if (toyCount >= 50) {
            totalPrice = totalPrice - totalPrice * 0.25;
        }
        // Петя трябва да даде 10% за наема на магазина.
        totalPrice = totalPrice - totalPrice * 0.10;
if (totalPrice>= excursionPrice) {
    System.out.printf("Yes! %.2f lv left.", totalPrice - excursionPrice);
} else
    System.out.printf("Not enough money! %.2f lv needed.", excursionPrice - totalPrice);
    }
}
