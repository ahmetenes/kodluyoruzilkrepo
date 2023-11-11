import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int first = scanner.nextInt();
        System.out.print("Input second number: ");
        int second = scanner.nextInt();

        System.out.println("1-Addition\n2-Substract\n3-Multiply\n4-Divide");
        System.out.print("Choose :");
        int choise = scanner.nextInt();
        switch (choise) {
            case 1:
                
                System.out.printf("Result: %d\n",first+second);
                break;
            case 2:
            
            System.out.printf("Result: %d\n",first-second);
            break;
            case 3:
            
            System.out.printf("Result: %d\n",first*second);
            break;
            case 4:
            if(second == 0)
                {
                    System.err.println("Division by zero!!! ");
                    break;
                }
            System.out.printf("Result: %d\n",first/second);
            break;
        
            default:
                System.err.println("Wrong Choice!!! ");

                break;
        }

    }
}
