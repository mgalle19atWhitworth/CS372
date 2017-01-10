/**
 * This class models a person and inherits from the Person class 
 * @author mgalle19
 *	@see Person
 */

public class Kid extends Person {
String favoriteCandy;

/**
 * 
 * @param newName inputs the name so it can be initialized 
 * @param newAge inputs the age so it can be initialized
 * @param newPhoneNumber inputs the PhoneNumber so it can be initialized
 * @param newCandy inputs the favorite candy so it can be initialized
 */
	public Kid(String newName,int newAge, int newPhoneNumber,String newCandy){
		name = newName;
		age= newAge;
		phoneNumber = newPhoneNumber;
		favoriteCandy=newCandy;
	}
}
