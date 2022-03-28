package ConditionalStetements.exercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        //1.Четене от конзолата -2 реда
        Scanner scanner = new Scanner(System.in);
        String serialName = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());
        //2. Изчисляване
        //Времето за обяд ще бъде 1/8 от времето за почивка
        //времето за отдих ще бъде 1/4 от времето за почивка
        double lunchTime = breakTime / 8.0;
        double restTime = breakTime / 4.0;
        double totalTime = episodeTime + lunchTime + restTime;
        if (totalTime <= breakTime) {
            System.out.printf("You have enough time to watch %s " + "and left with %.0f minutes free time.", serialName, Math.ceil(breakTime-totalTime));
        } else {
            System.out.printf("You don't have enough time to watch %s, " + "you need %.0f more minutes.", serialName, Math.ceil(totalTime-breakTime));
        }

    }
}
