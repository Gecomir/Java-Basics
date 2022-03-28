package ConditionalStetements.exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        //.1  Четене от конзолата - 3 реда
        Scanner scanner = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeInSecondsForMeters = Double.parseDouble(scanner.nextLine());
        //2. Изчисляване дали е подобрил рекорда или не е
        //съпротивлението на водата го забавя на всеки 15 м. с 12.5 секунди.
        double neededSeconds = distanceInMeters * timeInSecondsForMeters;
        double plusSeconds = Math.floor(distanceInMeters / 15) * 12.5;
        double fullTimeSeconds = neededSeconds + plusSeconds;
        if (recordInSeconds <= fullTimeSeconds) {
            fullTimeSeconds = fullTimeSeconds - recordInSeconds;
            System.out.printf("No, he failed! He was %.2f seconds slower.", fullTimeSeconds);
        } else {

            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", fullTimeSeconds);
        }
    }
}
