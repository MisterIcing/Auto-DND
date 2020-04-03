import java.util.ArrayList;

public class rogue {
	
	//page 88
	static public ArrayList<Integer> rogueStats(ArrayList<Integer> stats)
	{
		ArrayList<Integer> newStats = new ArrayList<Integer>(6);
		
		z.sort(stats);
		//strength 0
		newStats.add(stats.get(5));
		//dex 1
		newStats.add(stats.get(0));
		//const 2
		newStats.add(stats.get(3));
		//intel 3
		newStats.add(stats.get(1));
		//wisdom 4
		newStats.add(stats.get(4));
		//charisma 5
		newStats.add(stats.get(2));
		
		return newStats;
	}
	
	static public String getRogueDescr(String subC, int level)
	{
		String descr;
		descr = "Proficiencies:\n"
				+ "Armor: Light armor\r\n" + 
				"Weapons: Simple weapons, hand crossbows,\r\n" + 
				"longswords, rapiers, shortswords\r\n" + 
				"Tools: Thieves’ tools\r\n" + 
				"Saving Throws: Dexterity. Intelligence\r\n" + 
				"Skills: Choose four from Acrobatics, Athletics,\r\n" + 
				"Deception. Insight, Intimidation, Investigation,\r\n" + 
				"Perception, Performance. Persuasion, Sleight of\r\n" + 
				"Hand, and Stealth\n\n";
	
		for(int point = 1; point <= level; point++)
		{
			if(point == 1){
				descr += "Expertise. \nAt 1st level, choose two o f your skill proficiencies, or\r\n" + 
						"one o f your skill proficiencies and your proficiency with\r\n" + 
						"thieves’ tools. Your proficiency bonus is doubled for any\r\n" + 
						"ability check you make that uses either o f the chosen\r\n" + 
						"proficiencies.\n\n"
						+ "Sneak Attack. \nBeginning at 1st level, you know how to strike subtly\r\n" + 
						"and exploit a foe’s distraction. Once per turn, you can\r\n" + 
						"deal an extra 1d6 damage to one creature you hit with\r\n" + 
						"an attack if you have advantage on the attack roll. The\r\n" + 
						"attack must use a finesse or a ranged w eapon.\r\n" + 
						"You don’t need advantage on the attack roll if another\r\n" + 
						"enemy o f the target is within 5 feet o f it, that enemy\r\n" + 
						"isn’t incapacitated, and you don’t have disadvantage on\r\n" + 
						"the attack roll.\n\n"
						+ "Thieves' Cant. \nDuring your rogue training you learned thieves’ cant, a\r\n" + 
						"secret mix o f dialect, jargon, and code that allows you to\r\n" + 
						"hide messages in seemingly normal conversation. Only\r\n" + 
						"another creature that knows thieves’ cant understands\r\n" + 
						"such messages. It takes four times longer to convey such\r\n" + 
						"a message than it does to speak the same idea plainly.\r\n" + 
						"In addition, you understand a set o f secret signs and\r\n" + 
						"symbols used to convey short, simple messages, such\r\n" + 
						"as whether an area is dangerous or the territory o f a\r\n" + 
						"thieves’ guild, whether loot is nearby, or whether the\r\n" + 
						"people in an area are easy marks or w ill provide a safe\r\n" + 
						"house for thieves on the run.\n\n";
			}
			else if(point == 2){
				descr += "Cunning Action. \nStarting at 2nd level, your quick thinking and agility\r\n" + 
						"allow you to move and act quickly. You can take a\r\n" + 
						"bonus action on each o f your turns in combat. This\r\n" + 
						"action can b e used only to take the Dash, Disengage,\r\n" + 
						"or Hide action.\n\n";
			}
			else if(point == 3){//path
				if(subC.equals("thief")){
					descr += "Fast Hands. \nStarting at 3rd level, you can use the bonus action\r\n" + 
							"granted by your Cunning A ction to make a Dexterity\r\n" + 
							"(Sleight o f Hand) check, use your thieves’ tools to\r\n" + 
							"disarm a trap or open a lock, or take the Use an\r\n" + 
							"Object action.\n\n"
							+ "Second-Story Work. \nWhen you choose this archetype at 3rd level, you gain\r\n" + 
							"the ability to climb faster than normal; climbing no\r\n" + 
							"longer costs you extra movement.\r\n" + 
							"In addition, when you make a running jump, the\r\n" + 
							"distance you cover increases by a number of feet equal\r\n" + 
							"to your Dexterity modifier.\n\n";
				}
				else if(subC.equals("assassin")){
					descr += "Bonus Proficiencies. \nWhen you choose this archetype at 3rd level, you gain\r\n" + 
							"proficiency with the disguise kit and the poisoner’s kit.\n\n"
							+ "Assassinate. \nStarting at 3rd level, you are at your deadliest when you\r\n" + 
							"get the drop on your enemies. You have advantage on\r\n" + 
							"attack rolls against any creature that hasn’t taken a turn\r\n" + 
							"in the combat yet. In addition, any hit you score against\r\n" + 
							"a creature that is surprised is a critical hit.\n\n";
				}
				else if(subC.equals("arcane")){
					descr += "Spellcasting. \nWhen you reach 3rd level, you gain the ability to\r\n" + 
							"cast spells. See chapter 10 for the general rules of\r\n" + 
							"spellcasting and chapter 11 for the w izard spell list.\r\n" + 
							"Cantrips. You learn three cantrips: mage hand and\r\n" + 
							"two other cantrips o f your choice from the wizard spell\r\n" + 
							"list. You learn another wizard cantrip of your choice\r\n" + 
							"at 10th level.\n\n"
							+ "Mage Hand Legerdemain. \nStarting at 3rd level, when you cast mage hand, you can\r\n" + 
							"make the spectral hand invisible, and you can perform\r\n" + 
							"the following additional tasks with it:\r\n" + 
							"• You can stow one object the hand is holding in a\r\n" + 
							"container w orn or carried by another creature.\r\n" + 
							"• You can retrieve an object in a container worn or\r\n" + 
							"carried by another creature.\r\n" + 
							"• You can use thieves’ tools to pick locks and disarm\r\n" + 
							"traps at range.\r\n" +
							"You can perform one o f these tasks without being\r\n" + 
							"noticed by a creature if you succeed on a Dexterity\r\n" + 
							"(Sleight o f Hand) check contested by the creature’s\r\n" + 
							"Wisdom (Perception) check.\r\n" + 
							"In addition, you can use the bonus action granted by\r\n" + 
							"your Cunning Action to control the hand.\n\n";
				}
			}
			else if(point == 4){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 5){
				descr += "Uncanny Dodge. \nStarting at 5th level, when an attacker that you can see\r\n" + 
						"hits you with an attack, you can use your reaction to\r\n" + 
						"halve the attack’s damage against you.\n\n";
			}
			else if(point == 6){
				descr += "Expertise (Improvement). \nYou can choose two more o f your\r\n" + 
						"proficiencies (in skills or with thieves’ tools) to gain\r\n" + 
						"this benefit.\n\n";
			}
			else if(point == 7){
				descr += "Evasion. \nBeginning at 7th level, you can nimbly dodge out o f the\r\n" + 
						"way o f certain area effects, such as a red dragon’s fiery\r\n" + 
						"breath or an ice storm spell. When you are subjected\r\n" + 
						"to an effect that allows you to make a Dexterity saving\r\n" + 
						"throw to take only half damage, you instead take no\r\n" + 
						"damage if you succeed on the saving throw, and only\r\n" + 
						"half damage if you fail.\n\n";
			}
			else if(point == 8){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 9){//path
				if(subC.equals("thief")){
					descr += "Supreme Sneak. \nStarting at 9th level, you have advantage on a Dexterity\r\n" + 
							"(Stealth) check if you move no more than half your\r\n" + 
							"speed on the same turn.\n\n";
				}
				else if(subC.equals("assassin")){
					descr += "Infiltration Expertise. \nStarting at 9th level, you can unfailingly create false\r\n" + 
							"identities for yourself. You must spend seven days and\r\n" + 
							"25 gp to establish the history, profession, and affiliations\r\n" + 
							"for an identity. You can’t establish an identity that\r\n" + 
							"belongs to someone else. For example, you might acquire\r\n" + 
							"appropriate clothing, letters of introduction, and officiallooking\r\n" + 
							"certification to establish yourself as a member of\r\n" + 
							"a trading house from a remote city so you can insinuate\r\n" + 
							"yourself into the company o f other wealthy merchants.\r\n" + 
							"Thereafter, if you adopt the new identity as a disguise,\r\n" + 
							"other creatures believe you to be that person until given\r\n" + 
							"an obvious reason not to.\n\n";
				}
				else if(subC.equals("arcane")){
					descr += "Magical Ambush. \nStarting at 9th level, if you are hidden from a\r\n" + 
							"creature when you cast a spell on it, the creature has\r\n" + 
							"disadvantage on any saving throw it makes against the\r\n" + 
							"spell this turn.\n\n";
				}
			}
			else if(point == 10){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 11){
				descr += "Reliable Talent. \nBy 11th level, you have refined your chosen skills until\r\n" + 
						"they approach perfection. Whenever you make an ability\r\n" + 
						"check that lets you add your proficiency bonus, you can\r\n" + 
						"treat a d20 roll of 9 or lower as a 10.\n\n";
			}
			else if(point == 12){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 13){//path
				if(subC.equals("thief")){
					descr += "Use Magic Device. \nBy 13th level, you have learned enough about the\r\n" + 
							"workings of magic that you can improvise the use of\r\n" + 
							"items even when they are not intended for you. You\r\n" + 
							"ignore all class, race, and level requirements on the use\r\n" + 
							"of magic items.\n\n";
				}
				else if(subC.equals("assassin")){
					descr += "Imposter. \nAt 13th level, you gain the ability to unerringly m imic\r\n" + 
							"another person’s speech, writing, and behavior.\r\n" + 
							"You must spend at least three hours studying\r\n" + 
							"these three components of the person’s behavior,\r\n" + 
							"listening to speech, examining handwriting, and\r\n" + 
							"observing mannerisms.\r\n" + 
							"Your ruse is indiscernible to the casual observer. If a\r\n" + 
							"wary creature suspects something is amiss, you have\r\n" + 
							"advantage on any Charisma (Deception) check you make\r\n" + 
							"to avoid detection.\n\n";
				}
				else if(subC.equals("arcane")){
					descr += "Versatile Trickster. \nAt 13th level, you gain the ability to distract targets with\r\n" + 
							"your mage hand. As a bonus action on your turn, you can\r\n" + 
							"designate a creature within 5 feet o f the spectral hand\r\n" + 
							"created by the spell. Doing so gives you advantage on\r\n" + 
							"attack rolls against that creature until the end of the turn.\n\n";
				}
			}
			else if(point == 14){
				descr += "Blindsense. \nStarting at 14th level, if you are able to hear, you are\r\n" + 
						"aware o f the location o f any hidden or invisible creature\r\n" + 
						"within 10 feet o f you.\n\n";
			}
			else if(point == 15){
				descr += "Slippery Mind. \nBy 15th level, you have acquired greater mental\r\n" + 
						"strength. You gain proficiency in Wisdom saving throws.\n\n";
			}
			else if(point == 16){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 17){//path
				if(subC.equals("thief")){
					descr += "Thief's Reflexes. \nWhen you reach 17th level, you have become adept at\r\n" + 
							"laying ambushes and quickly escaping danger. You can\r\n" + 
							"take two turns during the first round o f any combat. You\r\n" + 
							"take your first turn at your normal initiative and your\r\n" +
							"second turn at your initiative minus 10. You can’t use\r\n" + 
							"this feature when you are surprised.\n\n";
				}
				else if(subC.equals("assassin")){
					descr += "Death Strike. \nStarting at 17th level, you become a master of instant\r\n" + 
							"death. When you attack and hit a creature that is\r\n" + 
							"surprised, it must make a Constitution saving throw\r\n" + 
							"(DC 8 + your Dexterity modifier + your proficiency\r\n" + 
							"bonus). On a failed save, double the damage of your\r\n" + 
							"attack against the creature.\n\n";
				}
				else if(subC.equals("arcane")){
					descr += "Spell Thief. \nAt 17th level, you gain the ability to magically\r\n" + 
							"steal the knowledge of how to cast a spell from\r\n" + 
							"another spellcaster.\r\n" + 
							"Immediately after a creature casts a spell that targets\r\n" + 
							"you or includes you in its area of effect, you can use your\r\n" + 
							"reaction to force the creature to make a saving throw\r\n" + 
							"with its spellcasting ability modifier. The DC equals\r\n" + 
							"your spell save DC. On a failed save, you negate the\r\n" + 
							"spell’s effect against you, and you steal the knowledge\r\n" + 
							"o f the spell if it is at least 1st level and of a level you can\r\n" + 
							"cast (it doesn’t need to be a wizard spell). For the next\r\n" + 
							"8 hours, you know the spell and can cast it using your\r\n" + 
							"spell slots. The creature can’t cast that spell until the\r\n" + 
							"8 hours have passed.\r\n" + 
							"Once you use this feature, you can’t use it again until\r\n" + 
							"you finish a long rest.\n\n";
				}
			}
			else if(point == 18){
				descr += "Elusive. \nBeginning at 18th level, you are so evasive that\r\n" + 
						"attackers rarely gain the upper hand against you. No\r\n" + 
						"attack roll has advantage against you while you aren’t\r\n" + 
						"incapacitated.\n\n";
			}
			else if(point == 19){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 20){
				descr += "Stroke of Luck. \nAt 20th level, you have an uncanny knack for succeeding\r\n" + 
						"when you need to. If your attack m isses a target within\r\n" + 
						"range, you can turn the miss into a hit. Alternatively, if\r\n" + 
						"you fail an ability check, you can treat the d20 roll as a 20.\r\n" + 
						"Once you use this feature, you can’t use it again until\r\n" + 
						"you finish a short or long rest.\n\n";
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

	static public String getSpc(int level, int mod, String subC)
	{
		String spc = "";
		
		if(subC.equals("arcane"))
		{
			for(int point = 1; point <= level; point++)
			{
				if(point == 1){}
				else if(point == 2){}
				else if(point == 3){
					spc = "Cantrips Known: 3\n"
				 			+ "Spells Known: 3\n"
							+ "1st: 2";
				}
				else if(point == 4){
					spc = "Cantrips Known: 3\n"
				 			+ "Spells Known: 4\n"
							+ "1st: 3";
				}
				else if(point == 5){}
				else if(point == 6){}
				else if(point == 7){
					spc = "Cantrips Known: 3\n"
				 			+ "Spells Known: 5\n"
							+ "1st: 4\n"
							+ "2nd: 2";
				}
				else if(point == 8){
					spc = "Cantrips Known: 3\n"
				 			+ "Spells Known: 6\n"
							+ "1st: 4\n"
							+ "2nd: 2";
				}
				else if(point == 9){}
				else if(point == 10){
					spc = "Cantrips Known: 4\n"
				 			+ "Spells Known: 7\n"
							+ "1st: 4\n"
							+ "2nd: 3";
				}
				else if(point == 11){
					spc = "Cantrips Known: 4\n"
				 			+ "Spells Known: 8\n"
							+ "1st: 4\n"
							+ "2nd: 3";
				}
				else if(point == 12){}
				else if(point == 13){
					spc = "Cantrips Known: 4\n"
				 			+ "Spells Known: 9\n"
							+ "1st: 4\n"
							+ "2nd: 3\n"
							+ "3rd: 2";
				}
				else if(point == 14){
					spc = "Cantrips Known: 4\n"
				 			+ "Spells Known: 10\n"
							+ "1st: 4\n"
							+ "2nd: 3\n"
							+ "3rd: 2";
				}
				else if(point == 15){}
				else if(point == 16){
					spc = "Cantrips Known: 4\n"
				 			+ "Spells Known: 11\n"
							+ "1st: 4\n"
							+ "2nd: 3\n"
							+ "3rd: 3";
				}
				else if(point == 17){}
				else if(point == 18){}
				else if(point == 19){
					spc = "Cantrips Known: 4\n"
				 			+ "Spells Known: 12\n"
							+ "1st: 4\n"
							+ "2nd: 3\n"
							+ "3rd: 3\n"
							+ "4th: 1";
				}
				else if(point == 20){
					spc = "Cantrips Known: 4\n"
				 			+ "Spells Known: 13\n"
							+ "1st: 4\n"
							+ "2nd: 3\n"
							+ "3rd: 3\n"
							+ "4th: 1";
				}
			}
			spc += "\n\nSpell Save DC: " + (8 + Integer.parseInt(getProf(level)) + mod)
				+ "\nSpell Attack Modifier: " + (Integer.parseInt(getProf(level)) + mod) + "\n\n";
		}
		if(level >= 19) {spc += "Sneak Attack: 10d6";}
		else if(level >= 17){spc += "Sneak Attack: 9d6";}
		else if(level >= 15){spc += "Sneak Attack: 8d6";}
		else if(level >= 13){spc += "Sneak Attack: 7d6";}	
		else if(level >= 11){spc += "Sneak Attack: 6d6";}	
		else if(level >= 9){spc += "Sneak Attack: 5d6";}	
		else if(level >= 7){spc += "Sneak Attack: 4d6";}	
		else if(level >= 5){spc += "Sneak Attack: 3d6";}	
		else if(level >= 3){spc += "Sneak Attack: 2d6";}	
		else if(level >= 1){spc += "Sneak Attack: 1d6";}	
			
		return spc;
	}
}
