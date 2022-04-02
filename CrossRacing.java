package PoSlojniProverki;

import java.util.Scanner;

public class CrossRacing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juniorsCount = Integer.parseInt(scanner.nextLine());
        int seniorsCount = Integer.parseInt(scanner.nextLine());
        String route = scanner.nextLine();
        double juniors = 0.0;
        double senior = 0.0;
        int allCount = juniorsCount + seniorsCount;
        switch (route) {
            case "trail":
                juniors = 5.50;
                senior = 7;
                break;
            case "cross-country":
                juniors = 8;
                senior = 9.50;
                break;
            case "downhill":
                juniors = 12.25;
                senior = 13.75;
                break;
            case "road":
                juniors = 20;
                senior = 21.50;
                break;
        }
        double allPrice = juniors * juniorsCount + senior * seniorsCount;
        double totalPrice = allPrice - allPrice * 0.05;
        if (route.equals("cross-country") && allCount >= 50) {
            totalPrice -= totalPrice * 0.25;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
