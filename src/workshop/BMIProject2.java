package workshop;

import java.io.IOException;
import java.text.DecimalFormat;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BMIProject2 {
    public static void main(String[] args) throws IOException {

        String fullName;
        double weight, height, bmi;


        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);


        DecimalFormat df = new DecimalFormat("0.000");


        System.out.println("+++++++++++++++++++++++++");
        System.out.println("  BMI PROGRAM BY SAU_DTI");
        System.out.println("+++++++++++++++++++++++++");
        System.out.print("Your name: ");
        fullName = reader.readLine();


        System.out.print("Input your weight (kg): ");
        weight = Double.parseDouble(reader.readLine());

        System.out.print("Input your height (m): ");
        height = Double.parseDouble(reader.readLine());


        bmi = weight / (height * height);



        System.out.println("+++++++++++++++++++++++++");
        System.out.println(fullName + ", your BMI is: " + df.format(bmi));

    }
}