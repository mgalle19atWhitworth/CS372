
public class EmployeeTest {

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
