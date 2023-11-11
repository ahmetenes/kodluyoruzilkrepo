import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the edges of triangle");
        System.out.print("a :");
        double a = scanner.nextDouble();
        System.out.print("b :");
        double b = scanner.nextDouble();
        System.out.print("c :");
        double c = scanner.nextDouble();
        double perimeter = (a+b+c);
        double u = perimeter/2.0;
        double area = Math.sqrt(u * (u - a)* (u - b) * (u - c));
        scanner.close();
        System.out.printf("Area of Triangle: %.2f \n",area);
    }
}
