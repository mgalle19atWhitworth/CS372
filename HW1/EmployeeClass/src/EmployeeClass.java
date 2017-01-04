public class EmployeeClass{
	String name;
	String lastname;
	double salary = 0;
	public EmployeeClass(String newName, String last, double newSalary){
		name = newName;
		lastname=last;
		salary=newSalary;
	}
	public void setName(String newName){
	name =newName;
	}
	public String getName(){
	return name;
	}
	
	public void setLastName(String last)
	{
	lastname=last;
	}
	public String getLastName(){
	return lastname;
	}
	public void setSalary(double newSalary){
	if (newSalary >0)
	salary = newSalary;
	}
	public double getSalary(){
	return salary;
	}
	
}