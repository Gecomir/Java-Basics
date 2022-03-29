package ConditionalStatementsAdvance.Exercises;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0.0;
        switch (flowers) {
            case "Roses":
                price = count * 5.00;
                if (count > 80)
                    price = price * 0.90;
                break;

            case "Dahlias":
                price = count * 3.80;
                if (count > 90)
                    price = price * 0.85;
                break;

            case "Tulips":
                price = count * 2.80;
                if (count > 80)
                    price = price * 0.85;
                break;

            case "Narcissus":
                price = count * 3.00;
                if (count < 120)
                    price = price * 1.15;
                break;

            case "Gladiolus":
                price = count * 2.50;
                if (count < 80)
                    price = price * 1.20;
                break;

        }
        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flowers, (budget - price));
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", (price - budget));
        }
    }
}
