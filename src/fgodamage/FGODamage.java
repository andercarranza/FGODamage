/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    public static final Map <String, String> servantsMap;
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
        double classBonus = myServ.servInfo.getClassMultiplier();
        double classAdvantage = myServ.servInfo.getClassAdv(enemyServ.servInfo);
        double randomlow = .9, randomhigh = 1.1;
        double endDamage = (atk * NPdmgMult *(firstcardBonus + (cardDV *(1+ cardMOD))) * classBonus * classAdvantage * myServ.getAtrributeAdv(enemyServ)
                * 1 * .23 *(1 + atkMod - enemyDefMod) * criticalModifier * extraCardModifier * (1 - specialDefMod) * //the times one at the start is to make the high and low points easier to calculate. just mulitply the final result by .9 and 1.1 for low and high bounds
                (1 + powerMod + selfDamageMod + (critDamageMod * isCrit) + (npDamageMod * isNPcard)) * (1 + ((superEffectiveModifier -1) * isSuperEffective))) 
                + dmgPlusAdd + enemyDmgCutAdd + (atk * busterChainMod); 
        System.out.println(endDamage);
        
    }
    
    
}
