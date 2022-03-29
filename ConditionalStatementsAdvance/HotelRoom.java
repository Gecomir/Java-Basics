package ConditionalStatementsAdvance.Exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double studioPrice = 0.0;
        double apartmentPrice = 0.0;

        switch (month) {
            case "May":
            case "October":
                studioPrice = nights * 50.00;
                apartmentPrice = nights * 65.00;
                if (nights > 7 && nights <= 14) {
                    studioPrice = studioPrice - studioPrice * 0.05;
                } else if (nights > 14) {
                    studioPrice = studioPrice - studioPrice * 0.30;
                    apartmentPrice = apartmentPrice - apartmentPrice * 0.10;
                }
                break;
            case "June":
            case "September":
                studioPrice = nights * 75.20;
                apartmentPrice = nights * 68.70;
                if (nights > 14) {
                    studioPrice = studioPrice - studioPrice * 0.20;
                    apartmentPrice = apartmentPrice - apartmentPrice * 0.10;
                }
                break;
            case "July":
            case "August":
                studioPrice = nights * 76.00;
                apartmentPrice = nights * 77.00;
                if (nights > 14) {
                    apartmentPrice = apartmentPrice - apartmentPrice * 0.10;
                }
                break;
            default:
                break;
        }
        System.out.printf("Apartment: %.2f lv. %nStudio: %.2f lv.", apartmentPrice, studioPrice);
    }
}




