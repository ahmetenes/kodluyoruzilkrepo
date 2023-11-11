import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.print("Price Without Tax: ");
        double price = scanner.nextDouble();
        double taxPercentage = price<=1000? 0.18:0.08;
        double priceWithTax = price * (1+taxPercentage);
        System.err.println();
    System.err.printf("KDV'siz Fiyat = %.2f \n",price);
    System.err.printf("KDV'li Fiyat = %.2f \n",priceWithTax);
    System.err.printf("KDV tutarı = %.2f \n",(price*taxPercentage));
 }
    
}
