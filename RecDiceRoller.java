import java.util.Random;

/**
 * Class designed to roll a standard six-sided die.
 * @author Patrick Valsted
 *
 */

public class RecDiceRoller {

	Random r=new Random();
	int die, count=1,totalCount;
	
	/**
	 * The constructor instantiates a RecDieRoller that has a total count of 0.
	 */
	public RecDiceRoller() {
		this.totalCount=0;
	}//end empty-constructor argument
	
	/**
	 * Simulates the rolling of a die. This recursive die is designed to re-roll until a 2 is rolled.
	 * It will count the number of times it has been rolled for all time.
	 * @return the eventual 2 roll of the die
	 */
	public int roll() {
		die=r.nextInt(6)+1; //a random integer 1-6
		int tempCount=0; //resets the tempCount
		
		if (die==2) { //runs only if the random int is a 2
			
			System.out.print(count+". A "+die+" was rolled.");
			tempCount=count; //saves the count before it's reset
			count=1; //count reset
			this.totalCount=totalCount+tempCount; //adds the number of rolls it took to get a 2 to the total count
			
			return die;
		}//end if
		
		else { //increments the count and calls the method again if a 2 is not rolled
			
			System.out.println(count+". A "+die+" was rolled.");
			count++;
			
			return this.roll();
		}//end else
	}//end roll

	/**
	 * Returns the total count for the user
	 * @return total count
	 */
	public int getTotalCount() {
		return totalCount;
	}//end getTotalCount
	
}//end class
