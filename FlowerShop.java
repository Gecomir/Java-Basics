package proverki;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //*	Магнолии – 3.25 лева
        // Зюмбюли – 4 лева
        // Рози – 3.50 лева
        // Кактуси – 8 лева
        int mongolia = Integer.parseInt(scanner.nextLine());
        int hyacinth = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cactus = Integer.parseInt(scanner.nextLine());
        double present = Double.parseDouble(scanner.nextLine());

        double allSumFlowers = (mongolia * 3.25) + (hyacinth * 4.00) + (roses * 3.50) + (cactus * 8.00);
        double totalSum = allSumFlowers - (allSumFlowers * 0.05);
        if (present <= totalSum) {
            System.out.printf("She is left with %.0f leva.", Math.floor(totalSum - present));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(present - totalSum));
        }
    }
}
