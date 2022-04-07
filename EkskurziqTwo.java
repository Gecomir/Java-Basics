package izpit;

import java.util.Scanner;

public class EkskurziqTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();

        double result = 0;

        switch (season){
            case "spring" :
                if (countPeople <= 5) {
                    result = countPeople * 50;
                } else {
                    result = countPeople * 48;
                }
                break;
            case "summer" :
                if (countPeople <= 5) {
                    result = countPeople * 48.50;
                    result -= result * 0.15;
                } else {
                    result = countPeople * 45;
                    result -= result * 0.15;

                }
                break;
            case "autumn" :
                if (countPeople <= 5) {
                    result = countPeople * 60;
                } else {
                    result = countPeople * 49.50;
                }
                break;
            case "winter" :
                if (countPeople <= 5) {
                    result = countPeople * 86;
                    result += result * 0.08;
                } else {
                    result = countPeople * 85;
                    result += result * 0.08;
                }
                break;
        }

        System.out.printf("%.2f leva.", result);

    }
}
