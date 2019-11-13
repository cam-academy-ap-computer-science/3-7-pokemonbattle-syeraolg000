 /* Sarah Gilliam
 * Grading Comments:   Incomplete program - 11/25
 *  
 *  RUBRIC Unit 3 = 25 pts
 * 10 pts - Correct Output (must compile and run)   5/10
 * 5 pts - Proper Use of Scanner, and decent User Interface  3/5
 * 3 pts - Proper Use of Return       0/2
 * 3 pts - Proper User of Parameter   0/2
 * 2 pts - Pseudocode and comments    1/2   
 * 2 pts - Consistent Layout and Style following Style Guidelines  2/2
 */
import java.util.*;
/*Main
 * call battleStart
 * call damage
 * call statsTable
 * BATTLESTART
 * print intro
 * ask for pokemon name
 * add in the name into the next line and the line after that 
 * return pokemon
 */

public class PokemonBattle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		battleStart();
		damage();
		statsTable();
	}
	public static String battleStart() {
		Scanner console = new Scanner(System.in);
		System.out.println("Another trainer is issuing a challenge!");
		
		System.out.println("Zebstrika appeared.");
		
		System.out.println("Which pokemon do you choose?");
		
		String pokemon = console.next();
		
		System.out.println("You chose " + pokemon + "!");
	
		System.out.println("It's a pokemon battle between " + pokemon + " and Zebstrika! Go!");
		
		return pokemon;
		
		}
	public static void damage() {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Zebstrika used Thunderbolt!");
		
		String pokemon = console.next();
		
		System.out.println("Trainer what are your"+ pokemon + "stats");
		
	
		}
	public static void statsTable() {


	}
	
}



