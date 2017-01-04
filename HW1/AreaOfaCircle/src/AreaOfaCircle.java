import java.util.Scanner;
public class AreaOfaCircle {
	public static void main(String[] args){
		final double PI = 3.14;
		Scanner input = new Scanner(System.in);
		System.out.print("What is the radius: ");
		int r = input.nextInt();
		double area = PI *Math.pow(r, 2);
		System.out.printf("The area is %f",area);

	}
}
