import java.util.ArrayList;

public class wizard {
	
	//page 106
	static public ArrayList<Integer> wizardStats(ArrayList<Integer> stats)
	{
		ArrayList<Integer> newStats = new ArrayList<Integer>(6);
		
		z.sort(stats);
		//strength
		newStats.add(stats.get(5));
		//dex
		newStats.add(stats.get(2));
		//const
		newStats.add(stats.get(1));
		//intel
		newStats.add(stats.get(0));
		//wisdom
		newStats.add(stats.get(3));
		//charisma
		newStats.add(stats.get(4));
		
		return newStats;
	}
	
	static public String getWizardDescr(String subC, int level)
	{
		String descr;
		descr = "Proficiencies:\n"
				+ "Armor: None\r\n" + 
				"Weapons: Daggers, darts, slings, quarterstaffs,\r\n" + 
				"light crossbows\r\n" + 
				"Tools: None\r\n" + 
				"Saving Throws: Intelligence, Wisdom\r\n" + 
				"Skills: Choose two from Arcana, History, Insight,\r\n" + 
				"Investigation, Medicine, and Religion\n\n";
		
	
		for(int point = 1; point <= level; point++)
		{
			if(point == 1){
				descr += "Spellcasting. \nAs a student o f arcane magic, you have a spellbook\r\n" + 
						"containing spells that show the first glimmerings of\r\n" + 
						"your true power.\n\n"
						+ "Spellbook.\nAt 1st level, you have a spellbook containing six 1st-level\r\n" + 
						"wizard spells o f your choice.\n\n"
						+ "Ritual Casting. \nYou can cast a wizard spell as a ritual if that spell has\r\n" + 
						"the ritual tag and you have the spell in your spellbook.\r\n" + 
						"You don't need to have the spell prepared.\n\n"
						+ "Spellcasting Focus. \nYou can use an arcane focus (found in chapter 5) as a\r\n" + 
						"spellcasting focus for your wizard spells.\n\n"
						+ "Arcane Recovery. \nYou have learned to regain some o f your magical energy\r\n" + 
						"by studying your spellbook. Once per day when you\r\n" + 
						"finish a short rest, you can choose expended spell slots\r\n" + 
						"to recover. The spell slots can have a combined level that\r\n" + 
						"is equal to or less than half your wizard level (rounded\r\n" + 
						"up), and none o f the slots can be 6th level or higher.\r\n" + 
						"For example, if you’re a 4th-level wizard, you can recover\r\n" + 
						"up to two levels worth o f spell slots. You can recover either\r\n" + 
						"a 2nd-level spell slot or two 1st-level spell slots.\n\n";
			}
			else if(point == 2){//path
				if(subC.equals("abjuration")){
					descr += "Abjuration Savant. \nBeginning when you select this school at 2nd level, the\r\n" + 
							"gold and time you must spend to copy an abjuration\r\n" + 
							"spell into your spellbook is halved.\n\n"
							+ "Arcane Ward. \nStarting at 2nd level, you can weave magic around\r\n" + 
							"yourself for protection. When you cast an abjuration\r\n" + 
							"spell o f 1st level or higher, you can simultaneously use a\r\n" + 
							"strand of the spell’s magic to create a magical ward on\r\n" + 
							"yourself that lasts until you finish a long rest. The ward\r\n" + 
							"has hit points equal to twice your w izard level + your\r\n" + 
							"Intelligence modifier. Whenever you take damage, the\r\n" + 
							"ward takes the damage instead. If this damage reduces\r\n" + 
							"the ward to 0 hit points, you take any remaining damage.\r\n" + 
							"While the ward has 0 hit points, it can’t absorb\r\n" + 
							"damage, but its magic remains. Whenever you cast an\r\n" + 
							"abjuration spell o f 1st level or higher, the ward regains a\r\n" + 
							"number o f hit points equal to twice the level o f the spell.\r\n" + 
							"Once you create the ward, you can't create it again\r\n" + 
							"until you finish a long rest.\n\n";
				}
				else if(subC.equals("conjuration")){
					descr += "Conjuration Savant. \nBeginning when you select this school at 2nd level, the\r\n" + 
							"gold and time you must spend to copy a conjuration spell\r\n" + 
							"into your spellbook is halved.\n\n"
							+ "Minor Conjuration. \nStarting at 2nd level when you select this school, you\r\n" + 
							"can use your action to conjure up an inanimate object\r\n" + 
							"in your hand or on the ground in an unoccupied space\r\n" + 
							"that you can see within 10 feet o f you. This object can be\r\n" + 
							"no larger than 3 feet on a side and weigh no more than\r\n" + 
							"10 pounds, and its form must be that of a nonmagical\r\n" +
							"object that you have seen. The object is visibly magical,\r\n" + 
							"radiating dim light out to 5 feet.\r\n" + 
							"The object disappears after 1 hour, when you use this\r\n" + 
							"feature again, or if it takes any damage.\n\n";
				}
				else if(subC.equals("divination")){
					descr += "Divination Savant. \nBeginning when you select this school at 2nd level, the\r\n" + 
							"gold and time you must spend to copy a divination spell\r\n" + 
							"into your spellbook is halved.\n\n"
							+ "Portent. \nStarting at 2nd level when you choose this school,\r\n" + 
							"glimpses o f the future begin to press in on your\r\n" + 
							"awareness. When you finish a long rest, roll two d20s\r\n" + 
							"and record the numbers rolled. You can replace any\r\n" + 
							"attack roll, saving throw, or ability check made by you or\r\n" + 
							"a creature that you can see with one o f these foretelling\r\n" + 
							"rolls. You must choose to do so before the roll, and you\r\n" + 
							"can replace a roll in this way only once per turn.\r\n" + 
							"Each foretelling roll can be used only once. When you\r\n" + 
							"finish a long rest, you lose any unused foretelling rolls.\n\n";
				}
				else if(subC.equals("enchantment")){
					descr  += "Enchantment Savant. \nBeginning when you select this school at 2nd level, the\r\n" + 
							"gold and time you must spend to copy an enchantment\r\n" + 
							"spell into your spellbook is halved.\n\n"
							+ "Hypnotic Gaze. \nStarting at 2nd level when you choose this school, your\r\n" + 
							"soft words and enchanting gaze can magically enthrall\r\n" + 
							"another creature. A s an action, choose one creature that\r\n" + 
							"you can see within 5 feet of you. If the target can see or\r\n" + 
							"hear you, it must succeed on a Wisdom saving throw\r\n" + 
							"against your wizard spell save DC or be charmed by you\r\n" + 
							"until the end of your next turn. The charmed creature’s\r\n" + 
							"speed drops to 0, and the creature is incapacitated and\r\n" + 
							"visibly dazed.\r\n" + 
							"On subsequent turns, you can use your action to\r\n" + 
							"maintain this effect, extending its duration until the\r\n" + 
							"end of your next turn. However, the effect ends if you\r\n" + 
							"move more than 5 feet away from the creature, if the\r\n" + 
							"creature can neither see nor hear you, or if the creature\r\n" + 
							"takes damage.\r\n" + 
							"Once the effect ends, or if the creature succeeds on its\r\n" + 
							"initial saving throw against this effect, you can’t use this\r\n" + 
							"feature on that creature again until you finish a long rest.\n\n";
				}
				else if(subC.equals("evocation")){
					descr += "Evocation Savant. \nBeginning when you select this school at 2nd level, the\r\n" + 
							"gold and time you must spend to copy an evocation spell\r\n" + 
							"into your spellbook is halved.\n\n"
							+ "Sculpt Spells. \nBeginning at 2nd level, you can create pockets of\r\n" + 
							"relative safety within the effects o f your evocation spells.\r\n" + 
							"When you cast an evocation spell that affects other\r\n" + 
							"creatures that you can see, you can choose a number\r\n" + 
							"of them equal to 1 + the spell’s level. The chosen\r\n" + 
							"creatures automatically succeed on their saving throws\r\n" + 
							"against the spell, and they take no damage if they would\r\n" + 
							"normally take half damage on a successful save.\n\n";
				}
				else if(subC.equals("illusion")){
					descr += "Illusion Savant. \nBeginning when you select this school at 2nd level, the\r\n" + 
							"gold and time you must spend to copy an illusion spell\r\n" + 
							"into your spellbook is halved.\n\n"
							+ "Improved Minor Illusion. \nWhen you choose this school at 2nd level, you learn\r\n" + 
							"the minor illusion cantrip. If you already know this\r\n" + 
							"cantrip, you learn a different w izard cantrip o f your\r\n" +
							"choice. The cantrip doesn’t count against your number\r\n" + 
							"of cantrips known.\r\n" + 
							"When you cast minor illusion, you can create both a\r\n" + 
							"sound and an image with a single casting o f the spell.\n\n";
				}
				else if(subC.equals("transmutation")){
					descr += "Transmutation Savant. \nBeginning when you select this school at 2nd level, the\r\n" + 
							"gold and time you must spend to copy a transmutation\r\n" + 
							"spell into your spellbook is halved.\n\n"
							+ "Minor Alchemy. \nStarting at 2nd level when you select this school, you\r\n" + 
							"can temporarily alter the physical properties o f one\r\n" + 
							"nonmagical object, changing it from one substance into\r\n" + 
							"another. You perform a special alchemical procedure\r\n" + 
							"on one object composed entirely o f wood, stone (but not\r\n" + 
							"a gemstone), iron, copper, or silver, transforming it into\r\n" + 
							"a different one o f those materials. For each 10 minutes\r\n" +
							"you spend performing the procedure, you can transform\r\n" + 
							"up to 1 cubic foot o f material. After 1 hour, or until you\r\n" + 
							"lose your concentration (as if you w ere concentrating on\r\n" + 
							"a spell), the material reverts to its original substance.\n\n";
				}
				else if(subC.equals("necromancy")){
					descr += "Necromancy Savant. \nBeginning when you select this school at 2nd level, the\r\n" + 
							"gold and time you must spend to copy a necromancy\r\n" + 
							"spell into your spellbook is halved.\n\n"
							+ "Grim Harvest. \nAt 2nd level, you gain the ability to reap life energy from\r\n" + 
							"creatures you kill with your spells. Once per turn when\r\n" + 
							"you kill one or more creatures with a spell of 1st level\r\n" + 
							"or higher, you regain hit points equal to twice the spell’s\r\n" + 
							"level, or three times its level if the spell belongs to the\r\n" + 
							"School o f Necromancy. You don’t gain this benefit for\r\n" + 
							"killing constructs or undead.\n\n";
				}
			}
			else if(point == 3){}
			else if(point == 4){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 5){}
			else if(point == 6){//path
				if(subC.equals("abjuration")){
					descr += "Projected Ward. \nStarting at 6th level, when a creature that you can see\r\n" + 
							"within 30 feet of you takes damage, you can use your\r\n" + 
							"reaction to cause your Arcane Ward to absorb that\r\n" + 
							"damage. If this damage reduces the w ard to 0 hit points,\r\n" + 
							"the warded creature takes any remaining damage.\n\n";
				}
				else if(subC.equals("conjuration")){
					descr += "Benign Transposition. \nStarting at 6th level, you can use your action to teleport\r\n" + 
							"up to 30 feet to an unoccupied space that you can see.\r\n" + 
							"Alternatively, you can choose a space within range\r\n" + 
							"that is occupied by a Small or M edium creature. If that\r\n" + 
							"creature is willing, you both teleport, swapping places.\r\n" + 
							"Once you use this feature, you can’t use it again until\r\n" + 
							"you finish a long rest or you cast a conjuration spell of\r\n" + 
							"1st level or higher.\n\n";
				}
				else if(subC.equals("divination")){
					descr += "Expert Divination. \nBeginning at 6th level, casting divination spells comes\r\n" + 
							"so easily to you that it expends only a fraction of your\r\n" + 
							"spellcasting efforts. When you cast a divination spell\r\n" + 
							"of 2nd level or higher using a spell slot, you regain one\r\n" + 
							"expended spell slot. The slot you regain must be of a\r\n" + 
							"level lower than the spell you cast and can’t be higher\r\n" + 
							"than 5th level.\n\n";
				}
				else if(subC.equals("enchantment")){
					descr += "Instinctive Charm. \nBeginning at 6th level, when a creature you can see\r\n" + 
							"within 30 feet o f you makes an attack roll against\r\n" + 
							"you, you can use your reaction to divert the attack,\r\n" + 
							"provided that another creature is within the attack’s\r\n" + 
							"range. The attacker must make a W isdom saving throw\r\n" + 
							"against your wizard spell save DC. On a failed save,\r\n" + 
							"the attacker must target the creature that is closest\r\n" + 
							"to it, not including you or itself. If multiple creatures\r\n" + 
							"are closest, the attacker chooses which one to target.\r\n" +
							"On a successful save, you can’t use this feature on the\r\n" + 
							"attacker again until you finish a long rest.\r\n" + 
							"You must choose to use this feature before knowing\r\n" + 
							"whether the attack hits or misses. Creatures that can’t\r\n" + 
							"be charmed are immune to this effect.\n\n";
				}
				else if(subC.equals("evocation")){
					descr += "Potent Cantrip. \nStarting at 6th level, your damaging cantrips affect\r\n" + 
							"even creatures that avoid the brunt o f the effect. When\r\n" + 
							"a creature succeeds on a saving throw against your\r\n" + 
							"cantrip, the creature takes half the cantrip’s damage (if\r\n" + 
							"any) but suffers no additional effect from the cantrip.\n\n";
				}
				else if(subC.equals("illusion")){
					descr += "Malleable Illusions. \nStarting at 6th level, when you cast an illusion spell that\r\n" + 
							"has a duration of 1 minute or longer, you can use your\r\n" + 
							"action to change the nature o f that illusion (using the\r\n" + 
							"spell’s normal parameters for the illusion), provided that\r\n" + 
							"you can see the illusion.\n\n";
				}
				else if(subC.equals("transmutation")){
					descr += "Transmuter's Stone. \nStarting at 6th level, you can spend 8 hours creating a\r\n" + 
							"transmuter’s stone that stores transmutation magic. You\r\n" + 
							"can benefit from the stone yourself or give it to another\r\n" + 
							"creature. A creature gains a benefit o f your choice\r\n" + 
							"as long as the stone is in the creature’s possession.\r\n" + 
							"When you create the stone, choose the benefit from the\r\n" + 
							"following options:\r\n" + 
							"• Darkvision out to a range o f 60 feet, as described in\r\n" + 
							"chapter 8\r\n" + 
							"• An increase to speed o f 10 feet while the creature is\r\n" + 
							"unencumbered\r\n" + 
							"• Proficiency in Constitution saving throws\r\n" + 
							"• Resistance to acid, cold, fire, lightning, or thunder\r\n" + 
							"damage (your choice whenever you choose this\r\n" + 
							"benefit)\r\n" + 
							"Each time you cast a transmutation spell o f 1st level\r\n" + 
							"or higher, you can change the effect o f your stone if the\r\n" + 
							"stone is on your person.\r\n" + 
							"If you create a new transmuter’s stone, the previous\r\n" + 
							"one ceases to function.\n\n";
				}
				else if(subC.equals("necromancy")){
					descr += "Undead Thralls. \nAt 6th level, you add the animate dead spell to your\r\n" + 
							"spellbook if it is not there already. When you cast\r\n" + 
							"animate dead, you can target one additional corpse\r\n" + 
							"or pile of bones, creating another zombie or skeleton,\r\n" + 
							"as appropriate.\r\n" + 
							"Whenever you create an undead using a necromancy\r\n" + 
							"spell, it has additional benefits:\r\n" + 
							"• The creature’s hit point maximum is increased by an\r\n" + 
							"amount equal to your w izard level.\r\n" + 
							"• The creature adds your proficiency bonus to its\r\n" + 
							"weapon damage rolls.\n\n";
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
			else if(point == 10){//path
				if(subC.equals("abjuration")){
					descr += "Improved Abjuration. \nBeginning at 10th level, when you cast an abjuration\r\n" + 
							"spell that requires you to make an ability check as\r\n" + 
							"a part o f casting that spell (as in counterspell and\r\n" + 
							"dispel magic), you add your proficiency bonus to that\r\n" + 
							"ability check.\n\n";
				}
				else if(subC.equals("conjuration")){
					descr += "Focused Conjuration. \nBeginning at 10th level, while you are concentrating on\r\n" + 
							"a conjuration spell, your concentration can’t be broken\r\n" + 
							"as a result o f taking damage.\n\n";
				}
				else if(subC.equals("divination")){
					descr += "The Third Eye. \nStarting at 10th level, you can use your action to\r\n" + 
							"increase your powers o f perception. When you do so,\r\n"
							+ "choose one o f the following benefits, which lasts until\r\n" + 
							"you are incapacitated or you take a short or long rest.\r\n" + 
							"You can’t use the feature again until you finish a rest.\n\n" + 
							"Darkvision. You gain darkvision out to a range o f 60\r\n" + 
							"feet, as described in chapter 8.\r\n" + 
							"Ethereal Sight. You can see into the Ethereal Plane\r\n" + 
							"within 60 feet o f you.\r\n" + 
							"Greater Comprehension. You can read any language.\r\n" + 
							"See Invisibility. You can see invisible creatures and\r\n" + 
							"objects within 10 feet o f you that are within line o f sight.\n\n";
				}
				else if(subC.equals("enchantment")){
					descr += "Split Enchantment. \nStarting at 10th level, when you cast an enchantment\r\n" + 
							"spell o f 1st level or higher that targets only one creature,\r\n" + 
							"you can have it target a second creature.\n\n";
				}
				else if(subC.equals("evocation")){
					descr += "Empowered Evocation. \nBeginning at 10th level, you can add your Intelligence\r\n" + 
							"modifier to the damage roll of any wizard evocation\r\n" + 
							"spell you cast.\n\n";
				}
				else if(subC.equals("illusion")){
					descr += "Illusory Self. \nBeginning at 10th level, you can create an illusory\r\n" + 
							"duplicate o f yourself as an instant, almost instinctual\r\n" + 
							"reaction to danger. When a creature makes an attack\r\n" + 
							"roll against you, you can use your reaction to interpose\r\n" + 
							"the illusory duplicate between the attacker and\r\n" + 
							"yourself. The attack automatically m isses you, then the\r\n" + 
							"illusion dissipates.\r\n" + 
							"Once you use this feature, you can’t use it again until\r\n" + 
							"you finish a short or long rest.\n\n";
				}
				else if(subC.equals("transmutation")){
					descr += "Shapechanger. \nAt 10th level, you add the polymorph spell to your\r\n" + 
							"spellbook, if it is not there already. You can cast\r\n" + 
							"polymorph without expending a spell slot. When you\r\n" + 
							"do so, you can target only yourself and transform into a\r\n" + 
							"beast w hose challenge rating is 1 or lower.\r\n" + 
							"Once you cast polymorph in this way, you can’t do so\r\n" + 
							"again until you finish a short or long rest, though you\r\n" + 
							"can still cast it normally using an available spell slot.\n\n";
				}
				else if(subC.equals("necromancy")){
					descr += "Inured to Undeath. \nBeginning at 10th level, you have resistance to necrotic\r\n" + 
							"damage, and your hit point maximum can't be reduced.\r\n" + 
							"You have spent so much time dealing with undead and\r\n" + 
							"the forces that animate them that you have become\r\n" + 
							"inured to some of their worst effects.\n\n";
				}
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
				if(subC.equals("abjuration")){
					descr += "Spell Resistance. \nStarting at 14th level, you have advantage on saving\r\n" + 
							"throws against spells.\r\n" + 
							"Furthermore, you have resistance against the\r\n" + 
							"damage of spells.\n\n";
				}
				else if(subC.equals("conjuration")){
					descr += "Durable Summons. \nStarting at 14th level, any creature that you\r\n" + 
							"summon or create with a conjuration spell has 30\r\n" + 
							"temporary hit points.\n\n";
				}
				else if(subC.equals("divination")){
					descr += "Greater Portent. \nStarting at 14th level, the visions in your dreams\r\n" + 
							"intensify and paint a more accurate picture in your mind\r\n" + 
							"of what is to come. You roll three d20s for your Portent\r\n" + 
							"feature, rather than two.\n\n";
				}
				else if(subC.equals("enchantment")){
					descr += "Alter Memories. \nAt 14th level, you gain the ability to make a creature\r\n" + 
							"unaware of your magical influence on it. When you cast\r\n" + 
							"an enchantment spell to charm one or more creatures,\r\n" + 
							"you can alter one creature’s understanding so that it\r\n" + 
							"remains unaware of being charmed.\r\n" + 
							"Additionally, once before the spell expires, you can\r\n" + 
							"use your action to try to make the chosen creature\r\n" + 
							"forget some of the time it spent charmed. The creature\r\n" + 
							"must succeed on an Intelligence saving throw against\r\n" + 
							"your wizard spell save DC or lose a number of hours\r\n" + 
							"of its memories equal to 1 + your Charisma modifier\r\n" + 
							"(minimum 1). You can make the creature forget less\r\n" + 
							"time, and the amount o f time can’t exceed the duration\r\n" + 
							"of your enchantment spell.\n\n";
				}
				else if(subC.equals("evocation")){
					descr += "Overchannel. \nStarting at 14th level, you can increase the power of\r\n" + 
							"your simpler spells. When you cast a w izard spell of\r\n" + 
							"5th level or lower that deals damage, you can deal\r\n" + 
							"maximum damage with that spell.\r\n" + 
							"The first time you do so, you suffer no adverse effect.\r\n" + 
							"If you use this feature again before you finish a long\r\n" + 
							"rest, you take 2d12 necrotic damage for each level of\r\n" + 
							"the spell, immediately after you cast it. Each time you\r\n" + 
							"use this feature again before finishing a long rest, the\r\n" + 
							"necrotic damage per spell level increases by 1d 12. This\r\n" + 
							"damage ignores resistance and immunity.\n\n";
				}
				else if(subC.equals("illusion")){
					descr += "Illusory Reality. \nBy 14th level, you have learned the secret o f weaving\r\n" + 
							"shadow magic into your illusions to give them a semireality.\r\n" + 
							"When you cast an illusion spell o f 1st level or\r\n" + 
							"higher, you can choose one inanimate, nonmagical\r\n" + 
							"object that is part o f the illusion and make that object\r\n" + 
							"real. You can do this on your turn as a bonus action\r\n" + 
							"while the spell is ongoing. The object remains real for\r\n" + 
							"1 minute. For example, you can create an illusion o f a\r\n" + 
							"bridge over a chasm and then make it real long enough\r\n" + 
							"for your allies to cross.\r\n" + 
							"The object can’t deal damage or otherwise\r\n" + 
							"directly harm anyone.\n\n";
				}
				else if(subC.equals("transmutation")){
					descr += "Master Transmuter. \nStarting at 14th level, you can use your action to\r\n" + 
							"consume the reserve of transmutation magic stored\r\n" + 
							"within your transmuter’s stone in a single burst. When\r\n" + 
							"you do so, choose one of the following effects. Your\r\n" + 
							"transmuter’s stone is destroyed and can’t be remade\r\n" + 
							"until you finish a long rest.\n\n" + 
							"Major Transformation. You can transmute one\r\n" + 
							"nonmagical object—no larger than a 5-foot cube—into\r\n" + 
							"another nonmagical object of similar size and mass and\r\n" + 
							"o f equal or lesser value. You must spend 10 minutes\r\n" + 
							"handling the object to transform it.\r\n" + 
							"Panacea. You remove all curses, diseases, and poisons\r\n" + 
							"affecting a creature that you touch with the transmuter’s\r\n" + 
							"stone. The creature also regains all its hit points.\r\n" + 
							"Restore Life. You cast the raise dead spell on a\r\n" + 
							"creature you touch with the transmuter’s stone, without\r\n" + 
							"expending a spell slot or needing to have the spell in\r\n" + 
							"your spellbook.\r\n" + 
							"Restore Youth. You touch the transmuter’s stone to\r\n" + 
							"a willing creature, and that creature’s apparent age is\r\n" + 
							"reduced by 3d10 years, to a minimum o f 13 years. This\r\n" + 
							"effect doesn’t extend the creature’s lifespan.\n\n";
				}
				else if(subC.equals("necromancy")){
					descr += "Command Undead. \nStarting at 14th level, you can use magic to bring\r\n" + 
							"undead under your control, even those created by other\r\n" + 
							"wizards. As an action, you can choose one undead that\r\n" + 
							"you can see within 60 feet o f you. That creature must\r\n" + 
							"make a Charisma saving throw against your wizard\r\n" + 
							"spell save DC. If it succeeds, you can’t use this feature\r\n" + 
							"on it again. If it fails, it becomes friendly to you and\r\n" + 
							"obeys your commands until you use this feature again.\r\n" + 
							"Intelligent undead are harder to control in this way.\r\n" + 
							"If the target has an Intelligence o f 8 or higher, it has\r\n" + 
							"advantage on the saving throw. If it fails the saving\r\n" + 
							"throw and has an Intelligence o f 12 or higher, it can\r\n" + 
							"repeat the saving throw at the end o f every hour until it\r\n" + 
							"succeeds and breaks free.\n\n";
				}
			}
			else if(point == 15){}
			else if(point == 16){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 17){}
			else if(point == 18){
				descr += "Spell Mastery. \nYou have learned to regain some o f your magical energy\r\n" + 
						"by studying your spellbook. Once per day when you\r\n" + 
						"finish a short rest, you can choose expended spell slots\r\n" + 
						"to recover. The spell slots can have a combined level that\r\n" + 
						"is equal to or less than half your wizard level (rounded\r\n" + 
						"up), and none o f the slots can be 6th level or higher.\r\n" + 
						"For example, if you’re a 4th-level wizard, you can recover\r\n" + 
						"up to two levels worth o f spell slots. You can recover either\r\n" + 
						"a 2nd-level spell slot or two 1st-level spell slots.\n\n";
			}
			else if(point == 19){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can’t increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 20){
				descr += "Signature Spell. \nYou have learned to regain some o f your magical energy\r\n" + 
						"by studying your spellbook. Once per day when you\r\n" + 
						"finish a short rest, you can choose expended spell slots\r\n" + 
						"to recover. The spell slots can have a combined level that\r\n" + 
						"is equal to or less than half your wizard level (rounded\r\n" + 
						"up), and none o f the slots can be 6th level or higher.\r\n" + 
						"For example, if you’re a 4th-level wizard, you can recover\r\n" + 
						"up to two levels worth o f spell slots. You can recover either\r\n" + 
						"a 2nd-level spell slot or two 1st-level spell slots.\n\n";
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
			if(point == 1)
			{
				spc = "Cantrips Known: 3\n"
						+ "1st: 2";
			}
			else if(point == 2)
			{
				spc = "Cantrips Known: 3\n"
						+ "1st: 3";
			}
			else if(point == 3)
			{
				spc = "Cantrips Known: 3\n"
						+ "1st: 4\n"
						+ "2nd: 2";
			}else if(point == 4)
			{
				spc = "Cantrips Known: 4\n"
						+ "1st: 4\n"
						+ "2nd: 3";
			}else if(point == 5)
			{
				spc = "Cantrips Known: 4\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 2";
			}else if(point == 6)
			{
				spc = "Cantrips Known: 4\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3";
			}else if(point == 7)
			{
				spc = "Cantrips Known: 4\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 1";
			}else if(point == 8)
			{
				spc = "Cantrips Known: 4\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 2";
			}else if(point == 9)
			{
				spc = "Cantrips Known: 4\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 1";
			}else if(point == 10)
			{
				spc = "Cantrips Known: 5\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2";
			}else if(point == 11)
			{
				spc = "Cantrips Known: 5\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1";
			}else if(point == 12)
			{
				spc = "Cantrips Known: 5\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1";
			}else if(point == 13)
			{
				spc = "Cantrips Known: 5\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1\n"
						+ "7th: 1";
			}else if(point == 14)
			{
				spc = "Cantrips Known: 5\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1\n"
						+ "7th: 1";
			}else if(point == 15)
			{
				spc = "Cantrips Known: 5\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1\n"
						+ "7th: 1\n"
						+ "8th: 1";
			}else if(point == 16)
			{
				spc = "Cantrips Known: 5\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1\n"
						+ "7th: 1\n"
						+ "8th: 1";
			}else if(point == 17)
			{
				spc = "Cantrips Known: 5\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1\n"
						+ "7th: 1\n"
						+ "8th: 1\n"
						+ "9th: 1";
			}else if(point == 18)
			{
				spc = "Cantrips Known: 5\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 3\n"
						+ "6th: 1\n"
						+ "7th: 1\n"
						+ "8th: 1\n"
						+ "9th: 1";
			}else if(point == 19)
			{
				spc = "Cantrips Known: 5\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 3\n"
						+ "6th: 2\n"
						+ "7th: 1\n"
						+ "8th: 1\n"
						+ "9th: 1";
			}else if(point == 20)
			{
				spc = "Cantrips Known: 5\n"
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
