package proverki;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        //	Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв. / км. Нощна тарифа: 0.90 лв. / км.
        //Автобус. Дневна / нощна тарифа: 0.09 лв. / км. Може да се използва за разстояния минимум 20 км.
        //Влак. Дневна / нощна тарифа: 0.06 лв. / км. Може да се използва за разстояния минимум 100 км. *//
        double sum = 0.0;
        if (km < 20 && dayOrNight.equals("day")) {
            sum = 0.70 + km * 0.79;
        } else if (km < 20 && dayOrNight.equals("night")) {
            sum = 0.70 + km * 0.90;
        } else if (km >= 20 && km < 100) {
            sum = km * 0.09;
        } else {
            sum = km * 0.06;
        }
        System.out.printf("%.2f", sum);
    }
}

