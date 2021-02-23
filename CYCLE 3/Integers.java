import java.util.Scanner;

public class Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the numbers:");
        String input = sc.nextLine();
        int sum = 0;
        String[] tokens = input.split(",");
        System.out.print("\n------Output after formatting-------\n");
        for (int i = 0; i < tokens.length; ++i) {
            System.out.println(tokens[i]);
            sum = sum + Integer.parseInt(tokens[i]);
        }
        System.out.println("Sum of integers = " + " " + sum);
    }
}