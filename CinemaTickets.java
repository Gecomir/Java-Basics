package examp;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filmName = scanner.nextLine();
        int count = 0;
        int studentTickets = 0;
        int kindTickets = 0;
        int standardTickets = 0;

        while (!filmName.equals("Finish")) {
            int freeSeat = Integer.parseInt(scanner.nextLine());
            count = 0;

            for (int i = 1; i <= freeSeat; i++) {
                String typeTickets = scanner.nextLine();
                if (typeTickets.equals("End")) {
                    break;
                }
                count++;
                switch (typeTickets) {
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    default:
                        kindTickets++;
                        break;
                }
            }
            System.out.printf("%s - %.2f%% full.%n", filmName, count * 1.0 / freeSeat * 100);

            filmName = scanner.nextLine();
        }
        count = standardTickets + kindTickets + studentTickets;
        System.out.printf("Total tickets: %d%n", count);
        System.out.printf("%.2f%% student tickets.%n", (100.0 / count) * studentTickets);
        System.out.printf("%.2f%% standard tickets.%n", (100.0 / count) * standardTickets);
        System.out.printf("%.2f%% kids tickets.", (100.0 / count) * kindTickets);
    }
}
