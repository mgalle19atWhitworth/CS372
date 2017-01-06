
public class City {

	public static void main(String[] args) {

		Person[] people={new Teacher("Tom",30,5556897,6,"Teaching"),new Teacher("Bob",40,5557894,12,"Teaching"),
						 new Police("Mike",35,5551234), new Police("Aubree",28,1478978),
						 new Kid("Aaron",6,7894561,"Suckers"), new Kid("Brian",10,3216549,"Starburst")};
		Building[] building={new CityHall("City Hall","1234 main"), new School("School","456 Main")};
		
		System.out.println("People in City");
		for(int i =0; i<people.length;i++){
			System.out.printf("%s,%d,%d\n",people[i].getName(),people[i].getAge(),people[i].getNumber());
		}
		System.out.println();
		System.out.println("Buildings in City");
		for (int i =0;i<building.length;i++){
			System.out.printf("%s,%s\n",building[i].name,building[i].address);
		}
		
		System.out.println();
		String PoliceOfficer1 = people[2].getName();
		String PoliceOfficer2=people[3].getName();
		CityHall C=(CityHall) building[0];
		C.addEmployee(PoliceOfficer1);
		C.addEmployee(PoliceOfficer2);
		C.showOccupants();
		
		String Teacher1=people[0].getName();
		String Teacher2=people[1].getName();
		String Kid1=people[4].getName();
		
		School s = (School) building[1];
		s.addEmployee(Teacher1);
		s.addEmployee(Teacher2);
		s.addEmployee(Kid1);
		s.showOccupants();
		
		Teacher t1=(Teacher) people[0];
		t1.pay();
		t1.pay();
		System.out.printf("%s's total payments: %d \n",t1.name, t1.totalPay);
	
	}
}
