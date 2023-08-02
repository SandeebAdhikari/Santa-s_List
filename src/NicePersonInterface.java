/**
 * An interface for a class of NicePerson
 * @author Sandeeb Adhikari
 *@version 1.0
 */
public interface NicePersonInterface extends NameInterface {
	
	/**Sets the full name. 
	 * @param n Its data type is Name which is class Name
	 * where the Name constructor passes the String first name
	 * and last name.
	 */
	public void setNames(Name n) ;
	/**Gets the full name.
	 * @return A Name contains
	 * first and last name.
	 */
	public Name getNames();
	/**Sets the presents.
	 * @param p A string that hold the name of 
	 * the present
	 */
	public void setPresent(String p );
	/**Gets the output.
	 * @return output It displays name of santa's nice list
	 * and list of present 
	 */
	public String toString();
}

