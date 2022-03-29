package ConditionalStatementsAdvance.Exercises;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arriveHour = Integer.parseInt(scanner.nextLine());
        int arriveMinute = Integer.parseInt(scanner.nextLine());

        int examTime = examHour * 60 + examMinute;    // преобразуване на часове в минути
        int arriveTime = arriveHour * 60 + arriveMinute;
        String status = "";
        String output = "";
        int diff = Math.abs(examTime - arriveTime);

        if (arriveTime < examTime - 30) {
            status = "Early";
            if (diff < 60) {
                output = String.format("%d minutes before the start", diff);
            } else {
                int h = diff / 60;
                int m = diff % 60;
                output = String.format("%d:%02d hours before the start", h, m);
            }

        } else if (arriveTime <= examTime) {
            status = " On Time";
            output = String.format("%d minutes before the start", diff);
        } else {
            status = "Late";
            if (diff < 60) {
                output = String.format("%d minutes after the start", diff);
            } else {
                int h = diff / 60;
                int m = diff % 60;
                output = String.format("%d:%02d hours after the start", h, m);
            }
        }
        System.out.println(status);
        System.out.println(output);
    }
}

