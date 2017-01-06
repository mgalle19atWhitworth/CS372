/**
 * This Class is a parent class for the different types of people in the city.
 * @author mgalle19
 *
 */
public abstract class Person {
	String name;
	int age;
	int phoneNumber;
	
	/**
	 * Return the name of the person
	 * @return the name of the person
	 */
	public String getName(){return name;}
	/** 
	 * Returns the age of the person
	 * @return the age of the person
	 */
	public int getAge(){return age;}
	/**
	 * Returns the age of the person
	 * @return the age of the person
	 */
	public int getNumber(){return phoneNumber;}
	
}
