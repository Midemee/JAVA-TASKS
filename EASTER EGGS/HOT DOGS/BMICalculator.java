import java.util.Scanner;
public class BMICalculator{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	System.out.print("Enter weight in pounds: ");
	double weight = input.nextDouble();
	//Body mass index

	System.out.print("Enter height in inches: ");
	double height = input.nextDouble();

	double weightKg = weight * 0.45359237;
	double heightMeters = height * 0.0254;
	
	
	double bmi = weightKg / (heightMeters * heightMeters);

	System.out.printf("The BMI is: %.2f", bmi);
    }
}