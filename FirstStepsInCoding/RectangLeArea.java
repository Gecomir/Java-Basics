import java.util.Scanner;

public class RectangLeArea {
    public static void main(String[] args) {
        // 1. две променливи (a и b) -> конзола
        //2. изчисля лицето = a * b
        //3. отпечатваме лицето
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int area = a * b;
        System.out.println(area);


    }
}
