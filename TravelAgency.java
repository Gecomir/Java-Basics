package examp1;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        String packet = scanner.nextLine();
        String vip = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double pricePerDay = 0.0;

        switch (town) {
            case "Bansko":
            case "Borovets":
                switch (packet) {
                    case "noEquipment":
                        pricePerDay = 80;
                        break;
                    case "withEquipment":
                        pricePerDay = 100;
                        break;
                }
                if (vip.equals("yes") && packet.equals("withEquipment")) {
                    pricePerDay -= pricePerDay * 0.10;
                }
                if (vip.equals("yes") && packet.equals("noEquipment")) {
                    pricePerDay -= pricePerDay * 0.05;
                }
            case "Varna":
            case "Burgas":
                switch (packet) {
                    case "withBreakfast":
                        pricePerDay = 130;
                        break;
                    case "noBreakfast":
                        pricePerDay = 100;
                        break;
                }
                if (vip.equals("yes") && packet.equals("withBreakfast")) {
                    pricePerDay -= pricePerDay * 0.12;
                }
                if (vip.equals("yes") && packet.equals("noBreakfast")) {
                    pricePerDay -= pricePerDay * 0.07;
                }

        }
        double totalPrice = days * pricePerDay;
        if (days > 7) {
            totalPrice -= pricePerDay;
        }
        if (days <= 1) {
            System.out.println("Days must be positive number!");
            return;
        }
        System.out.printf("The price is %.2flv! Have a nice time!", totalPrice);
    }
}
