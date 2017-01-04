
public class IntValue {

	public static void main(String[] args) {
		char[] values= {'A','B','C','a','b','c','0','1','2','$','*','+','/',' '};
		
		for (int i=0;i <values.length;i++)
		System.out.printf("The character %c has the values %d\n",values[i],((int)values[i]));
	}

}
