import java.util.ArrayList;

public class School extends Building {
	public School(String newName,String newAddress){
		name =newName;
		address=newAddress;
	}
private ArrayList<String> occupants = new ArrayList<String>();
	
	public void addEmployee(String name){
		occupants.add(name);
	}
	public void showOccupants(){
		System.out.println();
		System.out.println("People in the school");
		for(String o:occupants)
			System.out.printf("%s\n",o);
	}
}
