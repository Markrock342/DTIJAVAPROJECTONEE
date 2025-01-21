package workshop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class areaProject02 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println(" Shape Area  Program ");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Circle");
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.print("Seclect menu: ");
        int choice = Integer.parseInt(reader.readLine());

        // การคำนวณตามตัวเลือกของผู้ใช้
        if (choice == 1) {
            // คำนวณพื้นที่ของสี่เหลี่ยม
            System.out.print("Enter width: ");
            double width = Double.parseDouble(reader.readLine());
            System.out.print("Enter length: ");
            double length = Double.parseDouble(reader.readLine());
            double areaRectangle = width * length;
            System.out.println("Area of rectangle: " + areaRectangle);
        } else if (choice == 2) {
            // คำนวณพื้นที่ของสามเหลี่ยม
            System.out.print("Enter base: ");
            double base = Double.parseDouble(reader.readLine());
            System.out.print("Enter height: ");
            double height = Double.parseDouble(reader.readLine());
            double areaTriangle = 0.5 * base * height;
            System.out.println("Area of triangle: " + areaTriangle);
        } else if (choice == 3) {
            // คำนวณพื้นที่ของวงกลม
            System.out.print("Enter radius: ");
            double radius = Double.parseDouble(reader.readLine());
            double areaCircle = Math.PI * Math.pow(radius, 2);
            System.out.println("Area of circle: " + areaCircle);
        } else {
            System.out.println("Invalid choice! Please enter 1, 2, or 3.");
        }

        reader.close(); // ปิด BufferedReader
    }
}
