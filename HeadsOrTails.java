import java.util.Scanner;


public class HeadsOrTails {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
				
		String headsOrTailsGuess= "guess";
		int numberOfFlips;
		double heads = 0;
		double tails = 0;
		int x = 100;
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println ("Guess which will have more: heads or tails?");
		headsOrTailsGuess = scnr.next();
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println ("How many times shall we flip a coin?");
		numberOfFlips = scnr.nextInt();
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		for (int f=0; f < numberOfFlips; f++) {
            if (Math.random() < 0.5) {
                System.out.println("Heads");
                heads++;
            } else {
                System.out.println("Tails");
                tails++; 
               
            }
         
		
		}
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println ("You chose to flip the coin " + numberOfFlips + " times and guessed that " + headsOrTailsGuess + " would come out on top.");
		System.out.println ("Let's see how you did!");
		
		System.out.println ("Heads " + heads);
		System.out.println ("Tails " + tails);
		
		System.out.println ("Heads " + ((heads/numberOfFlips)*x) + " % of the time.");
		System.out.println ("Tails " + ((tails/numberOfFlips)*x) + " % of the time.");
	
		
		}
		
	}	



