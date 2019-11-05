
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



