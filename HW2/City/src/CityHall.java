import java.util.ArrayList;
/**
 * This class models the city hall and inherits from the Building class
 * @author mgalle19
 * @see Building
 */
public class CityHall extends Building {
	/**
	 * Constructor to create a city hall object
	 * @param newName implements name
	 * @param newAddress implements the buildings Address
	 */
	public CityHall(String newName,String newAddress){
		name =newName;
		address=newAddress;
	}
	private ArrayList<String> occupants = new ArrayList<String>();
	/**
	 * Adds the employee to the buildings array
	 * @param name inputs the employee name into the building array
	 */
	public void addEmployee(String name){
		occupants.add(name);
	}
	/**
	 * Outputs the occupants 
	 */
	public void showOccupants(){
		System.out.println("Police in CityHall: ");
		for(String o:occupants)
			System.out.printf("%s\n",o);
		
		
	}
	
}
