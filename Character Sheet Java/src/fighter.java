import java.util.ArrayList;
import java.util.Scanner;

public class fighter {

	//page 64
	static public ArrayList<Integer> fighterStats(ArrayList<Integer> stats)
	{
		ArrayList<Integer> newStats = new ArrayList<Integer>(6);
		
		z.sort(stats);
		//strength
		newStats.add(stats.get(0));
		//dex
		newStats.add(stats.get(2));
		//const
		newStats.add(stats.get(1));
		//intel
		newStats.add(stats.get(5));
		//wisdom
		newStats.add(stats.get(4));
		//charisma
		newStats.add(stats.get(3));
		
		return newStats;
	}

	static public String getFighterDescr(String subC, int level, String style)
	{
		String descr;
		descr = "Proficiencies:\n"
				+ "Armor : All armor, shields\r\n" + 
				"Weapons: Simple weapons, martial weapons\r\n" + 
				"Tools: None\r\n" + 
				"Saving Throws: Strength, Constitution\n"
				+ "Skills: Choose two skills from Acrobatics, Animal " + 
				"Handling, Athletics, History, Insight, Intimidation, " + 
				"Perception, and Survival\n\n";
	
		for(int point = 1; point <= level; point++)
		{
			if(point == 1){
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
				else if(style.equals("great weapon")){
					descr += "Great Weapon. \nWhen you roll a 1 or 2 on a damage die for an attack you\r\n" + 
							"make with a melee weapon that you are wielding with\r\n" + 
							"two hands, you can reroll the die and must use the new\r\n" + 
							"roll, even if the new roll is a 1 or a 2. The weapon must\r\n" + 
							"have the two-handed or versatile property for you to gain\r\n" + 
							"this benefit.\n\n";
				}
				else if(style.equals("protection")){
					descr += "Protection. \nWhen a creature you can see attacks a target other\r\n" + 
							"than you that is within 5 feet of you, you can use your\r\n" + 
							"reaction to impose disadvantage on the attack roll. You\r\n" + 
							"must be w ielding a shield.\n\n";
				}
				else if(style.equals("dual wield")){
					descr += "Dual Wield. \nWhen you engage in two-weapon fighting, you can add\r\n" + 
							"your ability modifier to the damage of the second attack.\n\n";
				}
				
				descr += "Second Wind. \nYou have a limited well of stamina that you can draw on\r\n" + 
						"to protect yourself from harm. On your turn, you can use\r\n" + 
						"a bonus action to regain hit points equal to 1d 10 + your\r\n" + 
						"fighter level.\r\n" + 
						"Once you use this feature, you must finish a short or\r\n" + 
						"long rest before you can use it again.\n\n";
			}
			else if(point == 2){
				descr += "Action Surge. \nStarting at 2nd level, you can push yourself beyond your\r\n" + 
						"normal limits for a moment. On your turn, you can take\r\n" + 
						"one additional action on top of your regular action and a\r\n" + 
						"possible bonus action.\n"
						+ "Once you use this feature, you must finish a short or\r\n" + 
						"long rest before you can use it again. Starting at 17th\r\n" + 
						"level, you can use it twice before a rest, but only once on\r\n" + 
						"the same turn.\n\n";
			}
			else if(point == 3){
				//path
				if(subC.equals("champion")){
					descr += "Improved Critical. \nBeginning when you choose this archetype at 3rd\r\n" + 
							"level, your weapon attacks score a critical hit on a\r\n" + 
							"roll of 19 or 20.\n\n";
				}
				else if(subC.equals("battle master")){
					descr += "Combat Superiority. \nWhen you choose this archetype at 3rd level, you\r\n" + 
							"learn maneuvers that are fueled by special dice called" + 
							"superiority dice.\n\n" +  
							"Superiority Dice. \nYou have four superiority dice,\r\n" + 
							"which are d8s. A superiority die is expended when you\r\n" + 
							"use it. You regain all of your expended superiority dice\r\n" + 
							"when you finish a short or long rest.\r\n" + 
							"You gain another superiority die at 7th level and one\r\n" + 
							"more at 15th level.\n\n" + 
							"Saving Throws. \nSome of your maneuvers require\r\n" + 
							"your target to make a saving throw to resist the\r\n" + 
							"maneuver’s effects. The saving throw DC is calculated\r\n" + 
							"as follows:\r\n" + 
							"Maneuver save DC = 8 + your proficiency bonus +\r\n" + 
							"your Strength or Dexterity modifier (your choice)\n\n"
							+ "Student of War. \nAt 3rd level, you gain proficiency with one type of\r\n" + 
							"artisan’s tools of your choice.\n"
							+ "Maneuvers. \nYou learn three maneuvers of your\r\n" + 
							"choice, which are detailed under “Maneuvers” below.\r\n" + 
							"Many maneuvers enhance an attack in some way. You\r\n" + 
							"can use only one maneuver per attack.\r\n" + 
							"You learn two additional maneuvers of your choice\r\n" + 
							"at 7th, 10th, and 15th level. Each time you learn new\r\n" + 
							"maneuvers, you can also replace one maneuver you\r\n" + 
							"know with a different one.\n\n";
					@SuppressWarnings("resource")
					Scanner list = new Scanner(System.in);
					System.out.println("Would you like a list of the maneuvers?");
					String nyeh = list.nextLine().toLowerCase();
					if(nyeh.equals("yes"))
					{
						descr+= "The Maneuvers are as follows:\n"
							+ "Commander’s Strike. \nWhen you take the Attack\r\n" + 
							"action on your turn, you can forgo one of your attacks\r\n" + 
							"and use a bonus action to direct one of your companions\r\n" + 
							"to strike. When you do so, choose a friendly creature\r\n" + 
							"who can see or hear you and expend one superiority die.\r\n" + 
							"That creature can immediately use its reaction to make\r\n" + 
							"one weapon attack, adding the superiority die to the\r\n" + 
							"attack’s damage roll.\n\n" + 
							"Disarming Attack. \nWhen you hit a creature with a\r\n" + 
							"weapon attack, you can expend one superiority die to\r\n" + 
							"attempt to disarm the target, forcing it to drop one item\r\n" + 
							"of your choice that it’s holding. You add the superiority\r\n" + 
							"die to the attack’s damage roll, and the target must\r\n" + 
							"make a Strength saving throw. On a failed save, it drops\r\n" + 
							"the object you choose. The object lands at its feet.\n\n" + 
							"Distracting Strike. \nWhen you hit a creature with a\r\n" + 
							"weapon attack, you can expend one superiority die to\r\n" + 
							"distract the creature, giving your allies an opening. You\r\n" + 
							"add the superiority die to the attack’s damage roll. The\r\n" + 
							"next attack roll against the target by an attacker other\r\n" + 
							"than you has advantage if the attack is made before the\r\n" + 
							"start of your next turn.\n\n" + 
							"Evasive Footwork. \nWhen you move, you can expend\r\n" + 
							"one superiority die, rolling the die and adding the\r\n" + 
							"number rolled to your AC until you stop moving.\n\n" + 
							"Feinting Attack. \nYou can expend one superiority die\r\n" + 
							"and use a bonus action on your turn to feint, choosing\r\n" + 
							"one creature within 5 feet of you as your target. You\r\n" + 
							"have advantage on your next attack roll against that\r\n" + 
							"creature. If that attack hits, add the superiority die to the\r\n" + 
							"attack’s damage roll.\n\n" + 
							"Goading Attack. \nWhen you hit a creature with a\r\n" + 
							"weapon attack, you can expend one superiority die to\r\n" + 
							"attempt to goad the target into attacking you. You add\r\n" + 
							"the superiority die to the attack’s damage roll, and\r\n" + 
							"the target must make a W isdom saving throw. On a\r\n" + 
							"failed save, the target has disadvantage on all attack\r\n" + 
							"rolls against targets other than you until the end of\r\n" + 
							"your next turn.\n\n" + 
							"Lunging Attack. \nWhen you make a melee weapon\r\n" + 
							"attack on your turn, you can expend one superiority die\r\n" + 
							"to increase your reach for that attack by 5 feet. If you hit,\r\n" + 
							"you add the superiority die to the attack’s damage roll.\n\n"
							+ "Maneuvering Attack. \nWhen you hit a creature with\r\n" + 
							"a weapon attack, you can expend one superiority\r\n" + 
							"die to maneuver one of your comrades into a more\r\n" + 
							"advantageous position. You add the superiority die to the\r\n" + 
							"attack’s damage roll, and you choose a friendly creature\r\n" + 
							"who can see or hear you. That creature can use its\r\n" + 
							"reaction to move up to half its speed without provoking\r\n" + 
							"opportunity attacks from the target of your attack.\n\n" + 
							"Menacing Attack. \nWhen you hit a creature with a\r\n" + 
							"weapon attack, you can expend one superiority die to\r\n" + 
							"attempt to frighten the target. You add the superiority\r\n" + 
							"die to the attack’s damage roll, and the target must\r\n" + 
							"make a W isdom saving throw. On a failed save, it is\r\n" + 
							"frightened of you until the end of your next turn.\n\n" + 
							"Parry. \nWhen another creature damages you with a\r\n" + 
							"melee attack, you can use your reaction and expend one\r\n" + 
							"superiority die to reduce the damage by the number you\r\n" + 
							"roll on your superiority die + your Dexterity modifier.\n\n" + 
							"Precision Attack. \nWhen you make a weapon attack\r\n" + 
							"roll against a creature, you can expend one superiority\r\n" + 
							"die to add it to the roll. You can use this maneuver\r\n" + 
							"before or after making the attack roll, but before any\r\n" + 
							"effects of the attack are applied.\n\n" + 
							"Pushing Attack. \nWhen you hit a creature with\r\n" + 
							"a weapon attack, you can expend one superiority\r\n" + 
							"die to attempt to drive the target back. You add the\r\n" + 
							"superiority die to the attack's damage roll, and if the\r\n" + 
							"target is Large or smaller, it must make a Strength\r\n" + 
							"saving throw. On a failed save, you push the target up\r\n" + 
							"to 15 feet away from you.\n\n" + 
							"Rally. \nOn your turn, you can use a bonus action and\r\n" + 
							"expend one superiority die to bolster the resolve of one\r\n" + 
							"of your companions. When you do so, choose a friendly\r\n" + 
							"creature w ho can see or hear you. That creature gains\r\n" + 
							"temporary hit points equal to the superiority die roll +\r\n" + 
							"your Charisma modifier.\n\n" + 
							"Riposte. \nWhen a creature misses you with a melee\r\n" + 
							"attack, you can use your reaction and expend one\r\n" + 
							"superiority die to make a melee weapon attack against\r\n" + 
							"the creature. If you hit, you add the superiority die to the\r\n" + 
							"attack's damage roll.\n\n" + 
							"Sweeping Attack. \nWhen you hit a creature with a\r\n" + 
							"melee weapon attack, you can expend one superiority\r\n" + 
							"die to attempt to damage another creature with the\r\n" + 
							"same attack. Choose another creature within 5 feet\r\n" + 
							"of the original target and within your reach. If the\r\n" + 
							"original attack roll w ould hit the second creature, it\r\n" + 
							"takes damage equal to the number you roll on your\r\n" + 
							"superiority die. The damage is of the same type dealt by\r\n" + 
							"the original attack.\n\n" + 
							"Trip Attack. \nWhen you hit a creature with a weapon\r\n" + 
							"attack, you can expend one superiority die to attempt\r\n" + 
							"to knock the target down. You add the superiority die\r\n" + 
							"to the attack’s damage roll, and if the target is Large or\r\n" + 
							"smaller, it must make a Strength saving throw. On a\r\n" + 
							"failed save, you knock the target prone.\n\n";
					}
				}
				else if(subC.equals("eldritch knight")){
					descr += "Spells: You know wizard spells of your choice\n\n"
							+ "Weapon Bond. \nAt 3rd level, you learn a ritual that creates a magical\r\n" + 
							"bond between yourself and one weapon. You perform\r\n" + 
							"the ritual over the course of 1 hour, which can be done\n"
							+ "during a short rest. The weapon must be within your\r\n" + 
							"reach throughout the ritual, at the conclusion of which\r\n" + 
							"you touch the weapon and forge the bond.\r\n" + 
							"Once you have bonded a weapon to yourself, you\r\n" + 
							"can’t be disarmed of that weapon unless you are\r\n" + 
							"incapacitated. If it is on the same plane of existence,\r\n" + 
							"you can summon that weapon as a bonus action on your\r\n" + 
							"turn, causing it to teleport instantly to your hand.\r\n" + 
							"You can have up to two bonded weapons, but can\r\n" + 
							"summon only one at a time with your bonus action.\r\n" + 
							"If you attempt to bond with a third weapon, you must\r\n" + 
							"break the bond with one of the other two.\n\n";
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
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 7){
				//path
				if(subC.equals("champion")){
					descr += "Remarkable Athlete. \nStarting at 7th level, you can add half your proficiency\r\n" + 
							"bonus (round up) to any Strength, Dexterity, or\r\n" + 
							"Constitution check you make that doesn’t already use\r\n" + 
							"your proficiency bonus.\r\n" + 
							"In addition, when you make a running long jump, the\r\n" + 
							"distance you can cover increases by a number of feet\r\n" + 
							"equal to your Strength modifier.\n\n";
				}
				else if(subC.equals("battle master")){
					descr += "Know Your Enemy. \nStarting at 7th level, if you spend at least 1 minute\r\n" + 
							"observing or interacting with another creature outside\r\n" + 
							"combat, you can learn certain information about its\r\n" + 
							"capabilities compared to your own. The DM tells you if\r\n" + 
							"the creature is your equal, superior, or inferior in regard\r\n" + 
							"to two of the following characteristics of your choice:\r\n"
							+ "• Strength score\r\n" + 
							"• Dexterity score\r\n" + 
							"• Constitution score\r\n" + 
							"• Armor Class\r\n" + 
							"• Current hit points\r\n" + 
							"• Total class levels (if any)\r\n" + 
							"• Fighter class levels (if any)\n\n";
				}
				else if(subC.equals("eldritch knight")){
					descr += "War Magic. \nBeginning at 7th level, when you use your action to\r\n" + 
							"cast a cantrip, you can make one weapon attack as a\r\n" + 
							"bonus action.\n\n";
				}
			}
			else if(point == 8){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 9){
				descr += "Indomitable. \nBeginning at 9th level, you can reroll a saving throw that\r\n" + 
						"you fail. If you do so, you must use the new roll, and you\r\n" + 
						"can’t use this feature again until you finish a long rest.\n\n";
			}
			else if(point == 10){
				//path
				if(subC.equals("champion")){ 
					descr += "Additional Fighting Style. \nAt 10th level, you can choose a second option from the\r\n" + 
							"Fighting Style class feature.\n\n";
				}
				else if(subC.equals("battle master")){
					descr += "Improved Combat Superiority. \nAt 10th level, your superiority "
							+ "dice turn into d10s.\n\n";
				}
				else if(subC.equals("eldritch knight")){
					descr += "Eldritch Strike. \nAt 10th level, you learn how to make your weapon\r\n" + 
							"strikes undercut a creature’s resistance to your spells.\r\n" + 
							"When you hit a creature with a weapon attack, that\r\n" + 
							"creature has disadvantage on the next saving throw\r\n" + 
							"it makes against a spell you cast before the end of\r\n" + 
							"your next turn.\n\n";
				}
			}
			else if(point == 11){
				descr += "Extra Attack (Override). \nThe number of attacks increases to 3.\n\n";
			}
			else if(point == 12){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 13){ 
				descr += "Indomitable (Override). \nYou can use it twice between "
					+ "long rests.\n\n";
			}
			else if(point == 14){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 15){
				//path
				if(subC.equals("champion")){
					descr += "Superior Critical. \nStarting at 15th level, your weapon attacks score a\r\n" + 
							"critical hit on a roll of 18-20.\n\n";
				}
				else if(subC.equals("battle master")){
					descr += "Relentless. \nStarting at 15th level, when you roll initiative and\r\n" + 
							"have no superiority dice remaining, you regain 1\r\n" + 
							"superiority die.\n\n";
				}
				else if(subC.equals("eldritch knight")){
					descr += "Arcane Charge. \nAt 15th level, you gain the ability to teleport up to 30\r\n" + 
							"feet to an unoccupied space you can see when you use\r\n" + 
							"your Action Surge. You can teleport before or after the\r\n" + 
							"additional action.\n\n";
				}
			}
			else if(point == 16){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 17){
				descr += "Indomitable (Override). \nYou can use it 3 times between long rests.\n\n";
			}
			else if(point == 18){
				//path
				if(subC.equals("champion")){
					descr += "Survivor. \nAt 18th level, you attain the pinnacle of resilience in\r\n" + 
							"battle. At the start of each of your turns, you regain hit\r\n" + 
							"points equal to 5 + your Constitution modifier if you\r\n" + 
							"have no more than half of your hit points left. You don’t\r\n" + 
							"gain this benefit if you have 0 hit points.\n\n";
				}
				else if(subC.equals("battle master")){
					descr += "Improved Combat Superiority (Override). \nAt 18th level, your superiority "
							+ "dice turn into d12s.\n\n";
				}
				else if(subC.equals("eldritch knight")){
					descr += "Improved War Magic. \nStarting at 18th level, when you use your action to\r\n" + 
							"cast a spell, you can make one weapon attack as a\r\n" + 
							"bonus action.\n\n";
				}
			}
			else if(point == 19){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 20){
				descr += "Extra Attack (Override). \nThe number of attacks increases to 4.\n\n";
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

	static public String getSpc(int level, int mod, String subC, String style1)
	{
		String spc = "";
		if(subC.equals("eldritch knight"))
		{
			for(int point = 0; point <= level; point ++)
			{
				if(point == 3){
					spc = "Cantrips Known: 2\n"
							+ "Spells Known: 3\n"
							+ "1st: 2";
				}
				else if(point == 4){
					spc = "Cantrips Known: 2\n"
							+ "Spells Known: 4\n"
							+ "1st: 3";
				}
				else if(point == 5){
					spc = "Cantrips Known: 2\n"
							+ "Spells Known: 4\n"
							+ "1st: 3";
				}
				else if(point == 6){
					spc = "Cantrips Known: 2\n"
							+ "Spells Known: 4\n"
							+ "1st: 3";
				}
				else if(point == 7){
					spc = "Cantrips Known: 2\n"
							+ "Spells Known: 5\n"
							+ "1st: 4\n"
							+ "2nd: 2";
				}
				else if(point == 8){
					spc = "Cantrips Known: 2\n"
							+ "Spells Known: 6\n"
							+ "1st: 4\n"
							+ "2nd: 2";
				}
				else if(point == 9){
					spc = "Cantrips Known: 2\n"
							+ "Spells Known: 6\n"
							+ "1st: 4\n"
							+ "2nd: 2";
				}
				else if(point == 10){
					spc = "Cantrips Known: 3\n"
							+ "Spells Known: 7\n"
							+ "1st: 4\n"
							+ "2nd: 3";
				}
				else if(point == 11){
					spc = "Cantrips Known: 3\n"
							+ "Spells Known: 8\n"
							+ "1st: 4\n"
							+ "2nd: 3";
				}
				else if(point == 12){
					spc = "Cantrips Known: 3\n"
							+ "Spells Known: 8\n"
							+ "1st: 4\n"
							+ "2nd: 3";
				}
				else if(point == 13){
					spc = "Cantrips Known: 3\n"
							+ "Spells Known: 9\n"
							+ "1st: 4\n"
							+ "2nd: 3\n"
							+ "3rd: 2";
				}
				else if(point == 14){
					spc = "Cantrips Known: 3\n"
							+ "Spells Known: 10\n"
							+ "1st: 4\n"
							+ "2nd: 3\n"
							+ "3rd: 2";
				}
				else if(point == 15){
					spc = "Cantrips Known: 3\n"
							+ "Spells Known: 10\n"
							+ "1st: 4\n"
							+ "2nd: 3\n"
							+ "3rd: 2";
				}
				else if(point == 16){
					spc = "Cantrips Known: 3\n"
							+ "Spells Known: 11\n"
							+ "1st: 4\n"
							+ "2nd: 3\n"
							+ "3rd: 3";
				}
				else if(point == 17){
					spc = "Cantrips Known: 3\n"
							+ "Spells Known: 11\n"
							+ "1st: 4\n"
							+ "2nd: 3\n"
							+ "3rd: 3";
				}
				else if(point == 18){
					spc = "Cantrips Known: 3\n"
							+ "Spells Known: 11\n"
							+ "1st: 4\n"
							+ "2nd: 3\n"
							+ "3rd: 3";
				}
				else if(point == 19){
					spc = "Cantrips Known: 3\n"
							+ "Spells Known: 12\n"
							+ "1st: 4\n"
							+ "2nd: 3\n"
							+ "3rd: 3\n"
							+ "4th: 1";
				}
				else if(point == 20){
					spc = "Cantrips Known: 3\n"
							+ "Spells Known: 13\n"
							+ "1st: 4\n"
							+ "2nd: 3\n"
							+ "3rd: 3\n"
							+ "4th: 1";
				}
			}
			spc += "\n\nSpell Save DC: " + (8 + Integer.parseInt(getProf(level)) + mod)
				+ "\nSpell Attack Modifier: " + (Integer.parseInt(getProf(level)) + mod);
		}
		
		//Specialty for second style if Champion
		if(subC.equals("champion") && level >= 10)
		{
			spc = "Additional Fighting Style: ";
			@SuppressWarnings("resource")
			Scanner list = new Scanner(System.in);
			System.out.println("Choose a second fighting style: archery, defense, dueling, great weapon, "
					+ "protection, or two weapon\n"
					+ "The second fighting style cannot be the same as the first or previous styles.");
			String style = list.nextLine().toLowerCase();
			
			if(style.equals("archery") && !(style1.equals(style))) {
				spc += "Archery \nYou gain a +2 bonus to attack rolls you make with\r\n" + 
						"ranged weapons.\n";
			}
			else if(style.equals("defense") && !(style1.equals(style))){
				spc += "Defense \nWhile you are wearing armor, you gain a +1 bonus to AC.\n";
			}
			else if(style.equals("dueling") && !(style1.equals(style))){
				spc += "Dueling \nWhen you are wielding a melee weapon in one hand and\r\n" + 
						"no other weapons, you"
						+ " gain a +2 bonus to damage rolls\r\n" + 
						"with that weapon.\n";
			}
			else if(style.equals("great weapon") && !(style1.equals(style))){
				spc += "Great Weapon \nWhen you roll a 1 or 2 on a damage die for an attack you\r\n" + 
						"make with a melee weapon that you are wielding with\r\n" + 
						"two hands, you can reroll the die and must use the new\r\n" + 
						"roll, even if the new roll is a 1 or a 2. The weapon must\r\n" + 
						"have the two-handed or versatile property for you to gain\r\n" + 
						"this benefit.\n";
			}
			else if(style.equals("protection") && !(style1.equals(style))){
				spc += "Protection \nWhen a creature you can see attacks a target other\r\n" + 
						"than you that is within 5 feet of you, you can use your\r\n" + 
						"reaction to impose disadvantage on the attack roll. You\r\n" + 
						"must be wielding a shield.\n";
			}
			else if(style.equals("dual wield") && !(style1.equals(style))){
				spc += "Dual Wield \nWhen you engage in two-weapon fighting, you can add\r\n" + 
						"your ability modifier to the damage of the second attack.\n";
			}
		}
		
		return spc;
	}
}
