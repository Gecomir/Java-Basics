package proverki;

import java.util.Scanner;

public class SLeepTomCat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dayOff = Integer.parseInt(scanner.nextLine());
        int norma = 30000;
        int workDays = 365 - dayOff;
        int playWithTom = workDays * 63 + dayOff * 127;
        int resultPlay = Math.abs(norma - playWithTom);
        int minute = resultPlay % 60;
        int hours = resultPlay / 60;
        if (playWithTom > norma) {

            System.out.println("Tom will run away");
            System.out.printf("%s hours and %s minutes more for play", hours, minute);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%s hours and %s minutes less for play", hours, minute);
        }
    }
}
