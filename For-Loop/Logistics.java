package ForLoops.exercises;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCargo = Integer.parseInt(scanner.nextLine());
        int bus = 0;
        int truck = 0;
        int train = 0;
        for (int i = 0; i < countCargo; i++) {
            int tone = Integer.parseInt(scanner.nextLine());
            if (tone < 4) {
                bus += tone;
            } else if (tone < 12) {
                truck += tone;
            } else {
                train += tone;
            }
        }

        double totalTone = bus + truck + train;
        double average = (bus * 200 + truck * 175 + train * 120) / totalTone;

        System.out.printf("%.2f%n", average);
        System.out.printf("%.2f%%%n", bus * 1.0 / totalTone * 100);
        System.out.printf("%.2f%%%n", truck * 1.0 / totalTone * 100);
        System.out.printf("%.2f%%%n", train * 1.0 / totalTone * 100);

    }
}

