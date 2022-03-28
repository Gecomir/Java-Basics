import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {

        //1. Четене от конзолата - 1 ред
        //2. Изчисляване
          // Баскетболни кецове – цената им е 40% по-малка от таксата за една година
          // Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
          // Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
          // Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
        //3. Отпечатване на вс разходи

        Scanner scanner = new Scanner(System.in);
        int annualFee = Integer.parseInt(scanner.nextLine());
        double sneakers = annualFee - 0.40 * annualFee;
        double outFit = sneakers - 0.20 * sneakers;
        double ball = outFit / 4;
        double accessories = ball / 5;
        double totalSum = annualFee + sneakers + outFit + ball + accessories;
        System.out.println(totalSum);
    }
}
