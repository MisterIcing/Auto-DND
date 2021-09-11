import java.util.ArrayList;

public class cleric {

	//page 50
	static public ArrayList<Integer> clericStats(ArrayList<Integer> stats)
	{
		ArrayList<Integer> newStats = new ArrayList<Integer>(6);
		
		z.sort(stats);
		//strength
		newStats.add(stats.get(2));
		//dex
		newStats.add(stats.get(5));
		//const
		newStats.add(stats.get(1));
		//intel
		newStats.add(stats.get(3));
		//wisdom
		newStats.add(stats.get(0));
		//charisma
		newStats.add(stats.get(4));
		
		return newStats;
	}

	static public String getClericDescr(String subC, int level)
	{
		String descr;
		descr = "Proficiencies:\n"
				+ "Armor: Light armor, medium armor, shields\r\n" + 
				"Weapons: All simple weapons\r\n" + 
				"Tools: None\r\n" + 
				"Saving Throws: Wisdom, Charisma\r\n" + 
				"Skills: Choose two from History, Insight, Medicine,\r\n" + 
				"Persuasion, and Religion\n\n";
	
		for(int point = 1; point <= level; point++)
		{
			if(point == 1){//path and spell
				descr +="Spellcasting. \nAs a conduit for divine power, you can cast cleric spells.\n\n";
				
				if(subC.equals("knowledge")){
					descr +="Spells: Command and Identify\n\n"
							+ "Blessings of Knowledge. \nAt 1st level, you learn two languages of your choice.\r\n" + 
							"You also become proficient in your choice of two of the\r\n" + 
							"following skills: Arcana, History, Nature, or Religion.\r\n" + 
							"Your proficiency bonus is doubled for any ability check\r\n" + 
							"you make that uses either of those skills.\n\n";
				}
				else if(subC.equals("life")){
					descr += "Spells: Bless and Cure wounds\n\n"
							+ "Bonus Proficiency. \nWhen you choose this domain at 1st level, you gain\r\n" + 
							"proficiency with heavy armor.\n\n"
							+ "Disciple of Life. \nAlso starting at 1st level, your healing spells are more\r\n" + 
							"effective. Whenever you use a spell of 1st level or higher\r\n" + 
							"to restore hit points to a creature, the creature regains\r\n" + 
							"additional hit points equal to 2+ the spell's level.\n\n";
				}
				else if(subC.equals("light")){
					descr +="Spells: Burning hands and Faerie fire\n\n"
							+ "Bonus Cantip. \nWhen you choose this domain at 1st level, you gain the\r\n" + 
							"light cantrip if you don't already know it.\n\n"
							+ "Warding Flare. \nAlso at 1st level, you can interpose divine light between\r\n" + 
							"yourself and an attacking enemy. When you are attacked\r\n" + 
							"by a creature within 30 feet of you that you can see,\r\n" + 
							"you can use your reaction to impose disadvantage on\r\n" + 
							"the attack roll, causing light to flare before the attacker\r\n" + 
							"before it hits or misses. An attacker that can't be blinded\r\n" + 
							"is immune to this feature.\r\n" + 
							"You can use this feature a number of times equal to\r\n" + 
							"your W isdom modifier (a minimum of once). \r\n"
							+ "You regain all expanded uses when you finish a long rest.\n\n";
				}
				else if(subC.equals("nature")){
					descr +="Spells: Animal friendship and Speak with animals\n\n"
							+ "Acolyte of Nature. \nAt 1st level, you learn one druid cantrip of your choice.\r\n" + 
							"You also gain proficiency in one of the following skills of\r\n" + 
							"your choice: Animal Handling, Nature, or Survival.\n\n"
							+ "Bonus Proficiency. \nAlso at 1st level, you gain proficiency with heavy armor.\n\n";
				}
				else if(subC.equals("tempest")){
					descr +="Spells: Fog cloud and Thunderwave\n\n"
							+ "Bonus Proficiencies. \nAt 1st level, you gain proficiency with martial  weapons\r\n" + 
							"and heavy armor.\n\n"
							+ "Wrath of the Storm. \nAlso at 1st level, you can thunderously rebuke attackers.\r\n" + 
							"When a creature within 5 feet of you that you can see\r\n" + 
							"hits you with an attack, you can use your reaction to\r\n" + 
							"cause the creature to make a Dexterity saving throw.\r\n" + 
							"The creature takes 2d8 lightning or thunder damage\r\n" + 
							"(your choice) on a failed saving throw, and half as much\r\n" + 
							"damage on a successful one.\r\n" + 
							"You can use this feature a number of times equal to\r\n" + 
							"your Wisdom modifier (a minimum of once). You regain\r\n" + 
							"all expended uses when you finish a long rest.\n\n";
				}
				else if(subC.equals("trickery")){
					descr +="Spells: Charm person and Disguise self\n\n"
							+ "Blessing of the Trickster. \nStarting when you choose this domain at 1st level, you\r\n" + 
							"can use your action to touch a willing creature other\r\n" + 
							"than yourself to give it advantage on Dexterity (Stealth)\r\n" + 
							"checks. This blessing lasts for 1 hour or until you use\r\n" + 
							"this feature again.\n\n";
				}
				else if(subC.equals("war")){
					descr +="Spells: Divine favor and Shield of faith\n\n"
							+ "Bonus Proficiencies. \nAt 1st level, you gain proficiency with martial  weapons\r\n" + 
							"and heavy armor.\n\n"
							+ "War Priest. \nFrom 1st level, your god delivers bolts of inspiration to\r\n" + 
							"you while you are engaged in battle. When you use the\r\n" + 
							"Attack action, you can make one w eapon attack as a\r\n" + 
							"bonus action.\r\n" + 
							"You can use this feature a number of times equal to\r\n" + 
							"your Wisdom modifier (a minimum of once). You regain\r\n" + 
							"all expended uses when you finish a long rest.\n\n";
				}
			}
			else if(point == 2){//path
				descr +="Channel Divinity. \nAt 2nd level, you gain the ability to channel divine\r\n" + 
						"energy directly from your deity, using that energy to fuel\r\n" + 
						"magical effects. You start with two such effects: Turn\r\n" + 
						"Undead and an effect determined by your domain. Some\r\n" + 
						"domains grant you additional effects as you advance in\r\n" + 
						"levels, as noted in the domain description.\r\n" + 
						"When you use your Channel Divinity, you choose\r\n" + 
						"which effect to create. You must then finish a short or\r\n" + 
						"long rest to use your Channel Divinity again.\r\n" + 
						"Some Channel Divinity effects require saving throws.\r\n" + 
						"When you use such an effect from this class, the DC\r\n" + 
						"equals your cleric spell save DC.\n\n"
						+ "Channel Divinity: Turn Undead. \nAs an action, you present your holy symbol and speak a\r\n" + 
						"prayer censuring the undead. Each undead that can see\r\n" + 
						"or hear you within 30 feet of you must make a W isdom\r\n" + 
						"saving throw. If the creature fails its saving throw, it is\r\n" + 
						"turned for 1 minute or until it takes any damage.\r\n" + 
						"A turned creature must spend its turns trying to move\r\n" + 
						"as far away from you as it can, and it can't willingly\r\n" + 
						"move to a space within 30 feet of you. It also can't take\r\n" + 
						"reactions. For its action, it can use only the Dash action\r\n" + 
						"or try to escape from an effect that prevents it from\r\n" + 
						"moving. If there's nowhere to move, the creature can use\r\n" + 
						"the Dodge action.\n\n";
				
				if(subC.equals("knowledge")){
					descr +="Channel Divinity: Knowledge of the Ages. \nStarting at 2nd level, you can use your Channel Divinity\r\n" + 
							"to tap into a divine well of knowledge. As an action,\r\n" + 
							"you choose one skill or tool. For 10 minutes, you have\r\n" + 
							"proficiency with the chosen skill or tool.\n\n";
				}
				else if(subC.equals("life")){
					descr +="Channel Divinity: Preserve Life. \nStarting at 2nd level, you can use your Channel Divinity\r\n" + 
							"to heal the badly injured.\r\n" + 
							"As an action, you present your holy symbol and\r\n" + 
							"evoke healing energy that can restore a number of hit\r\n" + 
							"points equal to five times your cleric level. Choose any\r\n" + 
							"creatures within 30 feet of you, and divide those hit\r\n" + 
							"points among them. This feature can restore a creature\r\n" + 
							"to no more than half of its hit point maximum. You can't\r\n" + 
							"use this feature on an undead or a construct.\n\n";
				}
				else if(subC.equals("light")){
					descr +="Channel Divinity: Radiance of the dawn. \nStarting at 2nd level, you can use your Channel Divinity\r\n" + 
							"to harness sunlight, banishing darkness and dealing\r\n" + 
							"radiant damage to your foes.\r\n" + 
							"As an action, you present your holy symbol, and any\r\n" + 
							"magical darkness within 30 feet of you is dispelled.\r\n" + 
							"Additionally, each hostile creature within 30 feet of\r\n" + 
							"you must make a Constitution saving throw. A creature\r\n" + 
							"takes radiant damage equal to 2d10 + your cleric level\r\n" + 
							"on a failed saving throw, and half as much damage on a\r\n" + 
							"successful one. A creature that has total cover from you\r\n" + 
							"is not affected.\n\n";
				}
				else if(subC.equals("nature")){
					descr +="Channel Divinity: Charm Animals and Plants. \nStarting at 2nd level, you can use your Channel Divinity\r\n" + 
							"to charm animals and plants.\r\n" + 
							"As an action, you present your holy symbol and invoke\r\n" + 
							"the name of your deity. Each beast or plant creature that\r\n" + 
							"can see you within 30 feet of you must make a W isdom\r\n" + 
							"saving throw. If the creature fails its saving throw, it is\r\n" + 
							"charmed by you for 1 minute or until it takes damage.\r\n" + 
							"While it is charmed by you, it is friendly to you and other\r\n" + 
							"creatures you designate.\n\n";
				}
				else if(subC.equals("tempest")){
					descr +="Channel Divinity: Destructive Wrath. \nStarting at 2nd level, you can use your Channel Divinity\r\n" + 
							"to wield the power of the storm with unchecked ferocity.\r\n" + 
							"When you roll lightning or thunder damage, you can\r\n" + 
							"use your Channel Divinity to deal maximum damage,\r\n"
							+ "instead of rolling.\n\n";
				}
				else if(subC.equals("trickery")){
					descr +="Channel Divinity: Invoke Duplicity. \nStarting at 2nd level, you can use your Channel Divinity\r\n" + 
							"to create an illusory duplicate of yourself.\r\n" + 
							"As an action, you create a perfect illusion of\r\n" + 
							"yourself that lasts for 1 minute, or until you lose your\r\n" + 
							"concentration (as if you were concentrating on a spell).\r\n" + 
							"The illusion appears in an unoccupied space that you\r\n" + 
							"can see within 30 feet of you. As a bonus action on your\r\n" + 
							"turn, you can move the illusion up to 30 feet to a space\r\n" + 
							"you can see, but it must remain within 120 feet of you.\r\n" + 
							"For the duration, you can cast spells as though you\r\n" + 
							"were in the illusion's space, but you must use your own\r\n" + 
							"senses. Additionally, when both you and your illusion\r\n" + 
							"are within 5 feet of a creature that can see the illusion,\r\n" + 
							"you have advantage on attack rolls against that creature,\r\n" + 
							"given how distracting the illusion is to the target.\n\n";
				}
				else if(subC.equals("war")){
					descr += "Channel Divinity: Guided Strike. \nStarting at 2nd level, you can use your Channel Divinity\r\n" + 
							"to strike with supernatural accuracy. When you make\r\n" + 
							"an attack roll, you can use your Channel Divinity to gain\r\n" + 
							"a +10 bonus to the roll. You make this choice after you\r\n" + 
							"see the roll, but before the DM says whether the attack\r\n" + 
							"hits or misses.\n\n";
				}
			}
			else if(point ==3)//magic
			{
				if(subC.equals("knowledge")){ descr += "Spells: Augury and Suggestion\n\n";}
				else if(subC.equals("life")){ descr += "Spells: Lesser restoration and Spiritual weapon\n\n";}
				else if(subC.equals("light")){ descr += "Spells Flaming sphere and Scorching ray\n\n";}
				else if(subC.equals("nature")){ descr += "Spells: Barkskin and Spike growth\n\n";}
				else if(subC.equals("tempest")){descr += "Spells: Gust of wind and Shatter\n\n";}
				else if(subC.equals("trickery")){descr += "Spells: Mirror image and Pass without trace\n\n";}
				else if(subC.equals("war")){descr += "Spells: Magic weapon and Spiritual weapon\n\n";}
			}
			else if(point == 4){ 
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 5){//magic
				descr +="Destroy Undead. \nStarting at 5th level, when an undead fails its saving\r\n" + 
						"throw against your Turn Undead feature, the creature is\r\n" + 
						"instantly destroyed if its challenge rating is at or below a\r\n" + 
						"certain threshold. (destroyed if CR is <= 1/2)\n\n";
				
				if(subC.equals("knowledge")){descr += "Spells: Nondetection and Speak with dead\n\n";}
				else if(subC.equals("life")){descr += "Spells: Beacon of hope and Revivify\n\n";}
				else if(subC.equals("light")){descr += "Spells: Daylight and Fireball\n\n";}
				else if(subC.equals("nature")){descr += "Spells: Plant growth and Wind wall\n\n";}
				else if(subC.equals("tempest")){descr += "Spells: Call lightning and Sleet strom\n\n";}
				else if(subC.equals("trickery")){descr += "Spells: Blink and Dispel magic\n\n";}
				else if(subC.equals("war")){descr += "Spells: Crusader's mantle and Spirit guardian\n\n";}
			}
			else if(point == 6){//path
				descr +="Channel Divinity (Override). \nBeginning at 6th level, you can use your Channel\r\n" + 
						"Divinity twice between rests.\n\n";
				
				if(subC.equals("knowledge")){
					descr += "Channel Divinity: Read Thoughts. \nAt 6th level, you can use your Channel Divinity to read a\r\n" + 
							"creature's thoughts. You can then use your access to the\r\n" + 
							"creature's mind to command it.\r\n"
							+ "As an action, choose one creature that you can see\r\n" + 
							"within 60 feet of you. That creature must make a\r\n" + 
							"Wisdom saving throw. If the creature succeeds on the\r\n" + 
							"saving throw, you can't use this feature on it again until\r\n" + 
							"you finish a long rest.\r\n" + 
							"If the creature fails its save, you can read its surface\r\n" + 
							"thoughts (those foremost in its mind, reflecting its\r\n" + 
							"current emotions and what it is actively thinking\r\n" + 
							"about) when it is within 60 feet of you. This effect lasts\r\n" + 
							"for 1 minute.\r\n" + 
							"During that time, you can use your action to end this\r\n" + 
							"effect and cast the suggestion spell on the creature\r\n" + 
							"without expending a spell slot. The target automatically\r\n" + 
							"fails its saving throw against the spell.\n\n";
				}
				else if(subC.equals("life")){
					descr +="Blessed Healer. \nBeginning at 6th level, the healing spells you cast on\r\n" + 
							"others heal you as well. When you cast a spell of 1st\r\n" + 
							"level or higher that restores hit points to a creature\r\n" + 
							"other than you, you regain hit points equal to 2 + the\r\n" + 
							"spell's level.\n\n";
				}
				else if(subC.equals("light")){//fix
					descr +="Improved Flare. \nStarting at 6th level, you can also use your Warding\r\n" + 
							"Flare feature when a creature that you can see within\r\n" + 
							"30 feet of you attacks a creature other than you.\n\n";
				}
				else if(subC.equals("nature")){
					descr +="Dampen Elements. \nStarting at 6th level, when you or a creature within 30\r\n" + 
							"feet of you takes acid, cold, fire, lightning, or thunder\r\n" + 
							"damage, you can use your reaction to grant resistance to\r\n" + 
							"the creature against that instance of the damage.\n\n";
				}
				else if(subC.equals("tempest")){
					descr +="Thunderbolt Strike. \nAt 6th level, when you deal lightning damage to a Large\r\n" + 
							"or smaller creature, you can also push it up to 10 feet\r\n" + 
							"away from you.\n\n";
				}
				else if(subC.equals("trickery")){
					descr +="Channel Divinity: Cloak of Shadows. \nStarting at 6th level, you can use your Channel\r\n" + 
							"Divinity to vanish.\r\n" + 
							"As an action, you become invisible until the end of your\r\n" + 
							"next turn. You become visible if you attack or cast a spell.\n\n";
				}
				else if(subC.equals("war")){
					descr += "Channel Divinity: War God's Blessing. \nAt 6th level, when a creature within 30 feet of you\r\n" + 
							"makes an attack roll, you can use your reaction to grant\r\n" + 
							"that creature a +10 bonus to the roll, using your Channel\r\n" + 
							"Divinity. You make this choice after you see the roll, but\r\n" + 
							"before the DM says whether the attack hits or misses.\n\n";
				}
			}
			else if(point == 7)//magic
			{
				if(subC.equals("knowledge")){descr += "Spells: Arcane eye and Confusion\n\n";}
				else if(subC.equals("life")){descr += "Spells: Death word and Guardian of faith\n\n";}
				else if(subC.equals("light")){descr += "Spells: Guardian of faith and Wall of fire\n\n";}
				else if(subC.equals("nature")){descr += "Spells: Dominate beast and Grasping vine\n\n";}
				else if(subC.equals("tempest")){descr += "Spells: Control water and Ice storm\n\n";}
				else if(subC.equals("trickery")){descr += "Spells: Dimension door and Polymorph\n\n";}
				else if(subC.equals("war")){descr += "Spells: Freedom of movement and Stoneskin\n\n";}
			}
			else if(point == 8){//path
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n"
						+ "Destroy Undead (Override). \nCR threshold increased to 1 CR or lower.\n\n";
			
				if(subC.equals("knowledge") || subC.equals("light")){
					descr += "Potent Spellcasting. \nStarting at 8th level, you add your Wisdom modifier to\r\n" + 
							"the damage you deal with any cleric cantrip.\n\n";
				}
				else if(subC.equals("life") || subC.equals("nature") || subC.equals("tempest")
						|| subC.equals("trickery") || subC.equals("war")){
					descr += "Divine Strike. \nAt 8th level, you gain the ability to infuse your weapon\r\n" + 
							"strikes with divine energy. Once on each of your turns\r\n" + 
							"when you hit a creature with a weapon attack, you can\r\n" + 
							"cause the attack to deal an extra 1d8 radiant damage to\r\n" + 
							"the target. When you reach 14th level, the extra damage\r\n" + 
							"increases to 2d8.\n\n";
				}
			}
			else if(point == 9)//magic
			{
				if(subC.equals("knowledge")){descr += "Spells: Legend lore and Scrying\n\n";}
				else if(subC.equals("life")){descr += "Spells: Mass cure wounds and Raise dead\n\n";}
				else if(subC.equals("light")){descr += "Spells: Flame strike and Scrying\n\n";}
				else if(subC.equals("nature")){descr += "Spells: Insect plague and Tree stride\n\n";}
				else if(subC.equals("tempest")){descr += "Spells: Destructive wave and Insect plague\n\n";}
				else if(subC.equals("trickery")){descr += "Spells: Dominate person and Modify memory\n\n";}
				else if(subC.equals("war")){descr += "Spells: Flame strike and Hold monster\n\n";}
			}
			else if(point == 10){
				descr +="Divine Intervention. \nBeginning at 10th level, you can call on your deity to\r\n" + 
						"intervene on your behalf when your need is great.\r\n" + 
						"Imploring your deity's aid requires you to use your\r\n" + 
						"action. Describe the assistance you seek, and roll\r\n" + 
						"percentile dice. If you roll a number equal to or lower\r\n" + 
						"than your cleric level, your deity intervenes. The DM\r\n" + 
						"chooses the nature of the intervention; the effect of any\r\n" + 
						"cleric spell or cleric domain spell w ould be appropriate.\r\n" + 
						"If your deity intervenes, you can't use this feature\r\n" + 
						"again for 7 days. Otherwise, you can use it again after\r\n" + 
						"you finish a long rest.\n\n";
			}
			else if(point == 11){
				descr +="Destroy Undead (Override). \nCR threshold increased to 2 CR or lower.\n\n";
			}
			else if(point == 12){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 14){
				descr +="Destroy Undead (Override). \nCR threshold increased to 3 CR or lower.\n\n";
			}
			else if(point == 16){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 17){//path
				descr +="Destroy Undead (Override). \nCR threshold increased to 4 CR or lower.\n\n";
			
				if(subC.equals("knowledge")){
					descr += "Visions of the past. \nStarting at 17th level, you can call up visions of the\r\n" + 
							"past that relate to an object you hold or your immediate\r\n" + 
							"surroundings. You spend at least 1 minute in meditation\r\n" + 
							"and prayer, then receive dreamlike, shadowy glimpses\r\n" + 
							"of recent events. You can meditate in this way for a\r\n" + 
							"number of minutes equal to your W isdom score and\r\n" + 
							"must maintain concentration during that time, as if you\r\n" + 
							"were casting a spell.\r\n" + 
							"Once you use this feature, you can't use it again until\r\n" + 
							"you finish a short or long rest.\r\n" + 
							"Object Reading. Holding an object as you meditate,\r\n" + 
							"you can see visions of the object's previous owner.\r\n" + 
							"After meditating for 1 minute, you learn how the owner\r\n" + 
							"acquired and lost the object, as w ell as the most recent\r\n" + 
							"significant event involving the object and that owner.\r\n" + 
							"If the object w as owned by another creature in the\r\n" + 
							"recent past (within a number of days equal to your\r\n" + 
							"Wisdom score), you can spend 1 additional minute\r\n" + 
							"for each owner to learn the same information about\r\n" + 
							"that creature.\r\n" + 
							"Area Reading. As you meditate, you see visions\r\n" + 
							"of recent events in your immediate vicinity (a room,\r\n" + 
							"street, tunnel, clearing, or the like, up to a 50-foot cube),\r\n" + 
							"going back a number of days equal to your W isdom\r\n" + 
							"score. For each minute you meditate, you learn about\r\n" + 
							"one significant event, beginning with the most recent.\r\n" + 
							"Significant events typically involve powerful emotions,\r\n" + 
							"such as battles and betrayals, marriages and murders,\r\n" + 
							"births and funerals. However, they might also include\r\n" + 
							"more mundane events that are nevertheless important\r\n" + 
							"in your current situation.\n\n";
				}
				else if(subC.equals("life")){
					descr +="Supreme Healing. \nStarting at 17th level, when you would normally roll\r\n" + 
							"one or more dice to restore hit points with a spell, you\r\n" + 
							"instead use the highest number possible for each die.\r\n" + 
							"For example, instead of restoring 2d6 hit points to a\r\n" + 
							"creature, you restore 12.\n\n";
				}
				else if(subC.equals("light")){
					descr +="Corona of Light. \nStarting at 17th level, you can use your action to activate\r\n" + 
							"an aura of sunlight that lasts for 1 minute or until you\r\n" + 
							"dismiss it using another action. You emit bright light in\r\n" + 
							"a 60-foot radius and dim light 30 feet beyond that. Your\r\n" + 
							"enemies in the bright light have disadvantage on saving\r\n" + 
							"throws against any spell that deals fire or radiant damage.\n\n";
				}
				else if(subC.equals("nature")){
					descr +="Master of Nature. \nAt 17th level, you gain the ability to command animals\r\n" + 
							"and plant creatures. While creatures are charmed by\r\n" + 
							"your Charm Animals and Plants feature, you can take\r\n" + 
							"a bonus action on your turn to verbally command what\r\n" + 
							"each of those creatures will do on its next turn.\n\n";
				}
				else if(subC.equals("tempest")){
					descr +="Stormborn. \nAt 17th level, you have a flying speed equal to\r\n" + 
							"your current walking speed whenever you are not\r\n" + 
							"underground or indoors.\n\n";
				}
				else if(subC.equals("trickery")){
					descr +="Improved Duplicity. \nAt 17th level, you can create up to four duplicates\r\n" + 
							"of yourself, instead of one, when you use Invoke\r\n" + 
							"Duplicity. As a bonus action on your turn, you can\r\n" + 
							"move any number of them up to 30 feet, to a maximum\r\n" + 
							"range of 120 feet.\n\n";
				}
				else if(subC.equals("war")){
					descr +="Avatar of Battle. \nAt 17th level, you gain resistance to bludgeoning, piercing,\r\n" + 
							"and slashing damage from nonmagical  weapons.\n\n";
				}
			}
			else if(point == 18){
				descr +="Channel Divinity (Override). \nYou can use it three times between rests. When you finish\r\n" + 
						"a short or long rest, you regain your expended uses.\n\n";
			}
			else if(point == 19){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 20){
				descr +="Divine Intervention Improvement. \nAt 20th level, your call for intervention succeeds\r\n" + 
						"automatically, no roll required.\n\n";
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

	static public String getSpc(int level, int wis)
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
		spc += "\n\nSpell Save DC: " + (8 + Integer.parseInt(getProf(level)) + wis)
				+ "\nSpell Attack Modifier: " + (Integer.parseInt(getProf(level)) + wis);
		return spc;
	}
}
