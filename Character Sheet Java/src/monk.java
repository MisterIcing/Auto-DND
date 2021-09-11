import java.util.ArrayList;
import java.util.Scanner;

public class monk {

	//page 70
	static public ArrayList<Integer> monkStats(ArrayList<Integer> stats)
	{
		ArrayList<Integer> newStats = new ArrayList<Integer>(6);
		
		z.sort(stats);
		//strength
		newStats.add(stats.get(3));
		//dex
		newStats.add(stats.get(0));
		//const
		newStats.add(stats.get(2));
		//intel
		newStats.add(stats.get(4));
		//wisdom
		newStats.add(stats.get(1));
		//charisma
		newStats.add(stats.get(5));
		
		return newStats;
	}
	
	static public String getMonkDescr(String subC, int level)
	{
		String descr;
		descr = "Proficiencies:\n"
				+ "Armor: None\r\n" + 
				"Weapons: Simple weapons, shortswords\r\n" + 
				"Tools: Choose one type of artisan's tools or one\r\n" + 
				"musical instrument\r\n" + 
				"Saving Throws: Strength, Dexterity\r\n" + 
				"Skills: Choose two from Acrobatics, Athletics, History,\r\n" + 
				"Insight, Religion, and Stealth\n\n";
	
		for(int point = 1; point <= level; point++)
		{
			if(point == 1){
				descr += "Unarmored Defense. \nBeginning at 1st level, while you are wearing no armor\r\n" + 
						"and not wielding a shield, your AC equals 10 + your\r\n" + 
						"Dexterity modifier + your Wisdom modifier.\n\n"
						+ "Martial Arts. \nAt 1st level, your practice of martial arts gives you\r\n" + 
						"mastery of combat styles that use unarmed strikes and\r\n" + 
						"monk weapons, which are shortswords and any simple\r\n" + 
						"melee weapons that don't have the two-handed or\r\n" + 
						"heavy property.\r\n" + 
						"You gain the following benefits while you are unarmed\r\n" + 
						"or wielding only monk weapons and you aren't wearing\r\n" + 
						"armor or w ielding a shield:\r\n" + 
						"> You can use Dexterity instead of Strength for the\r\n" + 
						"attack and damage rolls of your unarmed strikes and\r\n" + 
						"monk weapons.\r\n" + 
						"> You can roll a d4 in place of the normal damage\r\n" + 
						"of your unarmed strike or monk weapon. This die\r\n" + 
						"changes as you gain monk levels, as shown in the\r\n" + 
						"Martial Arts column of the Monk table.\r\n" + 
						"> When you use the Attack action with an unarmed\r\n" + 
						"strike or a monk weapon on your turn, you can make\r\n" + 
						"one unarmed strike as a bonus action. For example, if\r\n" + 
						"you take the Attack action and attack with a quarterstaff,\r\n" + 
						"you can also make an unarmed strike as a bonus\r\n" + 
						"action, assuming you haven't already taken a bonus\r\n" + 
						"action this turn.\n\n";
			}
			else if(point == 2){
				descr += "Ki. \nStarting at 2nd level, your training allows you to\r\n" + 
						"harness the mystic energy of ki. Your access to this\r\n" + 
						"energy is represented by a number of ki points. Your\r\n" + 
						"monk level determines the number of points you have,\r\n" + 
						"as shown in the Ki Points column of the Monk table.\r\n" + 
						"You can spend these points to fuel various ki features.\r\n" + 
						"You start knowing three such features: Flurry of Blows,\r\n" + 
						"Patient Defense, and Step of the Wind. You learn more\r\n" + 
						"ki features as you gain levels in this class.\r\n" + 
						"When you spend a ki point, it is unavailable until\r\n" + 
						"you finish a short or long rest, at the end of which you\r\n" + 
						"draw all of your expended ki back into yourself. You\r\n" + 
						"must spend at least 30 minutes of the rest meditating to\r\n" + 
						"regain your ki points.\n\n"
						+ "Ki feature: Flurry of Blows. \nImmediately after you take the Attack action on your\r\n" + 
						"turn, you can spend 1 ki point to make two unarmed\r\n" + 
						"strikes as a bonus action.\n\n"
						+ "Ki feature: Patient Defense. \nYou can spend 1 ki point to take the Dodge action as a\r\n" + 
						"bonus action on your turn.\n\n"
						+ "Ki feature: Step of the Wind. \nYou can spend 1 ki point to take the Disengage or Dash\r\n" + 
						"action as a bonus action on your turn, and your jump\r\n" + 
						"distance is doubled for the turn.\n\n"
						+ "Unarmored Movement. \nStarting at 2nd level, your speed increases by 10 feet\r\n" + 
						"while you are not wearing armor or w ielding a shield.\r\n" + 
						"This bonus increases when you reach certain monk\r\n" + 
						"levels, as shown in the Monk table.\n\n";
				
			}
			else if(point == 3){//path
				descr += "Deflect Missiles. \nStarting at 3rd level, you can use your reaction to\r\n" + 
						"deflect or catch the missile when you are hit by a ranged\r\n" + 
						"weapon attack. When you do so, the damage you take\r\n" + 
						"from the attack is reduced by 1d 10 + your Dexterity\r\n" + 
						"modifier + your monk level.\r\n" + 
						"If you reduce the damage to 0, you can catch the\r\n" + 
						"missile if it is small enough for you to hold in one hand\r\n" + 
						"and you have at least one hand free. If you catch a\r\n" + 
						"missile in this way, you can spend 1 ki point to make a\r\n" + 
						"ranged attack with the weapon or piece of ammunition\r\n" + 
						"you just caught, as part of the same reaction. You make\r\n" + 
						"this attack with proficiency, regardless of your weapon\r\n" + 
						"proficiencies, and the missile counts as a monk weapon\r\n" + 
						"for the attack.\n\n";
				
				if(subC.equals("hand")){
					descr += "Open Hand Technique. \nStarting when you choose this tradition at 3rd level,\r\n" + 
							"you can manipulate your enemy's ki when you harness\r\n" + 
							"your own. Whenever you hit a creature with one of the\r\n" + 
							"attacks granted by your Flurry of Blows, you can impose\r\n" + 
							"one of the following effects on that target:\r\n" + 
							"> It must succeed on a Dexterity saving throw or be\r\n" + 
							"knocked prone.\r\n" + 
							"> It must make a Strength saving throw. If it fails, you\r\n" + 
							"can push it up to 15 feet away from you.\r\n" + 
							"> It can't take reactions until the end of your next turn.\n\n";
				}
				else if(subC.equals("shadow")){
					descr += "Shadow Arts. \nStarting when you choose this tradition at 3rd level, you\r\n" + 
							"can use your ki to duplicate the effects of certain spells.\r\n" + 
							"As an action, you can spend 2 ki points to cast darkness,\r\n" + 
							"darkvision, pass without trace, or silence, without\r\n" + 
							"providing material components. Additionally, you gain\r\n" + 
							"the minor illusion cantrip if you don't already know it.\n\n";
				}
				else if(subC.equals("elements")){
					descr += "Disciple of the Elements. \nWhen you choose this tradition at 3rd level, you learn\r\n" + 
							"magical disciplines that harness the power of the four\r\n" + 
							"elements. A discipline requires you to spend ki points\r\n" + 
							"each time you use it.\r\n" + 
							"You know the Elemental Attunement discipline and\r\n" + 
							"one other elemental discipline of your choice, which are\r\n" + 
							"detailed in the 'Elemental Disciplines' section below.\r\n" + 
							"You learn one additional elemental discipline of your\r\n" + 
							"choice at 6th, 11th, and 17th level.\r\n" + 
							"Whenever you learn a new elemental discipline,\r\n" + 
							"you can also replace one elemental discipline that you\r\n" + 
							"already know with a different discipline.\r\n" + 
							"Casting Elemental Spells. Some elemental\r\n" + 
							"disciplines allow you to cast spells. See chapter 10 for\r\n" + 
							"the general rules of spellcasting. To cast one of these\r\n" + 
							"spells, you use its casting time and other rules, but you\r\n" + 
							"don't need to provide material components for it.\r\n" + 
							"Once you reach 5th level in this class, you can spend\r\n" + 
							"additional ki points to increase the level of an elemental\r\n" + 
							"discipline spell that you cast, provided that the spell has\r\n" + 
							"an enhanced effect at a higher level, as burning hands\r\n" + 
							"does. The spell's level increases by 1 for each additional\r\n" + 
							"ki point you spend. For example, if you are a 5th-level\r\n" + 
							"monk and use Sweeping Cinder Strike to cast burning\r\n" + 
							"hands, you can spend 3 ki points to cast it as a 2nd-level\r\n" + 
							"spell (the discipline's base cost of 2 ki points plus 1).\r\n" + 
							"The maximum number of ki points you can spend to\r\n" + 
							"cast a spell in this way (including its base ki point cost\r\n" + 
							"and any additional ki points you spend to increase its\r\n" + 
							"level) is determined by your monk level, as shown in the\r\n" + 
							"Spells and Ki Points table.\n\n"
							+ "Monk Level 5-8: 3 Max Ki Points for a spell\n"
							+ "Monk Level 9-12: 4 Max Ki Points for a spell\n"
							+ "Monk Level 13-16: 5 Max Ki Points for a spell\n"
							+ "Monk Level 17-20: 6 Max Ki Points for a spell\n";
					
					@SuppressWarnings("resource")
					Scanner list = new Scanner(System.in);
					System.out.println("Would you like a list of the Elemental Disciplines?");
					String nyeh = list.nextLine().toLowerCase();
					if(nyeh.equals("yes")) {
						descr += "Breath of Winter (17th Level Required). \nYou can\r\n" + 
								"spend 6 ki points to cast cone of cold.\n\n" + 
								"Clench of the North Wind (6th Level Required). \nYou\r\n" + 
								"can spend 3 ki points to cast hold person.\n\n" + 
								"Elemental Attunement. \nYou can use your action to\r\n" + 
								"briefly control elemental forces nearby, causing one of\r\n" + 
								"the following effects of your choice:\r\n" + 
								"> Create a harmless, instantaneous sensory effect\r\n" + 
								"related to air, earth, fire, or water, such as a shower of\r\n" + 
								"sparks, a puff of wind, a spray of light mist, or a gentle\r\n" + 
								"rumbling of stone.\r\n" + 
								"> Instantaneously light or snuff out a candle, a torch, or\r\n" + 
								"a small campfire.\r\n" + 
								"> Chill or warm up to 1 pound of nonliving material for\r\n" + 
								"up to 1 hour.\r\n" + 
								"> Cause earth, fire, water, or mist that can fit within a\r\n" + 
								"1-foot cube to shape itself into a crude form you designate\r\n" + 
								"for 1 minute.\n\n" + 
								"Eternal Mountain Defense (11th Level Required).\r\n" + 
								"You can spend 5 ki points to cast stoneskin,\r\n" + 
								"targeting yourself.\n\n" + 
								"Fangs of the Fire Snake. \nWhen you use the Attack\r\n" + 
								"action on your turn, you can spend 1 ki point to cause\r\n" + 
								"tendrils of flame to stretch out from your fists and feet.\r\n" + 
								"Your reach with your unarmed strikes increases by\r\n" + 
								"10 feet for that action, as well as the rest of the turn.\r\n" + 
								"A hit with such an attack deals fire damage instead of\r\n" + 
								"bludgeoning damage, and if you spend 1 ki point when\r\n" + 
								"the attack hits, it also deals an extra 1d 10 fire damage.\r\n" + 
								"Fist of Four Thunders. \nYou can spend 2 ki points to\r\n" + 
								"cast thunderwave.\n\n" + 
								"Fist of Unbroken Air. \nYou can create a blast of\r\n" + 
								"compressed air that strikes like a mighty fist. As an\r\n" + 
								"action, you can spend 2 ki points and choose a creature\r\n" + 
								"within 30 feet of you. That creature must make a\r\n" + 
								"Strength saving throw. On a failed save, the creature\r\n" + 
								"takes 3 d 10 bludgeoning damage, plus an extra 1d10\r\n" + 
								"bludgeoning damage for each additional ki point you\r\n" + 
								"spend, and you can push the creature up to 20 feet away\r\n" + 
								"from you and knock it prone. On a successful save, the\r\n" + 
								"creature takes half as much damage, and you don't push\r\n" + 
								"it or knock it prone.\n\n" + 
								"Flames of the Phoenix (11th Level Required). \nYou " + 
								"can spend 4 ki points to cast fireball.\n\n" + 
								"Gong of the Summit (6th Level Required). \nYou can " + 
								"spend 3 ki points to cast shatter.\n\n" + 
								"Mist Stance (11th Level Required). \nYou can spend 4\r\n" + 
								"ki points to cast gaseous form, targeting yourself.\n\n" + 
								"Ride the Wind (11th Level Required). \nYou can spend\r\n" + 
								"4 ki points to cast fly, targeting yourself.\n\n" + 
								"River of Hungry Flame (17th Level Required). \nYou\r\n" + 
								"can spend 5 ki points to cast wall of fire.\r\n" + 
								"Rush of the Gale Spirits. You can spend 2 ki points\r\n" + 
								"to cast gust of wind.\n\n"
								+ "Shape the Flowing River. \nAs an action, you can\r\n" + 
								"spend 1 ki point to choose an area of ice or water no\r\n" + 
								"larger than 30 feet on a side within 120 feet of you. You\r\n" + 
								"can change water to ice within the area and v ice versa,\r\n" + 
								"and you can reshape ice in the area in any manner you\r\n" + 
								"choose. You can raise or lower the ice's elevation, create\r\n" + 
								"or fill in a trench, erect or flatten a wall, or form a pillar.\r\n" + 
								"The extent of any such changes can't exceed half the\r\n" + 
								"area's largest dimension. For example, if you affect a\r\n" + 
								"30-foot square, you can create a pillar up to 15 feet high,\r\n" + 
								"raise or lower the square's elevation by up to 15 feet, dig\r\n" + 
								"a trench up to 15 feet deep, and so on. You can't shape\r\n" + 
								"the ice to trap or injure a creature in the area.\n\n" + 
								"Sweeping Cinder Strike. \nYou can spend 2 ki points to\r\n" + 
								"cast burning hands.\n\n" + 
								"Water Whip. \nYou can spend 2 ki points as a bonus\r\n" + 
								"action to create a whip of water that shoves and pulls\r\n" + 
								"a creature to unbalance it. A creature that you can see\r\n" + 
								"that is within 30 feet of you must make a Dexterity\r\n" + 
								"saving throw. On a failed save, the creature takes 3 d 10\r\n" + 
								"bludgeoning damage, plus an extra 1d 10 bludgeoning\r\n" + 
								"damage for each additional ki point you spend, and you\r\n" + 
								"can either knock it prone or pull it up to 25 feet closer\r\n" + 
								"to you. On a successful save, the creature takes half as\r\n" + 
								"much damage, and you don't pull it or knock it prone.\n\n" + 
								"Wave of Rolling Earth (17th Level Required). \nYou " + 
								"can spend 6 ki points to cast wall of stone.\n\n";
					}
				}
			}
			else if(point == 4){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n"
						+ "Slow Fall. \nBeginning at 4th level, you can use your reaction when\r\n" + 
						"you fall to reduce any falling damage you take by an\r\n" + 
						"amount equal to five times your monk level.\n\n";
			}
			else if(point == 5){
				descr += "Extra Attack. \nBeginning at 5th level, you can attack twice, instead of\r\n" + 
						"once, whenever you take the Attack action on your turn.\n\n"
						+ "Stunning Strike. \nStarting at 5th level, you can interfere with the flow of\r\n" + 
						"ki in an opponent's body. When you hit another creature\r\n" + 
						"with a melee weapon attack, you can spend 1 ki point to\r\n" + 
						"attempt a stunning strike. The target must succeed on a\r\n" + 
						"Constitution saving throw or be stunned until the end of\r\n" + 
						"your next turn.\n\n";
			}
			else if(point == 6){//path
				descr += "Ki-Empowered Strikes. \nStarting at 6th level, your unarmed strikes count as\r\n" + 
						"magical for the purpose of overcoming resistance and\r\n" + 
						"immunity to nonmagical attacks and damage.\n\n";
				
				if(subC.equals("hand")){
					descr += "Wholeness of Body. \nAt 6th level, you gain the ability to heal yourself. As an\r\n" + 
							"action, you can regain hit points equal to three times\n"
							+ "your monk level. You must finish a long rest before you\r\n" + 
							"can use this feature again.\n\n";
				}
				else if(subC.equals("shadow")){
					descr += "Shadow Step. \nAt 6th level, you gain the ability to step from one shadow\r\n" + 
							"into another. When you are in dim light or darkness,\r\n" + 
							"as a bonus action you can teleport up to 60 feet to an\r\n" + 
							"unoccupied space you can see that is also in dim light\r\n" + 
							"or darkness. You then have advantage on the first melee\r\n" + 
							"attack you make before the end of the turn.\n\n";
				}
				else if(subC.equals("elements")){}
			}
			else if(point == 7){
				descr += "Evasion. \nAt 7th level, your instinctive agility lets you dodge\r\n" + 
						"out of the way of certain area effects, such as a blue\r\n" + 
						"dragon's lightning breath or a fireball spell. When you\r\n" + 
						"are subjected to an effect that allows you to make a\r\n" + 
						"Dexterity saving throw to take only half damage, you\r\n" + 
						"instead take no damage if you succeed on the saving\r\n" + 
						"throw, and only half damage if you fail.\n\n"
						+ "Stillness of Mind. \nStarting at 7th level, you can use your action to end one\r\n" + 
						"effect on yourself that is causing you to be charmed\r\n" + 
						"or frightened.\n\n";
			}
			else if(point == 8){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 9){ 
				descr += "Unarmored Movement (Improvement). \nyou gain the ability to move along vertical\r\n" + 
					"surfaces and across liquids on your turn without falling\r\n" + 
					"during the move.";
			}
			else if(point == 10){
				descr += "Purity of Body. \nAt 10th level, your mastery of the ki flowing through you\r\n" + 
						"makes you immune to disease and poison.\n\n";
			}
			else if(point == 11){//path
				if(subC.equals("hand")){
					descr += "Tranquility. \nBeginning at 11th level, you can enter a special\r\n" + 
							"meditation that surrounds you with an aura of peace. At\r\n" + 
							"the end of a long rest, you gain the effect of a sanctuary\r\n" + 
							"spell that lasts until the start of your next long rest (the\r\n" + 
							"spell can end early as normal). The saving throw DC\r\n" + 
							"for the spell equals 8 + your W isdom modifier + your\r\n" + 
							"proficiency bonus.\n\n";
				}
				else if(subC.equals("shadow")){
					descr += "Cloak of Shadows. \nBy 11th level, you have learned to become one with\r\n" + 
							"the shadows. When you are in an area of dim light or\r\n" + 
							"darkness, you can use your action to become invisible.\r\n" + 
							"You remain invisible until you make an attack, cast a\r\n" + 
							"spell, or are in an area of bright light.\n\n";
				}
				else if(subC.equals("elements")){}
			}
			else if(point == 12){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 13){
				descr += "Tongue of the Sun and Moon. \nStarting at 13th level, you learn to touch the ki of other\r\n" + 
						"minds so that you understand all spoken languages.\r\n" + 
						"Moreover, any creature that can understand a language\r\n" + 
						"can understand what you say.\n\n";
			}
			else if(point == 14){
				descr += "Diamond Soul. \nBeginning at 14th level, your mastery of ki grants you\r\n" + 
						"proficiency in all saving throws.\r\n" + 
						"Additionally, whenever you make a saving throw and\r\n" + 
						"fail, you can spend 1 ki point to reroll it and take the\r\n" + 
						"second result.\n\n";
			}
			else if(point == 15){
				descr += "Timeless Body. \nAt 15th level, your ki sustains you so that you suffer\r\n" + 
						"none of the frailty of old age, and you can't be aged\r\n" + 
						"magically. You can still die of old age, however. In\r\n" + 
						"addition, you no longer need food or water.\n\n";
			}
			else if(point == 16){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 17){//path
				if(subC.equals("hand")){
					descr += "Quivering Palm. \nAt 17th level, you gain the ability to set up lethal\r\n" + 
							"vibrations in someone's body. When you hit a creature\r\n" + 
							"with an unarmed strike, you can spend 3 ki points to\r\n" + 
							"start these imperceptible vibrations, which last for a\r\n" + 
							"number of days equal to your monk level. The vibrations\r\n" + 
							"are harmless unless you use your action to end them.\r\n" + 
							"To do so, you and the target must be on the same plane\r\n" + 
							"of existence. When you use this action, the creature\r\n" + 
							"must make a Constitution saving throw. If it fails, it is\r\n" + 
							"reduced to 0 hit points. If it succeeds, it takes 10d 10\r\n" + 
							"necrotic damage.\r\n" + 
							"You can have only one creature under the effect of this\r\n" + 
							"feature at a time. You can choose to end the vibrations\r\n" + 
							"harmlessly without using an action.";
				}
				else if(subC.equals("shadow")){
					descr += "Opportunist. \nAt 17th level, you can exploit a creature's momentary\r\n" + 
							"distraction when it is hit by an attack. Whenever a\r\n" + 
							"creature within 5 feet of you is hit by an attack made by\r\n" + 
							"a creature other than you, you can use your reaction to\r\n" + 
							"make a melee attack against that creature.\n\n";
				}
				else if(subC.equals("elements")){}
			}
			else if(point == 18){
				descr += "Empty Body. \nBeginning at 18th level, you can use your action to\r\n" + 
						"spend 4 ki points to become invisible for 1 minute.\n"
						+ "During that time, you also have resistance to all damage\r\n" + 
						"but force damage.\r\n" + 
						"Additionally, you can spend 8 ki points to cast the\r\n" + 
						"astral projection spell, without needing material\r\n" + 
						"components. When you do so, you can't take any other\r\n" + 
						"creatures with you.\n\n";
			}
			else if(point == 19){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 20){
				descr += "Perfect Self. \nAt 20th level, when you roll for initiative and have no ki\r\n" + 
						"points remaining, you regain 4 ki points.\n\n";
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

	static public int getUSpeed(int speed, int level)
	{
		int newSpeed = 0;
		if(level >= 18) {newSpeed = speed + 30;}
		else if(level >= 14) {newSpeed = speed + 25;}
		else if(level >= 10) {newSpeed = speed + 20;}
		else if(level >= 6) {newSpeed = speed + 15;}
		else if(level >= 2) {newSpeed = speed + 10;}
		else if(level >= 1) {newSpeed = speed;}
		return newSpeed;
	}
	
	static public String getSpc(int level, int mod)
	{
		String spc = "";
		if(level >= 17){
			spc += "Martial Arts: 1d10\n";
		}
		else if(level >= 11){
			spc += "Martial Arts: 1d8\n";
		}
		else if(level >= 5){
			spc += "Martial Arts: 1d6\n";
		}	
		else if(level >= 1){
			spc += "Martial Arts: 1d4\n";
		}
		if(level >= 2)
			spc += "Ki Points: " + level;
		return spc;
	}
}
