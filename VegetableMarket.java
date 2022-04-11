package dopulnenie;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pricePerKgVegetables = Double.parseDouble(scanner.nextLine());
        double pricePerKgFruits = Double.parseDouble(scanner.nextLine());
        int totalKgVegetables = Integer.parseInt(scanner.nextLine());
        int totalKgFruits = Integer.parseInt(scanner.nextLine());

        double totalSumVegetables = pricePerKgVegetables * totalKgVegetables;
        double totalSumFruits = pricePerKgFruits * totalKgFruits;
        double allPrice = totalSumVegetables + totalSumFruits;
        double euro = allPrice / 1.94;

        System.out.printf("%.2f", euro);
    }
}
