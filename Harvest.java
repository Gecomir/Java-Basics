package proverki;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int area = Integer.parseInt(scanner.nextLine());
        double grapesPerMeter = Double.parseDouble(scanner.nextLine());
        int neededWine = Integer.parseInt(scanner.nextLine());
        int countWorker = Integer.parseInt(scanner.nextLine());

        double literPerPerson = 0.0;
        double productionWine = area * 0.40;
        double productionWine2 = productionWine * grapesPerMeter / 2.5;
        double resultWine = Math.abs(productionWine2 - neededWine);

        if (productionWine2 >= neededWine) {
            literPerPerson = Math.ceil(resultWine / countWorker);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(productionWine2));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(resultWine), literPerPerson);
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(resultWine));

        }
    }
}
