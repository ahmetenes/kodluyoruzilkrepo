import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.print("Input distance in terms of kilomaters: ");
        double openingPrice = 10.0;
        double pricePerKM = 2.2;
        double distanceInKM = scanner.nextDouble();
        scanner.close();
        double price = openingPrice +( distanceInKM*pricePerKM);
        System.err.printf("Price = %.2f \n",Math.max(price,20.0));
    }
}
