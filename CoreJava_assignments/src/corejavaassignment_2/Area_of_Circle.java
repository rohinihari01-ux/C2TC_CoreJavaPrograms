package corejavaassignment_2;
import java.util.Scanner;

public class Area_of_Circle {

    double radius;
    String colour;

    // Method to accept input
    void getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Radius:");
        radius = sc.nextDouble();

        System.out.println("Enter Colour:");
        colour = sc.next();
    }

    // Method to calculate area
    void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {
        Area_of_Circle c = new  Area_of_Circle ();
        c.getInput();
        c.calcArea();
    }
}

