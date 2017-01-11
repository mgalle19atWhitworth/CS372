import java.util.ArrayList;
/**
 * This class creates a School and inherits from building
 * @author mgalle19
 * @see Building
 */
public class School extends Building {
	/**
	 * Constructor that creates the school
	 * @param newName inputs the name so it can be initialized 
	 * @param newAddress inputs the Address so it can be initialized 
	 */
	public School(String newName,String newAddress){
		name =newName;
		address=newAddress;
	}
private ArrayList<String> occupants = new ArrayList<String>();
	
/**
 * Adds the employee to the buildings array
 * @param name inputs the employee name into the building array
 */
	public void addEmployee(String name){
		if (occupants.contains(name)){}
		
		else 
			occupants.add(name);
	}
	public void removePerson(String name){
		occupants.remove(name);
	}
	public void showOccupants(){
		System.out.println();
		System.out.println("People in the school");
		for(String o:occupants)
			System.out.printf("%s\n",o);
	}
}
