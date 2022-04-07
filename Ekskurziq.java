package izpit;

import java.util.Scanner;

public class Ekskurziq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceSleep = 20;
        double priceMuseum = 6;
        double priceCard = 1.60;

        int numberPeople = Integer.parseInt(scanner.nextLine());
        int numberNights = Integer.parseInt(scanner.nextLine());
        int numberCards = Integer.parseInt(scanner.nextLine());
        int numberTickets = Integer.parseInt(scanner.nextLine());

        double resultNights = numberNights * priceSleep;
        double resultCards = numberCards * priceCard;
        double resultTickets = numberTickets * priceMuseum;

        double fullPriceGroup = (resultCards + resultNights + resultTickets) * numberPeople;

        double totalPrice = fullPriceGroup + (fullPriceGroup * 0.25);

        System.out.printf("%.2f", totalPrice);

    }
}
