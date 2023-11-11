import java.util.Scanner;
/*
 * 
Armut  : 2,14 TL
Elma  : 3,67 TL
Domates  : 1,11 TL
Muz : 0,95 TL
Patlıcan  : 5,00 TL
 */
public class GroceryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] groceries = {"Armut", "Elma", "Domates", "Muz", "Patlıcan"};
        double[] prices = {2.14, 3.67, 1.11, 0.95, 5.00};
        double total = 0;
        for (int i = 0; i < groceries.length; i++) {
            System.err.printf(groceries[i]+" kac kilo:");
            double kilos = scanner.nextInt();
            total += prices[i]*kilos;
        }
        
        scanner.close();
        System.out.printf("Total: %.2f\n",total);
        
    }
    
}