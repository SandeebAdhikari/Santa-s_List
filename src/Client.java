import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * The class Client display the name of the santa's nice list
 * and randomly selected presents
 */
	public class Client {
			public static void main(String[] args) {
			//variable
			int noofGifts=3;
			
			
			//creates Name array list for children's name
			List<Name> children = new ArrayList<>();
			//creates name objects 
			Name name = new Name("Susan", "Smith");
			children.add(name);
			//It add the first name and last name on the children list
			children.add(new Name("Pradesh", "Patel"));
			children.add(new Name("Henry", "Cavil"));
			children.add(new Name("Upama", "Shrestha"));
			children.add(new Name("Mark", "Zukerberg"));
			children.add(new Name("Jason", "Mamoa"));
			
			
			//creates String array list for gift's name
			List<String> gifts = new ArrayList<>();
			//It adds the name of the gift on gift list 
			gifts.add(" Piano ");
			gifts.add(" Skate Board ");
		    gifts.add(" PS5 ");
		    gifts.add(" xbox ");
		    gifts.add(" $25 Gift Card ");
		    gifts.add(" $30 Gift Card ");
		    gifts.add(" bicycle ");
		    gifts.add(" Laptop ");
		    gifts.add(" Gaming Chair ");
		    gifts.add(" iPad ");
		    
		    
		    //creates NicePerson array list for santa's nice person list 
		    List<NicePerson>santasNiceList = new ArrayList<>();
		    
			for (int i=0; i<children.size(); i++) {
					//creates NicePerson object and passes the name of children
					NicePerson nicePerson = new NicePerson(children.get(i));
					//call the random present method and passes the gift list,
					// number of gift and santa's nice person name.
			        randomPresents(gifts, noofGifts, nicePerson);
			        //add the nice person list in the santa's nice person
			        santasNiceList.add(nicePerson);
				}
		   
			//display the santa's nice list with 3 randomly selected gifts
		    for (int j=0; j< santasNiceList.size(); j++) {
			   		System.out.print("\n"+santasNiceList.get(j));
			    }
		    }
            
			/**
			 * It selects random gifts from the gift list
			 * @param presents It contains the list of present 
			 * @param noOfGifts It contains number of gift to be given 
			 * @param p It contains santa's nice person list
			 */
			public static void randomPresents( List<String> presents, int noOfGifts, NicePerson p){
				//creates random object 
				Random rand= new Random();
				for (int i=0; i< noOfGifts; i++) {
					//random number is the generated number from gift list size 
					//which is between o to 9
					int randomNumber = rand.nextInt(presents.size());
					//it adds the generated presents in the present list 
					p.setPresent(presents.get(randomNumber));
			}
		
	}
	}


/***OUPUT***
Susan Smith
	 Gaming Chair 
	 bicycle 
	 bicycle 
Pradesh Patel
	 PS5 
	 Piano 
	 bicycle 
Henry Cavil
	 PS5 
	 Gaming Chair 
	 bicycle 
Upama Shrestha
	 iPad 
	 bicycle 
	 $30 Gift Card 
Mark Zukerberg
	 xbox 
	 iPad 
	 $25 Gift Card 
Jason Mamoa
	 xbox 
	 iPad 
	 Skate Board 
 */


