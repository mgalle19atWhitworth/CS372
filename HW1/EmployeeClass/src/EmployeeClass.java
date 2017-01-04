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
	
	public static void main (String[] args){
	EmployeeClass E1=new EmployeeClass("John","Jacob",1500);
	EmployeeClass E2=new EmployeeClass("Bob","Smith",1000);
	double E1Salary=E1.getSalary()*12;
	double E2Salary=E2.getSalary()*12;
	System.out.printf("%s's,yearly salary %f\n",E1.getName(),E1Salary);
	System.out.printf("%s's,yearly salary %f\n",E2.getName(),E2Salary);
	E1.setSalary(1650);
	E2.setSalary(1100);
	E1Salary=E1.getSalary()*12;
	E2Salary=E2.getSalary()*12;
	System.out.printf("%s's,yearly salary %f\n",E1.getName(),E1Salary);
	System.out.printf("%s's,yearly salary %f\n",E2.getName(),E2Salary);
	}
}