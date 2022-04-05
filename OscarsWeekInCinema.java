package examp;

import java.util.Scanner;

public class OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String film = scanner.nextLine();
        String kindHall = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());

        double price = 0.0;
        if (film.equals("A Star Is Born")) {
            switch (kindHall) {
                case "normal":
                    price = tickets * 7.50;
                    break;
                case "luxury":
                    price = tickets * 10.50;
                    break;
                case "ultra luxury":
                    price = tickets * 13.50;
            }
        } else if (film.equals("Bohemian Rhapsody")) {
            switch (kindHall) {
                case "normal":
                    price = tickets * 7.35;
                    break;
                case "luxury":
                    price = tickets * 9.45;
                    break;
                case "ultra luxury":
                    price = tickets * 12.75;
            }
        } else if (film.equals("Green Book")) {
            switch (kindHall) {
                case "normal":
                    price = tickets * 8.15;
                    break;
                case "luxury":
                    price = tickets * 10.25;
                    break;
                case "ultra luxury":
                    price = tickets * 13.25;
            }
        } else if (film.equals("The Favourite")) {
            switch (kindHall) {
                case "normal":
                    price = tickets * 8.75;
                    break;
                case "luxury":
                    price = tickets * 11.55;
                    break;
                case "ultra luxury":
                    price = tickets * 13.95;
            }
        }
        System.out.printf("%s -> %.2f lv.", film, price);
    }
}
