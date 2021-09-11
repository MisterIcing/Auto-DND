import java.util.*;

public class xShort {

	@SuppressWarnings("resource")
	public static String getDescr(String nClass, String subC, int level) {
		String descr = "";
		int rand = 0;
		int ASI = 0;
		
		if(nClass.equals("barbarian")){
			if(level >= 17) {rand = 3;}
			else if(level >= 13) {rand = 2;}
			else if(level >= 9) {rand = 1;}
			
			if(level >= 19) {ASI = 5;}
			else if(level >= 16) {ASI = 4;}
			else if(level >= 12) {ASI = 3;}
			else if(level >= 8) {ASI = 2;}
			else if(level >= 4) {ASI = 1;}
			
			descr ="Proficiencies:\n"
					+ "Armor: Light armor, medium armor, shields\r\n" + 
					"Weapons: Simple weapons, martial weapons\r\n" + 
					"Tools: None\r\n" + 
					"Skills: Choose two from Animal Handling, Athletics, " + 
					"Intimidation, Nature, Perception, and Survival\n\n";
			
			for(int point = 1; point <= level; point++)
			{
				if(point == 1){
					descr += "Rage \n\n"
							+ "Unarmored Defense \n\n";
				}
				else if(point == 2){
					descr += "Reckless Attack \n\n"
							+ "Danger Sense \n\n";
				}
				else if(point == 3){//path
					if(subC.equals("berserker")) {descr += "Frenzy\n\n";}
					else if(subC.equals("totem warrior")) {
						descr += "Spirit Seeker \n\n"
							+ "Totem Spirit \n\n";
						}
				}
				else if(point == 4){
					descr += "Ablility Score Improvement (x" + ASI + ")\n\n";
				}
				else if(point == 5){
					descr += "Extra Attack \n\n"
							+ "Fast Movement \n\n";
				}
				else if(point == 6){//path
					if(subC.equals("berserker")) {descr += "Mindless Rage \n\n";}
					else if(subC.equals("totem warrior")) {descr += "Aspect of the Beast \n\n";}
				}
				else if(point == 7){
					descr += "Feral Instinct \n\n";
				}
				else if(point == 8){
					descr += "";
				}
				else if(point == 9){
					descr += "Brutal Critical (" + rand + " di(c)e) \n\n";
				}
				else if(point == 10){//path
					if(subC.equals("berserker")) {descr += "Intimidating Presence \n\n";}
					else if(subC.equals("totem warrior")) {descr += "Spirit Walker";}
				}
				else if(point == 11){
					descr += "Relentless Rage \n\n";
				}
				else if(point == 12){
					descr += "";
				}
				else if(point == 13){
					descr += "";
				}
				else if(point == 14){//path
					if(subC.equals("berserker")) {descr += "Retaliation \n\n";}
					else if(subC.equals("totem warrior")) {descr += "Totemic Attunement \n\n";}
				}
				else if(point == 15){
					descr += "Persistant Rage \n\n";
				}
				else if(point == 16){
					descr += "";
				}
				else if(point == 17){
					descr += "";
				}
				else if(point == 18){
					descr += "Indomidable Might \n\n";
				}
				else if(point == 19){
					descr += "";
				}
				else if(point == 20){
					descr += "Primal Champion \n\n";
				}
			}
		}
		else if(nClass.equals("bard")){
			if(level >= 19) {ASI = 5;}
			else if(level >= 16) {ASI = 4;}
			else if(level >= 12) {ASI = 3;}
			else if(level >= 8) {ASI = 2;}
			else if(level >= 4) {ASI = 1;}
			
			int insp = 0;
			int rest = 0;
			int exp = 0;
			int mag = 0;
			
			if(level >= 15) {insp = 12;}
			else if(level >= 10) {insp = 10;}
			else if(level >= 5) {insp = 8;}
			else if(level >= 1) {insp = 6;}
			
			if(level >= 17) {rest = 12;}
			else if(level >= 13) {rest = 10;}
			else if(level >= 9) {rest = 8;}
			else if(level >= 2) {rest = 6;}
			
			if(level >= 10) {exp = 2;}
			else if(level >= 3) {exp = 1;}
			
			if(level >= 18) {mag = 3;}
			else if(level >= 14) {mag = 2;}
			else if(level >= 10) {mag = 1;}
			
			descr = "Proficiencies:\n"
					+ "Armor: Light armor, medium armor, shields\r\n" + 
					"Weapons: Simple weapons, martial weapons\r\n" + 
					"Tools: None\r\n" + 
					"Skills: Choose two from Animal Handling, Athletics, " + 
					"Intimidation, Nature, Perception, and Survival\n\n";
			
			for(int point = 1; point <= level; point++)
			{
				if(point == 1){
					descr += "Spellcasting \n\n"
							+ "Bardic Inspiration (d" + insp + ") \n\n";
				}
				else if(point == 2){
					descr += "Jack of All Trades \n\n"
							+ "Song of Rest (d" + rest + ") \n\n";
				}
				else if(point == 3){//path
					descr += "Expertise (x" + exp + ") \n\n";
					if(subC.equals("lore")) {
						descr += "Bonus Proficiencies: 3 Skills \n\n"
								+ "Cutting Words \n\n";
					}
					else if(subC.equals("valor")) {
						descr += "Bonus Proficiencies: Medium Armor, Shields, and Martial Weapons \n\n"
								+ "Combat Inspiration \n\n";
					}
				}
				else if(point == 4){
					descr += "Ablility Score Improvement (x" + ASI + ")\n\n";
				}
				else if(point == 5){
					descr += "Font of Inspiration \n\n";
				}
				else if(point == 6){ //path
					descr += "Countercharm \n\n";
					if(subC.equals("lore")) {descr += "Additional Magical Secrets \n\n";}
					else if(subC.equals("valor")) {descr += "Extra Attack \n\n";}
				}
				else if(point == 7){
					descr += "";
				}
				else if(point == 8){
					descr += "";
				}
				else if(point == 9){
					descr += "";
				}
				else if(point == 10){
					descr += "Magical Secrets (x" + mag + ") \n\n";
				}
				else if(point == 11){
					descr += "";
				}
				else if(point == 12){
					descr += "";
				}
				else if(point == 13){
					descr += "";
				}
				else if(point == 14){//path
					if(subC.equals("lore")) {descr += "Peerless Skill \n\n";}
					else if(subC.equals("valor")) {descr += "Battle Magic \n\n";}
				}
				else if(point == 15){
					descr += "";
				}
				else if(point == 16){
					descr += "";
				}
				else if(point == 17){
					descr += "";
				}
				else if(point == 18){
					descr += "";
				}
				else if(point == 19){
					descr += "";
				}
				else if(point == 20){
					descr += "Superior Inspiration \n\n";
				}
			}
		}
		else if(nClass.equals("cleric")){
			if(level >= 19) {ASI = 5;}
			else if(level >= 16) {ASI = 4;}
			else if(level >= 12) {ASI = 3;}
			else if(level >= 8) {ASI = 2;}
			else if(level >= 4) {ASI = 1;}
			
			double undead = 0;
			int div = 0;
			
			if(level >= 17) {undead = 4;}
			else if(level >= 14) {undead = 3;}
			else if(level >= 11) {undead = 2;}
			else if(level >= 8) {undead = 1;}
			else if(level >= 5) {undead = 0.5;}
			
			if(level >= 18) {div= 3;}
			else if(level >= 6) {div = 2;}
			else if(level >= 2) {div = 1;}
			
			descr = "Proficiencies:\n"
					+ "Armor: Light armor, medium armor, shields\r\n" + 
					"Weapons: All simple weapons\r\n" + 
					"Tools: None\r\n" + 
					"Saving Throws: Wisdom, Charisma\r\n" + 
					"Skills: Choose two from History, Insight, Medicine,\r\n" + 
					"Persuasion, and Religion\n\n";
			
			for(int point = 1; point <= level; point++)
			{
				if(point == 1){//path
					descr += "Spellcasting \n\n";
					if(subC.equals("knowledge")) {
						descr += "Spells: Command and Identify \n\n"
								+ "Blessings of Knowledge \n\n";
					}
					else if(subC.equals("life")) {
						descr += "Spells: Bless and Cure wounds \n\n"
								+ "Bonus Proficiency: Heavy Armor \n\n"
								+ "Disciple of Life \n\n";
					}
					else if(subC.equals("light")) {
						descr += "Spells: Burning hands and Faerie fire \n\n"
								+ "Bonus Cantrip: Light \n\n"
								+ "Warding Flare \n\n";
					}
					else if(subC.equals("nature")) {
						descr += "Spells: Animal friendship and Speak with animals \n\n"
								+ "Bonus Proficiency: Heavy Armor \n\n"
								+ "Acolyte of Nature \n\n";
					}
					else if(subC.equals("tempest")) {
						descr += "Spells: Fog cloud and Thunderwave \n\n"
								+ "Bonus Proficiency: Martial Weapons and Heavy Armor \n\n"
								+ "Wrath of the Storm \n\n";
					}
					else if(subC.equals("trickery")) {
						descr += "Spells: Charm person and Disguise self \n\n"
								+ "Blessing of the Trickster \n\n";
					}
					else if(subC.equals("war")) {
						descr += "Spells: Divine favor and Shield of faith \n\n"
								+ "Bonus Proficiency: Martial Weapons and Heavy Armor \n\n"
								+ "War Priest \n\n";
					}
				}
				else if(point == 2){//path
					descr += "Channel Divinity(CD) (" + div + "/rest) \n\n"
							+ "CD: Turn Undead\n\n";
					
					if(subC.equals("knowledge")) {descr += "CD: Knowledge of Ages \n\n";}
					else if(subC.equals("life")) {descr += "CD: Preserve Life \n\n";}
					else if(subC.equals("light")) {descr += "CD: Radiance of the Dawn \n\n";}
					else if(subC.equals("nature")) {descr += "CD: Charm Animals and Plants \n\n";}
					else if(subC.equals("tempest")) {descr += "CD: Desctructive Wrath \n\n";}
					else if(subC.equals("trickery")) {descr += "CD: Invoke Duplicity \n\n";}
					else if(subC.equals("war")) {descr += "CD: Guided Strike \n\n";}
				}
				else if(point == 3){//spells
					if(subC.equals("knowledge")){ descr += "Spells: Augury and Suggestion\n\n";}
					else if(subC.equals("life")){ descr += "Spells: Lesser restoration and Spiritual weapon\n\n";}
					else if(subC.equals("light")){ descr += "Spells Flaming sphere and Scorching ray\n\n";}
					else if(subC.equals("nature")){ descr += "Spells: Barkskin and Spike growth\n\n";}
					else if(subC.equals("tempest")){descr += "Spells: Gust of wind and Shatter\n\n";}
					else if(subC.equals("trickery")){descr += "Spells: Mirror image and Pass without trace\n\n";}
					else if(subC.equals("war")){descr += "Spells: Magic weapon and Spiritual weapon\n\n";}
				}
				else if(point == 4){
					descr += "Ablility Score Improvement (x" + ASI + ")\n\n";
				}
				else if(point == 5){//spells
					descr += "Destroy Undead (CR " + undead + ") \n\n";
					if(subC.equals("knowledge")){descr += "Spells: Nondetection and Speak with dead\n\n";}
					else if(subC.equals("life")){descr += "Spells: Beacon of hope and Revivify\n\n";}
					else if(subC.equals("light")){descr += "Spells: Daylight and Fireball\n\n";}
					else if(subC.equals("nature")){descr += "Spells: Plant growth and Wind wall\n\n";}
					else if(subC.equals("tempest")){descr += "Spells: Call lightning and Sleet strom\n\n";}
					else if(subC.equals("trickery")){descr += "Spells: Blink and Dispel magic\n\n";}
					else if(subC.equals("war")){descr += "Spells: Crusader's mantle and Spirit guardian\n\n";}

				}
				else if(point == 6){//path
					if(subC.equals("knowledge")) {descr += "CD: Read Thoughts \n\n";}
					else if(subC.equals("life")) {descr += "Blessed Healer \n\n";}
					else if(subC.equals("light")) {descr += "Improved Flare \n\n";}
					else if(subC.equals("nature")) {descr += "Dampen Elements \n\n";}
					else if(subC.equals("tempest")) {descr += "Thunderbolt Strike \n\n";}
					else if(subC.equals("trickery")) {descr += "CD: Cloak of Shadows \n\n";}
					else if(subC.equals("war")) {descr += "CD: War God's Blessing \n\n";}
				}
				else if(point == 7){//spells
					if(subC.equals("knowledge")){descr += "Spells: Arcane eye and Confusion\n\n";}
					else if(subC.equals("life")){descr += "Spells: Death word and Guardian of faith\n\n";}
					else if(subC.equals("light")){descr += "Spells: Guardian of faith and Wall of fire\n\n";}
					else if(subC.equals("nature")){descr += "Spells: Dominate beast and Grasping vine\n\n";}
					else if(subC.equals("tempest")){descr += "Spells: Control water and Ice storm\n\n";}
					else if(subC.equals("trickery")){descr += "Spells: Dimension door and Polymorph\n\n";}
					else if(subC.equals("war")){descr += "Spells: Freedom of movement and Stoneskin\n\n";}
				}
				else if(point == 8){//path
					if(subC.equals("knowledge") || subC.equals("light")){descr += "Potent Spellcasting \n\n";}
					else if(subC.equals("life") || subC.equals("nature") || subC.equals("tempest")
							|| subC.equals("trickery") || subC.equals("war")){descr += "Divine Strike \n\n";}
				}
				else if(point == 9){//spells
					if(subC.equals("knowledge")){descr += "Spells: Legend lore and Scrying\n\n";}
					else if(subC.equals("life")){descr += "Spells: Mass cure wounds and Raise dead\n\n";}
					else if(subC.equals("light")){descr += "Spells: Flame strike and Scrying\n\n";}
					else if(subC.equals("nature")){descr += "Spells: Insect plague and Tree stride\n\n";}
					else if(subC.equals("tempest")){descr += "Spells: Destructive wave and Insect plague\n\n";}
					else if(subC.equals("trickery")){descr += "Spells: Dominate person and Modify memory\n\n";}
					else if(subC.equals("war")){descr += "Spells: Flame strike and Hold monster\n\n";}
				}
				else if(point == 10){
					descr += "Divine Intervention \n\n";
				}
				else if(point == 11){
					descr += "";
				}
				else if(point == 12){
					descr += "";
				}
				else if(point == 13){
					descr += "";
				}
				else if(point == 14){
					descr += "";
				}
				else if(point == 15){
					descr += "";
				}
				else if(point == 16){
					descr += "";
				}
				else if(point == 17){//path
					if(subC.equals("knowledge")) {descr += "Visions of the Past \n\n";}
					else if(subC.equals("life")) {descr += "Supreme Healing \n\n";}
					else if(subC.equals("light")) {descr += "Corona of Light \n\n";}
					else if(subC.equals("nature")) {descr += "Master of Nature \n\n";}
					else if(subC.equals("tempest")) {descr += "Stormborn \n\n";}
					else if(subC.equals("trickery")) {descr += "Improved Duplicity \n\n";}
					else if(subC.equals("war")) {descr += "Avatar of Battle \n\n";}
				}
				else if(point == 18){
					descr += "";
				}
				else if(point == 19){
					descr += "";
				}
				else if(point == 20){
					descr += "Divine Intervention Improvement \n\n";
				}
			}
		}
		else if(nClass.equals("druid")){
			if(level >= 19) {ASI = 5;}
			else if(level >= 16) {ASI = 4;}
			else if(level >= 12) {ASI = 3;}
			else if(level >= 8) {ASI = 2;}
			else if(level >= 4) {ASI = 1;}
			
			String shape = "";
			if(level >= 8) {shape = "1, No limitations";}
			else if(level >= 4) {shape = "1/2, No flying speed";}
			else if(level >= 2) {shape = "1/4, No flying or swimming speed";}
			
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
					descr += "Druidic \n\n"
							+ "Spellcasting \n\n";
				}
				else if(point == 2){//path
					descr += "Wild Shape (Max Cr: " + shape + ") \n\n";
					if(!(subC.equals("moon")))
					{
						descr += "Bonus Cantrip: Additional Druid Cantrip \n\n"
								+ "Natural Recovery \n\n";
					}
					else if(subC.equals("moon")){
						descr +="Combat Wild Shape \n\n"
								+ "Circle Forms \n\n";
					}
				}
				else if(point == 3){//spells
					if(!(subC.equals("moon"))) {
						descr += "Circle Spells \n\n";
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
					descr += "Ablility Score Improvement (x" + ASI + ")\n\n";
				}
				else if(point == 5){//spells
					if(subC.equals("arctic")) {descr +="Spells: Sleet storm and Slow\n\n";}
					else if(subC.equals("coast")){descr +="Spells: Water breathing and Water walk\n\n";}
					else if(subC.equals("desert")){descr +="Spells: Create food and water and Protection from energy\n\n";}
					else if(subC.equals("forest")){descr +="Spells: Call lightning and Plant growth\n\n";}
					else if(subC.equals("grassland")){descr +="Spells: Daylight and Haste\n\n";}
					else if(subC.equals("mountain")){descr +="Spells: Lightinign bolt and Meld into stone\n\n";}
					else if(subC.equals("swamp")){descr +="Spells: Water walk and Stinking cloud\n\n";}
					else if(subC.equals("underdark")){descr +="Spells: Gaseous form and Stinking cloud\n\n";}
				}
				else if(point == 6){//path
					if(!(subC.equals("moon"))) {descr +="Land's Stride \n\n";}
					else if(subC.equals("moon")){
						descr += "Circle Forms (Improved) \n\n"
								+ "Primal Strike \n\n";
					}
				}
				else if(point == 7){//spells
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
					descr += "";
				}
				else if(point == 9){//spells
					if(subC.equals("arctic")) {descr +="Spells: Commune with nature and Cone of cold\n\n";}
					else if(subC.equals("coast")){descr +="Spells: Conjure elemental and Scrying\n\n";}
					else if(subC.equals("desert")){descr +="Spells: Insect plague and Wall of stone\n\n";}
					else if(subC.equals("forest")){descr +="Spells: Commune with nature and Tree stride\n\n";}
					else if(subC.equals("grassland")){descr +="Spells: Dream and Insect plague\n\n";}
					else if(subC.equals("mountain")){descr +="Spells: Passwall and Wall of stone\n\n";}
					else if(subC.equals("swamp")){descr +="Spells: Insect plague and Scrying\n\n";}
					else if(subC.equals("underdark")){descr +="Spells: Cloudkill and Insect plague\n\n";}
				}
				else if(point == 10){//path
					if(!(subC.equals("moon"))) {descr +="Nature's Ward \n\n";}
					else if(subC.equals("moon")){descr += "Elemental Wild Shape \n\n";}
				}
				else if(point == 11){
					descr += "";
				}
				else if(point == 12){
					descr += "";
				}
				else if(point == 13){
					descr += "";
				}
				else if(point == 14){//path
					if(!(subC.equals("moon"))) {descr +="Nature's Sanctuary \n\n";}
					else if(subC.equals("moon")){descr += "Thousand Forms \n\n";}
				}
				else if(point == 15){
					descr += "";
				}
				else if(point == 16){
					descr += "";
				}
				else if(point == 17){
					descr += "";
				}
				else if(point == 18){
					descr += "Timeless Body \n\n"
							+ "Beast Spells \n\n";
				}
				else if(point == 19){
					descr += "";
				}
				else if(point == 20){
					descr += "Archdruid \n\n";
				}
			}
		}
		else if(nClass.equals("fighter")){
			if(level >= 19) {ASI = 7;}
			else if(level >= 16) {ASI = 6;}
			else if(level >= 14) {ASI = 5;}
			else if(level >= 12) {ASI = 4;}
			else if(level >= 8) {ASI = 3;}
			else if(level >= 6) {ASI = 2;}
			else if(level >= 4) {ASI = 1;}
			
			int place = 0;
			String style = "";
			if(subC.contains("champion")) {
				place = subC.indexOf("champion");
				style = subC.substring(0, place).trim();
				subC = subC.substring(place);
			}
			else if(subC.contains("battle master")) {
				place = subC.indexOf("battle master");
				style = subC.substring(0, place).trim();
				subC = subC.substring(place);
			}
			else if(subC.contains("eldritch knight")) {
				place = subC.indexOf("eldritch knight");
				style = subC.substring(0, place).trim();
				subC = subC.substring(place);
			}
			
			int surge = 0;
			int EA = 0;
			int indom = 0;
			int comb = 0;
			
			if(level >= 17) {surge = 2;}
			else if(level >= 2) {surge = 1;}
			
			if(level >= 20) {EA = 3;}
			else if(level >= 11) {EA = 2;}
			else if(level >= 5) {EA = 1;}
			
			if(level >= 17) {indom = 3;}
			else if(level >= 13) {indom = 2;}
			else if(level >= 9) {indom = 1;}
			
			if(level >= 18) {comb = 12;}
			else if(level >= 10) {comb = 10;}
			
			descr = "Proficiencies:\n"
					+ "Armor : All armor, shields\r\n" + 
					"Weapons: Simple weapons, martial weapons\r\n" + 
					"Tools: None\r\n" + 
					"Saving Throws: Strength, Constitution\n"
					+ "Skills: Choose two skills from Acrobatics, Animal " + 
					"Handling, Athletics, History, Insight, Intimidation, " + 
					"Perception, and Survival\n\n";
			
			for(int point = 1; point <= level; point++)
			{
				if(point == 1){
					descr += "Style: " + style + " \n\n"
							+ "Second Wind \n\n";
				}
				else if(point == 2){
					descr += "Action Surge (" + surge + " use(s)) \n\n";
				}
				else if(point == 3){//path
					if(subC.equals("champion")) {descr += "Improved Critical \n\n";}
					else if(subC.equals("battle master")) {
						descr += "Combat Superiority \n\n"
								+ "Student of War \n\n"; 
					}
					else if(subC.equals("eldritch knight")) {
						descr += "Spellcasting \n\n"
								+ "Weapon Bond \n\n";
					}
				}
				else if(point == 4){
					descr += "Ablility Score Improvement (x" + ASI + ")\n\n";
				}
				else if(point == 5){
					descr += "Extra Attack (x" + EA + ") \n\n";
				}
				else if(point == 6){
					descr += "";
				}
				else if(point == 7){//path
					if(subC.equals("champion")) {descr += "Remarkable Athlete \n\n";}
					else if(subC.equals("battle master")) {descr += "Know Your Enemy \n\n";}
					else if(subC.equals("eldritch knight")) {descr += "War Magic \n\n";}
				}
				else if(point == 8){
					descr += "";
				}
				else if(point == 9){
					descr += "Indomitable (" + indom + " use(s)) \n\n";
				}
				else if(point == 10){//path
					if(subC.equals("champion")) {descr += "Additional Fighting Style \n\n";}
					else if(subC.equals("battle master")) {descr +="Improved Combat Superiority (d" + comb +  "s) \n\n";}
					else if(subC.equals("eldritch knight")) {descr += "Eldritch Strike \n\n";}
				}
				else if(point == 11){
					descr += "";
				}
				else if(point == 12){
					descr += "";
				}
				else if(point == 13){
					descr += "";
				}
				else if(point == 14){
					descr += "";
				}
				else if(point == 15){//path
					if(subC.equals("champion")) {descr += "Superior Critical \n\n";}
					else if(subC.equals("battle master")) {descr += "Relentless \n\n";}
					else if(subC.equals("eldritch knight")) {descr += "Arcane Charge \n\n";}
				}
				else if(point == 16){
					descr += "";
				}
				else if(point == 17){
					descr += "";
				}
				else if(point == 18){//path
					if(subC.equals("champion")) {descr += "Survivor \n\n";}
					else if(subC.equals("battle master")) {descr += "";}
					else if(subC.equals("eldritch knight")) {descr += "Improved War Magic \n\n";}
				}
				else if(point == 19){
					descr += "";
				}
				else if(point == 20){
					descr += "";
				}
			}
		}
		else if(nClass.equals("monk")){
			if(level >= 19) {ASI = 5;}
			else if(level >= 16) {ASI = 4;}
			else if(level >= 12) {ASI = 3;}
			else if(level >= 8) {ASI = 2;}
			else if(level >= 4) {ASI = 1;}
			
			int ki = 0;
			
			if(level >= 17) {ki = 6;}
			else if(level >=13) {ki = 5;}
			else if(level >= 9) {ki = 3;}
			else if(level >= 5) {ki = 2;}
			
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
					descr += "Unarmored Defense \n\n"
							+ "Martial Arts \n\n";
				}
				else if(point == 2){
					descr += "Ki \n\n"
							+ "Unarmored Movement \n\n";
				}
				else if(point == 3){//path
					descr += "Deflect Missiles \n\n";
					
					if(subC.equals("hand")){
						descr += "Open Hand Technique \n\n";
					}
					else if(subC.equals("shadow")){
						descr += "Shadow Arts \n\n";
					}
					else if(subC.equals("elements")){
						descr += "Disciple of the Elements: Max Ki Points for a spell: " + ki + "\n\n";
					}
				}
				else if(point == 4){
					descr += "Ablility Score Improvement (x" + ASI + ")\n\n"
							+ "Slow Fall \n\n";
				}
				else if(point == 5){
					descr += "Extra Attack \n\n"
							+ "Stunning Strike \n\n";
				}
				else if(point == 6){//path
					descr += "Ki Empowered Strikes \n\n";
					
					if(subC.equals("hand")){
						descr += "Wholeness of the Body \n\n";
					}
					else if(subC.equals("shadow")){
						descr += "Shadow Step \n\n";
					}
					else if(subC.equals("elements")){
						descr += "";
					}
				}
				else if(point == 7){
					descr += "Evasion \n\n"
							+ "Stillness of Mind \n\n";
				}
				else if(point == 8){
					descr += "";
				}
				else if(point == 9){
					descr += "Unarmored Movement Improvement \n\n";
				}
				else if(point == 10){
					descr += "Purity of Body \n\n";
				}
				else if(point == 11){//path
					if(subC.equals("hand")){
						descr += "Tranquility \n\n";
					}
					else if(subC.equals("shadow")){
						descr += "Cloak of Shadows \n\n";
					}
					else if(subC.equals("elements")){
						descr += "";
					}
				}
				else if(point == 12){
					descr += "";
				}
				else if(point == 13){
					descr += "Tongue of the Sun and Moon \n\n";
				}
				else if(point == 14){
					descr += "Diamond Soul \n\n";
				}
				else if(point == 15){
					descr += "Timeless Body \n\n";
				}
				else if(point == 16){
					descr += "";
				}
				else if(point == 17){//path
					if(subC.equals("hand")){
						descr += "Quivering Palm \n\n";
					}
					else if(subC.equals("shadow")){
						descr += "Opportunist \n\n";
					}
					else if(subC.equals("elements")){
						descr += "";
					}
				}
				else if(point == 18){
					descr += "Empty Body \n\n";
				}
				else if(point == 19){
					descr += "";
				}
				else if(point == 20){
					descr += "Perfecr Self \n\n";
				}
			}
		}
		else if(nClass.equals("paladin")){
			if(level >= 19) {ASI = 5;}
			else if(level >= 16) {ASI = 4;}
			else if(level >= 12) {ASI = 3;}
			else if(level >= 8) {ASI = 2;}
			else if(level >= 4) {ASI = 1;}
			System.out.println("Choose a fighting style: defense, dueling, great weapon, or "
					+ "protection");
			Scanner in = new Scanner(System.in);
			String style = in.nextLine().toLowerCase().trim();
			
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
					descr += "Divine Sense \n\n"
							+ "Lay on Hands \n\n";
				}
				else if(point == 2){
					descr += "Style: " + style + " \n\n"
							+ "Spellcasting \n\n"
							+ "Divine Smite \n\n";
				}
				else if(point == 3){//path
					descr += "Divine Health \n\n";
					
					if(subC.equals("devotion")) {
						descr += "CD: Sacred Weapon \n\n"
								+ "CD: Turn the Unholy \n\n";
						descr += "Spells: Protection from evil and good and Sanctuary.\n\n";
					}
					else if(subC.equals("ancients")) {
						descr += "CD: Nature's Wrath \n\n"
								+ "CD: Turn the Faithless \n\n";
						descr += "Spells: Ensnaring strike and Speak with animals.\n\n";
					}
					else if(subC.equals("vengeance")) {
						descr += "CD: Abjure Enemy \n\n"
								+ "CD: Vow of Enmity \n\n";
						descr += "Spells: Bane and Hunter's mark.\n\n";
					}
				}
				else if(point == 4){
					descr += "Ablility Score Improvement (x" + ASI + ")\n\n";
				}
				else if(point == 5){
					descr += "Extra Attack \n\n";
					if(subC.equals("devotion")){descr += "Spells: Lesser restoration and Zone of truth.\n\n";}
					else if(subC.equals("ancients")){descr += "Spells: Moonbeam and Misty step.\n\n";}
					else if(subC.equals("vengeance")){descr += "Spells: Hold person and Misty step.\n\n";}
				}
				else if(point == 6){
					descr += "Aura of Protection \n\n";
				}
				else if(point == 7){//path
					if(subC.equals("devotion")) {descr += "Aura of Devotion \n\n";}
					else if(subC.equals("ancients")) {descr += "Aura of Warding \n\n";}
					else if(subC.equals("vengeance")) {descr += "Relentless Avenger \n\n";}
				}
				else if(point == 8){
					descr += "";
				}
				else if(point == 9){
					if(subC.equals("devotion")){descr += "Spells: Beacon of hope and Dispel magic.\n\n";}
					else if(subC.equals("ancients")){descr += "Spells: Plant growth and Protection from energy.\n\n";}
					else if(subC.equals("vengeance")){descr += "Spells: Haste and Protection from energy.\n\n";}
				}
				else if(point == 10){
					descr += "Aura of Courage \n\n";
				}
				else if(point == 11){
					descr += "Improved Divine Smite \n\n";
				}
				else if(point == 12){
					descr += "";
				}
				else if(point == 13){
					if(subC.equals("devotion")){descr += "Spells: Freedom of movement and Guardian of faith.\n\n";}
					else if(subC.equals("ancients")){descr += "Spells: Ice storm and Stoneskin.\n\n";}
					else if(subC.equals("vengeance")){descr += "Spells: Banishment and Dimension door.\n\n";}
				}
				else if(point == 14){
					descr += "Cleansing Touch \n\n";
				}
				else if(point == 15){//path
					if(subC.equals("devotion")) {descr += "Purity of Spirit \n\n";}
					else if(subC.equals("ancients")) {descr += "Undying Sentinel \n\n";}
					else if(subC.equals("vengeance")) {descr += "Soul of Vengeance \n\n";}
				}
				else if(point == 16){
					descr += "";
				}
				else if(point == 17){
					if(subC.equals("devotion")){descr += "Spells. Commune and Flame strike.\n\n";}
					else if(subC.equals("ancients")){descr += "Spells. Commune with nature and Tree stride.\n\n";}
					else if(subC.equals("vengeance")){descr += "Spells. Hold monster and Scrying.\n\n";}
				}
				else if(point == 18){
					descr += "Aura Improvements \n\n";
				}
				else if(point == 19){
					descr += "";
				}
				else if(point == 20){//path
					if(subC.equals("devotion")) {descr += "Holy Nimbus \n\n";}
					else if(subC.equals("ancients")) {descr += "Elder Champion \n\n";}
					else if(subC.equals("vengeance")) {descr += "Avenging Angel \n\n";}
				}
			}
		}
		else if(nClass.equals("ranger")){
			if(level >= 19) {ASI = 5;}
			else if(level >= 16) {ASI = 4;}
			else if(level >= 12) {ASI = 3;}
			else if(level >= 8) {ASI = 2;}
			else if(level >= 4) {ASI = 1;}
			
			int fav = 0;
			if(level >= 14) {fav = 3;}
			else if(level >=6) {fav = 2;}
			else if(level >= 1) {fav = 1;}
			
			int nat = 0;
			if(level >= 10) {fav = 3;}
			else if(level >=6) {fav = 2;}
			else if(level >= 1) {fav = 1;}
			
			System.out.println("Choose a fighting style: archery, defense, dueling, or "
					+ "dual wield");
			Scanner in = new Scanner(System.in);
			String style = in.nextLine().toLowerCase().trim();
			
			for(int point = 1; point <= level; point++)
			{
				if(point == 1){
					descr += "Favored Enemy (x" + fav + ") \n\n"
							+ "Natural Explorer (x" +  nat + ") \n\n";
				}
				else if(point == 2){
					descr += "Style: " + style + " \n\n"
							+ "Spellcasting \n\n";
				}
				else if(point == 3){//path
					descr += "Primal Awarness \n\n";
					
					if(subC.equals("hunter")) {
						descr += "Hunter's Prey \n\n";
					}
					else if(subC.equals("beast master")) {
						descr += "Ranger's Companion \n\n";
					}
				}
				else if(point == 4){
					descr += "Ablility Score Improvement (x" + ASI + ")\n\n";
				}
				else if(point == 5){
					descr += "Extra Attack";
				}
				else if(point == 6){
					descr += "";
				}
				else if(point == 7){//path
					if(subC.equals("hunter")) {descr += "Defensive Tactics \n\n";}
					else if(subC.equals("beast master")) {descr += "Exceptional Training \n\n";}
				}
				else if(point == 8){
					descr += "Land's Stride \n\n";
				}
				else if(point == 9){
					descr += "";
				}
				else if(point == 10){
					descr += "Hide in Plain Sight \n\n";
				}
				else if(point == 11){//path
					if(subC.equals("hunter")) {descr += "Multiattack \n\n";}
					else if(subC.equals("beast master")) {descr += "Bestial Fury \n\n";}
				}
				else if(point == 12){
					descr += "";
				}
				else if(point == 13){
					descr += "";
				}
				else if(point == 14){
					descr += "Vanish \n\n";
				}
				else if(point == 15){//path
					if(subC.equals("hunter")) {descr += "Superior Hunter's Defense \n\n";}
					else if(subC.equals("beast master")) {descr += "Share Spells \n\n";}
				}
				else if(point == 16){
					descr += "";
				}
				else if(point == 17){
					descr += "";
				}
				else if(point == 18){
					descr += "Feral Senses \n\n";
				}
				else if(point == 19){
					descr += "";
				}
				else if(point == 20){
					descr += "Foe Slayer \n\n";
				}
			}
		}
		else if(nClass.equals("rogue")){
			if(level >= 19) {ASI = 6;}
			else if(level >= 16) {ASI = 5;}
			else if(level >= 12) {ASI = 4;}
			else if(level >= 10) {ASI = 3;}
			else if(level >= 8) {ASI = 2;}
			else if(level >= 4) {ASI = 1;}
			
			int exp = 0;
			if(level >= 6) {exp = 2;}
			else if(level >= 1) {exp = 1;}
			
			descr = "Proficiencies:\n"
					+ "Armor: Light armor\r\n" + 
					"Weapons: Simple weapons, hand crossbows,\r\n" + 
					"longswords, rapiers, shortswords\r\n" + 
					"Tools: Thieves' tools\r\n" + 
					"Saving Throws: Dexterity. Intelligence\r\n" + 
					"Skills: Choose four from Acrobatics, Athletics,\r\n" + 
					"Deception. Insight, Intimidation, Investigation,\r\n" + 
					"Perception, Performance. Persuasion, Sleight of\r\n" + 
					"Hand, and Stealth\n\n";
			
			for(int point = 1; point <= level; point++)
			{
				if(point == 1){
					descr += "Expertise (x" + exp + ") \n\n"
							+ "Sneak Attack \n\n"
							+ "Thieves' Cant \n\n";
				}
				else if(point == 2){
					descr += "Cunning Action \n\n";
				}
				else if(point == 3){//path
					if(subC.equals("thief")) {
						descr += "Fast Hands \n\n"
								+ "Second-Story Work \n\n";
					}
					else if(subC.equals("assassin")) {
						descr += "Bonus Proficiencies: Disguise Kit and Poisoner's Kit \n\n"
								+ "Assassinate \n\n";
					}
					else if(subC.equals("arcane")) {
						descr += "Spellcasting \n\n"
								+ "Mage Hand Legerdemain \n\n";
					}
				}
				else if(point == 4){
					descr += "Ablility Score Improvement (x" + ASI + ")\n\n";
				}
				else if(point == 5){
					descr += "Uncanny Dodge \n\n";
				}
				else if(point == 6){
					descr += "";
				}
				else if(point == 7){
					descr += "Evasion \n\n";
				}
				else if(point == 8){
					descr += "";
				}
				else if(point == 9){//path
					if(subC.equals("thief")) {descr += "Supreme Sneak \n\n";}
					else if(subC.equals("assassin")) {descr += "Infiltrtion Expertise \n\n";}
					else if(subC.equals("arcane")) {descr += "Magical Ambush \n\n";}
				}
				else if(point == 10){
					descr += "";
				}
				else if(point == 11){
					descr += "Reliable Talent \n\n";
				}
				else if(point == 12){
					descr += "";
				}
				else if(point == 13){//path
					if(subC.equals("thief")) {descr += "Use Magic Device \n\n";}
					else if(subC.equals("assassin")) {descr += "Imposter \n\n";}
					else if(subC.equals("arcane")) {descr += "Versatile Trickster \n\n";}
				}
				else if(point == 14){
					descr += "Blindsense \n\n";
				}
				else if(point == 15){
					descr += "Slippery Mind \n\n";
				}
				else if(point == 16){
					descr += "";
				}
				else if(point == 17){//path
					if(subC.equals("thief")) {descr += "Thief's Reflexes \n\n";}
					else if(subC.equals("assassin")) {descr += "Death Strike \n\n";}
					else if(subC.equals("arcane")) {descr += "Spell Thief \n\n";}
				}
				else if(point == 18){
					descr += "Elusive \n\n";
				}
				else if(point == 19){
					descr += "";
				}
				else if(point == 20){
					descr += "Stroke of Luck \n\n";
				}
			}
		}
		else if(nClass.equals("sorcerer")){
			if(level >= 19) {ASI = 5;}
			else if(level >= 16) {ASI = 4;}
			else if(level >= 12) {ASI = 3;}
			else if(level >= 8) {ASI = 2;}
			else if(level >= 4) {ASI = 1;}
			
			int mag = 0;
			if(level >= 17) {mag = 3;}
			else if(level >= 10) {mag = 2;}
			else if(level >= 3) {mag = 1;}
			
			String dragon = "";
			Scanner in = new Scanner(System.in);
			int poin = 0;
			if(level >= 5) {poin = 7;}
			else if(level >= 4) {poin = 6;}
			else if(level >= 3) {poin = 5;}
			else if(level >= 2) {poin = 3;}
			else if(level >= 1) {poin = 2;}
			
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
					descr += "Spellcasting \n\n";
					
					if(subC.equals("draconic")) {
						descr += "Dragon Ancestor \n\n";
						System.out.println("Choose Draconic Ancestry: Black(acid), Blue(lightning), "
								+ "Brass(fire), Bronze(lightning),\nCopper(acid), Gold(fire), "
								+ "Green(poison), Red(fire), Silver(cold), White(cold)");
						dragon = in.nextLine().trim().toLowerCase();
						descr = "Draconic Ancestry: " + z.toTitleCase(dragon) + " Dragon\n\n" + descr ;
						descr += "Draconic Reslilience \n\n";
					}
					else if(subC.equals("wild")) {
						descr += "Wild Magic Surge \n\n"
								+ "Tides of Chaos \n\n";
					}
				}
				else if(point == 2){
					descr += "Font of Magic: Sorcery Point Cost: " + poin +" \n\n";
				}
				else if(point == 3){
					descr += "Metamagic (x" + mag + ") \n\n";
				}
				else if(point == 4){
					descr += "Ablility Score Improvement (x" + ASI + ") \n\n";
				}
				else if(point == 5){
					descr += "";
				}
				else if(point == 6){//path
					if(subC.equals("draconic")) {descr += "Elemental Affinity \n\n";}
					else if(subC.equals("wild")) {descr += "Bend Luck \n\n";}
				}
				else if(point == 7){
					descr += "";
				}
				else if(point == 8){
					descr += "";
				}
				else if(point == 9){
					descr += "";
				}
				else if(point == 10){
					descr += "";
				}
				else if(point == 11){
					descr += "";
				}
				else if(point == 12){
					descr += "";
				}
				else if(point == 13){
					descr += "";
				}
				else if(point == 14){//path
					if(subC.equals("draconic")) {descr += "Dragon Wings \n\n";}
					else if(subC.equals("wild")) {descr += "Controlled Chaos \n\n";}
				}
				else if(point == 15){
					descr += "";
				}
				else if(point == 16){
					descr += "";
				}
				else if(point == 17){
					descr += "";
				}
				else if(point == 18){//path
					if(subC.equals("draconic")) {descr += "Draconic Presence \n\n";}
					else if(subC.equals("wild")) {descr += "Spell Bombardment \n\n";}
				}
				else if(point == 19){
					descr += "";
				}
				else if(point == 20){
					descr += "Sorcerous Restoration \n\n";
				}
			}
		}
		else if(nClass.equals("warlock")){
			if(level >= 19) {ASI = 5;}
			else if(level >= 16) {ASI = 4;}
			else if(level >= 12) {ASI = 3;}
			else if(level >= 8) {ASI = 2;}
			else if(level >= 4) {ASI = 1;}
			
			int mys = 0;
			if(level >= 17) {mys = 9;}
			else if(level >= 15) {mys = 8;}
			else if(level >= 13) {mys = 7;}
			else if(level >= 11) {mys = 6;}
			
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
					descr += "Pact Magic \n\n";
					
					if(subC.equals("archfey")) {
						descr += "Fey Presence \n\n" +
								"Spells: Faerie fire and Sleep \n\n";
					}
					else if(subC.equals("fiend")) {
						descr += "Dark One's Blessing \n\n"
								+ "Spells: Burning hands and Command \n\n";
					}
					else if(subC.equals("great")) {
						descr += "Awakened Mind \n\n"
								+ "Spells: Dissonant whispers and Tasha's hideous laughter \n\n";
					}
				}
				else if(point == 2){
					descr += "Eldritch Invocations \n\n";
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
				else if(point == 3){
					descr += "Pact Boon \n\n";
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
					descr += "Ablility Score Improvement (x" + ASI + ") \n\n";
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
						descr += "Misty Escape \n\n";
					}
					else if(subC.equals("fiend")){
						descr += "Dark One's Own Luck \n\n";
					}
					else if(subC.equals("great")){
						descr += "Entropic Ward \n\n";
					}
				}
				else if(point == 7){
					descr += "";
				}
				else if(point == 8){
					descr += "";
				}
				else if(point == 9){
					descr += "";
				}
				else if(point == 10){//path
					if(subC.equals("archfey")){
						descr += "Beguiling Defense \n\n";
					}
					else if(subC.equals("fiend")){
						descr += "Fiendish Resilience \n\n";
					}
					else if(subC.equals("great")){
						descr += "Thought Shield \n\n";
					}
				}
				else if(point == 11){
					descr += "Mystic Arcanum(" + mys + "th level) \n\n";
				}
				else if(point == 12){
					descr += "";
				}
				else if(point == 13){
					descr += "";
				}
				else if(point == 14){//path
					if(subC.equals("archfey")){
						descr += "Dark Delirium \n\n";
					}
					else if(subC.equals("fiend")){
						descr += "Hurl Through Hell \n\n";
					}
					else if(subC.equals("great")){
						descr += "Create Thrall \n\n";
					}
				}
				else if(point == 15){
					descr += "";
				}
				else if(point == 16){
					descr += "";
				}
				else if(point == 17){
					descr += "";
				}
				else if(point == 18){
					descr += "";
				}
				else if(point == 19){
					descr += "";
				}
				else if(point == 20){
					descr += "Eldritch Master \n\n";
				}
			}
		}
		else if(nClass.equals("wizard")){
			if(level >= 19) {ASI = 5;}
			else if(level >= 16) {ASI = 4;}
			else if(level >= 12) {ASI = 3;}
			else if(level >= 8) {ASI = 2;}
			else if(level >= 4) {ASI = 1;}
			
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
					descr += "Spellcasting \n\n"
							+ "Arcane Recovery \n\n";
				}
				else if(point == 2){//path
					if(subC.equals("abjuration")) {
						descr += "Abjuration Savant \n\n"
								+ "Arcane Ward \n\n";
					}
					else if(subC.equals("conjuration")) {
						descr += "Conjuration Savant \n\n"
								+ "Minor Conjuration";
					}
					else if(subC.equals("divination")) {
						descr += "Divination Savant \n\n"
								+ "Portent \n\n";
					}
					else if(subC.equals("enchantment")) {
						descr += "Enchantment Savant \n\n"
								+ "Hypnotic Gaze \n\n";
					}
					else if(subC.equals("evocation")) {
						descr += "Evocation Savant \n\n"
								+ "Sculpt Spells \n\n";
					}
					else if(subC.equals("illusion")) {
						descr += "Illusion Savant \n\n"
								+ "Improved Minor Illusion \n\n";
					}
					else if(subC.equals("transmutation")) {
						descr += "Transmutation Savant \n\n"
								+ "Minor Alchemy \n\n";
					}
					else if(subC.equals("necromancy")) {
						descr += "Necromancy Savant \n\n"
								+ "Grim Harvest \n\n";
					}
				}
				else if(point == 3){
					descr += "";
				}
				else if(point == 4){
					descr += "Ablility Score Improvement (x" + ASI + ")\n\n";
				}
				else if(point == 5){
					descr += "";
				}
				else if(point == 6){//path
					if(subC.equals("abjuration")) {descr += "Projected Ward \n\n";}
					else if(subC.equals("conjuration")) {descr += "Benign Transposition";}
					else if(subC.equals("divination")) {descr += "Expert Divination";}
					else if(subC.equals("enchantment")) {descr += "Instinctive Charm \n\n";}
					else if(subC.equals("evocation")) {descr += "Potent Cantrip \n\n";}
					else if(subC.equals("illusion")) {descr += "Malleable Illusions \n\n";}
					else if(subC.equals("transmutation")) {descr += "Transmuter's Stone \n\n";}
					else if(subC.equals("necromancy")) {descr += "Undead Thralls \n\n";}
				}
				else if(point == 7){
					descr += "";
				}
				else if(point == 8){
					descr += "";
				}
				else if(point == 9){
					descr += "";
				}
				else if(point == 10){//path
					if(subC.equals("abjuration")) {descr += "Improved Abjuration \n\n";}
					else if(subC.equals("conjuration")) {descr += "Focused Conjuration \n\n";}
					else if(subC.equals("divination")) {descr += "The Third Eye \n\n";}
					else if(subC.equals("enchantment")) {descr += "Split Enchantment \n\n";}
					else if(subC.equals("evocation")) {descr += "Empowered Evocation \n\n";}
					else if(subC.equals("illusion")) {descr += "Illusory Self \n\n";}
					else if(subC.equals("transmutation")) {descr += "Shapechanger \n\n";}
					else if(subC.equals("necromancy")) {descr += "Inured to Undeath \n\n";}
				}
				else if(point == 11){
					descr += "";
				}
				else if(point == 12){
					descr += "";
				}
				else if(point == 13){
					descr += "";
				}
				else if(point == 14){//path
					if(subC.equals("abjuration")) {descr += "Spell Resistance \n\n";}
					else if(subC.equals("conjuration")) {descr += "Durable Summons \n\n";}
					else if(subC.equals("divination")) {descr += "Greater Portent \n\n";}
					else if(subC.equals("enchantment")) {descr += "Alter Memories \n\n";}
					else if(subC.equals("evocation")) {descr += "Overchannel \n\n";}
					else if(subC.equals("illusion")) {descr += "Illusory Reality \n\n";}
					else if(subC.equals("transmutation")) {descr += "Master Transmuter \n\n";}
					else if(subC.equals("necromancy")) {descr += "Command Undead \n\n";}
				}
				else if(point == 15){
					descr += "";
				}
				else if(point == 16){
					descr += "";
				}
				else if(point == 17){
					descr += "";
				}
				else if(point == 18){
					descr += "Spell Mastery \n\n";
				}
				else if(point == 19){
					descr += "";
				}
				else if(point == 20){
					descr += "Signature Spell  \n\n";
				}
			}
		}
		
		return descr;
	}
}
