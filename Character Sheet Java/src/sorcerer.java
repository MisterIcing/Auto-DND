import java.util.*;

public class sorcerer {

	//page 93
	static public ArrayList<Integer> sorcererStats(ArrayList<Integer> stats)
	{
		ArrayList<Integer> newStats = new ArrayList<Integer>(6);
		
		z.sort(stats);
		//strength
		newStats.add(stats.get(3));
		//dex
		newStats.add(stats.get(4));
		//const
		newStats.add(stats.get(1));
		//intel
		newStats.add(stats.get(2));
		//wisdom
		newStats.add(stats.get(5));
		//charisma
		newStats.add(stats.get(0));
		
		return newStats;
	}
	
	static public String getSorcererDescr(String subC, int level)
	{
		String descr;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String dragon= "";
		String chart = "";
		descr = "Proficiencies:\n"
				+ "Armor: None\r\n" + 
				"Weapons: Daggers, darts, slings, quarterstaffs,\r\n" + 
				"light crossbows\r\n" + 
				"Tools: None\r\n" + 
				"Saving Throws: Constitution, Charisma\r\n" + 
				"Skills: Choose two from Arcana, Deception, Insight,\r\n" + 
				"Intimidation, Persuasion, and Religion\n\n";
	
		for(int point = 1; point <= level; point++)
		{
			if(point == 1){//path
				descr += "Spellcasting. \nAt 1st level, you know four cantrips of your choice from\r\n" + 
						"the sorcerer spell list.\n\n"; 
				if(subC.equals("draconic")){
					descr += "Dragon Ancestor. \nAt 1st level, you choose one type of dragon as your\r\n" + 
							"ancestor. The damage type associated with each dragon\r\n" + 
							"is used by features you gain later.\n" +
							"You can speak, read, and write Draconic. Additionally,\r\n" + 
							"whenever you make a Charisma check when interacting\r\n" + 
							"with dragons, your proficiency bonus is doubled if it\r\n" + 
							"applies to the check.\n\n";
					System.out.println("Choose Draconic Ancestry: Black(acid), Blue(lightning), "
							+ "Brass(fire), Bronze(lightning),\nCopper(acid), Gold(fire), "
							+ "Green(poison), Red(fire), Silver(cold), White(cold)");
					dragon = in.nextLine().trim().toLowerCase();
					descr = "Draconic Ancestry: " + z.toTitleCase(dragon) + " Dragon\n\n" + descr ;
					
					descr += "Draconic Resilience. \nAs magic flows through your body, it causes physical\r\n" + 
							"traits of your dragon ancestors to emerge. At 1st level,\r\n" + 
							"your hit point maximum increases by 1 and increases by\r\n" + 
							"1 again whenever you gain a level in this class.\r\n" + 
							"Additionally, parts of your skin are covered by a thin\r\n" + 
							"sheen of dragon-like scales. When you aren’t wearing\r\n" + 
							"armor, your AC equals 13 + your Dexterity modifier.\n\n";
				}
				else if(subC.equals("wild")){
					descr += "Wild Magic Surge. \nStarting when you choose this origin at 1st level, your\r\n" + 
							"spellcasting can unleash surges of untamed magic.\r\n" + 
							"Immediately after you cast a sorcerer spell of 1st level\r\n" + 
							"or higher, the DM can have you roll a d20. If you roll a\r\n" + 
							"1, roll on the Wild Magic Surge table to create a random\r\n" + 
							"magical effect.\n\n"
							+ "Tides of Chaos. \nStarting at 1st level, you can manipulate the forces of\r\n" + 
							"chance and chaos to gain advantage on one attack roll,\r\n" + 
							"ability check, or saving throw. Once you do so, you must\r\n" + 
							"finish a long rest before you can use this feature again.\r\n" + 
							"Any time before you regain the use of this feature, the\r\n" + 
							"DM can have you roll on the Wild Magic Surge table\r\n" + 
							"immediately after you cast a sorcerer spell of 1st level or\r\n" + 
							"higher. You then regain the use of this feature.\n\n";
					System.out.println("Would you like a copy of the Wild Magic Surge Chart?");
					chart = in.nextLine().trim().toLowerCase();				
					
				}
			}
			else if(point == 2){
				descr += "Font of Magic. \nAt 2nd level, you tap into a deep wellspring of magic\r\n" + 
						"within yourself. This w ellspring is represented by\r\n" + 
						"sorcery points, which allow you to create a variety of\r\n" + 
						"magical effects.\n\n"
						+ "Sorcery Points. \nYou have 2 sorcery points, and you gain more as you\r\n" + 
						"reach higher levels, as shown in the Sorcery Points\r\n" + 
						"column of the Sorcerer table. You can never have\r\n" + 
						"more sorcery points than shown on the table for your\r\n" + 
						"level. You regain all spent sorcery points when you\r\n" + 
						"finish a long rest.\n\n"
						+ "Flexible Casting. \nYou can use your sorcery points to gain additional spell\r\n" + 
						"slots, or sacrifice spell slots to gain additional sorcery\r\n" + 
						"points. You learn other ways to use your sorcery points\r\n" + 
						"as you reach higher levels.\n\n" + 
						"Creating Spell Slots. \nYou can transform unexpended\r\n" + 
						"sorcery points into one spell slot as a bonus action on\r\n" + 
						"your turn. The Creating Spell Slots table shows the cost\r\n" + 
						"of creating a spell slot of a given level. You can create\r\n" + 
						"spell slots no higher in level than 5th.\n\n"
						+ "Spell Slot Level		Sorcery Point Cost\r\n" + 
						"1st 					2\r\n" + 
						"2nd 					3\r\n" + 
						"3rd 					5\r\n" + 
						"4th 					6\r\n" + 
						"5th 					7\n\n"
						+ "Converting a Spell Slot to Sorcery Points. \nAs a\r\n" + 
						"bonus action on your turn, you can expend one spell\r\n" + 
						"slot and gain a number of sorcery points equal to the\r\n" + 
						"slot’s level.\n\n"; 
				
			}
			else if(point == 3){
				descr += "Metamagic. \nAt 3rd level, you gain the ability to twist your spells\r\n" + 
						"to suit your needs. You gain two of the following\r\n" + 
						"Metamagic options of your choice." + 
						"You can use only one Metamagic option on a spell\r\n" + 
						"when you cast it, unless otherwise noted.\n//Start of Metamagic options\n"

						+ "Careful Spell\r\n" + 
						"When you cast a spell that forces other creatures to make\r\n" + 
						"a saving throw, you can protect some of those creatures\r\n" + 
						"from the spell’s full force. To do so, you spend 1 sorcery\r\n" + 
						"point and choose a number of those creatures up to your\r\n" + 
						"Charisma modifier (minimum of one creature). A chosen\r\n" + 
						"creature automatically succeeds on its saving throw\r\n" + 
						"against the spell.\n\n" 
						+ "Distant Spell\r\n" + 
						"When you cast a spell that has a range of 5 feet or\r\n" + 
						"greater, you can spend 1 sorcery point to double the\r\n" + 
						"range of the spell.\r\n" + 
						"When you cast a spell that has a range of touch, you\r\n" + 
						"can spend 1 sorcery point to make the range of the\r\n" + 
						"spell 30 feet.\n\n"  
						+ "Empowered Spell\r\n" + 
						"When you roll damage for a spell, you can spend 1\r\n" + 
						"sorcery point to reroll a number of the damage dice up\r\n" + 
						"to your Charisma modifier (minimum of one). You must\r\n" + 
						"use the new rolls.\r\n" + 
						"You can use Empowered Spell even if you have\r\n" + 
						"already used a different Metamagic option during the\r\n" + 
						"casting of the spell.\n\n" 
						+ "Extended Spell\r\n" + 
						"When you cast a spell that has a duration of 1 minute\r\n" + 
						"or longer, you can spend 1 sorcery point to double its\r\n" + 
						"duration, to a maximum duration of 24 hours.\n\n" 
						+ "Heightened Spell\r\n" + 
						"When you cast a spell that forces a creature to make a\r\n" + 
						"saving throw to resist its effects, you can spend 3 sorcery\r\n" + 
						"points to give one target of the spell disadvantage on its\r\n" + 
						"first saving throw made against the spell.\n\n"
						+ "Quickened Spell\r\n" + 
						"When you cast a spell that has a casting time of 1 action,\r\n" + 
						"you can spend 2 sorcery points to change the casting\r\n" + 
						"time to 1 bonus action for this casting.\n\n"  
						+ "Subtle Spell\r\n" + 
						"When you cast a spell, you can spend 1 sorcery point to\r\n" + 
						"cast it without any somatic or verbal components.\n\n" 
						+ "Twinned Spell\r\n" + 
						"When you cast a spell that targets only one creature and\r\n" + 
						"doesn’t have a range of self, you can spend a number of\r\n" + 
						"sorcery points equal to the spell’s level to target a second\r\n" + 
						"creature in range with the same spell (1 sorcery point if\r\n" + 
						"the spell is a cantrip).\n"
						+ "//End of Metamagic options\n\n";
			}
			else if(point == 4){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 5){}
			else if(point == 6){//path
				if(subC.equals("draconic")){
					descr += "Elemental Affinity. \nStarting at 6th level, when you cast a spell that deals\r\n" + 
							"damage of the type associated with your draconic\r\n" + 
							"ancestry, add your Charisma modifier to that damage.\r\n" + 
							"At the same time, you can spend 1 sorcery point to gain\r\n" + 
							"resistance to that damage type for 1 hour.\n\n";
				}
				else if(subC.equals("wild")){
					descr += "Bend Luck. \nStarting at 6th level, you have the ability to twist fate\r\n" + 
							"using your wild magic. When another creature you can\r\n" + 
							"see makes an attack roll, an ability check, or a saving\r\n" + 
							"throw, you can use your reaction and spend 2 sorcery\r\n" + 
							"points to roll 1d4 and apply the number rolled as a\r\n" + 
							"bonus or penalty (your choice) to the creature’s roll.\n" +
							"You can do so after the creature rolls but before any effects\r\n" + 
							"of the roll occur.\n\n";
				}
			}
			else if(point == 7){}
			else if(point == 8){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 9){}
			else if(point == 10){
				descr += "Metamagic (Improvement). \nYou gain another metamagic option (listed earlier).\n\n";
			}
			else if(point == 11){}
			else if(point == 12){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 13){}
			else if(point == 14){//path
				if(subC.equals("draconic")){
					descr += "Dragon Wings. \nAt 14th level, you gain the ability to sprout a pair of\r\n" + 
							"dragon wings from your back, gaining a flying speed\r\n" + 
							"equal to your current speed. You can create these w ings\r\n" + 
							"as a bonus action on your turn. They last until you\r\n" + 
							"dismiss them as a bonus action on your turn.\r\n" + 
							"You can’t manifest your w ings while wearing armor\r\n" + 
							"unless the armor is made to accommodate them, and\r\n" + 
							"clothing not made to accommodate your wings might\r\n" + 
							"be destroyed when you manifest them.\n\n";
				}
				else if(subC.equals("wild")){
					descr += "Controlled Chaos. \nAt 14th level, you gain a modicum of control over the\r\n" + 
							"surges of your wild magic. Whenever you roll on the\r\n" + 
							"Wild Magic Surge table, you can roll twice and use\r\n" + 
							"either number.\n\n";
				}
			}
			else if(point == 15){}
			else if(point == 16){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n";
			}
			else if(point == 17){
				descr += "Metamagic (Improvement). \nYou gain yet another metamagic option (listed earlier).\n\n";
			}
			else if(point == 18){//path
				if(subC.equals("draconic")){
					descr += "Draconic Presence. \nBeginning at 18th level, you can channel the dread\r\n" + 
							"presence of your dragon ancestor, causing those around\r\n" + 
							"you to become awestruck or frightened. As an action,\r\n" + 
							"you can spend 5 sorcery points to draw on this power\r\n" + 
							"and exude an aura of awe or fear (your choice) to a\r\n" + 
							"distance of 60 feet. For 1 minute or until you lose your\r\n" + 
							"concentration (as if you w ere casting a concentration\r\n" + 
							"spell), each hostile creature that starts its turn in this\r\n" + 
							"aura must succeed on a W isdom saving throw or be\r\n" + 
							"charmed (if you chose awe) or frightened (if you chose\r\n" + 
							"fear) until the aura ends. A creature that succeeds on\r\n" + 
							"this saving throw is immune to your aura for 24 hours.\n\n";
				}
				else if(subC.equals("wild")){
					descr += "Spell Bombardment. \nBeginning at 18th level, the harmful energy of your\r\n" + 
							"spells intensifies. When you roll damage for a spell and\r\n" + 
							"roll the highest number possible on any of the dice,\r\n" + 
							"choose one of those dice, roll it again and add that roll to\r\n" + 
							"the damage. You can use the feature only once per turn.\n\n";
				}
			}
			else if(point == 19){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 20){
				descr += "Sorcerous Restoration. \nt 20th level, you regain 4 expended sorcery points\r\n" + 
						"whenever you finish a short rest.\n\n";
			}
		}
		if(chart.contains("yes"))
		{
			descr += "1-2: Roll on this table at the start of each of your turns for the next minute, ignoring this result on subsequent rolls.\n"
					+ "3-4: For the next minute, you can see any invisible creature if you have line of sight to it.\n"
					+ "5-6: A modron chosen and controlled by the DM appears in an unoccupied space within 5 feet of you, then disappears 1 minute later.\n"
					+ "7-8: You cast fireball as a 3rd-level spell centered on yourself.\n"
					+ "9-10: You cast magic missile as a 5th-level spell.\n"
					+ "11-12: Roll a d10. Your height changes by a number of inches equal to the roll. If the roll is odd, you shrink. If the roll is even, you grow.\n"
					+ "13-14: You cast confusion centered on yourself.\n"
					+ "15-16: For the next minute, you regain 5 hit points at the start of each of your turns.\n"
					+ "17-18: You grow a long beard made of feathers that remains until you sneeze, at which point the feathers explode out from your face.\n"
					+ "19-20: You cast grease centered on yourself.\n"
					+ "21-22: Creatures have disadvantage on saving throws against the next spell you cast in the next minute that involves a saving throw.\n"
					+ "23-24: Your skin turns a vibrant shade of blue. A remove curse spell can end this effect.\n"
					+ "25-26: An eye appears on your forehead for the next minute. During that time, you have advantage on Wisdom (Perception) checks that rely on sight.\n"
					+ "27-28: For the next minute, all your spells with a casting time of 1 action have a casting time of 1 bonus action.\n"
					+ "29-30: You teleport up to 60 feet to an unoccupied space of your choice that you can see.\n"
					+ "31-32: You are transported to the Astral Plane until the end of your next turn, after which time you return to the space you previously occupied or \n"+
					"	the nearest unoccupied space if that space is occupied.\n"
					+ "33-34: Maximize the damage of the next damaging spell you cast within the next minute.\n"
					+ "35-36: Roll a d10. Your age changes by a number of years equal to the roll. If the roll is odd, you get younger (minimum 1 year old). If the roll is even, you get older\n"
					+ "37-38: 1d6 flumphs controlled by the DM appear in unoccupied spaces within 60 feet of you and are frightened of you. They vanish after 1 minute.\n"
					+ "39-40: You regain 2d10 hit points.\n"
					+ "41-42: You turn into a potted plant until the start of your next turn. While a plant, you are incapacitated andhave vulnerability to all damage. If you drop to 0 hit\r\n" + 
					"	points, your pot breaks, and your form reverts.\n"
					+ "43-44: For the next minute, you can teleport up to 20 feet as a bonus action on each of your turns.\n"
					+ "45-46: You cast levitate on yourself.\n"
					+ "47-48: A unicorn controlled by the DM appears in a space within 5 feet of you, then disappears 1 minute later.\n"
					+ "49-50: You can’t speak for the next minute. Whenever you try, pink bubbles float out of your mouth.\n"
					+ "51-52: A spectral shield hovers near you for the next minute, granting you a +2 bonus to AC and immunity to magic missile.\n"
					+ "53-54: You are immune to being intoxicated by alcohol for the next 5d6 days.\n"
					+ "55-56: Your hair falls out but grows back within 24 hours.\n"
					+ "57-58: For the next minute, any flammable object you touch that isn’t being worn or carried by another creature bursts into flame.\n"
					+ "59-60: You regain your lowest-level expended spell slot.\n"
					+ "61-62: For the next minute, you must shout when you speak\n"
					+ "63-64: You cast fog cloud centered on yourself.\n"
					+ "65-66: Up to three creatures you choose within 30 feet of you take 4d10 lightning damage.\n"
					+ "67-68: You are frightened by the nearest creature until the\r\n end of your next turn.\n"
					+ "69-70: Each creature within 30 feet of you becomes invisible for the next minute. The invisibility ends on a creature when it attacks or casts a spell.\n"
					+ "71-72: You gain resistance to all damage for the next minute.\n"
					+ "73-74: A random creature within 60 feet of you becomes poisoned for 1d4 hours.\n"
					+ "75-76: You glow with bright light in a 30-foot radius for the next minute. Any creature that ends its turn within 5 feet of you is blinded until the end of its next turn.\n"
					+ "77=78: You cast polymorph on yourself. If you fail the saving throw, you turn into a sheep for the spell’s duration.\n"
					+ "79-80: Illusory butterflies and flower petals flutter in the air within 10 feet of you for the next minute.\n"
					+ "81-82: You can take one additional action immediately.\n"
					+ "83-84: Each creature within 30 feet of you takes 1d10 necrotic damage. You regain hit points equal to the sum of the necrotic damage dealt.\n"
					+ "85-86: You cast mirror image.\n"
					+ "87-88: You cast fly on a random creature within 60 feet of you.\n"
					+ "89-90: You become invisible for the next minute. During that time, other creatures can’t hear you. The invisibility ends if you attack or cast a spell.\n"
					+ "91-92: If you die within the next minute, you immediately come back to life as if by the reincarnate spell.\n"
					+ "93-94: Your size increases by one size category for the next minute.\n"
					+ "95-96: You and all creatures within 30 feet of you gain vulnerability to piercing damage for the next minute.\n"
					+ "97-98: You are surrounded by faint, ethereal music for the next minute.\n"
					+ "99-00: You regain all expended sorcery points.\n";
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
			if(point == 1){
				spc = "Cantrips Known: 4\n"
						+ "Spells Known: 2\n"
						+ "1st: 2";
			}
			else if(point == 2){
				spc = "Cantrips Known: 4\n"
						+ "Spells Known: 3\n"
						+ "1st: 3";
			}
			else if(point == 3){
				spc = "Cantrips Known: 4\n"
						+ "Spells Known: 4\n"
						+ "1st: 4\n"
						+ "2nd: 2";
			}
			else if(point == 4){
				spc = "Cantrips Known: 5\n"
						+ "Spells Known: 5\n"
						+ "1st: 4\n"
						+ "2nd: 3";
			}
			else if(point == 5){
				spc = "Cantrips Known: 5\n"
						+ "Spells Known: 6\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 2";
			}
			else if(point == 6){
				spc = "Cantrips Known: 5\n"
						+ "Spells Known: 7\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3";
			}
			else if(point == 7){
				spc = "Cantrips Known: 5\n"
						+ "Spells Known: 8\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 1";
			}
			else if(point == 8){
				spc = "Cantrips Known: 5\n"
						+ "Spells Known: 9\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 2";
			}
			else if(point == 9){
				spc = "Cantrips Known: 5\n"
						+ "Spells Known: 10\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 1";
			}
			else if(point == 10){
				spc = "Cantrips Known: 6\n"
						+ "Spells Known: 11\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2";
			}
			else if(point == 11){
				spc = "Cantrips Known: 6\n"
						+ "Spells Known: 12\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1";
			}
			else if(point == 12){
				spc = "Cantrips Known: 6\n"
						+ "Spells Known: 12\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1";
			}
			else if(point == 13){
				spc = "Cantrips Known: 6\n"
						+ "Spells Known: 13\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1\n"
						+ "7th: 1";
			}
			else if(point == 14){
				spc = "Cantrips Known: 6\n"
						+ "Spells Known: 13\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1\n"
						+ "7th: 1";
			}
			else if(point == 15){
				spc = "Cantrips Known: 6\n"
						+ "Spells Known: 14\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1\n"
						+ "7th: 1\n"
						+ "8th: 1";
			}
			else if(point == 16){
				spc = "Cantrips Known: 6\n"
						+ "Spells Known: 14\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1\n"
						+ "7th: 1\n"
						+ "8th: 1";
			}
			else if(point == 17){
				spc = "Cantrips Known: 6\n"
						+ "Spells Known: 15\n"
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
			else if(point == 18){
				spc = "Cantrips Known: 6\n"
						+ "Spells Known: 15\n"
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
			else if(point == 19){
				spc = "Cantrips Known: 6\n"
						+ "Spells Known: 15\n"
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
			else if(point == 20){
				spc = "Cantrips Known: 6\n"
						+ "Spells Known: 15\n"
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
		spc += "\n\nSpell Save DC: " + (8 + Integer.parseInt(getProf(level)) + mod)
				+ "\nSpell Attack Modifier: " + (Integer.parseInt(getProf(level)) + mod);
		return spc;
	}
}
