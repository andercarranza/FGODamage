package com.example.ander.fgodamagerecovery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

import static java.lang.Math.abs;
import static java.lang.Integer.*;

import static java.lang.Math.*;
import com.example.ander.fgodamagerecovery.Objects.Effects;
import com.example.ander.fgodamagerecovery.Objects.FGODamage;
import com.example.ander.fgodamagerecovery.Objects.Servant;

import java.util.List;
import java.util.Map;

import static com.example.ander.fgodamagerecovery.Objects.Effects.hougu;
import static com.example.ander.fgodamagerecovery.Objects.FGODamage.servantsMap;

public class Calculate  extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener{

    String card1Type;
    Servant servant1, servant2, servant3, dealer;

    int chargeStack = -100;
    public static int atk, cardNum, NPdmgMult = 1, criticalModifier = 1,
            isCrit = 0, isNPcard = 0, isSuperEffective = 0; //critmodifier is 1 if not, 2 if yes. isCrit 1 if crit 0 if not. same for np
    public static int skill1Level, skill2Level, skill3Level;
    public static double firstcardBonus = 0, cardDV = -1; //cardmod is for buffs of type arts/buster/quick ste to zero for now
    public static double enemyDefMod = 0; //atkMod for your servants attack modification, enemyDefMod for enemy defense modification....sidenote, note sure if this is where i want to put skill usage but might as well
    public static double extraCardModifier = 1; //1 if not  a brave chain, 2 if just a normal brave chain, 3.5 if in a brave chain with 3 of the same cards
    public static double specialDefMod = 0; //***NOTE ON THIS: only for bosses who have a special damage reduction on them ie gawain in camelot likely will be a while before i implement this***
    //public static double powerMod = 0; //Power Up [Anti-X] includes dragon killer, beast killer, executioner, boudica's skill and whatever else I forget.
    public static double selfDamageMod = 0; //forum says not used yet, not sure if this is still true
    //public static double critDamageMod = 0; //additive modifications to how hard you crit (10% == .1)
    //public static double npDamageMod = 0; //same as above except for NPs NOTE NOT THE AMOUNT OF DAMAGE NP DOES
    public static double superEffectiveModifier = 0; //not sure what this is about maybe something like "weak to enuma elish"
    // public static int dmgPlusAdd = 0; //dmg that is added like divinity and wavers 3rd skill
    public static int enemyDmgCutAdd = 0; //dmg cut like wavers second skill and mashus first, might implement in the future
    public static double busterChainMod = 0; //is .2 if it is a buster card in a buster chain, does not have to be buster brave
    //public static String classname, name, cardType, strIsbuster, classnameEnemy, nameEnemy;
    public static boolean isBuster, isNP = false;
    public static double teamAtkBonus = 0;
    public static double teamDmgAdd = 0;
    public static boolean dragonApplied = false; //keep track is ascalon is used

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculatelayout);
        Intent servantInfo = getIntent();
        final Bundle recieved = servantInfo.getExtras();
        Servant enemy = servantInfo.getParcelableExtra("EnemyObj");
        servant1 = servantInfo.getParcelableExtra("Servant1Obj");
        servant2 = servantInfo.getParcelableExtra("Servant2Obj");
        servant3 = servantInfo.getParcelableExtra("Servant3Obj");

        TextView text1 = (TextView)findViewById(R.id.text1);
        TextView text2 = (TextView)findViewById(R.id.text2);
        TextView text3 = (TextView)findViewById(R.id.text3);
        TextView text4 = (TextView)findViewById(R.id.text4);
        TextView text5 = (TextView)findViewById(R.id.text5);
        TextView text6 = (TextView)findViewById(R.id.text6);
        TextView text7 = (TextView)findViewById(R.id.text7);

        text1.setText(enemy.getName() + " " + enemy.getClassName());

        text3.setText(servant2.getATK() + " " + servant2.getName() + " " + servant2.getClassName());
        text4.setText(servant3.getATK() + " " + servant3.getName() + " " + servant3.getClassName());

        card1Type = recieved.getString("card1Type");
        String card1Servant  = recieved.getString("card1Servant");
        String card1Level = recieved.getString("card1Level");
        String card1Upgrade = recieved.getString("card1Upgrade");
        String card1Charge = recieved.getString("card1Charge");
        if(card1Upgrade.equals("Yes"))
            servant1.setUpgrade(true);

        String card2Type = recieved.getString("card2Type");
        String card2Servant  = recieved.getString("card2Servant");
        String card2Level = recieved.getString("card2Level");
        String card2Upgrade = recieved.getString("card2Upgrade");
        String card2Charge = recieved.getString("card2Charge");
        if(card2Upgrade.equals("Yes"))
            servant2.setUpgrade(true);

        String card3Type = recieved.getString("card3Type");
        String card3Servant  = recieved.getString("card3Servant");
        String card3Level = recieved.getString("card3Level");
        String card3Upgrade = recieved.getString("card3Upgrade");
        String card3Charge = recieved.getString("card3Charge");
        if(card3Upgrade.equals("Yes")) //these checks could go very wrong, better to have upgrade tied to servant
            servant3.setUpgrade(true);

        boolean skill1Active = false, skill2Active = false, skill3Active = false;

        //String sendDealer, sendType;
        int cardNum = 1;
        checkNP(card1Type);
        if(isNP)
        {
            if(card1Type.equals("Ascalon"))
                dragonApplied = true;
            chargeStack += 100;
        }
        dealer = getServantToSend(card1Servant);
        int [] card1Damages = damageNums(dealer, enemy, card1Type, cardNum, card1Level, card1Charge);
        text2.setText("Card 1: " + dealer.getName() + ", " + card1Type);
        cardNum = 2;
        checkNP(card2Type);
        if(isNP)
        {
            if(card2Type.equals("Ascalon"))
                dragonApplied = true;
            chargeStack += 100;
        }
        else
            chargeStack = -100;
        dealer = getServantToSend(card2Servant);
        int [] card2Damages = damageNums(dealer, enemy, card2Type, cardNum, card2Level, card2Charge);
        text3.setText("Card 2: " + dealer.getName() + ", " + card2Type);
        cardNum = 3;
        checkNP(card3Type);
        if(isNP)
            chargeStack += 100;
        else
            chargeStack = -100;
        dealer = getServantToSend(card3Servant);
        int [] card3Damages = damageNums(dealer, enemy, card3Type, cardNum, card3Level, card3Charge);
        text4.setText("Card 3: " + dealer.getName() + ", " + card3Type);

        text5.setText(card1Damages[0] + "-" + card1Damages[1]);
        text6.setText(card2Damages[0] + "-" + card2Damages[1]);
        text7.setText(card3Damages[0] + "-" + card3Damages[1]);

    }



    //not sure if this is what I should do but its all I could think of
    //will return an array with 2 numbers, high value and low value
    public int[] damageNums( Servant dealer, Servant enemy, String cardType, int cardNum, String level, String charge){
        int[] results = new int[2];
        double defChanges = 0, cardModReal = 0;
        int NPchargePerc = Integer.parseInt(charge) + chargeStack;
        if(isNP)
        {
            //put effect activation in here

            Log.d("RAGE", servant1.getName());
            double [] dmgArray;
            dmgArray = dealer.getNPdmgPattern();
            NPdmgMult = (int)dmgArray[Integer.parseInt(level) - 1];

            dealer.activatePreEffect(NPchargePerc, enemy, Integer.parseInt(level));
        }
        if(card1Type.equals("Buster"))
            firstcardBonus = .5;
        if(cardType.equals("Arts") || (isNP && hougu.get(dealer.getNPname() + "5").equals("Arts")))
        {
            if(cardNum == 1)
                cardDV = 1.00;
            if(cardNum == 2)
                cardDV = 1.20;
            if(cardNum == 3)
                cardDV = 1.40;

            defChanges += enemy.getArtsDef();
            cardModReal += dealer.getArtsMOD();
        }
        if(cardType.equals("Buster") || (isNP && hougu.get(dealer.getNPname() + "5").equals("Buster")))
        {
            if(cardNum == 1)
                cardDV = 1.50;
            if(cardNum == 2)
                cardDV = 1.80;
            if(cardNum == 3)
                cardDV = 2.10;

            defChanges += enemy.getBusterDef();
            cardModReal += dealer.getBusterMOD();
        }
        if(cardType.equals("Quick") || (isNP && hougu.get(dealer.getNPname() + "5").equals("Quick")))
        {
            if(cardNum == 1)
                cardDV = .80;
            if(cardNum == 2)
                cardDV = .96;
            if(cardNum == 3)
                cardDV = 1.12;

            defChanges += enemy.getQuickDef();
            cardModReal += dealer.getQuickMOD();
        }
        if(!isNP)
            NPdmgMult = 1;

        double low = (dealer.getATK() * NPdmgMult *(firstcardBonus +
                (cardDV *(1+ cardModReal)))) * dealer.getClassMultiplier() * dealer.getClassAdv(enemy)
                * dealer.getAtrributeAdv(enemy)* .9 * .23 *(1 + (dealer.getAtkMod() + teamAtkBonus) - (enemy.getDefMOD() - defChanges))
                * criticalModifier * extraCardModifier * (1 - specialDefMod) *
                (1 + dealer.getPowerMod() + selfDamageMod + (dealer.getCritDamageMod() * isCrit) +
                        (dealer.getNpDamageMod() * isNPcard) * (1 + ((superEffectiveModifier -1) * isSuperEffective)))
                + dealer.getDmgPlusAdd() + teamDmgAdd + enemyDmgCutAdd + (dealer.getATK() * busterChainMod);

        Log.d("RAGE", "check: " + dealer.getAtrributeAdv(enemy));
        double high = (dealer.getATK() * NPdmgMult *(firstcardBonus +
                (cardDV *(1+ cardModReal)))) * dealer.getClassMultiplier() * dealer.getClassAdv(enemy)
                * dealer.getAtrributeAdv(enemy)* 1.1 * .23 *(1 + (dealer.getAtkMod() + teamAtkBonus) - (enemy.getDefMOD() - defChanges))
                * criticalModifier * extraCardModifier * (1 - specialDefMod) *
                (1 + dealer.getPowerMod() + selfDamageMod + (dealer.getCritDamageMod() * isCrit) +
                        (dealer.getNpDamageMod() * isNPcard) * (1 + ((superEffectiveModifier -1) * isSuperEffective)))
                + dealer.getDmgPlusAdd() + teamDmgAdd + enemyDmgCutAdd + (dealer.getATK() * busterChainMod);
        int lowInt = (int) Math.round(low);
        int highInt = (int) Math.round(high);
        results[0] = lowInt;
        results[1] = highInt;
        if(isNP)
            dealer.activatePostEffect(NPchargePerc, enemy, Integer.parseInt(level));
        return results;
    }

    public void checkNP(String type){
        if(type.equals("Buster") || type.equals("Quick") || type.equals("Arts"))
            isNP = false;
        else
            isNP = true;

    }

    public Servant getServantToSend(String numParse)
    {
        int servNum = Integer.parseInt(numParse);
        if(servNum == 1)
        {
            Log.d("RAGE", "Matched servant 1 name");
            return servant1;
        }
        if(servNum == 2)
        {
            Log.d("RAGE", "Matched servant 2 name");
            return servant2;
        }
        if(servNum == 3)
        {
            Log.d("RAGE", "Matched servant 3 name");
            return servant3;
        }

        Log.d("RAGE", "Didnt match anything");
        return null;
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
