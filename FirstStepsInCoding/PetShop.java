import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        //1.Четене от конзолата - Броят на опаковките храна за куче и котки – цяло число в интервала [0… 100]
        //2. Изчисляване - 1 опаковка за кучета * 2.5лв. , 1 опаковка за котки * 4лв.
        //3. Отпечатване крайна сума в lv.
        Scanner scanner = new Scanner(System.in);
        double dog = Double.parseDouble(scanner.nextLine());
        double packet = dog * 2.5;
        int cat = Integer.parseInt(scanner.nextLine());
        int packet2 = cat * 4;
        double sum = packet + packet2;
        System.out.println(sum);

    }
}
