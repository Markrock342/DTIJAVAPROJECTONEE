package com.sau.tech;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Myclass04 {
    public static void main(String[] args) {
        // ใช้ try-with-resources เพื่อปิด resources อัตโนมัติ
        try (InputStreamReader input = new InputStreamReader(System.in);
             BufferedReader reader = new BufferedReader(input)) {

            String empName;
            double empSalary, tax10;

            // รับข้อมูลจากผู้ใช้
            System.out.println("Input employee name: ");
            empName = reader.readLine();

            System.out.println("Input employee salary: ");
            empSalary = Double.parseDouble(reader.readLine());

            System.out.println("----------------------");

            // คำนวณภาษี 10%
            tax10 = empSalary * 10 / 100;

            // แสดงผลลัพธ์
            System.out.println("Your name: " + empName);
            System.out.printf("Your salary: %.2f\n", empSalary);
            System.out.printf("Tax PAY: %.2f BAHT\n", tax10);

        } catch (IOException e) {
            // จัดการข้อผิดพลาดในการอ่านข้อมูล
            System.out.println("Error reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            // จัดการข้อผิดพลาดเมื่อตัวเลขไม่ถูกต้อง
            System.out.println("Invalid input for salary. Please enter a valid number.");
        }
    }
}
