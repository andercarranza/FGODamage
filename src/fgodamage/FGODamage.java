/*
 servants.java contains info for a few advantages like class and attribute advantages.
**IMPORTANT** all damage claculations and info located at http://blogs.nrvnqsr.com/entry.php/3309-How-is-damage-calculated this guy goes into a lot of detail and this 
forum thread seems to have a lot of useful information **IMPORTANT*

 */
package fgodamage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Ander
 */



public class FGODamage {
    public static final Map <String, String> servantsMap; //this map contains general servant info, in the style of "servantname0" = first skill
    //"servantname1" = second skill, "servantname2" = third skill, "servantname3" = servant gender, "servantname4" = servant attribute
    //later on i wanted to add upgraded skills. the "servantnameX" where X is a number is very useful because it allows us to add servant info
    //we feel we need while leaving it extremely easy to access, as long as we keep the same pattern for each servant
    //info from http://fate-go.cirnopedia.org/servant_all.php#
    
    
    //note on this: i really like this map format and i think it would be useful for storing Noble Phantasm damage info and maybe skills as well
    static{
        Map <String, String> servants = new HashMap<String, String>();
        servants.put("Emiya0","Mind's Eye (True) B");
        servants.put("Emiya1","Clairvoyance C");
        servants.put("Emiya2","Magecraft C-");
        servants.put("Emiya3","Male");
        servants.put("Emiya4","Man");
        servants.put("Mash0","Transient Wall of Snowflakes");
        servants.put("Mash1","Obscurant Wall of Chalk");
        servants.put("Mash2","Shield of Rousing Resolution");
        servants.put("Mash3","Female");
        servants.put("Mash4","Earth");
        servants.put("Arturia0","Charisma B");
        servants.put("Arturia1","Mana Burst A");
        servants.put("Arturia2","Intuition A");
        servants.put("Arturia3","Female");
        servants.put("Arturia4","Earth");
        servants.put("Arturia Alter0","Mana Burst A");
        servants.put("Arturia Alter1","Intuition B");
        servants.put("Arturia Alter2","Charisma E");
        servants.put("Arturia Alter3","Female");
        servants.put("Arturia Alter4","Man");
        servants.put("Arturia Lily0","Intuition B");
        servants.put("Arturia Lily1","Mana Burst A");
        servants.put("Arturia Lily2","Journey of the Flowers EX");
        servants.put("Arturia Lily3","Female");
        servants.put("Arturia Lily4","Earth");
        servants.put("Nero0","Migraine B");
        servants.put("Nero1","Imperial Priviledge EX");
        servants.put("Nero2","Thrice Setting Sun A");
        servants.put("Nero3","Female");
        servants.put("Nero4","Man");
        servants.put("Seigried0","Golden Rule C-");
        servants.put("Seigried1","Disengage A");
        servants.put("Seigried2","Dragon Slayer A");
        servants.put("Seigried3","Male");
        servants.put("Seigried4","Earth");
        servants.put("Caesar0","Tactics B");
        servants.put("Caesar1","Charisma C");
        servants.put("Caesar2","Incitement EX");
        servants.put("Caesar3","Male");
        servants.put("Caesar4","Man");
        servants.put("Altera0","Tactics B");
        servants.put("Altera1","Natural Body D");
        servants.put("Altera2","Crest of the Star");
        servants.put("Altera3","Female");
        servants.put("Altera4","Man");
        servants.put("Gilles Saber0","Tactics C");
        servants.put("Gilles Saber1","Golden Rule B");
        servants.put("Gilles Saber2","Prelati's Encouragement B");
        servants.put("Gilles Saber3","Male");
        servants.put("Gilles Saber4","Man");
        servants.put("Chevalier d'Eon0","Mind's Eye (True) C");
        servants.put("Chevalier d'Eon1","Self-Suggestion A");
        servants.put("Chevalier d'Eon2","Aspect of Beauty C");
        servants.put("Chevalier d'Eon3","Trap");
        servants.put("Chevalier d'Eon4","Man");
        servants.put("Gilgamesh0","Charisma A+");
        servants.put("Gilgamesh1","Golden Rule A");
        servants.put("Gilgamesh2","Collector EX");
        servants.put("Gilgamesh3","Male");
        servants.put("Gilgamesh4","Sky");
        servants.put("Robin Hood0","Sabotage A");
        servants.put("Robin Hood1","Golden Rule E");
        servants.put("Robin Hood2","May King B");
        servants.put("Robin Hood3","Male");
        servants.put("Robin Hood4","Man");
        servants.put("Atlante0","Beyond Arcadia B");
        servants.put("Atlante1","Hunter's Aesthetic C");
        servants.put("Atlante2","Calydon Hunt A");
        servants.put("Atlante3","Female");
        servants.put("Atlante4","Earth");
        servants.put("Euryale0","Vampirism C");
        servants.put("Euryale1","Siren Song A");
        servants.put("Euryale2","Whim of the Goddess A");
        servants.put("Euryale3","Female");
        servants.put("Euryale4","Sky");
        servants.put("Arash0","Toughness EX");
        servants.put("Arash1","Clairvoyance A");
        servants.put("Arash2","Bow and Arrow Creation A");
        servants.put("Arash3","Male");
        servants.put("Arash4","Earth");
        servants.put("Cu Chulainn0","Battle COntinuation A");
        servants.put("Cu Chulainn1","Protection from Arrows B");
        servants.put("Cu Chulainn2","Disengage C");
        servants.put("Cu Chulainn3","Male");
        servants.put("Cu Chulainn4","Sky");
        servants.put("Liz0","Charisma C");
        servants.put("Liz1","Charisma of Sadism A");
        servants.put("Liz2","Torture Technique A");
        servants.put("Liz3","Female");
        servants.put("Liz4","Man");
        servants.put("Benkei0","Vengeful Spirit Exorcism A");
        servants.put("Benkei1","Imposing Stance B");
        servants.put("Benkei2","Blank Subscription List");
        servants.put("Benkei3","Male");
        servants.put("Benkei4","Man");
        servants.put("Cu Chulainn (Prototype)0","Rune Spell B");
        servants.put("Cu Chulainn (Prototype)1","Protection from Arrows B");
        servants.put("Cu Chulainn (Prototype)2","Beast-Slayer B+");
        servants.put("Cu Chulainn (Prototype)3","Male");
        servants.put("Cu Chulainn (Prototype)4","Sky");
        servants.put("Leonidas0","Rear Guard's Pride A");
        servants.put("Leonidas1","Battle Continuation A");
        servants.put("Leonidas2","Warrior's Roar B");
        servants.put("Leonidas3","Male");
        servants.put("Leonidas4","Man");
        servants.put("Romulus0","Natural Body C");
        servants.put("Romulus1","Imperial Privilege EX");
        servants.put("Romulus2","Septem Colles A");
        servants.put("Romulus3","Male");
        servants.put("Romulus4","Star");
        servants.put("Medusa0","Mysitc Eyes A+");
        servants.put("Medusa1","Monstrous Strength B");
        servants.put("Medusa2","Bloodfort Andromeda B");
        servants.put("Medusa3","Female");
        servants.put("Medusa4","Earth");
        servants.put("Georgios0","Guardian Knight A+");
        servants.put("Georgios1","Martyr's Soul B+");
        servants.put("Georgios2","Battle Continuation A");
        servants.put("Georgios3","Male");
        servants.put("Georgios4","Man");
        servants.put("Edward Teach0","Voyager of the Storm A");
        servants.put("Edward Teach1","Pirate's Glory B");
        servants.put("Edward Teach2","Loving Gentleman C");
        servants.put("Edward Teach3","Male");
        servants.put("Edward Teach4","Man");
        servants.put("Boudica0","Vow to the Goddess B");
        servants.put("Boudica1","Battle Continuation A");
        servants.put("Boudica2","Protection of Andrasta A");
        servants.put("Boudica3","Female");
        servants.put("Boudica4","Man");
        servants.put("Ushiwakamaru0","Tenga's Strategy A");
        servants.put("Ushiwakamaru1","Charisma C+");
        servants.put("Ushiwakamaru2","Quick-Witted Swallow B");
        servants.put("Ushiwakamaru3","Female");
        servants.put("Ushiwakamaru4","Man");
        servants.put("Alexander0","Charisma C");
        servants.put("Alexander1","Fair Youth B");
        servants.put("Alexander2","Signs of a Supreme Ruler A");
        servants.put("Alexander3","Male");
        servants.put("Alexander4","Man");
        servants.put("Marie Antoinette0","Siren Song C");
        servants.put("Marie Antoinette1","Beautiful Princess A");
        servants.put("Marie Antoinette2","Grace of God B");
        servants.put("Marie Antoinette3","Female");
        servants.put("Marie Antoinette4","Man");
        servants.put("Martha0","Protection of the Faith A");
        servants.put("Martha1","Miracle D");
        servants.put("Martha2","Holy Maiden's Oath C");
        servants.put("Martha3","Female");
        servants.put("Martha4","Man");
        servants.put("Medea0","Rapid Divine Words A");
        servants.put("Medea1","Argon Coin");
        servants.put("Medea2","Circe's Teaching A");
        servants.put("Medea3","Female");
        servants.put("Medea4","Earth");
        servants.put("Gilles Caster0","Mental Corruption A");
        servants.put("Gilles Caster1","Aesthitic Appreciation E-");
        servants.put("Gilles Caster2","Evil Eye of the Abyss C");
        servants.put("Gilles Caster3","Male");
        servants.put("Gilles Caster4","Man");
        servants.put("Hans Christian Andersen0","Human Observation A");
        servants.put("Hans Christian Andersen1","Rapid Casting E");
        servants.put("Hans Christian Andersen2","Innocent Monster D");
        servants.put("Hans Christian Andersen3","Male");
        servants.put("Hans Christian Andersen4","Man");
        servants.put("William Shakespeare0","Enchant A");
        servants.put("William Shakespeare1","Self-Preservation B");
        servants.put("William Shakespeare2","The King's Men C");
        servants.put("William Shakespeare3","Male");
        servants.put("William Shakespeare4","Man");
        servants.put("Mephistopheles0","Curse A");
        servants.put("Mephistopheles1","Innocent Monster B");
        servants.put("Mephistopheles2","Jester's Burst of Laughter A+");
        servants.put("Mephistopheles3","Male");
        servants.put("Mephistopheles4","Earth");
        servants.put("Wolfganag Amadeus Mozart0","Protection of Muse (Fake) EX");
        servants.put("Wolfganag Amadeus Mozart1","Aesthetic Appreciation B");
        servants.put("Wolfganag Amadeus Mozart2","A Little Night Music EX");
        servants.put("Wolfganag Amadeus Mozart3","Male");
        servants.put("Wolfganag Amadeus Mozart4","Star");
        
        
        servantsMap = Collections.unmodifiableMap(servants);
    }

