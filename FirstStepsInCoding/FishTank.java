import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        //1. Прочитане от конзолата - 4 реда
        //2. Изчисляване
        //3. Отпечатване на необх. литри за напълването на аквариума
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        double volumeInCm = length * width * height;
        double volumeInLitres = volumeInCm / 1000;
        volumeInLitres = volumeInLitres - volumeInLitres * (percent / 100 );
        System.out.println(volumeInLitres);



    }
}
