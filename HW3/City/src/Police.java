import java.util.Scanner;
/**
 * This class lets you model a Police officer in the city and inherits from Person and implemts Employee
 * @author mgalle19
 * @see Person
 * @see Employee
 */
public class Police extends Person implements Employee{

	public enum Type {Patrol, Sergant, Captain, Cheif};
	private Type role;
	public Type getRole() {return role;}
	public void setRole(Type r){role = r;}
	public int totalPay;
	
	/**
	 * 
	 * @param newName initializes name 
	 * @param newAge initializes age
	 * @param newNumber initializes phoneNumber
	 * @param r the role of the police officer
	 */
	public Police(String newName,int newAge, int newNumber,Type r)
	{
	name = newName;
	age = newAge;
	phoneNumber= newNumber;
	role = r;
	}
	
	/**
	 * Return the amount the Police officer is being paid
	 * @return the amount the Officer is being paid
	 */
	public int pay(){
	int pay = 500;
	totalPay = totalPay+500;
	return pay;
	}
	
	/**
	 * The amount the Officer has been paid
	 * @return the total amount the officer has been paid
	 */
	public int getTotalPay(){return totalPay;}
	
	/**
	 * Returns the id of the officer
	 * @return the amount the officer is being paid
	 */
	public int id(){
	Scanner input = new Scanner(System.in);
	int id = input.nextInt();
	return id;
	}	
}
