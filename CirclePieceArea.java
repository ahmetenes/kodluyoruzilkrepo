import java.util.Scanner;

public class CirclePieceArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.print("Input radius: ");
        double radius = scanner.nextDouble();
        System.err.print("Input radian: ");
        double radian = scanner.nextDouble();
        double area = (Math.PI*radius*radius)*radian/360.0;
        scanner.close();
        System.err.printf("Price = %.2f \n",area);

    }
}
