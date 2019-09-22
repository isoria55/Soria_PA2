import java.util.Scanner;
public class soriapA2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userCalculator;
		double userWeight;
		double userHeight;
		// ask which BMI calculator they want
		System.out.println("Enter 1 for Standard BMI Calculator or enter 2 for Metric BMI Calculator:");
		userCalculator = scnr.nextInt();
		if (userCalculator == 1) {
			//ask user for weight and height
			System.out.println("Please enter your weight in pounds.");
			userWeight = scnr.nextDouble();
			System.out.println("Please enter your height in inches.");
			userHeight = scnr.nextDouble();
			// calculations and print
			System.out.println("Your BMI is: " + ((703 * userWeight) / Math.pow(userHeight, 2)));
			System.out.print("\nBMI Categories:\nUnderweight = <18.5\r\n" + "Normal weight = 18.5–24.9\r\n" + "Overweight = 25–29.9\r\n" + "Obesity = BMI of 30 or greater");
		}
		else if (userCalculator == 2) {
			System.out.println("Please enter your weight in kilograms.");
			userWeight = scnr.nextDouble();
			System.out.println("Please enter your height in centimeters.");
			userHeight = scnr.nextDouble();
			userHeight = userHeight / 100; // to convert to meters
			// calculations and print
			System.out.println("Your BMI is: " + (userWeight / (Math.pow(userHeight, 2))));
			System.out.print("\nBMI Categories:\nUnderweight = <18.5\r\n" + "Normal weight = 18.5–24.9\r\n" + "Overweight = 25–29.9\r\n" + "Obesity = BMI of 30 or greater");
		}
		else {
			System.out.println("Please run the program again and enter a 1 or a 2 to decide on a BMI calculator.");
		}
		
	}
}