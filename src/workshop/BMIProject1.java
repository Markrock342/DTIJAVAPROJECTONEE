package workshop;

import java.util.Scanner;

public class BMIProject1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("+++++++++++++++++++++++++");
        System.out.println("  BMI PROGRAM BY SAU_DTI");
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("Your name: ");
        String bmiName = scanner.nextLine();

        System.out.println("Input your weight (kg): ");
        double weight = scanner.nextDouble();

        System.out.println("Input your height (m): ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("+++++++++++++++++++++++++");

        System.out.println(bmiName + ", your BMI is: " + bmi);
        System.out.println("+++++++++++++++++++++++++");

        scanner.close();
    }
}
