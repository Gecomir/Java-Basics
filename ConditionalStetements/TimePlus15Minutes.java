package ConditionalStetements.exercises;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int hourToMinutes = hour * 60;
        int totalMinutes = hourToMinutes + minutes + 15;
        int realHour = totalMinutes / 60;
        int realMinutes = totalMinutes % 60;
        if (realHour == 24) {
            System.out.printf("0:%02d", realMinutes);
        } else if (realMinutes < 10) {
            System.out.printf("%d:%02d", realHour, realMinutes);
        } else {
            System.out.printf("%d:%d", realHour, realMinutes);
        }
    }
}
