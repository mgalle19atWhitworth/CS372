import java.util.Scanner;
public class OddorEven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = input.nextInt();
		int y = x %2;
		if (y == 0)
			System.out.printf("%d is even", x);
		else 
			System.out.printf("%d is odd",x);
	}

}
