package While_Loop.exercises.exam;

import javax.management.PersistentMBean;
import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String player = scanner.nextLine();
        int currentGoals = Integer.parseInt(scanner.nextLine());
        int maxScrore = 0;
        String bestPlayer = "";
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            if (currentGoals > maxScrore) {
              maxScrore = currentGoals;
               bestPlayer = input;
                System.out.printf("%s is the best player!%n", bestPlayer);
            }
            if (currentGoals >= 3) {
                maxScrore = currentGoals;
               bestPlayer = input;
                System.out.printf("He has scored %d goals and made a hat-trick !!!%n", maxScrore);
            } else {
                System.out.printf("He has scored %d goals.%n", maxScrore);
            }
            if (currentGoals >= 10) {
                break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("He has scored %d goals.%n", maxScrore);

    }
}










