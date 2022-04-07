package izpit;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        •	Любовно послание - 0.60 лв.
//•	Восъчна роза - 7.20 лв.
//•	Ключодържател - 3.60 лв.
//•	Карикатура - 18.20 лв.
//•	Късмет изненада - 22 лв.

        double priceLoveLetter = 0.60;
        double priceRose = 7.20;
        double priceKeychain = 3.60;
        double priceCaricature = 18.20;
        double priceLuck = 22;

        double priceParty = Double.parseDouble(scanner.nextLine());
        int countLoveLetter = Integer.parseInt(scanner.nextLine());
        int countRoses = Integer.parseInt(scanner.nextLine());
        int countKeychain = Integer.parseInt(scanner.nextLine());
        int countCaricature = Integer.parseInt(scanner.nextLine());
        int countLuck = Integer.parseInt(scanner.nextLine());

        int countArticules = countLoveLetter + countRoses + countKeychain + countCaricature + countLuck;

        double totalOrdersProfit = (countLoveLetter * priceLoveLetter) + (countRoses * priceRose) +
                (countKeychain * priceKeychain) + (countCaricature * priceCaricature) + (countLuck * priceLuck);

        if (countArticules >= 25) {
            totalOrdersProfit -= totalOrdersProfit * 0.35;
        }

        totalOrdersProfit -= totalOrdersProfit * 0.10;

        if (totalOrdersProfit >= priceParty) {
            System.out.printf("Yes! %.2f lv left.", totalOrdersProfit - priceParty);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", priceParty - totalOrdersProfit);
        }
    }
}
