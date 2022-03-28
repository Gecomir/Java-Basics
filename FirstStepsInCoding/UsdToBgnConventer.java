package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class UsdToBgnConventer {
    public static void main(String[] args) {
        //1. Прочитане от конзолата
        //2. Изчисляване
        //3. Отпечатване
        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd * 1.79549;
        System.out.println(bgn);
    }
}
