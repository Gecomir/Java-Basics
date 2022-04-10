package dopulnenie;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        w = w * 100;
        h = h * 100;
        double w1 = Math.floor(w / 120);
        double h1 = Math.floor((h - 100) / 70);
        double total = h1 * w1 - 3;
        System.out.printf("%.0f", total);

    }
}
