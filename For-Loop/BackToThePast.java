package ForLoops.exercises;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int yearsToLife = Integer.parseInt(scanner.nextLine());
        int years = 18;
        for (int i = 1880; i <= yearsToLife; i++) {
            if (i % 2 == 0) {
                money -= 12000;
            } else {
                money -= (12000 + 50 * years);
            }
            years++;
        }
            if (money < 0) {
                System.out.printf("He will need %.2f dollars to survive.", Math.abs(money));
            } else {
                System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", money);
            }
        }
    }
