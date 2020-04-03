import java.util.ArrayList;
import java.util.Scanner;

public class player {

	String nClss;
	ArrayList<Integer> nStats;
	Scanner race = new Scanner(System.in);
	Scanner info = new Scanner(System.in);
	Scanner gloop = new Scanner(System.in);
	String nRace = "";
	String descr = "";
	String subR = "";
	String savingThrow = "";
	String hitDie = "";
	String clssDescr = "";
	String sprinkles = "";
	String subC = "";
	String spc = "";
	String prof = "";
	int speed = 0;
	int nLevel = 1;
	int health = 0;
	String init = "";
	String str = "";
	String con = "";
	String intel = "";
	String wis = "";
	String cha = "";
	int temp = 0;
	String style = "";
	
	//TODO add weapon & armor choices as new method in each class
	public player(ArrayList<Integer> stats, String clss, int level, boolean abb)
	{
		nStats = stats;
		nClss = clss;
		nLevel = level;
		
		System.out.println("Pick a race: Dwarf, Elf, Halfling, Human, Dragonborn, Gnome, "
				+ "Half-Elf, Half-Orc, or Tiefling");
		nRace = race.nextLine().toLowerCase().trim();
		
		if(nRace.equals("dwarf"))
		{
			nStats.set(2, nStats.get(2) + 2);
			speed = 25;
			if(abb == true)
			{
				descr += "Darkvision\n\n"
						+ "Dwarven Resiliance \n\n"
						+ "Dwarven Combat Training \n\n"
						+ "Tool Proficiency: Smith's tools, Brewer's supplies, or Mason's tools \n\n"
						+ "Stonecunning \n\n"
						+ "Languages: Common & Dwarvish \n\n";
			}
			else {
				descr +="Darkvision. \nAccustomed to life underground, you\r\n" + 
						"have superior vision in dark and dim conditions. You\r\n" + 
						"can see in dim light within 60 feet of you as if it w ere\r\n" + 
						"bright light, and in darkness as if it were dim light. You\r\n" + 
						"can�t discern color in darkness, only shades of gray.\r\n\n" + 
						"Dwarven Resilience. You have advantage on saving\r\n" + 
						"throws against poison, and you have resistance against\r\n" + 
						"poison damage (explained in chapter 9).\r\n\n" + 
						"Dwarven Combat Training. You have proficiency\r\n" + 
						"with the battleaxe, handaxe, throwing hammer,\r\n" + 
						"and warhammer.\n\n" + "Tool Proficiency. \nYou gain proficiency with the\r\n" + 
						"artisan�s tools of your choice: smith�s tools, brewer�s\r\n" + 
						"supplies, or mason�s tools.\r\n\n" + 
						"Stonecunning. \nWhenever you make an Intelligence\r\n" + 
						"(History) check related to the origin of stonework, you\r\n" + 
						"are considered proficient in the History skill and add\r\n" + 
						"double your proficiency bonus to the check, instead of\r\n" + 
						"your normal proficiency bonus.\r\n\n" + 
						"Languages. \nYou can speak, read, and write Common\r\n" + 
						"and Dwarvish. Dwarvish is full of hard consonants and\r\n" + 
						"guttural sounds, and those characteristics spill over into\r\n" + 
						"whatever other language a dwarf might speak.\n\n";
			}
			
			System.out.println("Choose subrace: Hill Dwarf or Mountain Dwarf");
			subR = race.nextLine().toLowerCase().trim();
			if(subR.equals("hill dwarf"))
			{
				nStats.set(4, nStats.get(4) + 1);
				if(abb == true)
				{
					descr += "Dwarven Toughness\n\n";
				}
				else {
					descr +="Dwarven Toughness. \nYour hit point maximum\r\n" + 
							"increases by 1, and it increases by 1 every time you\r\n" + 
							"gain a level.\n\n";
				}
			}
			else if(subR.equals("mountain dwarf"))
			{
				nStats.set(0, nStats.get(0) + 2);
				if(abb == true)
				{
					descr += "Dwarven Armor Training \n\n";
				}
				else {
				descr +="Dwarven Armor Training. \nYou have proficiency with\r\n" + 
						"light and medium armor.\n\n";
				}
			}
			else
				System.out.println("Not a valid subrace");
		}
		else if(nRace.equals("elf"))
		{
			nStats.set(1, nStats.get(1) + 2);
			speed = 30;
			if(abb == true)
			{
				descr += "Darkvision \n\n"
						+ "Keen Senses \n\n"
						+ "Fey Ancestry \n\n"
						+ "Trance \n\n"
						+ "Languages: Common & Elvish\n\n";
			}
			else {
			descr +="Darkvision. \nAccustomed to twilit forests and the night\r\n" + 
					"sky, you have superior vision in dark and dim conditions.\r\n" + 
					"You can see in dim light within 60 feet of you as if it\r\n" + 
					"were bright light, and in darkness as if it were dim light.\r\n" + 
					"You can�t discern color in darkness, only shades of gray.\r\n" + 
					"Keen Senses. You have proficiency in the\r\n" + 
					"Perception skill.\r\n\n" + 
					"Fey Ancestry. \nYou have advantage on saving throws\r\n" + 
					"against being charmed, and magic can�t put you to sleep.\n\n" +
					"Trance. Elves don�t need to sleep. Instead, they\r\n" + 
					"meditate deeply, remaining semiconscious, for 4\r\n" + 
					"hours a day. (The Common word for such meditation\r\n" + 
					"is �trance.�) While meditating, you can dream after a\r\n" + 
					"fashion; such dreams are actually mental exercises that\r\n" + 
					"have become reflexive through years of practice. After\r\n" + 
					"resting in this way, you gain the same benefit that a\r\n" + 
					"human does from 8 hours of sleep.\r\n\n" + 
					"Languages. \nYou can speak, read, and write Common\r\n" + 
					"and Elvish. Elvish is fluid, with subtle intonations and\r\n" + 
					"intricate grammar. Elven literature is rich and varied,\r\n" + 
					"and their songs and poems are famous among other\r\n" + 
					"races. Many bards learn their language so they can add\r\n" + 
					"Elvish ballads to their repertoires.\n\n";
			}
			
			System.out.println("Choose subrace: High Elf, Wood Elf, or Dark Elf");
			subR = race.nextLine().toLowerCase().trim();
			
			if(subR.equals("high elf"))
			{
				nStats.set(3, nStats.get(3) + 1);
				if(abb == true)
				{
					descr += "Elf Weapon Training \n\n"
							+ "Cantrip \n\n"
							+ "Extra Language \n\n";
				}
				else {
				descr +="Elf Weapon Training. \nYou have proficiency with\r\n" + 
						"the longsword, shortsword, shortbow, and longbow.\r\n\n" + 
						"Cantrip. You know one cantrip of your choice from\r\n" + 
						"the wizard spell list. Intelligence is your spellcasting\r\n" + 
						"ability for it.\r\n\n" + 
						"Extra Language. You can speak, read, and write one\r\n" + 
						"extra language of your choice.";
				}
			}
			else if(subR.equals("wood elf"))
			{
				nStats.set(4, nStats.get(4) + 1);
				speed = 35;
				if(abb == true)
				{
					descr += "Elf Weapon Training \n\n"
							+ "Mask of the Wild \n\n";
				}
				else {
				descr +="Elf Weapon Training. \nYou have proficiency with the\r\n" + 
						"longsword, shortsword, shortbow, and longbow.\n\n" +
						"Mask of the Wild. You can attempt to hide even when\r\n" + 
						"you are only lightly obscured by foliage, heavy rain,\r\n" + 
						"falling snow, mist, and other natural phenomena.\n\n";
				}
			}
			else if(subR.equals("dark elf"))
			{
				nStats.set(5, nStats.get(5) + 1);
				if(abb == true)
				{
					descr += "Superior Darkvision \n\n"
							+ "Sunlight Sensitivity \n\n"
							+ "Drow Magic \n\n"
							+ "Drow Weapon Training \n\n";
				}
				else {
				descr +="Superior Darkvision. \nYour darkvision has a\r\n" + 
						"radius of 120 feet.\r\n" + 
						"Sunlight Sensitivity. \nYou have disadvantage on attack\r\n" + 
						"rolls and on Wisdom (Perception) checks that rely on\r\n" + 
						"sight when you, the target of your attack, or whatever\r\n" + 
						"you are trying to perceive is in direct sunlight.\r\n" + 
						"Drow Magic. \nYou know the dancing lights cantrip.\r\n" + 
						"When you reach 3rd level, you can cast the faerie fire\r\n" + 
						"spell once per day. When you reach 5th level, you can\r\n" + 
						"also cast the darkness spell once per day. Charisma is\r\n" + 
						"your spellcasting ability for these spells.\r\n" + 
						"Drow Weapon Training. \nYou have proficiency with\r\n" + 
						"rapiers, shortswords, and hand crossbows.\n\n"; 
				}
			}
			else
				System.out.println("Not a valid subrace");
		}
		else if(nRace.equals("halfling"))
		{
			nStats.set(2, nStats.get(2) + 2);
			speed = 25;
			if(abb == true)
			{
				descr += "Lucky \n\n"
						+ "Brave \n\n"
						+ "Halfling Ninmbleness \n\n"
						+ "Languages: Common & Halfling \n\n";
			}
			else {
			descr +="Lucky. \nWhen you roll a 1 on an attack roll, ability\r\n" + 
					"check, or saving throw, you can reroll the die and must\r\n" + 
					"use the new roll.\r\n\n" + 
					"Brave. \nYou have advantage on saving throws against\r\n" + 
					"being frightened.\r\n\n" + 
					"Halfling Nimbleness. \nYou can move through the\r\n" + 
					"space of any creature that is of a size larger than yours.\n\n" + 
					"Languages. \nYou can speak, read, and write Common\r\n" + 
					"and Halfling. The Halfling language isn�t secret, but\r\n" + 
					"halflings are loath to share it with others. They write\r\n" + 
					"very little, so they don�t have a rich body of literature.\r\n" + 
					"Their oral tradition, however, is very strong. Almost all\r\n" + 
					"halflings speak Common to converse with the people\r\n" + 
					"in whose lands they dwell or through which they\r\n" + 
					"are traveling.\n\n";
			}
			
			System.out.println("Choose subrace: Lightfoot or Stout");
			subR = race.nextLine().toLowerCase().trim();
			
			if(subR.equals("lightfoot"))
			{
				nStats.set(5, nStats.get(5) + 1);
				if(abb == true)
				{
					descr += "Naturally Stealthy \n\n";
				}
				else {
				descr +="Naturally Stealthy. \nYou can attempt to hide even\r\n" + 
						"when you are obscured only by a creature that is at least\r\n" + 
						"one size larger than you.\n\n";
				}
			}
			else if(subR.equals("stout"))
			{
				nStats.set(2, nStats.get(2));
				if(abb == true)
				{
					descr += "Stout Resilience \n\n";
				}
				else {
				descr +="Stout Resilience. \nYou have advantage on saving\r\n" + 
						"throws against poison, and you have resistance\r\n" + 
						"against poison damage.\n\n";
				}
			}
			else
				System.out.println("Not a valid subrace");
		}
		else if(nRace.equals("human"))
		{
			for(int x = 0; x < 6; x++)
			{
				nStats.set(x, nStats.get(x) + 1);
			}
			speed =30;
			subR = "N/A";
			if(abb == true)
			{
				descr += "Languages: Common & One Extra \n\n";
			}
			else {
			descr +="Languages. \nYou can speak, read, and write Common\r\n" + 
					"and one extra language of your choice. Humans typically\r\n" + 
					"learn the languages of other peoples they deal with,\r\n" + 
					"including obscure dialects. They are fond of sprinkling\r\n" + 
					"their speech with words borrowed from other tongues:\r\n" + 
					"Orc curses, Elvish musical expressions, Dwarvish\r\n" + 
					"military phrases, and so on.\n\n";
			}
		}
		else if(nRace.equals("dragonborn"))
		{
			nStats.set(0, nStats.get(0) + 2);
			nStats.set(5, nStats.get(5) + 1);
			speed = 30;
			
			System.out.println("Choose Draconic Ancestry: Black(acid), Blue(lightning), "
					+ "Brass(fire), Bronze(lightning),\nCopper(acid), Gold(fire), "
					+ "Green(poison), Red(fire), Silver(cold), White(cold)");
			subR = race.nextLine().toLowerCase().trim();
			
			if(abb == true)
			{
				descr += "Breath Weapon \n\n"
						+ "Draconic Ancestry \n\n"
						+ "Damage Resistance \n\n"
						+ "Languages: Common & Draconic \n\n";
			}
			else {
				if(subR.equals("black") || subR.equals("blue") || subR.equals("Brass") ||
						subR.equals("bronze"))
				{
					descr += "Breath Weapon: 5 by 30 ft. line (Dex. save)\n\n";
				}
				else if(subR.equals("green") || subR.equals("silver") || subR.equals("white"))
				{
					descr += "Breath Weapon: 15 ft. cone (Con. save)\n\n";
				}
				else if(subR.equals("gold") || subR.equals("red"))
				{
					descr +="Breath Weapon: 15 ft. cone (Dex. save)\n\n";
				}
				else
					System.out.println("Not a valid ancestry");
			
			descr +="Draconic Ancestry. \nYou have draconic ancestry.\r\n" + 
					"Choose one type of dragon from the Draconic Ancestry\r\n" + 
					"table. Your breath weapon and damage resistance are\r\n" + 
					"determined by the dragon type, as shown in the table.\r\n\n" + 
					"Breath Weapon. \nYou can use your action to exhale\r\n" + 
					"destructive energy. Your draconic ancestry determines\r\n" + 
					"the size, shape, and damage type of the exhalation.\r\n" + 
					"When you use your breath  weapon, each creature in\r\n" + 
					"the area of the exhalation must make a saving throw,\r\n" + 
					"the type of which is determined by your draconic\r\n" + 
					"ancestry. The DC for this saving throw equals 8 +\r\n" + 
					"your Constitution modifier + your proficiency bonus. A\r\n" + 
					"creature takes 2d6 damage on a failed save, and half\r\n" + 
					"as much damage on a successful one. The damage\r\n" + 
					"increases to 3d6 at 6th level, 4d6 at 11th level, and 5d6\r\n" + 
					"at 16th level.\r\n" + 
					"After you use your breath weapon, you can�t use it\r\n" + 
					"again until you complete a short or long rest.\r\n\n" + 
					"Damage Resistance. \nYou have resistance to the\r\n" + 
					"damage type associated with your draconic ancestry.\r\n\n" + 
					"Languages. You can speak, read, and write Common\r\n" + 
					"and Draconic. Draconic is thought to be one of the\r\n" + 
					"oldest languages and is often used in the study of magic.\r\n" + 
					"The language sounds harsh to most other creatures and\r\n" + 
					"includes numerous hard consonants and sibilants.\n\n";
		}
			
		}
		else if(nRace.equals("gnome"))
		{
			nStats.set(3, nStats.get(3) + 2);
			speed = 25;
			if(abb == true)
			{
				descr += "Darkvision \n\n"
						+ "Gnome Cunning \n\n"
						+ "Languages: Common & Gnomish \n\n";
			}
			else {
			descr +="Darkvision. \nAccustomed to life underground, you have\r\n" + 
					"superior vision in dark and dim conditions. You can\r\n" + 
					"see in dim light within 60 feet of you as if it were bright\r\n" + 
					"light, and in darkness as if it were dim light. You can't\r\n" + 
					"discern color in darkness, only shades of gray.\r\n\n" + 
					"Gnome Cunning. \nYou have advantage on all\r\n" + 
					"Intelligence, Wisdom, and Charisma saving throws\r\n" + 
					"against magic.\r\n\n" + 
					"Languages. \nYou can speak, read, and write Common\r\n" + 
					"and Gnomish. The Gnomish language, which uses the\r\n" + 
					"Dwarvish script, is renowned for its technical treatises\r\n" + 
					"and its catalogs of knowledge about the natural world.\n\n";
			}
			
			System.out.println("Choose subrace: Forest Gnome or Rock Gnome");
			subR = race.nextLine().toLowerCase().trim();
			
			if(subR.equals("forest gnome"))
			{
				nStats.set(1, nStats.get(1) + 1);
				if(abb == true)
				{
					descr += "Natural Ilusionist \n\n"
							+ "Speak with Small Beasts \n\n";
				}
				else {
				descr +="Natural Illusionist. \nYou know the minor illusion\r\n" + 
						"cantrip. Intelligence is your spellcasting ability for it.\r\n\n" + 
						"Speak with Small Beasts. Through sounds and\r\n" + 
						"gestures, you can communicate simple ideas with Small\r\n" + 
						"or smaller beasts. Forest gnomes love animals and often\r\n" + 
						"keep squirrels, badgers, rabbits, moles, woodpeckers,\r\n" + 
						"and other creatures as beloved pets.\n\n";
				}
			}
			else if(subR.equals("rock gnome"))
			{
				nStats.set(2, nStats.get(2) + 1);
				if(abb == true)
				{
					descr += "Artificier's Lore \n\n"
							+ "Tinker \n\n";
				}
				else {
				descr +="Artificer�s Lore. \nWhenever you make an Intelligence\r\n" + 
						"(History) check related to magic items, alchemical\r\n" + 
						"objects, or technological devices, you can add twice your\r\n" + 
						"proficiency bonus, instead of any proficiency bonus you\r\n" + 
						"normally apply.\r\n\n" + 
						"Tinker. \nYou have proficiency with artisan�s tools\r\n" + 
						"(tinker�s tools). Using those tools, you can spend 1\r\n" + 
						"hour and 10 gp worth of materials to construct a Tiny\r\n" + 
						"clockwork device (AC 5, 1 hp). The device ceases\r\n" + 
						"to function after 24 hours (unless you spend 1 hour\r\n" + 
						"repairing it to keep the device functioning), or when\r\n" + 
						"you use your action to dismantle it; at that time, you can\r\n" + 
						"reclaim the materials used to create it. You can have up\r\n" + 
						"to three such devices active at a time.\r\n" + 
						"When you create a device, choose one of the\r\n" + 
						"following options:\n\n" + 
						"Clockwork Toy. \nThis toy is a clockwork animal, monster,\r\n" + 
						"or person, such as a frog, mouse, bird, dragon, or\r\n" + 
						"soldier. When placed on the ground, the toy m oves\r\n" + 
						"5 feet across the ground on each of your turns in a\r\n" + 
						"random direction. It makes noises as appropriate\r\n" + 
						"to the creature it represents.\n\n" + 
						"Fire Starter. \nThe device produces a miniature\r\n" + 
						"flame, which you can use to light a candle,\r\n" + 
						"torch, or campfire. Using the device\r\n" + 
						"requires your action.\n\n" + 
						"Music Box. \nWhen opened, this music box\r\n" + 
						"plays a single song at a moderate volume.\r\n" + 
						"The box stops playing when it\r\n" + 
						"reaches the song�s end or\r\n" + 
						"when it is closed.\n\n";
				}
			}
			else
				System.out.println("Not a valid subrace");
		}
		else if(nRace.equals("half-elf"))
		{
			nStats.set(5, nStats.get(5) + 2);
			speed = 30;
			subR = "N/A";
			if(abb == true)
			{
				descr += "Ability Score Increase \n\n"
						+ "Darkvision \n\n"
						+ "Fey Ancestry \n\n"
						+ "Skill Versatility \n\n"
						+ "Languages: Common, Elvish, & One Extra \n\n";
			}
			else {
			descr +="Ability Score Increase. \nTwo other ability scores of your choice increase by 1.\n\n";
			descr +="Darkvision. \nThanks to your elf blood, you have\r\n" + 
					"superior vision in dark and dim conditions. You can\r\n" + 
					"see in dim light within 60 feet of you as if it were bright\r\n" + 
					"light, and in darkness as if it were dim light. You can�t\r\n" + 
					"discern color in darkness, only shades of gray.\r\n\n" + 
					"Fey Ancestry. You have advantage on saving throws\r\n" + 
					"against being charmed, and magic can�t put you to sleep.\r\n\n" + 
					"Skill Versatility. \nYou gain proficiency in two skills\r\n" + 
					"o f your choice.\r\n" + 
					"Languages. \nYou can speak, read, and write Common,\r\n" + 
					"Elvish, and one extra language of your choice.\n\n";
			}
		}
		else if(nRace.equals("half-orc"))
		{
			nStats.set(0, nStats.get(0) + 2);
			nStats.set(2, nStats.get(2) + 1);
			speed = 30;
			subR = "N/A";
			if(abb == true)
			{
				descr += "Darkvision \n\n"
						+ "Menacing \n\n"
						+ "Relentless Endurance \n\n"
						+ "Savage Attacks \n\n"
						+ "languages: Common & Orc \n\n";
			}
			else {
			descr +="Darkvision. \nThanks to your orc blood, you have\r\n" + 
					"superior vision in dark and dim conditions. You can\r\n" + 
					"see in dim light within 60 feet of you as if it were bright\r\n" + 
					"light, and in darkness as if it were dim light. You can't\r\n" + 
					"discern color in darkness, only shades of gray.\r\n\n" + 
					"Menacing. You gain proficiency in the\r\n" + 
					"Intimidation skill.\r\n\n" + 
					"Relentless Endurance. \nWhen you are reduced to\r\n" + 
					"0 hit points but not  killed outright, you can drop to 1 hit\r\n" + 
					"point instead. You can�t use this feature again until you\r\n" + 
					"finish a long rest.\r\n\n" + 
					"Savage Attacks. \nWhen you score a critical hit with\r\n" + 
					"a melee weapon attack, you can roll one of the weapon�s\r\n" + 
					"damage dice one additional time and add it to the extra\r\n" + 
					"damage of the critical hit.\r\n\n" + 
					"Languages. \nYou can speak, read, and\r\n" + 
					"write Common and Orc . Orc is a\r\n" + 
					"harsh, grating language with\r\n" + 
					"hard consonants. It has no script of its own\r\n" + 
					"but is written in the Dwarvish script.\n\n";
			}
		}
		else if(nRace.equals("tiefling"))
		{
			nStats.set(3, nStats.get(3) + 1);
			nStats.set(5, nStats.get(5) + 2);
			speed = 30;
			subR = "N/A";
			if(abb == true)
			{
				descr += "Darkvision \n\n"
						+ "Hellish Resistance \n\n"
						+ "Infernal Legacy \n\n"
						+ "Languages: Common & Infernal \n\n";
			}
			else {
			descr +="Darkvision. \nThanks to your infernal heritage, you\r\n" + 
					"have superior vision in dark and dim conditions. You\r\n" + 
					"can see in dim light within 60 feet of you as if it w ere\r\n" + 
					"bright light, and in darkness as if it were dim light. You\r\n" + 
					"can�t discern color in darkness, only shades of gray.\r\n\n" + 
					"Hellish Resistance. \nYou have resistance " + 
					"to fire damage.\r\n\n" + 
					"Infernal Legacy. \nYou know the thaumaturgy cantrip.\r\n" + 
					"Once you reach 3rd level, you can cast the hellish\r\n" + 
					"rebuke spell once per day as a 2nd-level spell. Once you\r\n" + 
					"reach 5th level, you can also cast the darkness spell\r\n" + 
					"once per day. Charisma is your spellcasting ability for\r\n" + 
					"these spells.\r\n\n" + 
					"Languages. \nYou can speak, read, and write Common " + 
					"and Infernal.\n\n";
			}
		}
		else
			System.out.println("Not a valid race");
		
		this.getHealth();
		this.getclssDescr(abb);
	}
	
