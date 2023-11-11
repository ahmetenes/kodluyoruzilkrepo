import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.print("Input weight in kilos: ");
        double weight = scanner.nextDouble();
        System.err.print("Input length in meters: ");
        double length = scanner.nextDouble();
        double bmi = (weight/(length*length));
        scanner.close();
        System.err.printf("BMI = %.2f \n",bmi);
    }
}
