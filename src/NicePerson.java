import java.util.ArrayList;
import java.util.List;
/**
 * The NicePerson class hold the santa's nice person's name 
 * and the add the presents to present list.
 * @author Sandeeb Adhikari
 * @version 1.0
 */

	public class NicePerson implements NicePersonInterface{
		//variables
		private Name name;
		List<String> presents;
	
	/**
	 * The default constructor for objects 
	   of class NicePerson. Name and presents 
	   are the largest possible String and list 
	   Respectively.
	   */	
		
	public NicePerson() {
		name= null;
		presents = null;
		
		}
	
	/**
	 * The alternate constructor for objects of class NicePerson.
	 * The nice person name given as a parameter. Presents array 
	 * list is created 
	 * @param Name n It passes the n with class Name data type. 
	  */
	
	public NicePerson(Name n) {
		name = n;
		presents= new ArrayList<>();
	}
	
	/**Sets the full name. 
	 * @param n Its data type is Name which is class Name
	 * where the Name constructor passes the String list of
	 * first name and last name.
	 */
	
	public void setNames(Name n) {
		name=n;
	}
	
	/**Gets the full name.
	 * @return A name contains list of 
	 * first and last name.
	 */
	
	public Name getNames() {
		return name;
	}
	
	/**Adds the string element in the string list.
	 * @param p A string list that holds the name of 
	 * the present(element)
	 */
	
	public void setPresent(String p ) {
		//it adds present string in present list    
		presents.add(p);
			
	}
	
	/**Gets the output.
	 * @return output It displays name of santa's nice list
	 * and list of present 
	 */
	
	public String toString()
	{
		//holds the string name on output
		String output = name.toString();
		for(int i=0; i < presents.size(); i++ )
	    output +="\n\t" + presents.get(i);
		return output;// returns output
	
	}

	@Override
	public void setName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFirst(String firstName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLast(String lastName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void giveLastNameTo(NameInterface aName) {
		// TODO Auto-generated method stub
		
	}
}
