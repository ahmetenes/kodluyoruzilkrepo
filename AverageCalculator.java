import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] classes = {"Matematik", "Fizik", "Kimya", "Türkçe", "Tarih", "Müzik"};
        int[] notes = {0, 0, 0, 0, 0, 0};
        int total = 0;
        for (int i = 0; i < classes.length; i++) {
            System.err.println(classes[i]+" Grade:");
            notes[i] = scanner.nextInt();
            total += notes[i];
        }
        double avg = total/classes.length;
        boolean isPassed = avg > 60.0;
        // "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
        String result = isPassed ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        scanner.close();
        System.err.println("Average: "+total/classes.length);
        System.err.println(result);
    }
}