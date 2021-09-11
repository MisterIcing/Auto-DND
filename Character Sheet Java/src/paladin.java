import java.util.ArrayList;
import java.util.*;

public class paladin {

	//page 76
	static public ArrayList<Integer> paladinStats(ArrayList<Integer> stats)
	{
		ArrayList<Integer> newStats = new ArrayList<Integer>(6);
		
		z.sort(stats);
		//strength
		newStats.add(stats.get(0));
		//dex
		newStats.add(stats.get(5));
		//const
		newStats.add(stats.get(1));
		//intel
		newStats.add(stats.get(4));
		//wisdom
		newStats.add(stats.get(3));
		//charisma
		newStats.add(stats.get(2));
		
		return newStats;
	}
	
	static public String getPaladinDescr(String subC, int level)
	{
		String descr;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String style = "";
		descr = "Proficiencies:\n"
				+ "Armor: All armor, shields\r\n" + 
				"Weapons: Simple weapons, martial weapons\r\n" + 
				"Tools: None\r\n" + 
				"Saving Throws: Wisdom, Charisma\r\n" + 
				"Skills: Choose two from Athletics, Insight, Intimidation,\r\n" + 
				"Medicine, Persuasion, and Religion\n\n";
	
		for(int point = 1; point <= level; point++)
		{
			if(point == 1){
				descr += "Divine Sense. \nThe presence of strong evil registers on your senses like\r\n" + 
						"a noxious odor, and powerful good rings like heavenly\r\n" + 
						"music in your ears. As an action, you can open your\r\n" + 
						"awareness to detect such forces. Until the end of your\r\n" + 
						"next turn, you know the location of any celestial, fiend,\r\n" + 
						"or undead within 60 feet of you that is not behind total\r\n" + 
						"cover. You know the type (celestial, fiend, or undead) of\r\n" + 
						"any being w hose presence you sense, but not its identity\r\n" + 
						"(the vampire Count Strahd von Zarovich, for instance).\r\n" + 
						"Within the same radius, you also detect the presence\r\n" + 
						"of any place or object that has been consecrated or\r\n" + 
						"desecrated, as with the hallow spell.\r\n" + 
						"You can use this feature a number of times equal to\r\n" + 
						"1 + your Charisma modifier. When you finish a long rest,\r\n" + 
						"you regain all expended uses.\n\n"
						+ "Lay on Hands. \nYour blessed touch can heal wounds. You have a pool\r\n" + 
						"of healing power that replenishes when you take a long\r\n" + 
						"rest. With that pool, you can restore a total number of\r\n" + 
						"hit points equal to your paladin level x 5.\r\n" + 
						"As an action, you can touch a creature and draw\r\n" + 
						"power from the pool to restore a number of hit points\r\n" + 
						"to that creature, up to the maximum amount remaining\r\n" + 
						"in your pool.\r\n" + 
						"Alternatively, you can expend 5 hit points from your\r\n" + 
						"pool of healing to cure the target of one disease or\r\n" + 
						"neutralize one poison affecting it. You can cure multiple\r\n" + 
						"diseases and neutralize multiple poisons with a single\r\n" + 
						"use of Lay on Hands, expending hit points separately\r\n" + 
						"for each one.\r\n" + 
						"This feature has no effect on undead and constructs.\n\n";
			}
			else if(point == 2){
				descr += "Divine Smite. \nStarting at 2nd level, when you hit a creature with a\r\n" + 
						"melee w eapon attack, you can expend one paladin spell\r\n" + 
						"slot to deal radiant damage to the target, in addition to\r\n" + 
						"the w eapon's damage. The extra damage is 2d8 for a\r\n" + 
						"1st-level spell slot, plus 1d8 for each spell level higher\r\n" + 
						"than 1st, to a maximum of 5d8. The damage increases\r\n" + 
						"by 1d8 if the target is an undead or a fiend.\n\n";
				
				System.out.println("Choose a fighting style: defense, dueling, great weapon, or "
						+ "protection");
				style = in.nextLine().toLowerCase().trim();
				if(style.equals("defense")){
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
							"must be wielding a shield.\n\n";
				}
				
				descr += "Spellcasting. \nBy 2nd level, you have learned to draw on divine\r\n" + 
						"magic through meditation and prayer to cast spells as\r\n" + 
						"a cleric does.\n"
						+ "The Paladin table shows how many spell slots you have\r\n" + 
						"to cast your spells. To cast one of your paladin spells of\r\n" + 
						"1st level or higher, you must expend a slot of the spell's\r\n" + 
						"level or higher. You regain all expended spell slots when\r\n" + 
						"you finish a long rest.\r\n" + 
						"You prepare the list of paladin spells that are available\r\n" + 
						"for you to cast, choosing from the paladin spell list.\r\n" + 
						"When you do so, choose a number of paladin spells\r\n" + 
						"equal to your Charisma modifier + half your paladin\r\n" + 
						"level, rounded down (minimum of one spell). The spells\r\n" + 
						"must be of a level for which you have spell slots.\n"
						+ "You can change your list of prepared spells when you\r\n" + 
						"finish a long rest. Preparing a new list of paladin spells\r\n" + 
						"requires time spent in prayer and meditation: at least 1\r\n" + 
						"minute per spell level for each spell on your list.\n\n";
				
			}
			else if(point == 3){//Path & Spells
				descr += "Divine Health. \nBy 3rd level, the divine magic flowing through you\r\n" + 
						"makes you immune to disease.\n\n"
						
						+ "Sacred Oath. \nWhen you reach 3rd level, you swear the oath that binds\r\n" + 
						"you as a paladin forever. Up to this time you have been\r\n" + 
						"in a preparatory stage, committed to the path but not\r\n" + 
						"yet sworn to it. Now you choose the Oath of Devotion,\r\n" + 
						"the Oath of the Ancients, or the Oath of Vengeance, all\r\n" + 
						"detailed at the end of the class description.\n"
						+ "Each oath has a list of associated spells. You gain\r\n" + 
						"access to these spells at the levels specified in the oath\r\n" + 
						"description. Once you gain access to an oath spell, you\r\n" + 
						"always have it prepared. Oath spells don't count against\r\n" + 
						"the number of spells you can prepare each day.\r\n" + 
						"If you gain an oath spell that doesn't appear on the\r\n" + 
						"paladin spell list, the spell is nonetheless a paladin\r\n" + 
						"spell for you.\n"
						+ "Your oath allows you to channel divine energy to fuel\r\n" + 
						"magical effects. Each Channel Divinity option provided\r\n" + 
						"by your oath explains how to use it.\r\n" + 
						"When you use your Channel Divinity, you choose\r\n" + 
						"which option to use. You must then finish a short or long\r\n" + 
						"rest to use your Channel Divinity again.\r\n" + 
						"Some Channel Divinity effects require saving throws.\r\n" + 
						"When you use such an effect from this class, the DC\r\n" + 
						"equals your paladin spell save DC.\n\n";
				
				if(subC.equals("devotion")){
					descr += "Tenents of Devotion. Honesty. Don't lie or cheat. Let your word be\r\n" + 
							"your promise.\r\n" + 
							"Courage. Never fear to act, though caution is w ise.\r\n" + 
							"Compassion. Aid others, protect the weak, and\r\n" + 
							"punish those who threaten them. Show m ercy to your\r\n" + 
							"foes, but temper it with w isdom.\r\n" + 
							"Honor. Treat others with fairness, and let your\r\n" + 
							"honorable deeds be an example to them. Do as\r\n" + 
							"much good as possible while causing the least\r\n" + 
							"amount of harm.\r\n" + 
							"Duty. Be responsible for your actions and their\r\n" + 
							"consequences, protect those entrusted to your care,\r\n" + 
							"and obey those w ho have just authority over you.\n\n"
							+ "Channel Divinity. \n"
							+ "Sacred Weapon. \nAs an action, you can imbue one\r\n" + 
							"weapon that you are holding with positive energy,\r\n" + 
							"using your Channel Divinity. For 1 minute, you add\r\n" + 
							"your Charisma modifier to attack rolls made with that\r\n" + 
							"weapon (with a minimum bonus of +1). The weapon also\r\n" + 
							"emits bright light in a 20-foot radius and dim light 20\r\n" + 
							"feet beyond that. If the weapon is not already magical, it\r\n" + 
							"becomes magical for the duration.\r\n" + 
							"You can end this effect on your turn as part of any\r\n" + 
							"other action. If you are no longer holding or carrying\r\n" + 
							"this w eapon, or if you fall unconscious, this effect ends.\r\n" + 
							"Turn the Unholy. \nAs an action, you present your\r\n" + 
							"holy symbol and speak a prayer censuring fiends and\r\n" + 
							"undead, using your Channel Divinity. Each fiend or\r\n" + 
							"undead that can see or hear you within 30 feet of you\r\n" + 
							"must make a Wisdom saving throw. If the creature\r\n" + 
							"fails its saving throw, it is turned for 1 minute or until\r\n" + 
							"it takes damage.\r\n" + 
							"A turned creature must spend its turns trying to move\r\n" + 
							"as far away from you as it can, and it can't willingly\r\n" + 
							"move to a space within 30 feet of you. It also can't take\n" +
							"reactions. For its action, it can use only the Dash action\r\n" + 
							"or try to escape from an effect that prevents it from\r\n" + 
							"moving. If there's nowhere to move, the creature can use\r\n" + 
							"the Dodge action.\n\n";
					
					descr += "Spells: Protection from evil and good and Sanctuary.\n\n";
				}
				else if(subC.equals("ancients")){
					descr += "Tenets of the Ancients. Kindle the Light. Through your acts of mercy,\r\n" + 
							"kindness, and forgiveness, kindle the light of hope in the\r\n" + 
							"world, beating back despair.\r\n" + 
							"Shelter the Light. Where there is good, beauty, love,\r\n" + 
							"and laughter in the world, stand against the w ickedness\r\n" + 
							"that w ould swallow it. Where life flourishes, stand\r\n" + 
							"against the forces that would render it barren.\r\n" + 
							"Preserve Your Own Light. Delight in song and\r\n" + 
							"laughter, in beauty and art. If you allow the light to die in\r\n" + 
							"your own heart, you can't preserve it in the world.\r\n" + 
							"Be the Light. Be a glorious beacon for all who live in\r\n" + 
							"despair. Let the light of your joy and courage shine forth\r\n" + 
							"in all your deeds.\n\n"
							+ "Channel Divinity. \n"
							+ "Nature's Wrath. \nYou can use your Channel Divinity\r\n" + 
							"to invoke primeval forces to ensnare a foe. As an action,\r\n" + 
							"you can cause spectral vines to spring up and reach\r\n" + 
							"for a creature within 10 feet of you that you can see.\r\n" + 
							"The creature must succeed on a Strength or Dexterity\r\n" + 
							"saving throw (its choice) or be restrained. While\r\n" + 
							"restrained by the vines, the creature repeats the saving\r\n" + 
							"throw at the end of each of its turns. On a success, it\r\n" + 
							"frees itself and the v ines vanish.\r\n" + 
							"Turn the Faithless. \nYou can use your Channel\r\n" + 
							"Divinity to utter ancient w ords that are painful for fey\r\n" + 
							"and fiends to hear. As an action, you present your holy\n"
							+ "symbol, and each fey or fiend within 30 feet of you that\r\n" + 
							"can hear you must make a W isdom saving throw. On a\r\n" + 
							"failed save, the creature is turned for 1 minute or until it\r\n" + 
							"takes damage.\r\n" + 
							"A turned creature must spend its turns trying to move\r\n" + 
							"as far away from you as it can, and it can't willingly\r\n" + 
							"move to a space within 30 feet of you. It also can't take\r\n" + 
							"reactions. For its action, it can use only the Dash action\r\n" + 
							"or try to escape from an effect that prevents it from\r\n" + 
							"moving. If there's nowhere to move, the creature can use\r\n" + 
							"the Dodge action.\r\n" + 
							"If the creature's true form is concealed by an illusion,\r\n" + 
							"shapeshifting, or other effect, that form is revealed while\r\n" + 
							"it is turned.\n\n";
					
					descr += "Spells. Ensnaring strike and Speak with animals.\n\n";
				}
				else if(subC.equals("vengeance")){
					descr += "Tenets of Vengeance. Fight the Greater Evil. Faced with a choice of fighting\r\n" + 
							"my sworn foes or combating a lesser evil. I choose the\r\n" + 
							"greater evil.\r\n" + 
							"No Mercy for the Wicked. Ordinary foes might win\r\n" + 
							"my mercy, but my sworn enemies do not.\r\n" + 
							"By Any Means Necessary. My qualms can't get in the\r\n" + 
							"way of exterminating my foes.\r\n" + 
							"Restitution. \nIf my foes w reak ruin on the world, it is\r\n" + 
							"because I failed to stop them. I must help those harmed\r\n" + 
							"by their misdeeds.\n\n"
							+ "Channel Divinity.\n"
							+ "Abjure Enemy. \nAs an action, you present your holy\r\n" + 
							"symbol and speak a prayer of denunciation, using your\r\n" + 
							"Channel Divinity. \nChoose one creature within 60 feet\r\n" + 
							"of you that you can see. That creature must make a\r\n" + 
							"Wisdom saving throw, unless it is immune to being\r\n" + 
							"frightened. Fiends and undead have disadvantage on\r\n" + 
							"this saving throw.\r\n" + 
							"On a failed save, the creature is frightened for 1\r\n" + 
							"minute or until it takes any damage. While frightened,\r\n" + 
							"the creature's speed is 0, and it can't benefit from any\r\n" + 
							"bonus to its speed.\r\n" + 
							"On a successful save, the creature's speed is halved\r\n" + 
							"for 1 minute or until the creature takes any damage.\r\n" + 
							"Vow of Enmity. As a bonus action, you can utter a vow\r\n" + 
							"of enmity against a creature you can see within 10 feet\r\n" + 
							"of you, using your Channel Divinity. You gain advantage\r\n" + 
							"on attack rolls against the creature for 1 minute or until\r\n" + 
							"it drops to 0 hit points or falls unconscious.\n\n";
					descr += "Spells. Bane and Hunter's mark.\n\n";
				}
			}
			else if(point == 4){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 5){//Spells
				descr += "Extra Attack. \nBeginning at 5th level, you can attack twice, instead of\r\n" + 
						"once, whenever you take the Attack action on your turn.\n\n";
				
				if(subC.equals("devotion")){descr += "Spells. Lesser restoration and Zone of truth.\n\n";}
				else if(subC.equals("ancients")){descr += "Spells. Moonbeam and Misty step.\n\n";}
				else if(subC.equals("vengeance")){descr += "Spells. Hold person and Misty step.\n\n";}
			}
			else if(point == 6){
				descr += "Aura of Protection. \nStarting at 6th level, whenever you or a friendly creature\r\n" + 
						"within 10 feet of you must make a saving throw, the\r\n" + 
						"creature gains a bonus to the saving throw equal to your\r\n" + 
						"Charisma modifier (with a minimum bonus of +1). You\r\n" + 
						"must be conscious to grant this bonus.\n\n";
			}
			else if(point == 7){//path
				if(subC.equals("devotion")){
					descr += "Aura of Devotion. \nStarting at 7th level, you and friendly creatures within\r\n" + 
							"10 feet of you can't be charmed while you are conscious.\n\n";
				}
				else if(subC.equals("ancients")){
					descr += "Aura of Warding. \nBeginning at 7th level, ancient magic lies so heavily\r\n" + 
							"upon you that it forms an eldritch ward. You and friendly\r\n" + 
							"creatures within 10 feet of you have resistance to\r\n" + 
							"damage from spells.\n\n";
				}
				else if(subC.equals("vengeance")){
					descr += "Relentless Avenger. \nBy 7th level, your supernatural focus helps you close\r\n" + 
							"off a foe's retreat. When you hit a creature with an\r\n" + 
							"opportunity attack, you can move up to half your\r\n" + 
							"speed immediately after the attack and as part of\r\n" + 
							"the same reaction. This movement doesn't provoke\r\n" + 
							"opportunity attacks.\n\n";
				}
			}
			else if(point == 8){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 9){//Spells
				if(subC.equals("devotion")){descr += "Spells. Beacon of hope and Dispel magic.\n\n";}
				else if(subC.equals("ancients")){descr += "Spells. Plant growth and Protection from energy.\n\n";}
				else if(subC.equals("vengeance")){descr += "Spells. Haste and Protection from energy.\n\n";}
			}
			else if(point == 10){
				descr += "Aura of Courage. \nStarting at 10th level, you and friendly creatures\r\n" + 
						"within 10 feet of you can't be frightened while you\r\n" + 
						"are conscious.\n\n";
			}
			else if(point == 11){
				descr += "Improved Divine Smite. \nBy 11th level, you are so suffused with righteous\r\n" + 
						"might that all your melee w eapon strikes carry divine\r\n" + 
						"power with them. Whenever you hit a creature with a\r\n" + 
						"melee weapon, the creature takes an extra 1d8 radiant\r\n" + 
						"damage. If you also use your Divine Smite with an\r\n" + 
						"attack, you add this damage to the extra damage of your\r\n" + 
						"Divine Smite.\n\n";
			}
			else if(point == 12){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 13){//Spells
				if(subC.equals("devotion")){descr += "Spells. Freedom of movement and Guardian of faith.\n\n";}
				else if(subC.equals("ancients")){descr += "Spells. Ice storm and Stoneskin.\n\n";}
				else if(subC.equals("vengeance")){descr += "Spells. Banishment and Dimension door.\n\n";}
			}
			else if(point == 14){
				descr += "Cleansing Touch. \nBeginning at 14th level, you can use your action to\r\n" + 
						"end one spell on yourself or on one willing creature\r\n" + 
						"that you touch.\r\n" + 
						"You can use this feature a number of times equal\r\n" + 
						"to your Charisma modifier (a minimum of once). You\r\n" + 
						"regain expended uses when you finish a long rest.\n\n";
			}
			else if(point == 15){//path
				if(subC.equals("devotion")){
					descr += "Purity of Spirit. \nBeginning at 15th level, you are always under the effects\r\n" + 
							"of a protection from evil and good spell.\n\n";
				}
				else if(subC.equals("ancients")){
					descr += "Undying Sentinel. \nStarting at 15th level, when you are reduced to 0 hit\r\n" + 
							"points and are not killed outright, you can choose to\r\n" + 
							"drop to 1 hit point instead. Once you use this ability, you\r\n" + 
							"can't use it again until you finish a long rest.\r\n" + 
							"Additionally, you suffer none of the drawbacks of old\r\n" + 
							"age, and you can't be aged magically.\n\n";
				}
				else if(subC.equals("vengeance")){
					descr += "Soul of Vengeance. \nStarting at 15th level, the authority with which you\r\n" + 
							"speak your Vow of Enmity gives you greater power over\r\n" + 
							"your foe. When a creature under the effect of your Vow\r\n" + 
							"of Enmity m akes an attack, you can use your reaction to\r\n" + 
							"make a melee weapon attack against that creature if it is\r\n" + 
							"within range.\n\n";
				}
			}
			else if(point == 16){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 17){//Spells
				if(subC.equals("devotion")){descr += "Spells. Commune and Flame strike.\n\n";}
				else if(subC.equals("ancients")){descr += "Spells. Commune with nature and Tree stride.\n\n";}
				else if(subC.equals("vengeance")){descr += "Spells. Hold monster and Scrying.\n\n";}
			}
			else if(point == 18){
				descr += "Aura improvements. \nThe range of auras increase to 30 ft.\n\n";
			}
			else if(point == 19){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 20){//path
				if(subC.equals("devotion")){
					descr +="Holy Nimbus. \nAt 20th level, as an action, you can emanate an aura of\r\n" + 
							"sunlight. For 1 minute, bright light shines from you in a\r\n" + 
							"30-foot radius, and dim light shines 30 feet beyond that.\r\n" + 
							"Whenever an enemy creature starts its turn in the\r\n" + 
							"bright light, the creature takes 10 radiant damage.\r\n" + 
							"In addition, for the duration, you have advantage on\r\n" + 
							"saving throws against spells cast by fiends or undead.\r\n" + 
							"Once you use this feature, you can't use it again until\r\n" + 
							"you finish a long rest.\n\n";
				}
				else if(subC.equals("ancients")){
					descr += "Elder Champion. \nAt 20th level, you can assume the form of an ancient\r\n" + 
							"force of nature, taking on an appearance you choose.\r\n" + 
							"For example, your skin might turn green or take on a\r\n" + 
							"bark-like texture, your hair might become leafy or mosslike,\r\n" + 
							"or you might sprout antlers or a lion-like mane.\r\n" + 
							"Using your action, you undergo a transformation.\r\n" + 
							"For 1 minute, you gain the following benefits:\r\n" + 
							"> At the start of each of your turns, you regain 10 hit\r\n" + 
							"points.\r\n" + 
							"> Whenever you cast a paladin spell that has a casting\r\n" + 
							"time of 1 action, you can cast it using a bonus action\r\n" + 
							"instead.\r\n" + 
							"> Enemy creatures within 10 feet of you have disadvantage\r\n" + 
							"on saving throws against your paladin spells and\r\n" + 
							"Channel Divinity options.\r\n" + 
							"Once you use this feature, you can't use it again until\r\n" + 
							"you finish a long rest.\n\n";
				}
				else if(subC.equals("vengeance")){
					descr += "Avenging Angel. \nAt 20th level, you can assume the form of an\r\n" + 
							"angelic avenger. Using your action, you undergo a\r\n" + 
							"transformation. For 1 hour, you gain the following\r\n" + 
							"benefits:\r\n" + 
							"> Wings sprout from your back and grant you a flying\r\n" + 
							"speed of 60 feet.\r\n" + 
							"> You emanate an aura of menace in a 30-foot radius.\r\n" + 
							"The first time any enemy creature enters the aura or\r\n" + 
							"starts its turn there during a battle, the creature must\r\n" + 
							"succeed on a W isdom saving throw or become frightened\r\n" + 
							"of you for 1 minute or until it takes any damage.\r\n" + 
							"Attack rolls against the frightened creature have\r\n" + 
							"advantage.\r\n" + 
							"Once you use this feature, you can't use it again until\r\n" + 
							"you finish a long rest.\n\n";
				}
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
				spc = "1st: 2";
			}
			else if(point == 3){
				spc = "1st: 3";
			}
			else if(point == 5){
				spc = "1st: 4\n"
						+ "2nd: 2";
			}
			else if(point == 7){
				spc = "1st: 4\n"
						+ "2nd: 3";
			}
			else if(point == 9){
				spc = "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 2";
			}
			else if(point == 11){
				spc = "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3";
			}
			else if(point == 13){
				spc = "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 1";
			}
			else if(point == 15){
				spc = "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 2";
			}
			else if(point == 17){
				spc = "1st: 4\n"
						+ "2nd: 3\n"
						+ "3rd: 3\n"
						+ "4th: 3\n"
						+ "5th: 1";
			}
			else if(point == 19){
				spc = "1st: 4\n"
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
