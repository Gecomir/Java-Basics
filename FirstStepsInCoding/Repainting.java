import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        //1. Прочитане от конзолата - 4 реда
        //2. Изчисления
        // Предпазен найлон - 1.50 лв. за кв. метър
        // Боя - 14.50 лв. за литър
        // Разредител за боя - 5.00 лв. за литър
        //3. Отпечатване сумата на вс. разходи

        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int paintThinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double nylonSum = (nylon + 2) * 1.50;
        double paintSum = paint * 1.10 * 14.50;
        double paintThinnerSum = paintThinner * 5.00;
        double materials = nylonSum + paintSum + paintThinnerSum + 0.40;
        double worker = materials * 0.30 * hours;
        double total = worker + materials;
        System.out.println();

    }
}
