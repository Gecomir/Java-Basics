package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        //1. Прочитане от конзолата
        //2. Изчисляване на градус = радиан * 180 / π.
        //3. Отпечатване
        Scanner scanner = new Scanner(System.in);
        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 180 / Math.PI;
        System.out.println(degrees);
    }
}