	public void getHealth()
	{
		//TODO someone needs to check the math
		if(nClss.equals("barbarian"))
		{
			health = 12 + nStats.get(2);
			if(nLevel > 1)
				health += ((Math.random()*12) + 1) + (nStats.get(2) * (nLevel)-1);
			savingThrow = "Strength & Constitution";
			hitDie = "d12";
		}
		else if(nClss.equals("bard"))
		{
			health = 8 + nStats.get(2);
			if(nLevel > 1)
				health += ((Math.random()*8) + 1) + (nStats.get(2) * (nLevel)-1);
			savingThrow = "Dexterity & Charisma";
			hitDie = "d8";
		}
		else if(nClss.equals("cleric"))
		{
			health = 8 + nStats.get(2);
			if(nLevel > 1)
				health += ((Math.random()*8) + 1) + (nStats.get(2) * (nLevel)-1);
			savingThrow = "Wisdom & Charisma";
			hitDie = "d8";
		}
		else if(nClss.equals("druid"))
		{
			health = 8 + nStats.get(2);
			if(nLevel > 1)
				health += ((Math.random()*8) + 1) + (nStats.get(2) * (nLevel)-1);
			savingThrow = "Intelligence & Wisdom";
			hitDie = "d8";
		}
		else if(nClss.equals("fighter"))
		{
			health = 10 + nStats.get(2);
			if(nLevel > 1)
				health += ((Math.random()*10) + 1) + (nStats.get(2) * (nLevel)-1);
			savingThrow = "Strength & Constitution";
			hitDie = "d10";
		}
		else if(nClss.equals("monk"))
		{
			health = 8 + nStats.get(2);
			if(nLevel > 1)
				health += ((Math.random()*8) + 1) + (nStats.get(2) * (nLevel)-1);
			savingThrow = "Strength & Dexterity";
			hitDie = "d8";
		}
		else if(nClss.equals("paladin"))
		{
			health = 10 + nStats.get(2);
			if(nLevel > 1)
				health += ((Math.random()*10) + 1) + (nStats.get(2) * (nLevel)-1);
			savingThrow = "Wisdom & Charisma";
			hitDie = "d10";
		}
		else if(nClss.equals("ranger"))
		{
			health = 10 + nStats.get(2);
			if(nLevel > 1)
				health += ((Math.random()*10) + 1) + (nStats.get(2) * (nLevel)-1);
			savingThrow = "Strength & Dexterity";
			hitDie = "d10";
		}
		else if(nClss.equals("rogue"))
		{
			health = 8 + nStats.get(2);
			if(nLevel > 1)
				health += ((Math.random()*8) + 1) + (nStats.get(2) * (nLevel)-1);
			savingThrow = "Dexterity & Intelligence";
			hitDie = "d8";
		}
		else if(nClss.equals("sorcerer"))
		{
			health = 6 + nStats.get(2);
			if(nLevel > 1)
				health += ((Math.random()*6) + 1) + (nStats.get(2) * (nLevel)-1);
			savingThrow = "Constitution & Charisma";
			hitDie = "d6";
		}
		else if(nClss.equals("warlock"))
		{
			health = 8 + nStats.get(2);
			if(nLevel > 1)
				health += ((Math.random()*8) + 1) + (nStats.get(2) * (nLevel)-1);
			savingThrow = "Wisdom & Charisma";
			hitDie = "d8";
		}
		else if(nClss.equals("wizard"))	
		{
			health = 6 + nStats.get(2);
			if(nLevel > 1)
				health += ((Math.random()*6) + 1) + (nStats.get(2) * (nLevel)-1);
			savingThrow = "Itelligence & Wisdom";
			hitDie = "d8";
		}
		else
			System.out.println("No values changed");
			
	}
	
