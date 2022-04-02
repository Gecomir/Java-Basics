package proverki;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pool = Integer.parseInt(scanner.nextLine());
        int pipe1 = Integer.parseInt(scanner.nextLine());
        int pipe2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double pipe1PerHour = pipe1 * hours;
        double pipe2PerHour = pipe2 * hours;
        double totalPipes = pipe1PerHour + pipe2PerHour;
        if (totalPipes <= pool) {
            double poolFilet = totalPipes / pool * 100;
            double firstPipe = pipe1PerHour / totalPipes * 100;
            double secondPipe = pipe2PerHour / totalPipes * 100;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", poolFilet, firstPipe, secondPipe);
        } else {
            double fail = totalPipes - pool;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, fail);
        }
    }
}
