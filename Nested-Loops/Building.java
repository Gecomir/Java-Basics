package NestedLoops.lab;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countFloor = Integer.parseInt(scanner.nextLine());
        int countRoom = Integer.parseInt(scanner.nextLine());

        for (int floor = countFloor; floor >= 1; floor--) {
            for (int roomNumber = 0; roomNumber <= countRoom - 1; roomNumber++) {

                if (floor == countFloor) {
                    System.out.print("L" + floor + roomNumber + " ");
                } else if (floor % 2 == 0) {
                    System.out.print("O" + floor + roomNumber + " ");
                } else {
                    System.out.print("A" + floor + roomNumber + " ");
                }
            }
            System.out.println();
        }
    }
}
