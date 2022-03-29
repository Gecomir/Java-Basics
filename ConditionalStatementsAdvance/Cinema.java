package ConditionalStatementsAdvance.Exercises;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int totalPlaces = r * c;
        double total = 0.0;
        switch (projection) {
            case "Premiere":
                total = totalPlaces * 12.00;
                break;
            case "Normal":
                total = totalPlaces * 7.50;
                break;
            case "Discount":
                total = totalPlaces * 5.00;
                break;

        }
        System.out.printf("%.2f leva", total);

    }
}
