import java.util.ArrayList;

public class bard {

	//page 45
	static public ArrayList<Integer> bardStats(ArrayList<Integer> stats)
	{
		ArrayList<Integer> newStats = new ArrayList<Integer>(6);
		
		z.sort(stats);
		//strength
		newStats.add(stats.get(3));
		//dex
		newStats.add(stats.get(1));
		//const
		newStats.add(stats.get(2));
		//intel
		newStats.add(stats.get(5));
		//wisdom
		newStats.add(stats.get(4));
		//charisma
		newStats.add(stats.get(0));
		
		return newStats;
	}
	
	static public String getBardDescr(String subC, int level)
	{
		String descr = "";
		descr = "Proficiencies:\n"
				+ "Armor: Light armor, medium armor, shields\r\n" + 
				"Weapons: Simple weapons, martial weapons\r\n" + 
				"Tools: None\r\n" + 
				"Skills: Choose two from Animal Handling, Athletics, " + 
				"Intimidation, Nature, Perception, and Survival\n\n";
		
		for(int point = 1; point <= level; point++)
		{
			if(point == 1)
			{
				descr +="Spellcasting. \nYou have learned to untangle and reshape the fabric of\r\n" + 
						"reality in harmony with your wishes and music. Your\r\n" + 
						"spells are part of your vast repertoire, magic that you\r\n" + 
						"can tune to different situations.\n"
						+ "You can cast any bard spell you know as a ritual if that\r\n" + 
						"spell has the ritual tag.\n"
						+ "You can use a musical instrument (found in chapter 5)\r\n" + 
						"as a spellcasting focus for your bard spells.\n\n"
						+ "Bardic Inspiration. You can inspire others through stirring words or music.\r\n" + 
						"To do so, you use a bonus action on your turn to choose\r\n" + 
						"one creature other than yourself within 60 feet of you\r\n" + 
						"who can hear you. That creature gains one Bardic\r\n" + 
						"Inspiration die, a d6.\r\n" + 
						"Once within the next 10 minutes, the creature can roll\r\n" + 
						"the die and add the number rolled to one ability check,\r\n" + 
						"attack roll, or saving throw it makes. The creature can\r\n" + 
						"wait until after it rolls the d20 before deciding to use the\r\n" + 
						"Bardic Inspiration die, but must decide before the DM\r\n" + 
						"says whether the roll succeeds or fails. Once the Bardic\r\n" + 
						"Inspiration die is rolled, it is lost. A creature can have\r\n" + 
						"only one Bardic Inspiration die at a time.\n"
						+ "You can use this feature a number of times equal\r\n" + 
						"to your Charisma modifier (a minimum of once). You\r\n" + 
						"regain any expended uses when you finish a long rest.\n\n";
			}
			else if(point == 2)
			{
				descr +="Jack of All Trades. \nStarting at 2nd level, you can add half your proficiency\r\n" + 
						"bonus, rounded down, to any ability check you make that\r\n" + 
						"doesn’t already include your proficiency bonus.\n\n"
						+ "Song of Rest. Beginning at 2nd level, you can use soothing music or\r\n" + 
						"oration to help revitalize your wounded allies during\r\n" + 
						"a short rest. If you or any friendly creatures w ho can\r\n" + 
						"hear your performance regain hit points at the end of\r\n" + 
						"the short rest, each of those creatures regains an extra\r\n" + 
						"1d6 hit points.\n\n";
			}
			else if(point == 3)
			{//path
				descr +="Expertise. \nAt 3rd level, choose two of your skill proficiencies. Your\r\n" + 
						"proficiency bonus is doubled for any ability check you\r\n" + 
						"make that uses either of the chosen proficiencies.\n\n";
				
				if(subC.equals("lore"))
				{
					descr +="Bonus Proficiencies. \nWhen you join the College of Lore at 3rd level, you gain\r\n" + 
							"proficiency with three skills of your choice.\n\n"
							+ "Cutting Words. \nYou learn how to use your wit to\r\n" + 
							"distract, confuse, and otherwise sap the confidence and\r\n" + 
							"competence of others. When a creature that you can\r\n" + 
							"see within 60 feet of you makes an attack roll, an ability\r\n" + 
							"check, or a damage roll, you can use your reaction to\r\n" + 
							"expend one of your uses of Bardic Inspiration, rolling\r\n" + 
							"a Bardic Inspiration die and subtracting the number\r\n" + 
							"rolled from the creature’s roll. You can choose to use\r\n" + 
							"this feature after the creature makes its roll, but before\r\n" + 
							"the DM determines whether the attack roll or ability\n" +
							"check succeeds or fails, or before the creature deals its\r\n" + 
							"damage. The creature is immune if it can’t hear you or if\r\n" + 
							"it’s immune to being charmed.\n\n";
				}
				else if(subC.equals("valor"))
				{
					descr +="Bonus Proficiencies. \nWhen you join the College of Valor at 3rd level, you\r\n" + 
							"gain proficiency with medium armor, shields, and\r\n" + 
							"martial weapons.\n\n"
							+ "Combat Inspiration. \nyou learn to inspire others in battle.\r\n" + 
							"A creature that has a Bardic Inspiration die from you\r\n" + 
							"can roll that die and add the number rolled to a weapon\r\n" + 
							"damage roll it just made. Alternatively, when an attack\r\n" + 
							"roll is made against the creature, it can use its reaction\r\n" + 
							"to roll the Bardic Inspiration die and add the number\r\n" + 
							"rolled to its AC against that attack, after seeing the roll\r\n"
							+ "but before knowing whether it hits or misses\n\n";
				}
			}
			else if(point == 4)
			{
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 5)
			{
				descr +="Bardic Inspiration (Override). \nDie changes to a d8.\n\n"
						+ "Font of Inspiration. \nBeginning when you reach 5th level, you regain all of\r\n" + 
						"your expended uses of Bardic Inspiration when you\r\n" + 
						"finish a short or long rest.\n\n";
			}
			else if(point == 6)
			{//path
				descr +="Countercharm. \nAt 6th level, you gain the ability to use musical notes or\r\n" + 
						"words of power to disrupt mind-influencing effects. As\r\n" + 
						"an action, you can start a performance that lasts until\r\n" + 
						"the end of your next turn. During that time, you and any\r\n" + 
						"friendly creatures within 30 feet of you have advantage\r\n" + 
						"on saving throws against being frightened or charmed.\r\n" + 
						"A creature must be able to hear you to gain this benefit.\r\n" + 
						"The performance ends early if you are incapacitated or\r\n" + 
						"silenced or if you voluntarily end it (no action required).\n\n";
				
				if(subC.equals("lore"))
				{
					descr +="Additional Magical Secrets. \nAt 6th level, you learn two spells of your choice from any\r\n" + 
							"class. A spell you choose must be of a level you can cast,\r\n" + 
							"as shown on the Bard table, or a cantrip. The chosen\r\n" + 
							"spells count as bard spells for you but don’t count\r\n" + 
							"against the number of bard spells you know.\n\n";
				}
				else if(subC.equals("valor"))
				{
					descr +="Extra Attack. \nStarting at 6th level, you can attack twice, instead of\r\n" + 
							"once, whenever you take the Attack action on your turn.\n\n";
				}
			}	
			else if(point == 8)
			{
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 9)
			{
				descr +="Song of Rest (Override). \nDie changes to d8.\n\n";
			}
			else if(point == 10)
			{
				descr +="Bardic Inspiration (Overide). \nDie becomes d10.\n\n"
						+ "Expertise. \nAt 10th level, you can choose another two skill\r\n" + 
						"proficiencies to gain this benefit. See level 3.\n\n"
						+ "Magical Secrets. \nBy 10th level, you have plundered magical knowledge\r\n" + 
						"from a w ide spectrum of disciplines. Choose two spells\r\n" + 
						"from any class, including this one. A spell you choose\r\n" + 
						"must be of a level you can cast, as shown on the Bard\r\n" + 
						"table, or a cantrip.\r\n" + 
						"The chosen spells count as bard spells for you and are\r\n" + 
						"included in the number in the Spells Known column of\r\n" + 
						"the Bard table.";
			}
			else if(point == 12)
			{
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 13)
			{
				descr +="Song of Rest (Override). \nDie changes to d10.\n\n";
			}
			else if(point == 14)
			{//path
				descr +="Magical Secrets. \nYou learn two additional spells from any class(total 4).\n\n";
				
				if(subC.equals("lore"))
				{
					descr +="Peerless Skill. \nStarting at 14th level, when you make an ability check,\r\n" + 
							"you can expend one use of Bardic Inspiration. Roll a\r\n" + 
							"Bardic Inspiration die and add the number rolled to\r\n" + 
							"your ability check. You can choose to do so after you roil\r\n" + 
							"the die for the ability check, but before the DM tells you\r\n" + 
							"whether you succeed or fail.\n\n";
				}
				else if(subC.equals("valor"))
				{
					descr +="Battle Magic. \nAt 14th level, you have mastered the art of weaving\r\n" + 
							"spellcasting and weapon use into a single harmonious\r\n" + 
							"act. When you use your action to cast a bard spell, you\r\n" + 
							"can make one weapon attack as a bonus action.\n\n";
				}
			}
			else if(point == 15)
			{
				descr +="Bardic Inspiration (Override). \nDie changes to d12.\n\n";
			}
			else if(point == 16)
			{
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 17)
			{
				descr +="Song of Rest (Override). \nDie changes to a d12.\n\n";
			}
			else if(point == 18)
			{
				descr +="Magical Secrets. \nYou learn two additional spells from any class(total 6)\n\n";
			}
			else if(point == 19)
			{
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 20)
			{
				descr +="Superior Inspiration. \nAt 20th level, when you roll initiative and have no uses\r\n" + 
						"of Bardic Inspiration left, you regain one use.\n\n";
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
	
	static public String getSpc(int level, int ch)
	{
		String spc = "";
		for(int point = 1; point <= level; point++)
		{
			if(point == 1)
			{
				spc = "Cantrips Known: 2\nSpells Known: 4\n1st: 2";
			}
			else if(point == 2)
			{
				spc = "Cantrips Known: 2\nSpells Known: 5\n1st: 3";
			}
			else if(point == 3)
			{
				spc = "Cantrips Known: 2\nSpells Known: 6\n1st: 4\n2nd: 2";
			}
			else if(point == 4)
			{
				spc = "Cantrips Known: 3\nSpells Known: 7\n1st: 4\n2nd: 3";
			}
			else if(point == 5)
			{
				spc = "Cantrips Known: 3\nSpells Known: 8\n1st: 4\n2nd: 3\n3rd: 2";
			}
			else if(point == 6)
			{
				spc = "Cantrips Known: 3\nSpells Known: 9\n1st: 4\n2nd: 3\n3rd: 3";
			}	
			else if(point == 7)
			{
				spc = "Cantrips Known: 3\nSpells Known: 10\n1st: 4\n2nd: 3\n3rd: 3\n4th: 1";
			}
			else if(point == 8)
			{
				spc = "Cantrips Known: 3\nSpells Known: 11\n1st: 4\n2nd: 3\n3rd: 3\n4th: 2";
			}
			else if(point == 9)
			{
				spc = "Cantrips Known: 3\nSpells Known: 12\n1st: 4\n2nd: 3\n3rd: 3\n4th: 3\n5th: 1";
			}
			else if(point == 10)
			{
				spc = "Cantrips Known: 4\n"
						+ "Spells Known: 14\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2";
			}
			else if(point == 11)
			{
				spc = "Cantrips Known: 4\n"
						+ "Spells Known: 15\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1";
			}
			else if(point == 12)
			{
				spc = "Cantrips Known: 4\n"
						+ "Spells Known: 15\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1";
			}
			else if(point == 13)
			{
				spc = "Cantrips Known: 4\n"
						+ "Spells Known: 16\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1\n"
						+ "7th: 1";
			}
			else if(point == 14)
			{
				spc = "Cantrips Known: 4\n"
						+ "Spells Known: 18\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1\n"
						+ "7th: 1";
			}
			else if(point == 15)
			{
				spc = "Cantrips Known: 4\n"
						+ "Spells Known: 19\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1\n"
						+ "7th: 1\n"
						+ "8th: 1";
			}
			else if(point == 16)
			{
				spc = "Cantrips Known: 4\n"
						+ "Spells Known: 19\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1\n"
						+ "7th: 1\n"
						+ "8th: 1";
			}
			else if(point == 17)
			{
				spc = "Cantrips Known: 4\n"
						+ "Spells Known: 20\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1\n"
						+ "7th: 1\n"
						+ "8th: 1\n"
						+ "9th: 1";
			}
			else if(point == 18)
			{
				spc = "Cantrips Known: 4\n"
						+ "Spells Known: 22\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 3\n"
						+ "6th: 1\n"
						+ "7th: 1\n"
						+ "8th: 1\n"
						+ "9th: 1";
			}
			else if(point == 19)
			{
				spc = "Cantrips Known: 4\n"
						+ "Spells Known: 22\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 3\n"
						+ "6th: 2\n"
						+ "7th: 1\n"
						+ "8th: 1\n"
						+ "9th: 1";
			}
			else if(point == 20)
			{
				spc = "Cantrips Known: 4\n"
						+ "Spells Known: 22\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 3\n"
						+ "6th: 2\n"
						+ "7th: 2\n"
						+ "8th: 1\n"
						+ "9th: 1";
			}
		}
		spc += "\n\nSpell Save DC: " + (8 + Integer.parseInt(getProf(level)) + ch)
				+ "\nSpell Attack Modifier: " + (Integer.parseInt(getProf(level)) + ch);
		return spc;
	}
}
