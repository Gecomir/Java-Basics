import java.util.Scanner;

public class EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int diapasonStart = Integer.parseInt(scanner.nextLine());
        int diapasonEnd = Integer.parseInt(scanner.nextLine());


        for (int number = diapasonStart; number <= diapasonEnd; number++) {
            int sumOdd = 0;
            int sumEven = 0;

            String strNumber = Integer.toString(number);

            for (int i = 0; i < strNumber.length(); i++) {
                int digit = strNumber.charAt(i);

                if (i % 2 == 0) {
                    sumEven += digit;
                } else {
                    sumOdd += digit;
                }
            }

            if (sumEven == sumOdd) {
                System.out.printf("%d ", number);
            }
        }
    }
}
