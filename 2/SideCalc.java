abstract class Sides {
    public abstract void nSides();
}

class Rectangle extends Sides {
    public void nSides() {
        System.out.println("\nNumber of sides of rectangle = 4");
    }
}

class Triangle extends Sides {
    public void nSides() {
        System.out.println("\nNumber of sides of triangle = 3");
    }
}

class Hexagon extends Sides {
    public void nSides() {
        System.out.println("\nNumber of sides of Hexagon = 6");
    }
}

public class SideCalc {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        Hexagon hexagon = new Hexagon();

        triangle.nSides();
        rectangle.nSides();
        hexagon.nSides();

    }
}