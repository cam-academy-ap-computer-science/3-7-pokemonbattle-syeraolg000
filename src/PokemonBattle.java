/********************
 * Grading Commets:
 *  Good job.   The code is clean and simple and works.
 *   Please make sure you indent properly - your closing brackets are off 
 *   and there are lots of extra spaces.
 *  The original grade was 11/25 so your new grade is 18/25.
 *  Nice work.
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
 * DAMAGE
 * Ask user for stats
 * calculate the damage
 * return damage + HP value.
 * STATSTABLE.
 * print out stats with new HP value.
 */

public class PokemonBattle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int HP;
		String pokemon = battleStart();
		HP=damage(pokemon);
		statsTable(HP, pokemon);

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
	public static final int damage(String pokemon) {
		Scanner console = new Scanner(System.in);

		System.out.println("Zebstrika used Thunderbolt!");

		System.out.println("Trainer what are your "+ pokemon + " stats");
		
		System.out.println("Level: ");
		
		int level = console.nextInt();
		
		System.out.println("Attack: ");
		
		int attack = console.nextInt();
		
		System.out.println("Defense: ");
		
		int defense = console.nextInt();
		
		System.out.println("Base: ");
		
		int base = console.nextInt();
		
		System.out.println("STAB");
		
		int STAB = console.nextInt();
		
		System.out.println("HP ");
		
		int HP = console.nextInt();
		
		int modifier = (int)(STAB * Math.random());
		
		int damage;
		
		damage = (((2 * level + 10)/250 + (attack/defense) * base + 2) * modifier);
		
		System.out.println(pokemon + " sustained " + damage + " points damage");
		
		System.out.println("HP, after damage, are now " + (damage + HP));
		
		return HP + damage;

		

	

		
		

		}
	public static void statsTable(int HP, String pokemon) {
		
		System.out.println("Name: " + pokemon);
		
		System.out.println("Level: 1");
		
		System.out.println("----------------------------------");
		
		System.out.println("HP: " + HP);
		
		System.out.println("Attack: 2");
		
		System.out.println("Defense: 2");
		
		System.out.println("SPD ATK: 8");
		
		System.out.println("SPD DEF: 6");
		
		System.out.println("Speed: 4 ");
		

	}

}

	



