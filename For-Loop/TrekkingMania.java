package ForLoops.exercises;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        int group4 = 0;
        int group5 = 0;

        for (int i = 1; i <= n; i++) {
            int peopleCount = Integer.parseInt(scanner.nextLine());
            if (peopleCount < 6) {
                group1 += peopleCount;
            } else if (peopleCount < 13) {
                group2 += peopleCount;
            } else if (peopleCount < 26) {
                group3 += peopleCount;
            } else if (peopleCount < 41) {
                group4 += peopleCount;

            } else {
                group5 += peopleCount;

            }
        }
        int totalPeople = group1 + group2 + group3 + group4 + group5;
        System.out.printf("%.2f%%%n", group1 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", group2 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", group3 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", group4 * 1.0 / totalPeople * 100);
        System.out.printf("%.2f%%%n", group5 * 1.0 / totalPeople * 100);

    }
}
