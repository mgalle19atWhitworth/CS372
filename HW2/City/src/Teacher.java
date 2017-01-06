import java.util.Scanner;
public class Teacher extends Person implements Employee {
	int grade;
	String cert;
	int totalPay=0;
	public Teacher(String newName,int newAge, int newNumber, int newGrade, String newCert)
	{
		name = newName;
		age = newAge;
		phoneNumber= newNumber;
		grade=newGrade;
		cert=newCert;
	}
	public int pay(){
		int pay = 500;
		totalPay = totalPay+pay;
		return pay;
	}
	public int getTotalPay(){return totalPay;}
	public int id(){
		Scanner input = new Scanner(System.in);
		int id = input.nextInt();
		return id;
	}
}