    public static void main(String[] args) {
        Scanner rtz = new Scanner(System.in);
        Scanner rtz1 = new Scanner(System.in);
        int atk, cardNum, NPdmgMult = 1, criticalModifier = 1, isCrit = 0, isNPcard = 0
                , isSuperEffective = 0; //critmodifier is 1 if not, 2 if yes. isCrit 1 if crit 0 if not. same for np
        double firstcardBonus = 0, cardDV = -1, cardMOD = 0; //cardmod is for buffs of type arts/buster/quick ste to zero for now
        double atkMod = 0, enemyDefMod = 0; //atkMod for your servants attack modification, enemyDefMod for enemy defense modification....sidenote, note sure if this is where i want to put skill usage but might as well
        double extraCardModifier = 1; //1 if not  abrave chain, 2 if just a normal brave chain, 3.5 if in a brave chain with 3 of the same cards
        double specialDefMod = 0; //***NOTE ON THIS: only for bosses who have a special damage reduction on them ie gawain in camelot likely will be a while before i implement this***
        double powerMod = 0; //not sure what this is, check forum/skill wording 
        double selfDamageMod = 0; //forum says not used yet, not sure if this is still true 
        double critDamageMod = 0; //additive modifications to how hard you crit (10% == .1)
        double npDamageMod = 0; //same as above except for NPs NOTE NOT THE AMOUNT OF DAMAGE NP DOES
        double superEffectiveModifier = 0; //not sure what this is about maybe something like "weak to enuma elish"
        int dmgPlusAdd = 0; //dmg that is added like divinity and wavers 3rd skill
        int enemyDmgCutAdd = 0; //dmg cut like wavers second skill and mashus first, might implement in the future
        double busterChainMod = 0; //is .2 if it is a buster card in a buster chain, does not have to be buster brave
        String classname, name, cardType, strIsbuster, classnameEnemy, nameEnemy;
        boolean isBuster, isNP = false;
        System.out.println("What is the class of the enemy?");
        classnameEnemy = rtz.nextLine();
        System.out.println("What is the name of the enemy?");
        nameEnemy = rtz.nextLine();
        System.out.println("What is the ATK of your servant?");
        atk = rtz.nextInt();
        rtz.nextLine();
        System.out.println("What is the class of your servant?");
        classname = rtz.nextLine();
        //TimeUnit.SECONDS.sleep(1);
        System.out.println("What is the name of your servant?");
        name = rtz.nextLine();
        System.out.println("Is the first card buster?(y/n)");
        strIsbuster = rtz.nextLine();
        System.out.println("Which card is this?(1,2,3)");
        cardNum = rtz.nextInt();
        rtz.nextLine();
        System.out.println("Type of card?");
        cardType = rtz.nextLine();
        if(isNP)
            NPdmgMult = 200; //change to the servants np level and dmg amount later
        if(strIsbuster.equals("y"))
            firstcardBonus = .5;
        if(cardType.equals("Arts"))
        {
            if(cardNum == 1)
                cardDV = 1.00;
            if(cardNum == 2)
                cardDV = 1.20;
            if(cardNum == 3)
                cardDV = 1.40;
        }
        if(cardType.equals("Buster"))
        {
            if(cardNum == 1)
                cardDV = 1.50;
            if(cardNum == 2)
                cardDV = 1.80;
            if(cardNum == 3)
                cardDV = 2.10;
        }
        if(cardType.equals("Quick"))
        {
            if(cardNum == 1)
                cardDV = .80;
            if(cardNum == 2)
                cardDV = .96;
            if(cardNum == 3)
                cardDV = 1.12;
        }
        Servant myServ = new Servant(atk, name, classname);
        Servant enemyServ = new Servant(0, nameEnemy, classnameEnemy);
        double classBonus = myServ.getClassMultiplier();
        double classAdvantage = myServ.getClassAdv(enemyServ);
        double randomlow = .9, randomhigh = 1.1;
        double endDamage = (atk * NPdmgMult *(firstcardBonus + (cardDV *(1+ cardMOD))) * classBonus * classAdvantage * myServ.getAtrributeAdv(enemyServ)
                * 1 * .23 *(1 + atkMod - enemyDefMod) * criticalModifier * extraCardModifier * (1 - specialDefMod) * //the times one at the start is to make the high and low points easier to calculate. just mulitply the final result by .9 and 1.1 for low and high bounds
                (1 + powerMod + selfDamageMod + (critDamageMod * isCrit) + (npDamageMod * isNPcard)) * (1 + ((superEffectiveModifier -1) * isSuperEffective))) 
                + dmgPlusAdd + enemyDmgCutAdd + (atk * busterChainMod); 
        System.out.println(endDamage);
        
    }
    
    
}
