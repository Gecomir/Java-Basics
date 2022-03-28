import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        //1.Четене от конзолата - Името на архитекта и броя на проектите (цяло число от 0...100)
        //2. отпечатване "The architect {името на архитекта} will need {необходими часове} hours to complete брой на проектите project/s."
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int project = Integer.parseInt(scanner.nextLine());
        int sum = project * 3;
        System.out.println("The architect " + name + " will need " + sum + " hours to complete " + project + " project/s" + ".");


    }
}
