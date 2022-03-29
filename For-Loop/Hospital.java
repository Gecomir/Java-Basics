package ForLoops.exercises;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int period = Integer.parseInt(scanner.nextLine());
        int doctor = 7;
        int treatedPatients = 0;
        int unTreatedPatients = 0;
        for (int i = 1; i <= period; i++) {
            int patients = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0 && unTreatedPatients > treatedPatients) {
                doctor++;
            }
            if (patients > doctor) {
                treatedPatients += doctor;
                unTreatedPatients += (patients - doctor);
            } else {
                treatedPatients += patients;
            }
        }
        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.", unTreatedPatients);
    }
}
