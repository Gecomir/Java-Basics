package examp1;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double profit = Double.parseDouble(scanner.nextLine());
        String name = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;

        while (!name.equals("Party!")) {
            int length = name.length();
            double sum = length * count;

            if (sum % 2 != 0) {
                sum -= sum * 0.25;
            }
            totalSum += sum;

            if (totalSum >= profit) {
                System.out.println("Target acquired.");
                System.out.printf("Club income - %.2f leva.", totalSum);
                break;
            }
            name = scanner.nextLine();

            if (name.equals("Party!")) {
                break;
            }
            count = Integer.parseInt(scanner.nextLine());
        }

        if (totalSum < profit) {
            System.out.printf("We need %.2f leva more.%n", Math.abs(totalSum - profit));
            System.out.printf("Club income - %.2f leva.", totalSum);
        }
    }
}
