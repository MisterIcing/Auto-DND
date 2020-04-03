import java.util.ArrayList;
import java.util.*;

public class ranger {

	//page 83
	static public ArrayList<Integer> rangerStats(ArrayList<Integer> stats)
	{
		ArrayList<Integer> newStats = new ArrayList<Integer>(6);
		
		z.sort(stats);
		//strength
		newStats.add(stats.get(4));
		//dex
		newStats.add(stats.get(0));
		//const
		newStats.add(stats.get(1));
		//intel
		newStats.add(stats.get(3));
		//wisdom
		newStats.add(stats.get(2));
		//charisma
		newStats.add(stats.get(5));
		
		return newStats;
	}
	
	static public String getRangerDescr(String subC, int level)
	{
		String descr;
		String style;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		descr = "Proficiencies:\n"
				+ "Armor: Light armor, medium armor, shields\r\n" + 
				"Weapons: Simple weapons, martial weapons\r\n" + 
				"Tools: None\r\n" + 
				"Saving Throws: Strength, Dexterity\r\n" + 
				"Skills: Choose three from Animal Handling,\r\n" + 
				"Athletics, Insight, Investigation, Nature, Perception,\r\n" + 
				"Stealth, and Survival\n\n";
	
		for(int point = 1; point <= level; point++)
		{
			if(point == 1){
				descr += "Favored Enemy. \nBeginning at 1st level, you have significant experience\r\n" + 
						"studying, tracking, hunting, and even talking to a certain\r\n" + 
						"type of enemy.\r\n" + 
						"Choose a type of favored enemy: aberrations,\r\n" + 
						"beasts, celestials, constructs, dragons, elementals, fey,\r\n" + 
						"fiends, giants, monstrosities, oozes, plants, or undead.\r\n" + 
						"Alternatively, you can select two races of humanoid\r\n" + 
						"(such as gnolls and orc s) as favored enemies.\r\n" + 
						"You have advantage on W isdom (Survival) checks to\r\n" + 
						"track your favored enemies, as w ell as on Intelligence\r\n" + 
						"checks to recall information about them.\r\n" + 
						"When you gain this feature, you also learn one\r\n" + 
						"language of your choice that is spoken by your favored\r\n" + 
						"enemies, if they speak one at all.\n\n"
						+ "Natural Explorer. \nYou are particularly familiar with one type of natural\r\n" + 
						"environment and are adept at traveling and surviving in\r\n" + 
						"such regions. Choose one type of favored terrain: arctic,\r\n" + 
						"coast, desert, forest, grassland, mountain, swamp,\r\n" + 
						"or the Underdark. When you make an Intelligence or\r\n" + 
						"Wisdom check related to your favored terrain, your\r\n" + 
						"proficiency bonus is doubled if you are using a skill that\r\n" + 
						"you’re proficient in.\r\n" + 
						"While traveling for an hour or m ore in your favored\r\n" + 
						"terrain, you gain the following benefits:\r\n" + 
						"• Difficult terrain doesn’t slow your group’s travel.\r\n" + 
						"• Your group can’t become lost except by magical\r\n" + 
						"means.\r\n" + 
						"• Even when you are engaged in another activity while\r\n" + 
						"traveling (such as foraging, navigating, or tracking),\r\n" + 
						"you remain alert to danger.\r\n" + 
						"• If you are traveling alone, you can move stealthily at\r\n" + 
						"a normal pace.\r\n" + 
						"• When you forage, you find twice as much food as you\r\n" + 
						"normally would.\r\n" + 
						"• While tracking other creatures, you also learn their\r\n" + 
						"exact number, their sizes, and how long ago they\r\n" + 
						"passed through the area.\n\n";
			}
			else if(point == 2){
				System.out.println("Choose a fighting style: archery, defense, dueling, or "
						+ "dual wield");
				style = in.nextLine().toLowerCase().trim();
				if(style.equals("archery")) {
					descr += "Archery. \nYou gain a +2 bonus to attack rolls you make with\r\n" + 
							"ranged weapons.\n\n";
				}
				else if(style.equals("defense")){
					descr += "Defense. \nWhile you are wearing armor, you gain a +1 bonus to AC.\n\n";
				}
				else if(style.equals("dueling")){
					descr += "Dueling. \nWhen you are wielding a melee weapon in one hand and\r\n" + 
							"no other weapons, you gain a +2 bonus to damage rolls\r\n" + 
							"with that weapon.\n\n";
				}
				else if(style.equals("dual wield")){
					descr += "Dual Wield. \nWhen you engage in two-weapon fighting, you can add\r\n" + 
							"your ability modifier to the damage of the second attack.\n\n";
				}
				
				descr += "Spellcasting. \nBy the time you reach 2nd level, you have learned to\r\n" + 
						"use the magical essence of nature to cast spells, much\r\n" + 
						"as a druid does.\n\n";
			}
			else if(point == 3){//path
				descr += "Primeval Awareness. \nBeginning at 3rd level, you can use your action and\r\n" + 
						"expend one ranger spell slot to focus your awareness on\r\n" + 
						"the region around you. For 1 minute per level of the spell\r\n" + 
						"slot you expend, you can sense whether the following\r\n" + 
						"types of creatures are present within 1 mile of you (or\r\n" + 
						"within up to 6 miles if you are in your favored terrain):\r\n" + 
						"aberrations, celestials, dragons, elementals, fey, fiends,\r\n" + 
						"and undead. This feature doesn’t reveal the creatures’\r\n" + 
						"location or number.\n\n";
				
				if(subC.equals("hunter")){
					descr += "Hunter's Prey. \nAt 3rd level, you gain one of the following features\r\n" + 
							"of your choice.\r\n" + 
							"Colossus Slayer. \nYour tenacity can w ear down\r\n" + 
							"the most potent foes. When you hit a creature with a\r\n" + 
							"weapon attack, the creature takes an extra 1d8 damage\r\n" + 
							"if it’s below its hit point maximum. You can deal this\r\n" + 
							"extra damage only once per turn.\r\n" + 
							"Giant Killer. \nWhen a Large or larger creature within\r\n" + 
							"5 feet of you hits or misses you with an attack, you can\r\n" + 
							"use your reaction to attack that creature immediately\r\n" + 
							"after its attack, provided that you can see the creature.\r\n" + 
							"Horde Breaker. \nOnce on each of your turns when you\r\n" + 
							"make a w eapon attack, you can make another attack\r\n" + 
							"with the same weapon against a different creature that\r\n" + 
							"is within 5 feet of the original target and within range\r\n" + 
							"of your weapon.\n\n";
				}
				else if(subC.equals("beast master")){
					descr += "Ranger's Companion. \nAt 3rd level, you gain a beast companion that\r\n" + 
							"accompanies you on your adventures and is trained to\r\n" + 
							"fight alongside you. Choose a beast that is no larger than\r\n" + 
							"Medium and that has a challenge rating of 1/4 or lower\r\n" + 
							"(appendix D presents statistics for the hawk, mastiff,\r\n" + 
							"and panther as examples). Add your proficiency bonus\r\n" + 
							"to the beast’s AC, attack rolls, and damage rolls, as well\r\n" + 
							"as to any saving throws and skills it is proficient in. Its\r\n" + 
							"hit point maximum equals its normal maximum or four\r\n" + 
							"times your ranger level, whichever is higher.\r\n" + 
							"The beast obeys your commands as best as it can. It\r\n" + 
							"takes its turn on your initiative, though it doesn’t take an\r\n" + 
							"action unless you command it to. On your turn, you can\r\n" + 
							"verbally command the beast where to move (no action\r\n" + 
							"required by you). You can use your action to verbally\r\n" + 
							"command it to take the Attack, Dash, Disengage, Dodge,\r\n" + 
							"or Help action. Once you have the Extra Attack feature,\r\n" + 
							"you can make one w eapon attack yourself when you\r\n" + 
							"command the beast to take the Attack action.\r\n" + 
							"While traveling through your favored terrain with only\r\n" + 
							"the beast, you can move stealthily at a normal pace.\r\n" + 
							"If the beast dies, you can obtain another one by\r\n" + 
							"spending 8 hours magically bonding with another beast\r\n" + 
							"that isn’t hostile to you, either the same type of beast as\r\n" + 
							"before or a different one.\n\n";
				}
			}
			else if(point == 4){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 5){
				descr += "Extra Attack. \nBeginning at 5th level, you can attack twice, instead of\r\n" + 
						"once, whenever you take the Attack action on your turn.\n\n";
			}
			else if(point == 6){
				descr += "Favored Enemy (Improvement). \nYou choose one additional favored enemy, as well as\r\n" + 
						"an associated language.\n\n"
						+ "Natural Explorer (Improvement). \nYou choose an additional favored terrain type.\n\n";
			}
			else if(point == 7){//path
				if(subC.equals("hunter")){
					descr += "Defensive Tactics. \nAt 7th level, you gain one of the following features\r\n" + 
							"of your choice.\r\n" + 
							"Escape the Horde. \nOpportunity attacks against you\r\n" + 
							"are made with disadvantage.\r\n" + 
							"Multiattack Defense. \nWhen a creature hits you\r\n" + 
							"with an attack, you gain a +4 bonus to AC against\r\n" + 
							"all subsequent attacks made by that creature for the\r\n" + 
							"rest of the turn.\r\n" + 
							"Steel Will. You have advantage on saving throws\r\n" + 
							"against being frightened.\n\n";
				}
				else if(subC.equals("beast master")){
					descr += "Exceptional Training. \nBeginning at 7th level, on any of your turns when\r\n" + 
							"your beast companion doesn’t attack, you can use a\r\n" + 
							"bonus action to command the beast to take the Dash,\r\n" + 
							"Disengage, Dodge, or Help action on its turn.\n\n";
				}
			}
			else if(point == 8){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n"
						+ "Land's Stride. \nStarting at 8th level, moving through nonmagical\r\n" + 
						"difficult terrain costs you no extra movement. You can\r\n" + 
						"also pass through nonmagical plants without being\r\n" + 
						"slowed by them and without taking damage from them if\r\n" + 
						"they have thorns, spines, or a similar hazard.\r\n" + 
						"In addition, you have advantage on saving throws\r\n" + 
						"against plants that are magically created or manipulated\r\n" + 
						"to impede movement, such those created by the\r\n" + 
						"entangle spell.\n\n";
			}
			else if(point == 9){}
			else if(point == 10){
				descr += "Natural Explorer (Improvement). \nYou choose an additional favored terrain type.\n\n"
						+ "Hide in Plain Sight. Starting at 10th level, you can spend 1 minute creating\r\n" + 
						"camouflage for yourself. You must have access to fresh\r\n" + 
						"mud, dirt, plants, soot, and other naturally o ccurring\r\n" + 
						"materials with which to create your camouflage.\r\n" + 
						"Once you are camouflaged in this way, you can try\r\n" + 
						"to hide by p ressing yourself up against a solid surface,\r\n" + 
						"such as a tree or wall, that is at least as tall and w ide\r\n" + 
						"as you are. You gain a +10 bonus to Dexterity (Stealth)\r\n" + 
						"checks as long as you remain there without moving or\r\n" + 
						"taking actions. Once you move or take an action or a\r\n" + 
						"reaction, you must camouflage yourself again to gain\r\n" + 
						"this benefit.\n\n";
			}
			else if(point == 11){//path
				if(subC.equals("hunter")){
					descr += "Multiattack. \nAt 11th level, you gain one of the following features\r\n" + 
							"of your choice.\r\n" + 
							"Volley. \nYou can use your action to make a ranged\r\n" + 
							"attack against any number of creatures within 10 feet\r\n" + 
							"of a point you can see within your w eapon’s range. You\r\n" + 
							"must have ammunition for each target, as normal, and\r\n" + 
							"you make a separate attack roll for each target.\r\n" + 
							"Whirlwind Attack. \nYou can use your action to make a\r\n" + 
							"melee attack against any number of creatures within 5\r\n" + 
							"feet of you, with a separate attack roll for each target.\n\n";
				}
				else if(subC.equals("beast master")){
					descr += "Bestial Fury. \nStarting at 11th level, your beast companion can\r\n" + 
							"make two attacks when you command it to use the\r\n" + 
							"Attack action.\n\n";
				}
			}
			else if(point == 12){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 13){}
			else if(point == 14){
				descr += "Favored Enemy (Improvement). \nYou choose one additional favored enemy, as well as\r\n" + 
						"an associated language.\n\n"
						+ "Vanish. \nStarting at 14th level, you can use the Hide action as a\r\n" + 
						"bonus action on your turn. Also, you can’t be tracked by\r\n" + 
						"nonmagical means, unless you choose to leave a trail.\n\n";
			}
			else if(point == 15){//path
				if(subC.equals("hunter")){
					descr += "Superior Hunter's Defense. \nAt 15th level, you gain one of the following features\r\n" + 
							"of your choice.\r\n" + 
							"Evasion. \nYou can nimbly dodge out of the way of\r\n" + 
							"certain area effects, such as a red dragon’s fiery breath\r\n" + 
							"or a lightning bolt spell. When you are subjected to an\r\n" + 
							"effect that allows you to make a Dexterity saving throw\r\n" + 
							"to take only half damage, you instead take no damage\r\n" +
							"if you succeed on the saving throw, and only half\r\n" + 
							"damage if you fail.\r\n" + 
							"Stand Against the Tide. \nWhen a hostile creature\r\n" + 
							"misses you with a melee attack, you can use your reaction\r\n" + 
							"to force that creature to repeat the same attack against\r\n" + 
							"another creature (other than itself) of your choice.\r\n" + 
							"Uncanny Dodge. \nWhen an attacker that you can see\r\n" + 
							"hits you with an attack, you can use your reaction to\r\n" + 
							"halve the attack’s damage against you.";
				}
				else if(subC.equals("beast master")){
					descr += "Share Spells. \nBeginning at 15th level, when you cast a spell targeting\r\n" + 
							"yourself, you can also affect your beast companion with\r\n" + 
							"the spell if the beast is within 30 feet of you.\n\n";
				}
			}
			else if(point == 16){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 17){}
			else if(point == 18){
				descr += "Feral Senses. \nAt 18th level, you gain preternatural senses that help\r\n" + 
						"you fight creatures you can’t see. When you attack a\r\n" + 
						"creature you can’t see, your inability to see it doesn’t\r\n" + 
						"impose disadvantage on your attack rolls against it.\r\n" + 
						"You are also aware of the location of any invisible\r\n" + 
						"creature within 30 feet of you, provided that the\r\n" + 
						"creature isn’t hidden from you and you aren’t\r\n" + 
						"blinded or deafened.\n\n";
			}
			else if(point == 19){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 20){
				descr += "Foe Slayer. \nAt 20th level, you become an unparalleled hunter of your\r\n" + 
						"enemies. Once on each of your turns, you can add your\r\n" + 
						"Wisdom modifier to the attack roll or the damage roll of\r\n" + 
						"an attack you make against one of your favored enemies.\r\n" + 
						"You can choose to use this feature before or after the\r\n" + 
						"roll, but before any effects of the roll are applied.";
			}
		}
		return descr;
	}
	
