/**
 * The interface has methods for pay and for the Employees id
 * @author mgalle19
 *
 */
public interface Employee {
	/**
	 * The pays the employee
	 * @return the amount the have been paid
	 */
	public int pay();
	/**
	 * Allows the Employee to input their id
	 * @return their id
	 */
	public int id();
	
}
