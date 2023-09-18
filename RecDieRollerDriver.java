/**
 * Application class for the RecDiceRoller. Simulates running the roll method 1,000 times
 * and displays the average number of rolls until 2.
 * @author Patrick Valsted
 *
 */
public class RecDieRollerDriver {

	public static void main(String[] args) {
		RecDiceRoller rdr=new RecDiceRoller(); //instantiates new roller
		
		for (int i=1;i<1001;i++) { //the roll method is run 1000 times
			rdr.roll();
			System.out.println("\nThe total count is: "+rdr.getTotalCount()); //prints total count at the end of each
			System.out.println(i+" twos have been rolled.\n"); //prints the number of 2s rolled until 1000
		}//end for loop
		
		System.out.println("The average number of rolls it takes for a 2 to roll given the program runs 1000 times is "+((double)rdr.getTotalCount()/1000));
		//The average number of rolls is calculated by dividing the total number of rolls by the number of 2s rolled
		
	}//end main

}//end class
