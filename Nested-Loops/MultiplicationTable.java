package NestedLoops.lab;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                System.out.printf("%s * %s = %s%n", x, y, x * y);
            }
        }
    }
}
