import java.util.Scanner;
/**
 * This class models a teacher in the city and inherits of Person and implements Employee  
 * @author mgalle19
 * @see Person
 * @see Employee
 */
public class Teacher extends Person implements Employee {
	int grade;
	String cert;
	int totalPay=0;
	/**
	 *This is a constructor to make a Teacher 
	 * @param newName initializes name 
	 * @param newAge initializes age
	 * @param newNumber initializes phoneNumber
	 * @param newGrade	initializes Grade level they teach
	 * @param newCert	initializes their teaching certificate   
	 */
	public Teacher(String newName,int newAge, int newNumber, int newGrade, String newCert)
	{
		name = newName;
		age = newAge;
		phoneNumber= newNumber;
		grade=newGrade;
		cert=newCert;
	}
	/**
	 * Returns the amount the Teacher gets paid
	 * @return the amount the teacher gets paid
	 */
	public int pay(){
		int pay = 500;
		totalPay = totalPay+pay;
		return pay;
	}
	/**
	 * Returns the total amount the teacher has been paid
	 * @return the total amount the teacher has been paid
	 */
	public int getTotalPay(){return totalPay;}
	/**
	 * Returns the teachers id
	 * @return the teachers id
	 */
	public int id(){
		Scanner input = new Scanner(System.in);
		int id = input.nextInt();
		return id;
	}
}
