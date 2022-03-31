import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberJudjes = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        double average = 0.0;

        String presentation = scanner.nextLine();

        while  (!presentation.equals("Finish")) {
            counter++;
            double sumExam = 0.0;
            double averageExam = 0.0;

            for (int i = 0; i < numberJudjes; i++) {
                sumExam += Double.parseDouble(scanner.nextLine());
            }

            averageExam = sumExam / numberJudjes;
            average += averageExam;

            System.out.printf("%s - %.2f.%n", presentation, averageExam);
            presentation = scanner.nextLine();
        }

        average = average / counter;

        System.out.printf("Student's final assessment is %.2f.%n", average);
    }
}