	public String getThem(){
		return z.toTitleCase(nClss) + z.toTitleCase(nRace) + nLevel;
	}
	
	
 	public void getclssDescr(boolean abb)
	{
		
		if(nClss.equals("barbarian"))
		{
			System.out.println("Choose a subclass: Berserker or Totem Warrior");
			subC = gloop.nextLine().toLowerCase();
			this.getBns(); //here
			if(abb == true)
			{
				descr += xShort.getDescr(nClss, subC, nLevel);
			}
			else {
				descr += barbarian.getBarbDescr(subC, nLevel);
			}
			spc = barbarian.getSpc(nLevel);
			prof = barbarian.getProf(nLevel);
			
			if(nLevel == 20)
			{
				nStats.set(0, nStats.get(0) + 4);
				nStats.set(2, nStats.get(2) + 4);
			}
		}
		else if(nClss.equals("bard"))
		{			
			System.out.println("Choose a college: Lore or Valor");
			subC = gloop.nextLine().toLowerCase();
			this.getBns();
			if(abb == true)
			{
				descr += xShort.getDescr(nClss, subC, nLevel);
			}
			else {
				descr += bard.getBardDescr(subC, nLevel);
			}
			spc = bard.getSpc(nLevel, Integer.parseInt(cha));
			prof = bard.getProf(nLevel);
			
		}
		else if(nClss.equals("cleric"))
		{
			System.out.println("Choose a divine domain: "
					+ "Knowledge, Life, Light, Nature, Tempest, Trickery, or War");
			subC = gloop.nextLine().toLowerCase();
			this.getBns();
			if(abb == true)
			{
				descr += xShort.getDescr(nClss, subC, nLevel);
			}
			else {
				descr += cleric.getClericDescr(subC, nLevel);
			}
			spc = cleric.getSpc(nLevel, Integer.parseInt(wis));
			prof = cleric.getProf(nLevel);
		}
		else if(nClss.equals("druid"))
		{
			System.out.println("Choose a circle: Arctic, Coast, Desert, Forest, Grassland, Mountain, Swamp, Underdark, or Moon");
			subC = gloop.nextLine().toLowerCase();
			this.getBns();
			if(abb == true)
			{
				descr += xShort.getDescr(nClss, subC, nLevel);
			}
			else {
				descr += druid.getDruidDescr(subC, nLevel);
			}
			spc = druid.getSpc(nLevel, Integer.parseInt(wis));
			prof = druid.getProf(nLevel);
		}
		else if(nClss.equals("fighter"))
		{
			System.out.println("Choose a martial archetype: Champion, Battle Master, Eldritch Knight");
			subC = gloop.nextLine().toLowerCase();
			System.out.println("Choose a fighting style: archery, defense, dueling, great weapon, "
					+ "protection, or dual wield");
			style = gloop.nextLine().toLowerCase().trim();
			this.getBns();
			if(abb == true)//style
			{
				subC = style + " " + subC;
				descr += xShort.getDescr(nClss, subC, nLevel);
			}
			else {
				descr += fighter.getFighterDescr(subC, nLevel, style);
			}
			spc = fighter.getSpc(nLevel, Integer.parseInt(intel), subC, style);
			prof = fighter.getProf(nLevel);
		}
		else if(nClss.equals("monk"))
		{
			System.out.println("Choose a monastic tradition: Way of the Open Hand (Hand), "
					+ "Way of Shadow (Shadow), or Way of the Four Elements (Elements)");
			subC = gloop.nextLine().toLowerCase();
			this.getBns();
			if(abb == true)
			{
				descr += xShort.getDescr(nClss, subC, nLevel);
			}
			else {
				descr += monk.getMonkDescr(subC, nLevel);
			}
			spc = monk.getSpc(nLevel, Integer.parseInt(wis));
			prof = monk.getProf(nLevel);
			speed = monk.getUSpeed(speed, nLevel);
			if(subC.equals("hand"))
				subC.equals("Way of the Open Hand");
			if(subC.equals("shadow"))
				subC.equals("Way of Shadow");
			if(subC.equals("elements"))
				subC.equals("Way of the Four Elements");
		}
		else if(nClss.equals("paladin"))
		{
			System.out.println("Choose a sacred oath: Oath of Devotion (Devotion), "
					+ "Oath of the Ancients (Ancients), or Oath of Vengeance (Vengeance)");
			subC = gloop.nextLine().toLowerCase();
			this.getBns();
			if(abb == true)
			{
				descr += xShort.getDescr(nClss, subC, nLevel);
			}
			else {
				descr += paladin.getPaladinDescr(subC, nLevel);
			}
			spc = paladin.getSpc(nLevel, Integer.parseInt(cha));
			prof = paladin.getProf(nLevel);
			if(subC.equals("devotion"))
				subC.equals("Oath of Devotion");
			if(subC.equals("ancients"))
				subC.equals("Oath of Ancients");
			if(subC.equals("vengeance"))
				subC.equals("Oath of Vengeance");
		}
		else if(nClss.equals("ranger"))
		{
			System.out.println("Choose a ranger archetype: Hunter or Beast Master");
			subC = gloop.nextLine().toLowerCase();
			this.getBns();
			if(abb == true)
			{
				descr += xShort.getDescr(nClss, subC, nLevel);
			}
			else {
				descr += ranger.getRangerDescr(subC, nLevel);
			}
			spc = ranger.getSpc(nLevel, Integer.parseInt(wis));
			prof = ranger.getProf(nLevel);
		}	
		else if(nClss.equals("rogue"))
		{
			System.out.println("Choose a Roguish Archetype: Thief, Assassin, or Arcane Trickster (Arcane)");
			subC = gloop.nextLine().toLowerCase();
			this.getBns();
			if(abb == true)
			{
				descr += xShort.getDescr(nClss, subC, nLevel);
			}
			else {
				descr += rogue.getRogueDescr(subC, nLevel);
			}
			spc = rogue.getSpc(nLevel, Integer.parseInt(intel), subC);
			prof = rogue.getProf(nLevel);
			if(subC.equals("arcane"))
				subC.equals("Arcane Trickster");
		}	
		else if(nClss.equals("sorcerer"))
		{
			System.out.println("Choose a sorcerous origin: Draconic Bloodline (Draconic) or Wild Magic (Wild)");
			subC = gloop.nextLine().toLowerCase();
			this.getBns();
			if(abb == true)
			{
				descr += xShort.getDescr(nClss, subC, nLevel);
			}
			else {
				descr += sorcerer.getSorcererDescr(subC, nLevel);
			}
			spc = sorcerer.getSpc(nLevel, Integer.parseInt(cha));
			prof = sorcerer.getProf(nLevel);
			if(subC.equals("wild"))
				subC.equals("Wild Magic");
			if(subC.equals("draconic"))
				subC.equals("Draconic Bloodline");
		}
		else if(nClss.equals("warlock"))
		{
			System.out.println("Choose an otherworldly patron: Archfey, Fiend, or Great Old One (Great)");
			subC = gloop.nextLine().toLowerCase();
			this.getBns();
			if(abb == true)
			{
				descr += xShort.getDescr(nClss, subC, nLevel);
			}
			else {
				descr += warlock.getWarlockDescr(subC, nLevel);
			}
			spc = warlock.getSpc(nLevel, Integer.parseInt(cha));
			prof = warlock.getProf(nLevel);
			if(subC.equals("great"))
				subC.equals("Great Old One");
		}
		else if(nClss.equals("wizard"))
		{
			System.out.println("Choose an arcane tradition: Abjuration, Conjuration, Divination, "
					+ "Enchantment, Evocation, Illusion, or Transmutation");
			subC = gloop.nextLine().toLowerCase();
			this.getBns();
			if(abb == true)
			{
				descr += xShort.getDescr(nClss, subC, nLevel);
			}
			else {
				descr += wizard.getWizardDescr(subC, nLevel);
			}
			spc = wizard.getSpc(nLevel, Integer.parseInt(intel));
			prof = wizard.getProf(nLevel);
		}
		
	}
 	
