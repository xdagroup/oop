import java.util.Scanner;

class Area {

    static double area(float a, float b, float c) {
        float s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    static double area(float l, float b) {
        return l * b;
    }

    

    static double area(float r) {
        return 3.1415 * r * r;
    }

}

public class areaMenu {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int case_value;
        char ch;
        float a, l, b, c, r;

        ch = 'Y';
        while (ch == 'Y' || ch == 'y') {
            System.out.println("Enter the number of your choice from the menu below :");
            System.out.println("1)Triangle\n2)Rectangle\n3)Circle");
            case_value = in.nextInt();
            switch (case_value) {
                case 1:
                    System.out.print("Enter 3 side lengths: ");
                    a = in.nextFloat();
                    b = in.nextFloat();
                    c = in.nextFloat();
                    System.out.println("Area of triangle: " + Area.area(a, b, c));
                    break;

                case 2:
                    System.out.print("Enter length and breadth: ");
                    l = in.nextFloat();
                    b = in.nextFloat();
                    System.out.println("Area of rectangle: " + Area.area(l, b));
                    break;

                case 3:
                    System.out.print("Enter radius: ");
                    r = in.nextFloat();
                    System.out.println("Area of circle: " + Area.area(r));
                    break;

                default:
                    System.out.println("Invalid entry!!");
            }
            System.out.print("Do you want to continue yes or no? ");
            ch = in.next().charAt(0);
            System.out.println();
        }
        in.close();
    }
}