	static public String getProf(int level)
	{
		String prof = "";
		for(int point = 1; point <= level; point++)
		{
			if(point == 1)
			{
				prof ="+2";
			}
			else if(point == 5)
			{
				prof ="+3";
			}
			else if(point == 9)
			{
				prof ="+4";
			}
			else if(point == 13)
			{
				prof ="+5";
			}
			else if(point == 17)
			{
				prof ="+6";
			}			
		}
		return prof;
	}

	static public String getSpc(int level, int mod)
	{
		String spc = "";
		for(int point = 1; point <= level; point++)
		{
			if(point == 1){}
			else if(point == 2){
				spc = "Spells Known: 2\n"
						+ "1st: 2";
			}
			else if(point == 3){
				spc = "Spells Known: 3\n"
						+ "1st: 3";
			}
			else if(point == 5){
				spc = "Spells Known: 4\n"
						+ "1st: 4\n"
						+ "2nd: 2";
			}
			else if(point == 7){
				spc = "Spells Known: 5\n"
						+ "1st: 4\n"
						+ "2nd: 3";
			}
			else if(point == 9){
				spc = "Spells Known: 6\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 2";
			}
			else if(point == 11){
				spc = "Spells Known: 7\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3";
			}
			else if(point == 13){
				spc = "Spells Known: 8\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 1";
			}
			else if(point == 15){
				spc = "Spells Known: 9\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 2";
			}
			else if(point == 17){
				spc = "Spells Known: 10\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 1";
			}
			else if(point == 19){
				spc = "Spells Known: 11\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2";
			}
		}
		spc += "\n\nSpell Save DC: " + (8 + Integer.parseInt(getProf(level)) + mod)
				+ "\nSpell Attack Modifier: " + (Integer.parseInt(getProf(level)) + mod);
		return spc;
	}
}
