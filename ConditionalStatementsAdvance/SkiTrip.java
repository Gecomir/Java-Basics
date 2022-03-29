package ConditionalStatementsAdvance.Exercises;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String rating = scanner.nextLine();
        // "room for one person", "apartment", "president apartment"
        double discount = 0.0;
        double pricePerNight = 0.0;
        int nights = days - 1;
        switch (typeOfRoom) {
            case "room for one person":
                pricePerNight = 18.00;
                break;

            case "apartment":
                pricePerNight = 25.00;
                if (days < 10) {
                    discount = 0.30;
                } else if (days <= 15) {
                    discount = 0.35;
                } else {
                    discount = 0.50;
                }
                break;

            case "president apartment":
                pricePerNight = 35.00;
                if (days < 10) {
                    discount = 0.10;
                } else if (days <= 15) {
                    discount = 0.15;
                } else {
                    discount = 0.20;
                }
                break;
        }
        double totalPrice = nights * pricePerNight;
        totalPrice = totalPrice - totalPrice * discount;
        switch (rating) {
            case "positive":
                totalPrice = totalPrice * 1.25;
                break;
            case "negative":
                totalPrice = totalPrice * 0.90;
                break;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
