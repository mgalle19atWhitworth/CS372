import java.util.Scanner;

public class Police extends Person {
	
	public enum Type {Patrol, Sergant, Captain, Cheif};
	private Type role;
	public Type getRole() {return role;}
	public void setRole(Type r){role = r;}
	public int totalPay;
	
	public Police(String newName,int newAge, int newNumber)
	{
	name = newName;
	age = newAge;
	phoneNumber= newNumber;
	}
	
	public int pay(String Employee){
	int pay = 500;
	totalPay = totalPay+500;
	return pay;
	}
	
	public int getTotalPay(){return totalPay;}
	
	public int id(){
	Scanner input = new Scanner(System.in);
	int id = input.nextInt();
	return id;
	}	
}
