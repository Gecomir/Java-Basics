package dopulnenie;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pricePerKgMackerel = Double.parseDouble(scanner.nextLine());
        double pricePerKgTsatsa = Double.parseDouble(scanner.nextLine());
        double kgPalamud = Double.parseDouble(scanner.nextLine());
        double kgSafrid = Double.parseDouble(scanner.nextLine());
        int kgShel = Integer.parseInt(scanner.nextLine());

        double pricePalamud = pricePerKgMackerel * 1.60;
        double totalSumPalamud = pricePalamud * kgPalamud;
        double priceSafrid = pricePerKgTsatsa * 1.80;
        double totalSumSafrid = kgSafrid * priceSafrid;
        double totalKgShel = kgShel * 7.5;
        double allSum = totalSumPalamud + totalSumSafrid + totalKgShel;

        System.out.printf("%.2f", allSum);

    }
}
