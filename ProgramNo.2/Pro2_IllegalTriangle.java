import java.util.Scanner;

public class Pro2_IllegalTriangle {
    public static void main(String[] args) {

        //-----------------------------------------------test 1st-----------------------------------------------//
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Test new Triangle with non-compliant values:");
        try {
            Triangle triangle = new Triangle(0.1, 0.1, 0.2);
            System.out.println("The Triangle's area is " + triangle.getArea());
        } catch (IllegalTriangleException e) {
            System.out.println(e + " => These values can't find the area");
        }

        //-----------------------------------------------test 2nd-----------------------------------------------//
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Test new Triangle with compliant values:");
        try {
            Triangle triangle = new Triangle(1.0, 8.0, 8.0);
            System.out.println("The Triangle's area is " + triangle.getArea());
        } catch (IllegalTriangleException e) {
            System.out.println(e + " => These values can't find the area");
        }
        System.out.println("------------------------------------------------------------------------");
    }
}
