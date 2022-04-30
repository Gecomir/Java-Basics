package WhileLoop;

import java.util.Scanner;

public class barcodeGeneration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int f1 = firstNumber / 1000;
        int f2 = firstNumber / 100 % 10;
        int f3 = firstNumber / 10 % 10;
        int f4 = firstNumber % 10;

        int e1 = endNumber / 1000;
        int e2 = endNumber / 100 % 10;
        int e3 = endNumber / 10 % 10;
        int e4 = endNumber % 10;

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {

                        if (i % 2 != 0  && i >= f1 && i <= e1) {
                            if (j % 2 != 0  && j >= f2 && j <= e2) {
                                if (k % 2 != 0  && k >= f3 && k <= e3) {
                                    if (l % 2 != 0  && l >= f4 && l <= e4) {


                                        System.out.printf("%d%d%d%d ",i,j,k,l);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

