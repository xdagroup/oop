import java.util.Scanner;

public class Multiply {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        int product;
        product = num1 * num2;
        System.out.println("The product of given two numbers is: " + product);

    }
}
