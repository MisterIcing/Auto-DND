import java.util.ArrayList;
import java.util.Scanner;

public class warlock {

	//page 99
	static public ArrayList<Integer> warlockStats(ArrayList<Integer> stats)
	{
		ArrayList<Integer> newStats = new ArrayList<Integer>(6);
		
		z.sort(stats);
		//strength
		newStats.add(stats.get(4));
		//dex
		newStats.add(stats.get(2));
		//const
		newStats.add(stats.get(1));
		//intel
		newStats.add(stats.get(5));
		//wisdom
		newStats.add(stats.get(3));
		//charisma
		newStats.add(stats.get(0));
		
		return newStats;
	}
	
	static public String getWarlockDescr(String subC, int level)
	{
		String descr;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String a = "";
		String Boon = "";
		descr = "Proficiencies:\n"
				+ "Armor: Light armor\r\n" + 
				"Weapons: Simple weapons\r\n" + 
				"Tools: None\r\n" + 
				"Saving Throws: Wisdom, Charisma\r\n" + 
				"Skills: Choose two skills from Arcana,\r\n" + 
				"Deception, History, Intimidation, Investigation,\r\n" + 
				"Nature, and Religion\n\n";
	
		for(int point = 1; point <= level; point++)
		{
			if(point == 1){//path
				descr += "Pact Magic. \nYour arcane research and the magic bestowed on you\r\n" + 
						"by your patron have given you facility with spells. \nYou know two cantrips of your choice from the warlock\r\n" + 
						"spell list. You can use an arcane focus (found in chapter 5) as a\r\n" + 
						"spellcasting focus for your warlock spells.\n\n";
				
				if(subC.equals("archfey")){
					descr += "Fey Presence. \nStarting at 1st level, your patron bestows upon you the\r\n" + 
							"ability to project the beguiling and fearsome presence\r\n" + 
							"of the fey. As an action, you can cause each creature in\r\n" + 
							"a 10-foot cube originating from you to make a Wisdom\r\n" + 
							"saving throw against your w arlock spell save DC. The\r\n" + 
							"creatures that fail their saving throws are all charmed\r\n" + 
							"or frightened by you (your choice) until the end of\r\n" + 
							"your next turn.\r\n" + 
							"Once you use this feature, you can't use it again until\r\n" + 
							"you finish a short or long rest.\n\n"
							+ "Spells: Faerie fire and Sleep\n\n";
				}
				else if(subC.equals("fiend")){
					descr += "Dark One's Blessing. \nStarting at 1st level, when you reduce a hostile creature\r\n" + 
							"to 0 hit points, you gain temporary hit points equal to your\r\n" + 
							"Charisma modifier + your warlock level (minimum of 1).\n\n"
							+ "Spells: Burning hands and Command\n\n";
				}
				else if(subC.equals("great")){
					descr += "Awakened Mind. \nStarting at 1st level, your alien knowledge gives you\r\n" + 
							"the ability to touch the minds of other creatures. You\r\n" + 
							"can communicate telepathically with any creature you\r\n" + 
							"can see within 30 feet of you. You don't need to share\r\n" + 
							"a language with the creature for it to understand your\r\n" + 
							"telepathic utterances, but the creature must be able to\r\n" + 
							"understand at least one language.\n\n"
							+ "Spells: Dissonant whispers and Tasha's hideous laughter\n\n";
				}
			}
			else if(point == 2){//ask for list of invocations
				descr += "Eldritch Invocations. \nIn your study of occult lore, you have unearthed eldritch\r\n" + 
						"invocations, fragments of forbidden knowledge that\r\n" + 
						"imbue you with an abiding magical ability.\r\n" + 
						"At 2nd level, you gain two eldritch invocations of your\r\n" + 
						"choice. When you gain certain w arlock\r\n" + 
						"levels, you gain additional invocations of your choice,\r\n" + 
						"as shown in the Invocations Known column of the\r\n" + 
						"Warlock table.\r\n" + 
						"Additionally, when you gain a level in this class,\r\n" + 
						"you can choose one of the invocations you know and\r\n" + 
						"replace it with another invocation that you could learn\r\n" + 
						"at that level.\n\n";
				System.out.println("Would you like a list of Eldritch Invocations?");
				a = in.nextLine().toLowerCase().trim();
				
				//spells
				if(subC.equals("archfey")){
					descr += "Spells: Calm emotions and Phantasmal force\n\n";
				}
				else if(subC.equals("fiend")){
					descr += "Spells: Blindness/deafness and Scorching ray\n\n";
				}
				else if(subC.equals("great")){
					descr += "Spells: Detect thoughts and Phantasmal force\n\n";
				}
			}
			else if(point == 3){//choose?
				descr += "Pact Boon. \nAt 3rd level, your otherworldly patron bestows a gift\r\n" + 
						"upon you for your loyal service.\n\n";
				System.out.println("Pick a Boon: Chain, Blade, or Tome.");
				Boon = in.nextLine().toLowerCase().trim();
						
				if(Boon.equals("chain"))
				{
					descr += "Pact of the Chain.\r\n" + 
						"You learn the find familiar spell and can cast it as a\r\n" + 
						"ritual. The spell doesn't count against your number of\r\n" + 
						"spells known.\r\n" + 
						"When you cast the spell, you can choose one of the\r\n" + 
						"normal forms for your familiar or one of the following\r\n" + 
						"special forms: imp, pseudodragon, quasit, or sprite.\r\n" + 
						"Additionally, when you take the Attack action, you can\r\n" + 
						"forgo one of your own attacks to allow your familiar to\r\n" + 
						"make one attack of its own.\n\n";
				}
				else if(Boon.equals("blade"))
				{
					descr += "Pact of the Blade.\r\n" + 
						"You can use your action to create a pact weapon in your\r\n" + 
						"empty hand. You can choose the form that this melee\r\n" + 
						"weapon takes each time you create it (see chapter 5 for\r\n" + 
						"weapon options). You are proficient with it while you\r\n" + 
						"wield it. This weapon counts as magical for the purpose\r\n" + 
						"of overcoming resistance and immunity to nonmagical\r\n" + 
						"attacks and damage.\n" +
						"Your pact weapon disappears if it is more than 5 feet\r\n" + 
						"away from you for 1 minute or more. It also disappears\r\n" + 
						"if you use this feature again, if you dismiss the weapon\r\n" + 
						"(no action required), or if you die.\r\n" + 
						"You can transform one magic weapon into your pact\r\n" + 
						"weapon by performing a special ritual while you hold\r\n" + 
						"the weapon. You perform the ritual over the course\r\n" + 
						"of 1 hour, which can be done during a short rest.\r\n" + 
						"You can then dismiss the weapon, shunting it into an\r\n" + 
						"extradimensional space, and it appears whenever you\r\n" + 
						"create your pact weapon thereafter. You can't affect an\r\n" + 
						"artifact or a sentient weapon in this way. The weapon\r\n" + 
						"ceases being your pact weapon if you die, if you perform\r\n" + 
						"the 1-hour ritual on a different weapon, or if you use\r\n" + 
						"a 1-hour ritual to break your bond to it. The weapon\r\n" + 
						"appears at your feet if it is in the extradimensional space\r\n" + 
						"when the bond breaks.\n\n";
				}
				else if(Boon.equals("tome"))
				{
					descr += "Pact of the Tome.\r\n" + 
						"Your patron gives you a grimoire called a Book of\r\n" + 
						"Shadows. When you gain this feature, choose three\r\n" + 
						"cantrips from any class's spell list. While the book is on\r\n" + 
						"your person, you can cast those cantrips at will. They\r\n" + 
						"don't count against your number of cantrips known.\r\n" + 
						"If you lose your Book of Shadows, you can perform\r\n" + 
						"a 1-hour ceremony to receive a replacement from your\r\n" + 
						"patron. This ceremony can be performed during a short\r\n" + 
						"or long rest, and it destroys the previous book. The book\r\n" + 
						"turns to ash when you die.\n\n";
				}
				
				//spells
				if(subC.equals("archfey")){
					descr += "Spells: Blink and Plant growth\n\n";
				}
				else if(subC.equals("fiend")){
					descr += "Spells: Fireball and Stinking cloud\n\n";
				}
				else if(subC.equals("great")){
					descr += "Spells: Clairvoyance and Sending\n\n";
				}
			}
			else if(point == 4){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
				
				//spells
				if(subC.equals("archfey")){
					descr += "Spells: Dominate beast and Greater invisibility\n\n";
				}
				else if(subC.equals("fiend")){
					descr += "Spells: Fire shield and Wall of fire\n\n";
				}
				else if(subC.equals("great")){
					descr += "Spells: Dominate beast and Evard's black tentacles\n\n";
				}
			}
			else if(point == 5){
				//spells
				if(subC.equals("archfey")){
					descr += "Spells: Dominate person and Seeming\n\n";
				}
				else if(subC.equals("fiend")){
					descr += "Spells: Flame strike and Hallow\n\n";
				}
				else if(subC.equals("great")){
					descr += "Spells: Dominate person and telekinesis\n\n";
				}
			}
			else if(point == 6){//path
				if(subC.equals("archfey")){
					descr += "Misty Escape. \nStarting at 6th level, you can vanish in a puff of mist in\r\n" + 
							"response to harm. When you take damage, you can use\r\n" + 
							"your reaction to turn invisible and teleport up to 60 feet\r\n" + 
							"to an unoccupied space you can see. You remain invisible\r\n" + 
							"until the start of your next turn or until you attack or\r\n" + 
							"cast a spell.\r\n" + 
							"Once you use this feature, you can't use it again until\r\n" + 
							"you finish a short or long rest.\n\n";
				}
				else if(subC.equals("fiend")){
					descr += "Dark One's Own Luck. \nStarting at 6th level, you can call on your patron to alter\r\n" + 
							"fate in your favor. When you make an ability check or a\r\n" + 
							"saving throw, you can use this feature to add a d 10 to\r\n" + 
							"your roll. You can do so after seeing the initial roll but\r\n" + 
							"before any of the roll's effects occur.\r\n" + 
							"Once you use this feature, you can't use it again until\r\n" + 
							"you finish a short or long rest.\n\n";
				}
				else if(subC.equals("great")){
					descr += "Entropic Ward. \nAt 6th level, you learn to magically ward yourself against\r\n" + 
							"attack and to turn an enemy's failed strike into good\r\n" + 
							"luck for yourself. When a creature makes an attack\r\n" + 
							"roll against you, you can use your reaction to impose\r\n" + 
							"disadvantage on that roll. If the attack misses you, your\r\n" + 
							"next attack roll against the creature has advantage if you\r\n" + 
							"make it before the end of your next turn.\r\n" + 
							"Once you use this feature, you can't use it again until\r\n" + 
							"you finish a short or long rest.\n\n";
				}
			}
			else if(point == 7){}
			else if(point == 8){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 9){}
			else if(point == 10){//path
				if(subC.equals("archfey")){
					descr += "Beguiling Defense. \nBeginning at 10th level, your patron teaches you how to\r\n" + 
							"turn the mind-affecting magic of your enemies against\r\n" + 
							"them. You are immune to being charmed, and when\r\n" + 
							"another creature attempts to charm you, you can use\r\n" + 
							"your reaction to attempt to turn the charm back on\r\n" + 
							"that creature. The creature must succeed on a Wisdom\r\n" + 
							"saving throw against your warlock spell save DC or\r\n" + 
							"be charmed by you for 1 minute or until the creature\r\n" + 
							"takes any damage.\n\n";
				}
				else if(subC.equals("fiend")){
					descr += "Fiendish Resilience. \nStarting at 10th level, you can choose one damage type\r\n" + 
							"when you finish a short or long rest. You gain resistance\r\n" + 
							"to that damage type until you choose a different one\r\n" + 
							"with this feature. Damage from magical weapons or\r\n" + 
							"silver weapons ignores this resistance.\n\n";
				}
				else if(subC.equals("great")){
					descr += "Thought Shield. \nStarting at 10th level, your thoughts can't be read by\r\n" + 
							"telepathy or other m eans unless you allow it. You also\r\n" + 
							"have resistance to psychic damage, and whenever a\r\n" + 
							"creature deals psychic damage to you, that creature\r\n" + 
							"takes the same amount of damage that you do.\n\n";
				}
			}
			else if(point == 11){
				descr += "Mystic Arcanum (6th Level). \nAt 11th level, your patron bestows upon you a magical\r\n" + 
						"secret called an arcanum. Choose one 6th-level spell\r\n" + 
						"from the w arlock spell list as this arcanum.\r\n" + 
						"You can cast your arcanum spell once without\r\n" + 
						"expending a spell slot. You must finish a long rest before\r\n" + 
						"you can do so again. You regain all uses of your\r\n" + 
						"Mystic Arcanum when you finish a long rest.\n\n";
			}
			else if(point == 12){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 13){
				descr += "Mystic Arcanum (7th Level). \nYou gain an additional warlock spell of your choice.\n\n";
			}
			else if(point == 14){//path
				if(subC.equals("archfey")){
					descr += "Dark Delirium. \nStarting at 14th level, you can plunge a creature into\r\n" + 
							"an illusory realm. As an action, choose a creature\r\n" + 
							"that you can see within 60 feet of you. It must make a\r\n" + 
							"Wisdom saving throw against your warlock spell save\r\n" + 
							"DC. On a failed save, it is charmed or frightened by you\r\n" + 
							"(your choice) for 1 minute or until your concentration\r\n" + 
							"is broken (as if you are concentrating on a spell). This\r\n" + 
							"effect ends early if the creature takes any damage.\r\n" + 
							"Until this illusion ends, the creature thinks it is lost\r\n" + 
							"in a misty realm, the appearance of which you choose.\r\n" + 
							"The creature can see and hear only itself, you, and\r\n" + 
							"the illusion.\r\n" + 
							"You must finish a short or long rest before you can\r\n" + 
							"use this feature again.\n\n";
				}
				else if(subC.equals("fiend")){
					descr += "Hurl Through Hell. \nStarting at 14th level, when you hit a creature with an\r\n" + 
							"attack, you can use this feature to instantly transport\r\n" + 
							"the target through the lower planes. The creature\r\n" + 
							"disappears and hurtles through a nightmare landscape.\r\n" + 
							"At the end of your next turn, the target returns to the\r\n" + 
							"space it previously occupied, or the nearest unoccupied\r\n" + 
							"space. If the target is not a fiend, it takes 10d 10 psychic\r\n" + 
							"damage as it reels from its horrific experience.\r\n" + 
							"Once you use this feature, you can't use it again until\r\n" + 
							"you finish a long rest.\n\n";
				}
				else if(subC.equals("great")){
					descr += "Create Thrall. \nAt 14th level, you gain the ability to infect a humanoid's\r\n" + 
							"mind with the alien magic of your patron. You can use\r\n" + 
							"your action to touch an incapacitated humanoid. That\r\n" + 
							"creature is then charmed by you until a remove curse\r\n" + 
							"spell is cast on it, the charmed condition is removed\r\n" + 
							"from it, or you use this feature again.\r\n" + 
							"You can communicate telepathically with the charmed\r\n" + 
							"creature as long as the two of you are on the same plane\r\n" + 
							"of existence.\n\n";
				}
			}
			else if(point == 15){
				descr += "Mystic Arcanum (8th Level). \nYou gain an additional warlock spell of your choice.\n\n";
			}
			else if(point == 16){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 17){
				descr += "Mystic Arcanum (9th Level). \nYou gain an additional warlock spell of your choice.\n\n";
			}
			else if(point == 18){}
			else if(point == 19){
				descr +="Ability Score Improvement. \nYou can increase one ability score of your\r\n" + 
						"choice by 2, or you can increase two ability scores of\r\n" + 
						"your choice by 1. As normal, you can't increase an ability\r\n" + 
						"score above 20 using this feature.\n\n";
			}
			else if(point == 20){
				descr += "Eldritch Master. \nAt 20th level, you can draw on your inner reserve of\r\n" + 
						"mystical power while entreating your patron to regain\r\n" + 
						"expended spell slots. You can spend 1 minute entreating\r\n" + 
						"your patron for aid to regain all your expended spell slots\r\n" + 
						"from your Pact Magic feature. Once you regain spell slots\r\n" + 
						"with this feature, you must finish a long rest before you\r\n" + 
						"can do so again.\n\n";
			}
		}
		if(a.equals("yes"))
		{
			descr += "Agonizing Blast\r\n" + 
					"Prerequisite: eldritch blast cantrip\r\n" + 
					"When you cast eldritch blast, add your Charisma\r\n" + 
					"modifier to the damage it deals on a hit.\n\n"
					+ "Armor of Shadows\r\n" + 
					"You can cast mage armor on yourself at will, without\r\n" + 
					"expending a spell slot or material components.\n\n" +
					"Ascendant Step\r\n" + 
					"Prerequisite: 9th level\r\n" + 
					"You can cast levitate on yourself at will, without\r\n" + 
					"expending a spell slot or material components.\n\n" + 
					"Beast Speech\r\n" + 
					"You can cast speak with animals at will, without\r\n" + 
					"expending a spell slot.\n\n" + 
					"Beguiling Influence\r\n" + 
					"You gain proficiency in the Deception and\r\n" + 
					"Persuasion skills.\n\n" + 
					"Bewitching Whispers\r\n" + 
					"Prerequisite: 7th level\r\n" + 
					"You can cast compulsion once using a warlock spell slot.\r\n" + 
					"You can't do so again until you finish a long rest.\n\n" + 
					"Book of Ancient Secrets\r\n" + 
					"Prerequisite: Pact of the Tome feature\r\n" + 
					"You can now inscribe magical rituals in your Book of\r\n" + 
					"Shadows. Choose two 1st-level spells that have the\r\n" + 
					"ritual tag from any class's spell list. The spells appear\r\n" + 
					"in the book and don't count against the number of spells\r\n" + 
					"you know. With your Book of Shadows in hand, you\r\n" + 
					"can cast the chosen spells as rituals. You can't cast the\r\n" + 
					"spells except as rituals, unless you've learned them by\r\n" + 
					"some other means. You can also cast a warlock spell\r\n" + 
					"you know as a ritual if it has the ritual tag.\r\n" + 
					"On your adventures, you can add other ritual spells to\r\n" + 
					"your Book of Shadows. When you find such a spell, you\r\n" + 
					"can add it to the book if the spell's level is equal to or\r\n" + 
					"less than half your warlock level (rounded up) and if you\r\n" + 
					"can spare the time to transcribe the spell. For each level\r\n" + 
					"of the spell, the transcription process takes 2 hours and\r\n" + 
					"costs 50 gp for the rare inks needed to inscribe it.\n\n" + 
					"Chains of Carceri\r\n" + 
					"Prerequisite: 15th level, Pact of the Chain feature\r\n" + 
					"You can cast hold monster at w ill'targeting a celestial,\r\n" + 
					"fiend, or elemental'without expending a spell slot or\r\n" + 
					"material components. You must finish a long rest before\r\n" + 
					"you can use this invocation on the same creature again.\n\n" + 
					"Devil's Sight\r\n" + 
					"You can see normally in darkness, both magical and\r\n" + 
					"nonmagical, to a distance of 120 feet.\n\n" + 
					"Dreadful Word\r\n" + 
					"Prerequisite: 7th level\r\n" + 
					"You can cast confusion once using a w arlock spell slot.\r\n" + 
					"You can't do so again until you finish a long rest.\n\n" + 
					"Eldritch Sight\r\n" + 
					"You can cast detect magic at will, without expending\r\n" + 
					"a spell slot.\n\n" //here
					+ "Eldritch Spear\r\n" + 
					"Prerequisite: eldritch blast cantrip\r\n" + 
					"When you cast eldritch blast, its range is 300 feet.\n\n" + 
					"Eyes of the Rune Keeper\r\n" + 
					"You can read all writing.\n\n" + 
					"Fiendish Vigor\r\n" + 
					"You can cast false life on yourself at will as a\r\n" + 
					"1st-level spell, without expending a spell slot or\r\n" + 
					"material components.\n\n" + 
					"Gaze of Two Minds\r\n" + 
					"You can use your action to touch a willing humanoid\r\n" + 
					"and perceive through its senses until the end of your\r\n" + 
					"next turn. As long as the creature is on the same\r\n" + 
					"plane of existence as you, you can use your action\r\n" + 
					"on subsequent turns to maintain this connection,\r\n" + 
					"extending the duration until the end of your next turn.\r\n" + 
					"While perceiving through the other creature's senses,\r\n" + 
					"you benefit from any special senses possessed by that\r\n" + 
					"creature, and you are blinded and deafened to your own\r\n" + 
					"surroundings.\n\n" + 
					"Lifedrinker\r\n" + 
					"Prerequisite: 12th level, Pact of the Blade feature\r\n" + 
					"When you hit a creature with your pact weapon, the\r\n" + 
					"creature takes extra necrotic damage equal to your\r\n" + 
					"Charisma modifier (minimum 1).\n\n" + 
					"Mask of Many Faces\r\n" + 
					"You can cast disguise self at will, without expending\r\n" + 
					"a spell slot.\n\n" + 
					"Master of Myriad Forms\r\n" + 
					"Prerequisite: 15th level\r\n" + 
					"You can cast alter self at will, without expending\r\n" + 
					"a spell slot.\n\n" + 
					"Minions of Chaos\r\n" + 
					"Prerequisite: 9th level\r\n" + 
					"You can cast conjure elemental once using a\r\n" + 
					"warlock spell slot. You can't do so again until you\r\n" + 
					"finish a long rest.\n\n" + 
					"Mire the Mind\r\n" + 
					"Prerequisite: 5th level\r\n" + 
					"You can cast slow once using a warlock spell slot. You\r\n" + 
					"can't do so again until you finish a long rest.\n\n" + 
					"Misty Visions\r\n" + 
					"You can cast silent image at will, without expending a\r\n" + 
					"spell slot or material components.\r\n" + 
					"One with Shadows\r\n" + 
					"Prerequisite: 5th level\r\n" + 
					"When you are in an area of dim light or darkness, you\r\n" + 
					"can use your action to become invisible until you move\r\n" + 
					"or take an action or a reaction.\n\n"
					+ "Otherworldly Leap\r\n" + 
					"Prerequisite: 9th level\r\n" + 
					"You can cast jump on yourself at will, without expending\r\n" + 
					"a spell slot or material components.\n\n" + 
					"Repelling Blast\r\n" + 
					"Prerequisite: eldritch blast cantrip\r\n" + 
					"When you hit a creature with eldritch blast, you can push\r\n" + 
					"the creature up to 10 feet away from you in a straight line.\n\n" + 
					"Sculptor of Flesh\r\n" + 
					"Prerequisite: 7th level\r\n" + 
					"You can cast polymorph once using a warlock spell slot.\r\n" + 
					"You can't do so again until you finish a long rest.\n\n" + 
					"Sign of Ill Omen\r\n" + 
					"Prerequisite: 5th level\r\n" + 
					"You can cast bestow curse once using a w arlock spell\r\n" + 
					"slot. You can't do so again until you finish a long rest.\n\n" + 
					"Thief of Five Fates\r\n" + 
					"You can cast bane once using a warlock spell slot. You\r\n" + 
					"can't do so again until you finish a long rest.\n\n" + 
					"Thirsting Blade\r\n" + 
					"Prerequisite: 5th level, Pact of the Blade feature\r\n" + 
					"You can attack with your pact weapon twice, instead of\r\n" + 
					"once, whenever you take the Attack action on your turn.\n\n" + 
					"Visions of Distant Realms\r\n" + 
					"Prerequisite: 15th level\r\n" + 
					"You can cast arcane eye at will, without expending\r\n" + 
					"a spell slot.\n\n" + 
					"Voice of the Chain Master\r\n" + 
					"Prerequisite: Pact of the Chain feature\r\n" + 
					"You can communicate telepathically with your familiar\r\n" + 
					"and perceive through your familiar's senses as long as\r\n" + 
					"you are on the same plane of existence. Additionally,\r\n" + 
					"while perceiving through your familiar's senses, you can\r\n" + 
					"also speak through your familiar in your own voice, even\r\n" + 
					"if your familiar is normally incapable of speech.\n\n" + 
					"Whispers of the Grave\r\n" + 
					"Prerequisite: 9th level\r\n" + 
					"You can cast speak with dead at will, without expending\r\n" + 
					"a spell slot.\n\n" + 
					"Witch Sight\r\n" + 
					"Prerequisite: 15th level\r\n" + 
					"You can see the true form of any shapechanger or\r\n" + 
					"creature concealed by illusion or transmutation magic\r\n" + 
					"while the creature is within 30 feet of you and within\r\n" + 
					"line of sight.\n\n";
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
				spc = "Cantrips Known: 2\n" +
						"Spells Known: 2\n" +
						"Spell Slots: 1\n" +
						"Slot Level: 1st\n" +
						"Invocations Known: None";
			}
			else if(point == 2){
				spc = "Cantrips Known: 2\n" +
						"Spells Known: 3\n" +
						"Spell Slots: 2\n" +
						"Slot Level: 1st\n" +
						"Invocations Known: 2";
			}
			else if(point == 3){
				spc = "Cantrips Known: 2\n" +
						"Spells Known: 4\n" +
						"Spell Slots: 2\n" +
						"Slot Level: 2nd\n" +
						"Invocations Known: 2";
			}
			else if(point == 4){
				spc = "Cantrips Known: 3\n" +
						"Spells Known: 5\n" +
						"Spell Slots: 2\n" +
						"Slot Level: 2nd\n" +
						"Invocations Known: 2";
			}
			else if(point == 5){
				spc = "Cantrips Known: 3\n" +
						"Spells Known: 6\n" +
						"Spell Slots: 2\n" +
						"Slot Level: 3rd\n" +
						"Invocations Known: 3";
			}
			else if(point == 6){
				spc = "Cantrips Known: 3\n" +
						"Spells Known: 7\n" +
						"Spell Slots: 2\n" +
						"Slot Level: 3rd\n" +
						"Invocations Known: 3";
			}
			else if(point == 7){
				spc = "Cantrips Known: 3\n" +
						"Spells Known: 8\n" +
						"Spell Slots: 2\n" +
						"Slot Level: 4th\n" +
						"Invocations Known: 4";
			}
			else if(point == 8){
				spc = "Cantrips Known: 3\n" +
						"Spells Known: 9\n" +
						"Spell Slots: 2\n" +
						"Slot Level: 4th\n" +
						"Invocations Known: 4";
			}
			else if(point == 9){
				spc = "Cantrips Known: 3\n" +
						"Spells Known: 10\n" +
						"Spell Slots: 2\n" +
						"Slot Level: 5th\n" +
						"Invocations Known: 5";
			}
			else if(point == 10){
				spc = "Cantrips Known: 4\n" +
						"Spells Known: 10\n" +
						"Spell Slots: 2\n" +
						"Slot Level: 5th\n" +
						"Invocations Known: 5";
			}
			else if(point == 11){
				spc = "Cantrips Known: 4\n" +
						"Spells Known: 11\n" +
						"Spell Slots: 3\n" +
						"Slot Level: 5th\n" +
						"Invocations Known: 5";
			}
			else if(point == 12){
				spc = "Cantrips Known: 4\n" +
						"Spells Known: 11\n" +
						"Spell Slots: 3\n" +
						"Slot Level: 5th\n" +
						"Invocations Known: 6";
			}
			else if(point == 13){
				spc = "Cantrips Known: 4\n" +
						"Spells Known: 12\n" +
						"Spell Slots: 3\n" +
						"Slot Level: 5th\n" +
						"Invocations Known: 6";
			}
			else if(point == 14){
				spc = "Cantrips Known: 4\n" +
						"Spells Known: 12\n" +
						"Spell Slots: 3\n" +
						"Slot Level: 5th\n" +
						"Invocations Known: 6";
			}
			else if(point == 15){
				spc = "Cantrips Known: 4\n" +
						"Spells Known: 13\n" +
						"Spell Slots: 3\n" +
						"Slot Level: 5th\n" +
						"Invocations Known: 7";
			}
			else if(point == 16){
				spc = "Cantrips Known: 4\n" +
						"Spells Known: 13\n" +
						"Spell Slots: 3\n" +
						"Slot Level: 5th\n" +
						"Invocations Known: 7";
			}
			else if(point == 17){
				spc = "Cantrips Known: 4\n" +
						"Spells Known: 14\n" +
						"Spell Slots: 4\n" +
						"Slot Level: 5th\n" +
						"Invocations Known: 7";
			}
			else if(point == 18){
				spc = "Cantrips Known: 4\n" +
						"Spells Known: 14\n" +
						"Spell Slots: 4\n" +
						"Slot Level: 5th\n" +
						"Invocations Known: 8";
			}
			else if(point == 19){
				spc = "Cantrips Known: 4\n" +
						"Spells Known: 15\n" +
						"Spell Slots: 5\n" +
						"Slot Level: 5th\n" +
						"Invocations Known: 8";
			}
			else if(point == 20){
				spc = "Cantrips Known: 4\n" +
						"Spells Known: 15\n" +
						"Spell Slots: 4\n" +
						"Slot Level: 5th\n" +
						"Invocations Known: 8";
			}
		}
		spc += "\n\nSpell Save DC: " + (8 + Integer.parseInt(getProf(level)) + mod)
				+ "\nSpell Attack Modifier: " + (Integer.parseInt(getProf(level)) + mod);
		return spc;
	}
}
