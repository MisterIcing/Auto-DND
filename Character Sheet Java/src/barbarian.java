import java.util.ArrayList;

public class barbarian {

	//page 49
	static public ArrayList<Integer> barbarianStats(ArrayList<Integer> stats)
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
		newStats.add(stats.get(3));
		//charisma
		newStats.add(stats.get(4));
		
		return newStats;
	}
	
	static public String getBarbDescr(String subC, int level)
	{
		String descr = "";
		descr ="Proficiencies:\n"
					+ "Armor: Light armor, medium armor, shields\r\n" + 
					"Weapons: Simple weapons, martial weapons\r\n" + 
					"Tools: None\r\n" + 
					"Skills: Choose two from Animal Handling, Athletics, " + 
					"Intimidation, Nature, Perception, and Survival\n\n";
		
		for(int point = 1; point <= level; point++)
		{
			if(point == 1)
			{
				descr +="Rage. \n" + 
						"In battle, you fight with primal ferocity. On your turn,\r\n" + 
						"you can enter a rage as a bonus action.\r\n" + 
						"While raging, you gain the following benefits if you\r\n" + 
						"aren't w earing heavy armor:\r\n" + 
						"> You have advantage on Strength checks and Strength\r\n" + 
						"saving throws.\r\n" + 
						"> When you make a melee weapon attack using\r\n" + 
						"Strength, you gain a bonus to the damage roll that\r\n" + 
						"increases as you gain levels as a barbarian, as shown\r\n" + 
						"in the Rage Damage column of the Barbarian table.\r\n" + 
						"> You have resistance to bludgeoning, piercing, and\r\n" + 
						"slashing damage.\r\n" + 
						"If you are able to cast spells, you can't cast them or\r\n" + 
						"concentrate on them while raging.\r\n" + 
						"Your rage lasts for 1 minute. It ends early if you are\r\n" + 
						"knocked unconscious or if your turn ends and you\r\n" + 
						"haven't attacked a hostile creature since your last turn\r\n" + 
						"or taken damage since then. You can also end your rage\r\n" + 
						"on your turn as a bonus action.\r\n" + 
						"Once you have raged the number of times shown\r\n" + 
						"for your barbarian level in the Rages column of the\r\n" + 
						"Barbarian table, you must finish a long rest before you\r\n" + 
						"can rage again.\r\n\n" + 
						"Unarmored Defense. " + 
						"While you are not wearing any armor, your Armor Class\r\n" + 
						"equals 10 + your Dexterity m odifier + your Constitution\r\n" + 
						"modifier. You can use a shield and still gain this benefit.\n\n";
			}
			else if(point == 2)
			{
				descr +="Reckless Attack. \nStarting at 2nd level, you can throw aside all concern\r\n" + 
						"for defense to attack with fierce desperation. When\r\n" + 
						"you make your first attack on your turn, you can decide\r\n" + 
						"to attack recklessly. Doing so gives you advantage on\r\n" + 
						"melee weapon attack rolls using Strength during this\r\n" + 
						"turn, but attack rolls against you have advantage until\r\n" + 
						"your next turn.\n\n" + 
						"Danger Sense. At 2nd level, you gain an uncanny sense of when things\r\n" + 
						"nearby aren't as they should be, giving you an edge\r\n" + 
						"when you dodge away from danger.\r\n" + 
						"You have advantage on Dexterity saving throws\r\n" + 
						"against effects that you can see, such as traps and spells.\r\n" + 
						"To gain this benefit, you can't be blinded, deafened, or\r\n" + 
						"incapacitated.\n\n";
			}
			else if(point == 3)//path
			{
				descr +="Primal Path. \nAt 3rd level, you choose a path that shapes the nature of\r\n" + 
						"your rage. Choose the Path of the Berserker or the Path\r\n" + 
						"of the Totem Warrior, both detailed at the end of the\r\n" + 
						"class description. Your choice grants you features at 3rd\r\n" + 
						"level and again at 6th, 10th, and 14th levels.\n\n";
				
				if(subC.equals("berserker"))
				{
					descr += "Frenzy. \nStarting when you choose this path at 3rd level, you\r\n" + 
							"can go into a frenzy when you rage. If you do so, for\r\n" + 
							"the duration of your rage you can make a single melee\r\n" + 
							"weapon attack as a bonus action on each of your turns\r\n" + 
							"after this one. When your rage ends, you suffer one level\r\n" + 
							"of exhaustion.\n\n";
				}
				else if(subC.equals("totem warrior"))
				{
					descr += "Spirit Seeker. \nYou gain the ability to cast the beast\r\n" + 
							"sense and speak with animals spells, but only as rituals,\r\n" + 
							"as described in chapter 10.\n\n"
							+ "Totem Spirit. \nAt 3rd level, when you adopt this path, you choose a\r\n" + 
							"totem spirit and gain its feature. You must make or\r\n" + 
							"acquire a physical totem object- an amulet or similar\r\n" + 
							"adornment'that incorporates fur or feathers, claws,\r\n" + 
							"teeth, or b ones of the totem animal. At your option, you\r\n" + 
							"also gain minor physical attributes that are reminiscent\r\n" + 
							"of your totem spirit. For example, if you have a bear\r\n" + 
							"totem spirit, you might be unusually hairy and thickskinned,\r\n" + 
							"or if your totem is the eagle, your eyes turn\r\n" + 
							"bright yellow.\n"
							+ "Your totem animal might be an animal related to those\r\n" + 
							"listed here but more appropriate to your homeland.\r\n" + 
							"For example, you could choose a hawk or vulture in\r\n" + 
							"place of an eagle.\r\n" + 
							"> Bear. While raging, you have resistance to all damage\r\n" + 
							"except psychic damage. The spirit of the bear makes you\r\n" + 
							"tough enough to stand up to any punishment.\r\n" + 
							"> Eagle. While you're raging and aren't wearing\r\n" + 
							"heavy armor, other creatures have disadvantage on\r\n" + 
							"opportunity attack rolls against you, and you can use the\r\n" + 
							"Dash action as a bonus action on your turn. The spirit\r\n" + 
							"of the eagle makes you into a predator w ho can weave\r\n" + 
							"through the fray with ease.\r\n" + 
							"> Wolf, While you're raging, your friends have\r\n" + 
							"advantage on melee attack rolls against any creature\r\n" + 
							"within 5 feet of you that is hostile to you. The spirit of\r\n" + 
							"the wolf makes you a leader of hunters.\n\n";
				}
			}
			else if(point == 4)
			{
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 5)
			{
				descr +="Extra Attack. \nBeginning at 5th level, you can attack twice, instead of\r\n" + 
						"once, whenever you take the Attack action on your turn.\n\n"
						+ "Fast Movement. Starting at 5th level, your speed increases by 10 feet\r\n" + 
						"while you aren't w earing heavy armor.\n\n";
			}
			else if(point == 6)
			{
				if(subC.equals("berserker"))
				{
					descr += "Mindless Rage. \nBeginning at 6th level, you can't be charmed or\r\n" + 
							"frightened while raging. If you are charmed or\r\n" + 
							"frightened when you enter your rage, the effect is\r\n" + 
							"suspended for the duration of the rage.\n\n";
				}
				if(subC.equals("totem warrior"))
				{
					descr += "Aspect of the Beast. \nAt 6th level, you gain a magical benefit based on the\r\n" + 
							"totem animal of your choice. You can choose the same\r\n" + 
							"animal you selected at 3rd level or a different one.\r\n" + 
							"> Bear. You gain the might of a bear. Your carrying\r\n" + 
							"capacity (including maximum load and maximum lift)\r\n" + 
							"is doubled, and you have advantage on Strength checks\r\n" + 
							"made to push, pull, lift, or break objects.\r\n" + 
							"> Eagle. You gain the eyesight of an eagle. You can\r\n" + 
							"see up to 1 mile away with no difficulty, able to discern\r\n" + 
							"even fine details as though looking at something no\r\n" + 
							"more than 100 feet away from you. Additionally, dim\r\n" + 
							"light doesn't impose disadvantage on your Wisdom\r\n" + 
							"(Perception) checks.\r\n" + 
							"> Wolf, You gain the hunting sensibilities of a wolf. You\r\n" + 
							"can track other creatures while traveling at a fast pace,\r\n" + 
							"and you can move stealthily while traveling at a normal\r\n" + 
							"pace (see chapter 8 for rules on travel pace).\n\n";
				}
			}	
			else if(point == 7)
			{
				descr +="Feral Instinct. \nBy 7th level, your instincts are so honed that you have\r\n" + 
						"advantage on initiative rolls.\r\n" + 
						"Additionally, if you are surprised at the beginning of\r\n" + 
						"combat and aren't incapacitated, you can act normally\r\n" + 
						"on your first turn, but only if you enter your rage before\r\n" + 
						"doing anything else on that turn.\n\n";
			}
			else if(point == 8)
			{
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 9)
			{
				descr +="Brutal Critical. \nBeginning at 9th level, you can roll one(total 2) additional\r\n" + 
						"weapon damage die when determining the extra\r\n" + 
						"damage for a critical hit with a melee attack.\n\n";
			}
			else if(point == 10)
			{
				//Path increase
				if(subC.equals("berserker"))
				{
					descr +="Intimidating Presence. \nsomeone with your menacing presence.\r\n" + 
							"When you do so, choose one creature that you can see\r\n" + 
							"within 30 feet of you. If the creature can see or hear\r\n" + 
							"you, it must succeed on a W isdom saving throw (DC\r\n" + 
							"equal to 8 + your proficiency bonus + your Charisma\r\n" + 
							"modifier) or be frightened of you until the end of your\r\n" + 
							"next turn. On subsequent turns, you can use your action\r\n" + 
							"to extend the duration of this effect on the frightened\n" +
							"creature until the end of your next turn. This effect ends\r\n" + 
							"if the creature ends its turn out of line of sight or more\r\n" + 
							"than 60 feet away from you.\r\n" + 
							"If the creature succeeds on its saving throw, you can't\r\n" + 
							"use this feature on that creature again for 24 hours.\n\n";
				}
				if(subC.equals("totem warrior"))
				{
					descr +="Spirit Walker. \nAt 10th level, you can cast the commune with nature\r\n" + 
							"spell, but only as a ritual. When you do so, a spiritual\r\n" + 
							"version of one of the animals you chose for Totem Spirit\r\n" + 
							"or Aspect of the Beast appears to you to convey the\r\n" + 
							"information you seek.\n\n";
				}
			}
			else if(point == 11)
			{
				descr +="Relentless Rage. \nStarting at 11th level, your rage can keep you fighting\r\n" + 
						"despite grievous w ounds. If you drop to 0 hit points\r\n" + 
						"while you're raging and don't die outright, you can make\r\n" + 
						"a DC 10 Constitution saving throw. If you succeed, you\r\n" + 
						"drop to 1 hit point instead.\r\n" + 
						"Each time you use this feature after the first, the DC\r\n" + 
						"increases by 5. When you finish a short or long rest, the\r\n" + 
						"DC resets to 10.\n\n";
			}
			else if(point == 12)
			{
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 13)
			{
				descr +="Brutal Critical(Override). \nYou can roll two(total 3) additional\r\n" + 
						"weapon damage die when determining the extra\r\n" + 
						"damage for a critical hit with a melee attack.\n\n";
			}
			else if(point == 14)
			{
				//Path increase
				if(subC.equals("berserker"))
				{
					descr += "Retaliation. \nStarting at 14th level, when you take damage from\r\n" + 
							"a creature that is within 5 feet of you. you can use\r\n" + 
							"your reaction to make a melee weapon attack against\r\n" + 
							"that creature.";
				}
				if(subC.equals("totem warrior"))
				{
					descr +="Totemic Attunement. \nAt 14th level, you gain a magical benefit based on a\r\n" + 
							"totem animal of your choice. You can choose the same\r\n" + 
							"animal you selected previously or a different one.\r\n" + 
							"> Bear, While you're raging, any creature within 5 feet\r\n" + 
							"of you that's hostile to you has disadvantage on attack\r\n" + 
							"rolls against targets other than you or another character\r\n" + 
							"with this feature. An enemy is immune to this effect if it\r\n" + 
							"can't see or hear you or if it can't be frightened.\r\n" + 
							"> Eagle. While raging, you have a flying speed equal to\r\n" + 
							"your current walking speed. This benefit works only in\r\n" + 
							"short bursts; you fall if you end your turn in the air and\r\n" + 
							"nothing else is holding you aloft.\r\n" + 
							"> Wolf. While you're raging, you can use a bonus action\r\n" + 
							"on your turn to knock a Large or smaller creature prone\r\n" + 
							"when you hit it with melee w eapon attack.\n\n";
				}
			}
			else if(point == 15)
			{
				descr +="Persistant Rage. \nBeginning at 15th level, your rage is so fierce that\r\n" + 
						"it ends early only if you fall unconscious or if you\r\n" + 
						"choose to end it.\n\n";
			}
			else if(point == 16)
			{
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 17)
			{
				descr +="Brutal Critical(Override). \nYou can roll three(total 4) additional\r\n" + 
						"weapon damage die when determining the extra\r\n" + 
						"damage for a critical hit with a melee attack.\n\n";
			}
			else if(point == 18)
			{
				descr +="Indomitable Might. \nBeginning at 18th level, if your total for a Strength\r\n" + 
						"check is less than your Strength score, you can use that\r\n" + 
						"score in place of the total.\n\n";
			}
			else if(point == 19)
			{
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 20)
			{
				descr +="Primal Champion. \nAt 20th level, you embody the power of the wilds. Your\r\n" + 
						"Strength and Constitution scores increase by 4. Your\r\n" + 
						"maximum for those scores is now 24.(included in total)\n\n";
				
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
	
	static public String getSpc(int level)
	{
		String spc = "";
		for(int point = 1; point <= level; point++)
		{
			if(point == 1)
			{
				spc = "Rages: 2\nRage Damage: +2";
			}
			/*else if(point == 2)
			{
				spc ="\n\n";
			}*/
			else if(point == 3)
			{
				spc = "Rages: 3\nRage Damage: +2";
			}
			/*else if(point == 4)
			{
				spc ="\n\n";
			}
			else if(point == 5)
			{
				spc ="\n\n";
			}*/
			else if(point == 6)
			{
				spc = "Rages: 4\nRage Damage: +2";
			}	
			/*else if(point == 7)
			{
				spc ="\n\n";
			}
			else if(point == 8)
			{
				spc ="\n\n";
			}*/
			else if(point == 9)
			{
				spc = "Rages: 4\nRage Damage: +3";
			}
			/*else if(point == 10)
			{
				spc ="\n\n";
			}
			else if(point == 11)
			{
				spc ="\n\n";
			}*/
			else if(point == 12)
			{
				spc = "Rages: 5\nRage Damage: +3";
			}
			/*else if(point == 13)
			{
				spc ="\n\n";
			}
			else if(point == 14)
			{
				spc ="\n\n";
			}
			else if(point == 15)
			{
				spc ="\n\n";
			}*/
			else if(point == 16)
			{
				spc = "Rages: 5\nRage Damage: +4";;
			}
			else if(point == 17)
			{
				spc = "Rages: 6\nRage Damage: +4";
			}
			/*else if(point == 18)
			{
				spc ="\n\n";
			}
			else if(point == 19)
			{
				spc ="\n\n";
			}*/
			else if(point == 20)
			{
				spc = "Rages: Unlimited\nRage Damage: +4";
			}
			
		}
		return spc;
	}
}