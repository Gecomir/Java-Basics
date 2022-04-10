package dopulnenie;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double area = x * y;
        double window = 1.5 * 1.5;
        double twoOutside = (2 * area) - (2 * window);
        double backOutside = (x * x) * 2;
        double door = 1.2 * 2;
        double totalSide = backOutside - door;
        double redPaint = (twoOutside + totalSide) / 3.4;

        double triangle = 2 * (x * y);
        double triangleTwo = 2 * (x * h / 2);
        double greenPaint = (triangle + triangleTwo) / 4.3;
        System.out.printf("%.2f%n", redPaint);
        System.out.printf("%.2f", greenPaint);
    }
}
