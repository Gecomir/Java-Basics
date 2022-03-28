package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        //1. Четене от конзолата - 3 реда
        //2. Изчисляване на общата сума = депозирана сума + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        //3. Отпечатване на сумата в края на срока
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percents = Double.parseDouble(scanner.nextLine());
        double interest = deposit * (percents / 100);
        double month1 = interest / 12;
        double sum = deposit + months * month1;
        System.out.println(sum);
    }
}
