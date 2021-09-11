import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.math.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.*;

//Hey, what are you doing here?
@SuppressWarnings("unused")
public class Runner { //TODO unadded ASI's will not be taken into account for any stats including strength checks, dex/armor, magicy stuff, con for health up

	public static void main(String[] args) {
		ArrayList<Integer> stats = new ArrayList<Integer>(6);
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner num = new Scanner(System.in);
		String sprinkles;
		int level = 0;
		boolean abb = false;
		boolean hug = false; //Cool Cool Cool
		
		System.out.println("Automatic DND Character Generator by Alex Issing");
		System.out.println("Would You like the abbreviated version?");
		if(in.nextLine().trim().toLowerCase().equals("yes"))
			abb = true;
		
		stats = z.sort(stats);
		System.out.println("Would you like to use the automated rolls or add your own custom rolls? (auto or custom)");
		if(in.nextLine().toLowerCase().trim().equals("custom")) {
			for(int place = 0; place < 6; place ++)
			{
				if(place == 0) {System.out.println("Strength: ");}
				else if(place == 1){System.out.println("Dexterity: ");}
				else if(place == 2){System.out.println("Constitution: ");}
				else if(place == 3){System.out.println("Intelligence: ");}
				else if(place == 4){System.out.println("Wisdom: ");}
				else if(place == 5){System.out.println("Charisma: ");}
				stats.set(place, num.nextInt());
			}
		}
		else{
			for (int j = 0; j < 6; j++)
			{
				ArrayList<Integer> rolls = new ArrayList<Integer>(4);
				for(int x = 0; x < 4; x++)
					rolls.add(z.d6());
				
				rolls = z.sort(rolls);
				
				//System.out.println(rolls.toString());
				stats.add(rolls.get(0) + rolls.get(1) + rolls.get(2));
			}
		}
		
		System.out.println(stats.toString());
		
		System.out.println("Pick a class: Barbarian, Bard, Cleric, Druid, Fighter, Monk, "
				+ "Paladin, Ranger, Rogue, Sorcerer, Warlock, or Wizard");
		sprinkles = in.nextLine().toLowerCase().trim();
		
		if(sprinkles.equals("barbarian"))
			stats = barbarian.barbarianStats(stats);
		else if(sprinkles.equals("bard"))
			stats = bard.bardStats(stats);
		else if(sprinkles.equals("cleric"))
			stats = cleric.clericStats(stats);
		else if(sprinkles.equals("druid"))
			stats = druid.druidStats(stats);
		else if(sprinkles.equals("fighter"))
			stats = fighter.fighterStats(stats);
		else if(sprinkles.equals("monk"))
			stats = monk.monkStats(stats);
		else if(sprinkles.equals("paladin"))
			stats = paladin.paladinStats(stats);
		else if(sprinkles.equals("ranger"))
			stats = ranger.rangerStats(stats);
		else if(sprinkles.equals("rogue"))
			stats = rogue.rogueStats(stats);
		else if(sprinkles.equals("sorcerer"))
			stats = sorcerer.sorcererStats(stats);
		else if(sprinkles.equals("warlock"))
			stats = warlock.warlockStats(stats);
		else if(sprinkles.equals("wizard"))
			stats = wizard.wizardStats(stats);
		else if(sprinkles.equals("hug"))
		{
			int x = z.d12();
			hug = true;
			
			if(x == 1) {
				stats = barbarian.barbarianStats(stats);
				sprinkles = "barbarian";
			}
			else if(x == 2) {
				stats = bard.bardStats(stats);
				sprinkles = "bard";
			}
			else if(x == 3) {
				stats = cleric.clericStats(stats);
				sprinkles = "cleric";
			}
			else if(x == 4) {
				stats = druid.druidStats(stats);
				sprinkles = "druid";
			}
			else if(x == 5) {
				stats = fighter.fighterStats(stats);
				sprinkles = "fighter";
			}
			else if(x == 6) {
				stats = monk.monkStats(stats);
				sprinkles = "monk";
			}
			else if(x == 7) {
				stats = paladin.paladinStats(stats);
				sprinkles = "paladin";
			}
			else if(x == 8) {
				stats = ranger.rangerStats(stats);
				sprinkles = "ranger";
			}
			else if(x == 9) {
				stats = rogue.rogueStats(stats);
				sprinkles = "rogue";
			}
			else if(x == 10) {
				stats = sorcerer.sorcererStats(stats);
				sprinkles = "sorerer";
			}
			else if(x == 11) {
				stats = warlock.warlockStats(stats);
				sprinkles = "warlock";
			}
			else if(x == 12) {
				stats = wizard.wizardStats(stats);
				sprinkles = "wizard";
			}
		}
		
		System.out.println("What level");
		
		String lvl = "";
		/*if(hug = true) {
			lvl = Integer.toString(z.d20());
		}
		else*/
			lvl = in.nextLine();
		
		if(z.checkIfInt(lvl))
		{
			level = Integer.parseInt(lvl);
			if(level > 20)
				level = 20;
			else if(level < 1)
				level = 1;
			player me = new player(stats, sprinkles, level, abb, hug);
			me.getBns();
			System.out.println("*No Ability Score Improvements are included in final output.");
			System.out.println(me.toString());
			String end = me.toString();
			System.out.println("\nWould you like armor and weapon tables?");
			if(in.nextLine().trim().toLowerCase().equals("yes")){
				System.out.println(me.getTables());
			}
			
			System.out.println("Would you like to save this?");
			String saved = in.nextLine().toLowerCase().trim();
			Date date = new Date();
			String scrar = me.getThem() + "_" + date.getTime() + ".txt";
			if(saved.equals("yes"))
			{
				try {
				FileOutputStream saveFile=new FileOutputStream(scrar);

				ObjectOutputStream save = new ObjectOutputStream(saveFile);

				save.writeObject(end);
				
				save.close();
				System.out.println(scrar);
				}
				catch(Exception exc){
					exc.printStackTrace();
				}
			}
		}
		else
			System.out.println("Not a number");
	}
}
//By Alex Issing