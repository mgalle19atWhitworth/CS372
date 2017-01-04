import java.util.Scanner;
public class BodyMassIndex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your weight in pounds: ");
		int weight = input.nextInt();
		System.out.println("Enter your height in inches: ");
		input = new Scanner(System.in);
		int height = input.nextInt();
		double BMI = (weight*703)/(height*height);
		System.out.printf("Your BMI is %f",BMI);
		
		System.out.println("BMI Values");
		System.out.println("Underweight: less then 18.5");
		System.out.println("Normal:      between 18.5 and 24.9");
		System.out.println("Overweight:  between 25 and 29.9");
		System.out.println("Obese:       30 or greater");

	}

}
