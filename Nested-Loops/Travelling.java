package NestedLoops.lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double needBudget = Double.parseDouble(scanner.nextLine());
            double saveMoney = 0;

            while (saveMoney < needBudget) {
                double money = Double.parseDouble(scanner.nextLine());
                saveMoney += money;
            }
            System.out.printf("Going to %s!%n", destination);

            destination = scanner.nextLine();
        }
    }
}
