package proverki;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededHours = Integer.parseInt(scanner.nextLine());
        int daysLeft = Integer.parseInt(scanner.nextLine());
        int countWorker = Integer.parseInt(scanner.nextLine());

        double hoursWork = daysLeft - daysLeft * 0.1;
        double leftWork = hoursWork * 8;
        int plusHours = countWorker * (daysLeft * 2);
        double totalHours = Math.floor(leftWork + plusHours);
        if (neededHours <= totalHours) {
            System.out.printf("Yes!%.0f hours left.", totalHours - neededHours);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", neededHours - totalHours);
        }
    }
}
