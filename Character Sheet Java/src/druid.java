import java.util.ArrayList;

public class druid {

	//page 58
	static public ArrayList<Integer> druidStats(ArrayList<Integer> stats)
	{
		ArrayList<Integer> newStats = new ArrayList<Integer>(6);
		
		z.sort(stats);
		//strength
		newStats.add(stats.get(5));
		//dex
		newStats.add(stats.get(1));
		//const
		newStats.add(stats.get(2));
		//intel
		newStats.add(stats.get(4));
		//wisdom
		newStats.add(stats.get(0));
		//charisma
		newStats.add(stats.get(3));
		
		return newStats;
	}

	static public String getDruidDescr(String subC, int level)
	{
		String descr;
		descr = "Proficiencies: \nArmor: Light armor, medium armor, shields (druids will " + 
				"not wear armor or use shields made o f metal)\r\n" + 
				"Weapons: Clubs, daggers, darts, javelins, maces, " + 
				"quarterstaffs, scimitars, sickles, slings, spears\r\n" + 
				"Tools: Herbalism kit\r\n" + 
				"Saving Throws: Intelligence, Wisdom\r\n"
				+ "Skills: Choose two from Arcana, Animal " + 
				"Handling, Insight, Medicine, Nature, Perception, " + 
				"Religion, and Survival\n\n";
	
		for(int point = 1; point <= level; point++)
		{
			if(point == 1){
				descr += "Druidic. \nYou know Druidic, the secret language o f druids. You\r\n" + 
						"can speak the language and use it to leave hidden\r\n" + 
						"messages. You and others who know this language\r\n" + 
						"automatically spot such a message. Others spot the\r\n" + 
						"message's presence with a successful DC 15 Wisdom\r\n" + 
						"(Perception) check but can't decipher it without magic.\n\n"
						+ "Spellcasting. \nAt 1st level, you know two cantrips o f your choice from\r\n" + 
						"the druid spell list. You learn additional druid cantrips\r\n" + 
						"o f your choice at higher levels, as shown in the Cantrips\r\n" + 
						"Known column o f the Druid table.\n"
						+ "You can cast a druid spell as a ritual if that spell has the\r\n" + 
						"ritual tag and you have the spell prepared.\r\n" +  
						"You can use a druidic focus (found in chapter 5) as a\r\n" + 
						"spellcasting focus for your druid spells.\n\n";
			}
			else if(point == 2){
				descr +="Wild Shape. \nStarting at 2nd level, you can use your action to\r\n" + 
						"magically assume the shape o f a beast that you have\r\n" + 
						"seen before. You can use this feature twice. You regain\r\n" + 
						"expended uses when you finish a short or long rest.\r\n" + 
						"Your druid level determines the beasts you can\r\n" + 
						"transform into, as shown in the Beast Shapes table. At\r\n" + 
						"2nd level, for example, you can transform into any beast\r\n" + 
						"that has a challenge rating o f 1/4 or lower that doesn't\r\n" + 
						"have a flying or swimming speed. (Max Cr: 1/4; no flying or swimming speed)\n"
						+ "You can stay in a beast shape for a number o f hours\r\n" + 
						"equal to half your druid level (rounded down). You then\r\n" + 
						"revert to your normal form unless you expend another\r\n" + 
						"use o f this feature. You can revert to your normal\r\n" + 
						"form earlier by using a bonus action on your turn. You\r\n" + 
						"automatically revert if you fall unconscious, drop to\r\n" + 
						"0 hit points, or die.\r\n" + 
						"While you are transformed, the following rules apply:\n"
						+ "Your game statistics are replaced by the statistics of\r\n" + 
						"the beast, but you retain your alignment, personality,\r\n" + 
						"and Intelligence, Wisdom, and Charisma scores. You\r\n" + 
						"also retain all o f your skill and saving throw proficiencies,\r\n" + 
						"in addition to gaining those o f the creature. If\r\n" + 
						"the creature has the same proficiency as you and the\r\n" + 
						"bonus in its stat block is higher than yours, use the\r\n" + 
						"creature's bonus instead of yours. If the creature has\r\n" + 
						"any legendary or lair actions, you can't use them.\r\n" + 
						"> When you transform, you assume the beast's hit\r\n" + 
						"points and Hit Dice. When you revert to your normal\r\n" + 
						"form, you return to the number o f hit points you had\r\n" + 
						"before you transformed. However, if you revert as a\r\n" + 
						"result o f dropping to 0 hit points, any excess damage\r\n" + 
						"carries over to your normal form. For example, if you\r\n" + 
						"take 10 damage in animal form and have only 1 hit\r\n" + 
						"point left, you revert and take 9 damage. As long as\r\n" + 
						"the excess damage doesn't reduce your normal form\r\n" + 
						"to 0 hit points, you aren't knocked unconscious.\r\n" + 
						"> You can't cast spells, and your ability to speak or\r\n" + 
						"take any action that requires hands is limited to the\r\n" + 
						"capabilities o f your beast form. Transforming doesn't\r\n" + 
						"break your concentration on a spell you've already\r\n" + 
						"cast, however, or prevent you from taking actions that\r\n" + 
						"are part o f a spell, such as call lightning, that you've\r\n" + 
						"already cast.\r\n" + 
						"> You retain the benefit o f any features from your class,\r\n" + 
						"race, or other source and can use them if the new\r\n" + 
						"form is physically capable o f doing so. However, you\r\n" + 
						"can't use any o f your special senses, such as darkvision,\r\n" + 
						"unless your new form also has that sense.\r\n" + 
						"> You choose whether your equipment falls to the\r\n" + 
						"ground in your space, merges into your new form, or\r\n" + 
						"is w orn by it. Worn equipment functions as normal,\r\n" + 
						"but the DM decides whether it is practical for the new\r\n" + 
						"form to wear a piece o f equipment, based on the creature's\r\n" + 
						"shape and size. Your equipment doesn't change\r\n" + 
						"size or shape to match the new form, and any equipment that\r\n" + 
						"the new form can't w ear must either fall to the\r\n" + 
						"ground or merge with it Equipment that merges with the form has no\r\n" + 
						"effect until you leave the form.\n\n"
						+ "Druid Circle. \nAt 2nd level, you choose to\r\n" + 
						"identify with a circle o f druids:\r\n" + 
						"the Circle o f the Land or the Circle o f the Moon, both\r\n" + 
						"detailed at the end o f the class description. Your choice\r\n" + 
						"grants you features at 2nd level and again at 6th, 10th,\r\n" + 
						"and 14th level.\n\n";
				
				if(!(subC.equals("moon")))
				{
					descr += "Bonus Cantrip. \nWhen you choose this circle at 2nd level, you learn one\r\n" + 
							"additional druid cantrip of your choice.\n\n"
							+ "Natural Recovery. \nStarting at 2nd level, you can regain some o f your\r\n" + 
							"magical energy by sitting in meditation and communing\r\n" + 
							"with nature. During a short rest, you choose expended\r\n" + 
							"spell slots to recover. The spell slots can have a\r\n" + 
							"combined level that is equal to or less than half your\r\n" + 
							"druid level (rounded up), and none of the slots can be\r\n" + 
							"6th level or higher. You can't use this feature again until\r\n" + 
							"you finish a long rest\r\n" + 
							"For example, when you are a 4th-level druid, you can\r\n" + 
							"recover up to two levels w orth of spell slots. You can\r\n" + 
							"recover either a 2nd-level slot or two 1st-level slots.\n\n";
				}
				else if(subC.equals("moon")){
					descr +="Combat Wild Shape. \nWhen you choose this circle at 2nd level, you gain the\r\n" + 
							"ability to use Wild Shape on your turn as a bonus action,\r\n" + 
							"rather than as an action.\r\n" + 
							"Additionally, while you are transformed by Wild\r\n" + 
							"Shape, you can use a bonus action to expend one\r\n" + 
							"spell slot to regain 1d8 hit points per level o f the spell\r\n" + 
							"slot expended.\n\n"
							+ "Circle Forms. \nThe rites of your circle grant you the ability to transform\r\n" + 
							"into more dangerous animal forms. Starting at 2nd\r\n" + 
							"level, you can use your Wild Shape to transform into a\r\n" + 
							"beast with a challenge rating as high as 1 (you ignore\r\n" + 
							"the Max. CR column of the Beast Shapes table, but must\r\n" + 
							"abide by the other limitations there).\n\n";
					}
			}
			else if(point == 3){
				if(!(subC.equals("moon"))) {
					descr += "Circle Spells. \nOnce you gain access to a circle spell, you always have\r\n" + 
							"it prepared, and it doesn't count against the number of\r\n" + 
							"spells you can prepare each day. If you gain access to a\r\n" + 
							"spell that doesn't appear on the druid spell list, the spell\r\n" + 
							"is nonetheless a druid spell for you.\n\n";
				}
				
				if(subC.equals("arctic")) {descr +="Spells: Hold person and Spike growth\n\n";}
				else if(subC.equals("coast")){descr +="Spells: Mirror image and Misty step\n\n";}
				else if(subC.equals("desert")){descr +="Spells: Blur and Silence\n\n";}
				else if(subC.equals("forest")){descr +="Spells: Barkskin and Spider climb\n\n";}
				else if(subC.equals("grassland")){descr +="Spells: Invisibility and Pass without trace\n\n";}
				else if(subC.equals("mountain")){descr +="Spells: Spider climb and Spike growth\n\n";}
				else if(subC.equals("swamp")){descr +="Spells: Darkness and Melf's acid arrow\n\n";}
				else if(subC.equals("underdark")){descr +="Spells: Spider climb and Web\n\n";}
			}
			else if(point == 4){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 5){
				
				if(subC.equals("arctic")) {descr +="Spells: Sleet storm and Slow\n\n";}
				else if(subC.equals("coast")){descr +="Spells: Water breathing and Water walk\n\n";}
				else if(subC.equals("desert")){descr +="Spells: Create food and water and Protection from energy\n\n";}
				else if(subC.equals("forest")){descr +="Spells: Call lightning and Plant growth\n\n";}
				else if(subC.equals("grassland")){descr +="Spells: Daylight and Haste\n\n";}
				else if(subC.equals("mountain")){descr +="Spells: Lightinign bolt and Meld into stone\n\n";}
				else if(subC.equals("swamp")){descr +="Spells: Water walk and Stinking cloud\n\n";}
				else if(subC.equals("underdark")){descr +="Spells: Gaseous form and Stinking cloud\n\n";}
			}
			else if(point == 6){
				
				if(!(subC.equals("moon"))) {
					descr +="Land's Stride. \nStarting at 6th level, moving through nonmagical\r\n" + 
							"difficult terrain costs you no extra movement. You can\r\n" + 
							"also pass through nonmagical plants without being\r\n" + 
							"slowed by them and without taking damage from them if\r\n" + 
							"they have thorns, spines, or a similar hazard.\r\n" + 
							"In addition, you have advantage on saving throws against\r\n" + 
							"plants that are magically created or manipulated to impede\r\n" + 
							"movement, such those created by the entangle spell.\n\n";
				}
				else if(subC.equals("moon")){
					descr +="Circle Forms (Override). \nStarting at 6th level, you can transform into a beast\r\n" + 
							"with a challenge rating as high as your druid level\r\n" + 
							"divided by 3, rounded down.\n\n"
							+ "Primal Strike. \nStarting at 6th level, your attacks in beast form count as\r\n" + 
							"magical for the purpose o f overcoming resistance and\r\n" + 
							"immunity to nonmagical attacks and damage.\n\n";
					}
			}
			else if(point == 7){
				
				if(subC.equals("arctic")) {descr +="Spells: Freedom of movement and Ice storm\n\n";}
				else if(subC.equals("coast")){descr +="Spells: Control water and Freedom of movement\n\n";}
				else if(subC.equals("desert")){descr +="Spells: Blight and Hallucinatory terrain\n\n";}
				else if(subC.equals("forest")){descr +="Spells: Divination and Freedom of movement\n\n";}
				else if(subC.equals("grassland")){descr +="Spells: Divination and Freedom of movement\n\n";}
				else if(subC.equals("mountain")){descr +="Spells: Stone shape and Stoneskin\n\n";}
				else if(subC.equals("swamp")){descr +="Spells: Freedom of movement and Locate creature\n\n";}
				else if(subC.equals("underdark")){descr +="Spells: Greater invisibility and Stone shape\n\n";}
			}
			else if(point == 8){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 9){
				
				if(subC.equals("arctic")) {descr +="Spells: Commune with nature and Cone of cold\n\n";}
				else if(subC.equals("coast")){descr +="Spells: Conjure elemental and Scrying\n\n";}
				else if(subC.equals("desert")){descr +="Spells: Insect plague and Wall of stone\n\n";}
				else if(subC.equals("forest")){descr +="Spells: Commune with nature and Tree stride\n\n";}
				else if(subC.equals("grassland")){descr +="Spells: Dream and Insect plague\n\n";}
				else if(subC.equals("mountain")){descr +="Spells: Passwall and Wall of stone\n\n";}
				else if(subC.equals("swamp")){descr +="Spells: Insect plague and Scrying\n\n";}
				else if(subC.equals("underdark")){descr +="Spells: Cloudkill and Insect plague\n\n";}
			}
			else if(point == 10){
				
				if(!(subC.equals("moon"))) {
					descr +="Nature's Ward. \nWhen you reach 10th level, you can't be charmed or\r\n" + 
							"frightened by elementals or fey, and you are immune to\r\n" + 
							"poison and disease.\n\n";
				}
				else if(subC.equals("moon")){
					descr +="Elemental Wild Shape. \nAt 10th level, you can expend two uses of Wild Shape\r\n" + 
							"at the same time to transform into an air elemental, an\r\n" + 
							"earth elemental, a fire elemental, or a water elemental.\n\n";
					}
			}
			else if(point == 11){}
			else if(point == 12){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 13){}
			else if(point == 14){
				
				if(!(subC.equals("moon"))) {
					descr +="Nature's Sanctuary. \nWhen you reach 14th level, creatures o f the natural\r\n" + 
							"world sense your connection to nature and become\r\n" + 
							"hesitant to attack you. When a beast or plant creature\r\n" + 
							"attacks you, that creature must make a Wisdom saving\r\n" + 
							"throw against your druid spell save DC. On a failed save,\r\n" + 
							"the creature must choose a different target, or the attack\r\n" + 
							"automatically misses. On a successful save, the creature\r\n" + 
							"is immune to this effect for 24 hours.\r\n" + 
							"The creature is aware o f this effect before it makes its\r\n" + 
							"attack against you.\n\n";
					}
				else if(subC.equals("moon")){
					descr +="Thousand Forms. \nBy 14th level, you have learned to use magic to alter\r\n" + 
							"your physical form in more subtle ways. You can cast the\r\n" + 
							"alter self spell at will.\n\n";
					}
			}
			else if(point == 15){}
			else if(point == 16){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 17){}
			else if(point == 18){
				descr += "Timeless Body. \nStarting at 18th level, the primal magic that you wield\r\n" + 
					"causes you to age more slowly. For every 10 years that\r\n" + 
					"pass, your body ages only 1 year.\n\n"
					+ "Beast Spells. \nBeginning at 18th level, you can cast many of your druid\r\n" + 
					"spells in any shape you assume using Wild Shape. You\r\n" + 
					"can perform the somatic and verbal components of a\r\n" + 
					"druid spell while in a beast shape, but you aren't able to\r\n" + 
					"provide material components.\n\n";
			}
			else if(point == 19){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 20){
				descr += "Archdruid. \nAt 20th level, you can use your W ild Shape an unlimited\r\n" + 
						"number of times. Additionally, you can ignore the verbal and somatic\r\n" + 
						"components of your druid spells, as well as any material\r\n" + 
						"components that lack a cost and aren't consumed by a\r\n" + 
						"spell. You gain this benefit in both your normal shape\r\n" + 
						"and your beast shape from Wild Shape.\n\n";
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
		for(int point = 1; point <= level; point ++)
		{
			if(point == 1)
			{
				spc = "Cantrips Known: 2\n"
						+ "1st: 2";
			}
			else if(point == 2)
			{
				spc = "Cantrips Known: 2\n"
						+ "1st: 3";
			}
			else if(point == 3)
			{
				spc = "Cantrips Known: 2\n"
						+ "1st: 4\n"
						+ "2nd: 2";
			}else if(point == 4)
			{
				spc = "Cantrips Known: 3\n"
						+ "1st: 4\n"
						+ "2nd: 3";
			}else if(point == 5)
			{
				spc = "Cantrips Known: 3\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 2";
			}else if(point == 6)
			{
				spc = "Cantrips Known: 3\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3";
			}else if(point == 7)
			{
				spc = "Cantrips Known: 3\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 1";
			}else if(point == 8)
			{
				spc = "Cantrips Known: 3\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 2";
			}else if(point == 9)
			{
				spc = "Cantrips Known: 3\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 1";
			}else if(point == 10)
			{
				spc = "Cantrips Known: 4\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2";
			}else if(point == 11)
			{
				spc = "Cantrips Known: 4\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1";
			}else if(point == 12)
			{
				spc = "Cantrips Known: 4\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1";
			}else if(point == 13)
			{
				spc = "Cantrips Known: 4\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1\n"
						+ "7th: 1";
			}else if(point == 14)
			{
				spc = "Cantrips Known: 4\n"
						+ "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 2\n"
						+ "6th: 1\n"
						+ "7th: 1";
			}else if(point == 15)
			{
				spc = "Cantrips Known: 4\n"
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
				spc = "Cantrips Known: 4\n"
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
				spc = "Cantrips Known: 4\n"
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
				spc = "Cantrips Known: 4\n"
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
				spc = "Cantrips Known: 4\n"
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
				spc = "Cantrips Known: 4\n"
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
