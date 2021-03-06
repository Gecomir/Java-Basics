package WhileLoop;

import java.util.Scanner;

public class DishWasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBottles = Integer.parseInt(scanner.nextLine());
        countBottles *= 750;

        int mlPerDishes = 0;
        int countDishes = 0;
        int mlPerPots = 0;
        int countPots = 0;

        boolean isItEnd = false;

        int allMlPerWash = 0;
        int result = 0;

        int looper = 0;
        String input = "";
        while (true) {
            input = scanner.nextLine();

            if (input.equals("End")) {
                isItEnd = true;
                break;
            }

            int dishInput = Integer.parseInt(input);
            looper++;

            if (looper % 3 == 0) {
                mlPerPots += dishInput;
                countPots += dishInput;
            } else {
                mlPerDishes += dishInput;
                countDishes += dishInput;
            }

            allMlPerWash = mlPerDishes * 5 + mlPerPots * 15;

            if (countBottles < allMlPerWash) {
                break;
            }

        }
        if (isItEnd || countBottles >= allMlPerWash) {
            result = countBottles - allMlPerWash;
            System.out.printf("Detergent was enough!%n" +
                    "%d dishes and %d pots were washed.%n" +
                    "Leftover detergent %d ml.", countDishes, countPots, result);

        } else {
            result = Math.abs(allMlPerWash - countBottles);
            System.out.printf("Not enough detergent, %d ml. more necessary!", result);

        }
    }
}