 	public void getBns() 
 	{
 		for(int point = 0; point < 6; point++)
		{
			if(nStats.get(point) >= 30)
				temp = 10;
			else if(nStats.get(point) >= 28)
				temp = 9;
			else if(nStats.get(point) >= 26)
				temp = 8;
			else if(nStats.get(point) >= 24)
				temp = 7;
			else if(nStats.get(point) >= 22)
				temp = 6;
			else if(nStats.get(point) >= 20)
				temp = 5;
			else if(nStats.get(point) >= 18)
				temp = 4;
			else if(nStats.get(point) >= 16)
				temp = 3;
			else if(nStats.get(point) >= 14)
				temp = 2;
			else if(nStats.get(point) >= 12)
				temp = 1;
			else if(nStats.get(point) >= 10)
				temp = 0;
			else if(nStats.get(point) >= 8)
				temp = -1;
			else if(nStats.get(point) >= 6)
				temp = -2;
			else if(nStats.get(point) >= 4)
				temp = -3;
			else if(nStats.get(point) >= 2)
				temp = -4;
			else if(nStats.get(point) >= 1)
				temp = -5;
			else
				temp = -6;
			
			if(point == 0)
			{
				if(temp > 0)
					str = "+" + Integer.toString(temp);
				else 
					str = Integer.toString(temp);
			}
			else if(point == 1)
			{
				if(temp > 0)
					init = "+" + Integer.toString(temp);
				else 
					init = Integer.toString(temp);
			}
			else if(point == 2)
			{
				if(temp > 0)
					con = "+" + Integer.toString(temp);
				else 
					con = Integer.toString(temp);
			}
			else if(point == 3)
			{
				if(temp > 0)
					intel = "+" + Integer.toString(temp);
				else 
					intel = Integer.toString(temp);
			}
			else if(point == 4)
			{
				if(temp > 0)
					wis = "+" + Integer.toString(temp);
				else 
					wis = Integer.toString(temp);
			}
			else if(point == 5)
			{
				if(temp > 0)
					cha = "+" + Integer.toString(temp);
				else 
					cha = Integer.toString(temp);
			}
		}
 	}
	
