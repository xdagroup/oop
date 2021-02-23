import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Student1 {

    public static void main(String args[]) throws Exception {

        int mark1;
        int mark2;
        int mark3;

        double average;

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br;
        br = new BufferedReader(is);

        System.out.println("Enter your name : ");
        String name = br.readLine();

        System.out.println("Enter your Mark 1 : ");
        mark1 = Integer.parseInt(br.readLine());

        System.out.println("Enter your Mark 2 : ");
        mark2 = Integer.parseInt(br.readLine());

        System.out.println("Enter your Mark 3 : ");
        mark3 = Integer.parseInt(br.readLine());

        try {
            average = mark1 + mark2 + mark3 / 0;
            System.out.println("Average =" + average);
        }

        catch (Exception e) {

            System.out.println("Something went wrong!");
            e.printStackTrace();
        }

        finally {
            System.out.println("This is the final block");
        }

    }
}