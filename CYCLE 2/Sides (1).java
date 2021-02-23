abstract class Shape {
    public abstract void noOfSides();
}

class Rectangle extends Shape {
    public void noOfSides() {
        System.out.println("\nThe number of sides for a rectangle are : 4");
    }
}

class Triangle extends Shape {
    public void noOfSides() {
        System.out.println("\nThe number of sides for a triangle are : 3");
    }
}


class Hexagon extends Shape {
    public void noOfSides() {
        System.out.println("\nThe number of sides for a hexagon are : 6");
    }
}

public class Sides {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Triangle tri = new Triangle();
        Hexagon hex = new Hexagon();
        System.out.println("\nNUMBER OF SIDES FOR DIFFERENT GEOMETRICAL STRUCTURES ");
        System.out.println("------------------------------------------------------");

        tri.noOfSides();
        rect.noOfSides();
        hex.noOfSides();

    }
}