	public String toString()
	{
		String output;
		this.getBns();
		if(nClss.length() > 2 && subR.length() > 2)
		{
			output = "\n" + z.toTitleCase(nClss) + ": " + z.toTitleCase(subC) + 
					"\n" + z.toTitleCase(nRace) + ": " + z.toTitleCase(subR) + 
					"\nLevel: " + nLevel + 
					"\nHealth: " + health +		
					"\nInitiative: " + init;
			
			output += "\nSpeed: " + speed + 
					"\nSaving Throws: " + savingThrow + 
					"\nSee book for armor class " +
					"\nHit Die: " + hitDie +
					"\nProficiency Bonus: " + prof;
			
			output += "\n\nStrength: " + nStats.get(0).toString() + " " + str +
					"\nDexterity: " + nStats.get(1).toString() + " " + init +
					"\nConstitution: " + nStats.get(2).toString() + " " + con + 
					"\nIntelligence: " + nStats.get(3).toString() + " " + intel +
					"\nWisdom: " + nStats.get(4).toString() + " " + wis +
					"\nCharisma: " + nStats.get(5).toString() + " " + cha;
			
			if(!(spc.equals("")))
					output += "\n\n" + spc + "\n\n" + descr;
			else 
				output += "\n\n" + descr;
		}
		else
			output = "No values output";
		
		return output;
	}
}
