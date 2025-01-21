package workshop;

import java.util.Scanner;

public class areaProject01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println(" Shape Area  Program ");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.print("Seclect menu: ");
        int choice = scanner.nextInt();


        if (choice == 1) {

            System.out.print("Enter width: ");
            double width = scanner.nextDouble();
            System.out.print("Enter length: ");
            double length = scanner.nextDouble();
            double areaRectangle = width * length;
            System.out.println("Area of rectangle: " + areaRectangle);
        } else if (choice == 2) {

            System.out.print("Enter base: ");
            double base = scanner.nextDouble();
            System.out.print("Enter height: ");
            double height = scanner.nextDouble();
            double areaTriangle = 0.5 * base * height;
            System.out.println("Area of triangle: " + areaTriangle);
        } else if (choice == 3) {

            System.out.print("Enter radius: ");
            double radius = scanner.nextDouble();
            double areaCircle = Math.PI * Math.pow(radius, 2);
            System.out.println("Area of circle: " + areaCircle);
        } else {
            System.out.println("Invalid choice! Please enter 1, 2, or 3.");
        }


        scanner.close();
    }
}
