package examp;

import java.util.Scanner;

public class OscarCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());
        double st = rent - rent * 0.30;
        double ket = st - st * 0.15;
        double light = ket / 2;
        double allSum = rent + st + ket + light;
        System.out.printf("%.2f", allSum);
    }
}
