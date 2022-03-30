package WhileLoop;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();
        String bestPlayer = "";
        int bestScore = 0;
        while (!playerName.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());

            if (goals > bestScore) {
                bestScore = goals;
                bestPlayer = playerName;
            }
            if (bestScore >= 10) {
                break;
            }
            playerName = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", bestPlayer);
        if (bestScore >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n", bestScore);
        } else {
            System.out.printf("He has scored %d goals.", bestScore);
        }
    }
}
