package examp1;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        double payTicket = Double.parseDouble(scanner.nextLine());
        double priceChair = Double.parseDouble(scanner.nextLine());
        double priceUmbrella = Double.parseDouble(scanner.nextLine());

        double enter = countPeople * payTicket;
        double totalUmbrella = Math.ceil(countPeople * 1.0 / 2) * priceUmbrella;
        double totalChair = Math.ceil(countPeople * 1.0 * 0.75);
        double total = totalChair*priceChair;
        double totalPrice = enter + total+ totalUmbrella;
        System.out.printf("%.2f lv.", totalPrice);
    }
}
