import java.util.Scanner;

public class FrequencyOfACharacter {
    public static void main(final String args[]) {
        System.out.println("Enter a string:");
        final Scanner sc = new Scanner(System.in);
        final String str = sc.nextLine();

        System.out.println("Enter character:");
        final char character = sc.nextLine().charAt(0);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("Frequency of the given character: " + count);
    }
}