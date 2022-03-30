package WhileLoop;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBalls = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int countRed = 0;
        int countOrange = 0;
        int countYellow = 0;
        int countWhite = 0;
        int countBlack = 0;
        int otherBalls = 0;
        for (int i = 1; i <= countBalls; i++) {
            String colors = scanner.nextLine();
            switch (colors) {
                case "red":
                    sum += 5;
                    countRed++;
                    break;
                case "orange":
                    sum += 10;
                    countOrange++;
                    break;
                case "yellow":
                    sum += 15;
                    countYellow++;
                    break;
                case "white":
                    sum += 20;
                    countWhite++;
                    break;
                case "black":
                    sum = sum / 2;
                    countBlack++;
                    break;
                default:
                    otherBalls++;
            }
        }
        System.out.printf("Total points: %d%n", sum);
        System.out.printf("Red balls: %d%n", countRed);
        System.out.printf("Orange balls: %d%n", countOrange);
        System.out.printf("Yellow balls: %d%n", countYellow);
        System.out.printf("White balls: %d%n", countWhite);
        System.out.printf("Other colors picked: %d%n", otherBalls);
        System.out.printf("Divides from black balls: %d", countBlack);
    }
}

