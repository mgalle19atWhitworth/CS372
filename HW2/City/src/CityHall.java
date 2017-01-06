import java.util.ArrayList;
public class CityHall extends Building {
	public CityHall(String newName,String newAddress){
		name =newName;
		address=newAddress;
	}
	private ArrayList<String> occupants = new ArrayList<String>();
	
	public void addEmployee(String name){
		occupants.add(name);
	}
	public void showOccupants(){
		System.out.println("Police in CityHall: ");
		for(String o:occupants)
			System.out.printf("%s\n",o);
		
		
	}
	
}
