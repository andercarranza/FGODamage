package com.fgoWork;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import static java.lang.Math.abs;

import com.fgoWork.LoadEnemy;
import com.fgoWork.ModifierEdits;
import com.fgoWork.Objects.Party;
import com.fgoWork.Objects.Servant;

import java.text.NumberFormat;
import java.util.Locale;

import static com.fgoWork.Objects.Effects.hougu;

public class Calculate extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    String card1Type, card2Type, card3Type;
    Servant servant1, servant2, servant3, dealer, enemy;
    TextView text1, text2, text3, text4, text5, text6, text7, extraValue, totalDamagios;
    CheckBox critActivate1, critActivate2, critActivate3;
    int chargeStack = -100, totalLow, totalHigh;
    int [] card1Damages, card2Damages, card3Damages, extraCardDMG = {0, 0};
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
    public static double teamCritBonus = 0;
    public static double teamDmgAdd = 0;
    public static boolean dragonApplied = false; //keep track is ascalon is used

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculatelayout);
        Intent servantInfo = getIntent();
        final Bundle recieved = servantInfo.getExtras();
        enemy = servantInfo.getParcelableExtra("EnemyObj");
        servant1 = servantInfo.getParcelableExtra("Servant1Obj");
        servant2 = servantInfo.getParcelableExtra("Servant2Obj");
        servant3 = servantInfo.getParcelableExtra("Servant3Obj");

        Log.d("Defense", enemy.getDefMOD() + "");

        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        text3 = (TextView) findViewById(R.id.text3);
        text4 = (TextView) findViewById(R.id.text4);
        text5 = (TextView) findViewById(R.id.text5);
        text6 = (TextView) findViewById(R.id.text6);
        text7 = (TextView) findViewById(R.id.text7);
        totalDamagios = (TextView) findViewById(R.id.totalNums);
        TextView extraLabel = (TextView) findViewById(R.id.extraLabel);
        extraValue = (TextView) findViewById(R.id.extraValue);
        TextView servant1NM = (TextView) findViewById(R.id.servant1NM);
        TextView servant2NM = (TextView) findViewById(R.id.servant2NM);
        TextView servant3NM = (TextView) findViewById(R.id.servant3NM);
        TextView enemyNM = (TextView) findViewById(R.id.enemyServ);
        critActivate1 = (CheckBox) findViewById(R.id.attack1Crit);
        critActivate2 = (CheckBox) findViewById(R.id.attack2Crit);
        critActivate3 = (CheckBox) findViewById(R.id.attack3Crit);

        Button cardSelect = (Button) findViewById(R.id.backBtn);
        Button cardSelectWMods = (Button) findViewById(R.id.keepBtn);
        Button editMods = (Button) findViewById(R.id.editBtn);
        Button newEnemy = (Button) findViewById(R.id.enemyBtn);

        extraLabel.setVisibility(View.INVISIBLE);
        extraValue.setVisibility(View.INVISIBLE);

        text1.setText("Enemy: " + enemy.getName() + " " + enemy.getClassName());

        text3.setText(servant2.getATK() + " " + servant2.getName() + " " + servant2.getClassName());
        text4.setText(servant3.getATK() + " " + servant3.getName() + " " + servant3.getClassName());

        card1Type = recieved.getString("card1Type");
        final String card1Servant = recieved.getString("card1Servant");
        final String card1Charge = recieved.getString("card1Charge");


        card2Type = recieved.getString("card2Type");
        final String card2Servant = recieved.getString("card2Servant");
        final String card2Charge = recieved.getString("card2Charge");


        card3Type = recieved.getString("card3Type");
        final  String card3Servant = recieved.getString("card3Servant");
        final  String card3Charge = recieved.getString("card3Charge");


        boolean skill1Active = false, skill2Active = false, skill3Active = false, extraAttack = false;

        if (Integer.parseInt(card1Servant) == Integer.parseInt(card2Servant) && Integer.parseInt(card2Servant) == Integer.parseInt(card3Servant))
            extraAttack = true;

        //String sendDealer, sendType;
        int cardNum = 1;
        checkNP(card1Type);
        if (isNP) {
            if (card1Type.equals("Ascalon"))
                dragonApplied = true;
            chargeStack += 100;
        }
        dealer = getServantToSend(card1Servant);
        card1Damages = damageNums(dealer, enemy, card1Type, cardNum, card1Charge);
        text2.setText("Card 1: " + dealer.getName() + ", " + card1Type);
        cardNum = 2;
        checkNP(card2Type);
        if (isNP) {
            if (card2Type.equals("Ascalon"))
                dragonApplied = true;
            chargeStack += 100;
        } else
            chargeStack = -100;
        dealer = getServantToSend(card2Servant);
        card2Damages = damageNums(dealer, enemy, card2Type, cardNum, card2Charge);
        text3.setText("Card 2: " + dealer.getName() + ", " + card2Type);
        cardNum = 3;
        checkNP(card3Type);
        if (isNP)
            chargeStack += 100;
        else
            chargeStack = -100;
        dealer = getServantToSend(card3Servant);
        card3Damages = damageNums(dealer, enemy, card3Type, cardNum, card3Charge);
        text4.setText("Card 3: " + dealer.getName() + ", " + card3Type);
        if (extraAttack) {
            extraLabel.setVisibility(View.VISIBLE);
            extraValue.setVisibility(View.VISIBLE);
            extraLabel.setText("Extra Attack: " + dealer.getName());
            extraCardDMG = damageNums(dealer, enemy, "extra", 4, "0");
            extraValue.setText(NumberFormat.getNumberInstance(Locale.US).format(extraCardDMG[0]) + "-" + NumberFormat.getNumberInstance(Locale.US).format(extraCardDMG[1]));
        }

        servant1NM.setText(servant1.getName());
        servant2NM.setText(servant2.getName());
        servant3NM.setText(servant3.getName());
        enemyNM.setText(enemy.getName());
        text5.setText(NumberFormat.getNumberInstance(Locale.US).format(card1Damages[0]) + "-" + NumberFormat.getNumberInstance(Locale.US).format(card1Damages[1]));
        text6.setText(NumberFormat.getNumberInstance(Locale.US).format(card2Damages[0]) + "-" + NumberFormat.getNumberInstance(Locale.US).format(card2Damages[1]));
        text7.setText(NumberFormat.getNumberInstance(Locale.US).format(card3Damages[0]) + "-" + NumberFormat.getNumberInstance(Locale.US).format(card3Damages[1]));


        totalLow = card1Damages[0] + card2Damages[0] + card3Damages[0] + extraCardDMG[0];
        totalHigh = card1Damages[1] + card2Damages[1] + card3Damages[1] + extraCardDMG[1];
        totalDamagios.setText(NumberFormat.getNumberInstance(Locale.US).format(totalLow) + "-" + NumberFormat.getNumberInstance(Locale.US).format(totalHigh));
        displayModifiers();

        final Intent selectCards = new Intent(this, CardSelect.class);
        final Intent modifiers = new Intent(this, ModifierEdits.class);
        final Intent loadEnemy = new Intent(this, LoadEnemy.class);

        critActivate1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                checkNP(card1Type);
                if (!isNP) {
                    if (critActivate1.isChecked()) {
                        criticalModifier = 2;
                        isCrit = 1;
                        dealer = getServantToSend(card1Servant);
                        card1Damages = damageNums(dealer, enemy, card1Type, 1, card1Charge);
                        reDisplay();
                    }
                    else
                    {
                        criticalModifier = 1;
                        isCrit = 0;
                        dealer = getServantToSend(card1Servant);
                        card1Damages = damageNums(dealer, enemy, card1Type, 1, card1Charge);
                        reDisplay();
                    }
                }
            }
        });

        critActivate2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                checkNP(card2Type);
                if (!isNP) {
                    if (critActivate2.isChecked()) {
                        criticalModifier = 2;
                        isCrit = 1;
                        dealer = getServantToSend(card2Servant);
                        card2Damages = damageNums(dealer, enemy, card2Type, 2, card2Charge);
                        reDisplay();
                    }
                    else
                    {
                        criticalModifier = 1;
                        isCrit = 0;
                        dealer = getServantToSend(card2Servant);
                        card2Damages = damageNums(dealer, enemy, card2Type, 2, card2Charge);
                        reDisplay();
                    }
                }
            }
        });

        critActivate3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                checkNP(card3Type);
                if (!isNP) {
                    if (critActivate3.isChecked()) {
                        criticalModifier = 2;
                        isCrit = 1;
                        dealer = getServantToSend(card3Servant);
                        card3Damages = damageNums(dealer, enemy, card3Type, 3, card3Charge);
                        reDisplay();
                    }
                    else
                    {
                        criticalModifier = 1;
                        isCrit = 0;
                        dealer = getServantToSend(card3Servant);
                        card3Damages = damageNums(dealer, enemy, card3Type, 3, card3Charge);
                        reDisplay();
                    }
                }
            }
        });

        cardSelect.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                selectCards.putExtra("enemyObj", enemy);
                selectCards.putExtra("serv_1a", new Servant(servant1.getATK(), servant1.getName(), servant1.getClassName(), servant1.getSkill1lvl(), servant1.getSkill2lvl(), servant1.getSkill3lvl(), servant1.getIsUpgraded(), servant1.getNPlvl()));
                selectCards.putExtra("serv_2a", new Servant(servant2.getATK(), servant2.getName(), servant2.getClassName(), servant2.getSkill1lvl(), servant2.getSkill2lvl(), servant2.getSkill3lvl(), servant2.getIsUpgraded(), servant2.getNPlvl()));
                selectCards.putExtra("serv_3a", new Servant(servant3.getATK(), servant3.getName(), servant3.getClassName(), servant3.getSkill1lvl(), servant3.getSkill2lvl(), servant3.getSkill3lvl(), servant3.getIsUpgraded(), servant3.getNPlvl()));
                startActivity(selectCards);
            }
        });

        cardSelectWMods.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                selectCards.putExtra("enemyObj", enemy);
                selectCards.putExtra("serv_1a", servant1);
                selectCards.putExtra("serv_2a", servant2);
                selectCards.putExtra("serv_3a", servant3);
                startActivity(selectCards);
            }
        });

        editMods.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Bundle passThis = new Bundle();

                passThis.putString("card1Type", card1Type);
                passThis.putString("card1Servant", card1Servant);
                passThis.putString("card1Charge", card1Charge);

                passThis.putString("card2Type", card2Type);
                passThis.putString("card2Servant", card2Servant);
                passThis.putString("card2Charge", card2Charge);

                passThis.putString("card3Type", card3Type);
                passThis.putString("card3Servant", card3Servant);
                passThis.putString("card3Charge", card3Charge);

                modifiers.putExtras(passThis);
                modifiers.putExtra("EnemyObj", enemy);
                modifiers.putExtra("serv_1a", servant1);
                modifiers.putExtra("serv_2a", servant2);
                modifiers.putExtra("serv_3a", servant3);
                startActivity(modifiers);
            }
        });

        newEnemy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Party passingParty = new Party (servant1, servant2, servant3);
                loadEnemy.putExtra("team", (Parcelable) passingParty);
                startActivity(loadEnemy);
            }
        });

    }

    public void reDisplay(){
        text5.setText(NumberFormat.getNumberInstance(Locale.US).format(card1Damages[0]) + "-" + NumberFormat.getNumberInstance(Locale.US).format(card1Damages[1]));
        text6.setText(NumberFormat.getNumberInstance(Locale.US).format(card2Damages[0]) + "-" + NumberFormat.getNumberInstance(Locale.US).format(card2Damages[1]));
        text7.setText(NumberFormat.getNumberInstance(Locale.US).format(card3Damages[0]) + "-" + NumberFormat.getNumberInstance(Locale.US).format(card3Damages[1]));


        totalLow = card1Damages[0] + card2Damages[0] + card3Damages[0] + extraCardDMG[0];
        totalHigh = card1Damages[1] + card2Damages[1] + card3Damages[1] + extraCardDMG[1];
        totalDamagios.setText(NumberFormat.getNumberInstance(Locale.US).format(totalLow) + "-" + NumberFormat.getNumberInstance(Locale.US).format(totalHigh));
    }

    public void displayModifiers() {
        TextView servant1atkMod = (TextView) findViewById(R.id.servant1ATKmod);
        TextView servant1CritMod = (TextView) findViewById(R.id.servant1CRITmod);
        TextView servant1NPDMGmod = (TextView) findViewById(R.id.servant1NPDMGmod);
        TextView servant1PowMod = (TextView) findViewById(R.id.servant1POWERmod);
        TextView servant1ArtMod = (TextView) findViewById(R.id.servant1ARTSmod);
        TextView servant1BustMod = (TextView) findViewById(R.id.servant1BUSTERmod);
        TextView servant1QckMod = (TextView) findViewById(R.id.servant1QUICKmod);
        TextView servant1DMGPLS = (TextView) findViewById(R.id.servant1DMGPLUSADD);

        TextView servant2atkMod = (TextView) findViewById(R.id.servant2ATKmod);
        TextView servant2CritMod = (TextView) findViewById(R.id.servant2CRITmod);
        TextView servant2NPDMGmod = (TextView) findViewById(R.id.servant2NPDMGmod);
        TextView servant2PowMod = (TextView) findViewById(R.id.servant2POWERmod);
        TextView servant2ArtMod = (TextView) findViewById(R.id.servant2ARTSmod);
        TextView servant2BustMod = (TextView) findViewById(R.id.servant2BUSTERmod);
        TextView servant2QckMod = (TextView) findViewById(R.id.servant2QUICKmod);
        TextView servant2DMGPLS = (TextView) findViewById(R.id.servant2DMGPLUSADD);

        TextView servant3atkMod = (TextView) findViewById(R.id.servant3ATKmod);
        TextView servant3CritMod = (TextView) findViewById(R.id.servant3CRITmod);
        TextView servant3NPDMGmod = (TextView) findViewById(R.id.servant3NPDMGmod);
        TextView servant3PowMod = (TextView) findViewById(R.id.servant3POWERmod);
        TextView servant3ArtMod = (TextView) findViewById(R.id.servant3ARTSmod);
        TextView servant3BustMod = (TextView) findViewById(R.id.servant3BUSTERmod);
        TextView servant3QckMod = (TextView) findViewById(R.id.servant3QUICKmod);
        TextView servant3DMGPLS = (TextView) findViewById(R.id.servant3DMGPLUSADD);

        TextView enemyDefMod = (TextView) findViewById(R.id.enemyDeflabel);
        TextView enemySpDefMod = (TextView) findViewById(R.id.enemySpDefLabel);
        TextView enemyDmgCut = (TextView) findViewById(R.id.enemyDmgCutLabel);
        TextView enemyArtsDef = (TextView) findViewById(R.id.artsDefLabel);
        TextView enemyButserDef = (TextView) findViewById(R.id.busterDefLabel);
        TextView enemyQuickDef = (TextView) findViewById(R.id.quickDefLabel);


        if (servant1.getAtkMod() != 0) {
            servant1atkMod.setTextColor(ContextCompat.getColor(this, R.color.red));
            servant1atkMod.setText("ATK mod: " + (servant1.getAtkMod() * 100) + "%");
        }
        if (servant1.getCritDamageMod() != 0) {
            servant1CritMod.setTextColor(ContextCompat.getColor(this, R.color.red));
            servant1CritMod.setText("Crit mod: " + (servant1.getCritDamageMod() * 100) + "%");
        }
        if (servant1.getNpDamageMod() != 0) {
            servant1NPDMGmod.setText("NP damage mod: " + (servant1.getNpDamageMod() * 100) + "%");
            servant1NPDMGmod.setTextColor(ContextCompat.getColor(this, R.color.red));
        }
        if (servant1.getPowerMod() != 0) {
            servant1PowMod.setText("Power mod: " + (servant1.getPowerMod() * 100) + "%");
            servant1PowMod.setTextColor(ContextCompat.getColor(this, R.color.red));
        }
        if (servant1.getArtsMOD() != 0) {
            servant1ArtMod.setText("Arts mod: " + (servant1.getArtsMOD() * 100) + "%");
            servant1ArtMod.setTextColor(ContextCompat.getColor(this, R.color.red));
        }
        if (servant1.getBusterMOD() != 0) {
            servant1BustMod.setTextColor(ContextCompat.getColor(this, R.color.red));
            servant1BustMod.setText("Buster mod: " + (servant1.getBusterMOD() * 100) + "%");
        }
        if (servant1.getQuickMOD() != 0) {
            servant1QckMod.setTextColor(ContextCompat.getColor(this, R.color.red));
            servant1QckMod.setText("Quick mod: " + (servant1.getQuickMOD() * 100) + "%");
        }
        if (servant1.getDmgPlusAdd() != 0) {
            servant1DMGPLS.setTextColor(ContextCompat.getColor(this, R.color.red));
            servant1DMGPLS.setText("DamagePlusAdd: " + (servant1.getDmgPlusAdd()));
        }

        if (servant2.getAtkMod() != 0) {
            servant2atkMod.setTextColor(ContextCompat.getColor(this, R.color.red));
            servant2atkMod.setText("ATK mod: " + (servant2.getAtkMod() * 100) + "%");
        }
        if (servant2.getCritDamageMod() != 0) {
            servant2CritMod.setTextColor(ContextCompat.getColor(this, R.color.red));
            servant2CritMod.setText("Crit mod: " + (servant2.getCritDamageMod() * 100) + "%");
        }
        if (servant2.getNpDamageMod() != 0) {
            servant2NPDMGmod.setTextColor(ContextCompat.getColor(this, R.color.red));
            servant2NPDMGmod.setText("NP damage mod: " + (servant2.getNpDamageMod() * 100) + "%");
        }
        if (servant2.getPowerMod() != 0) {
            servant2PowMod.setTextColor(ContextCompat.getColor(this, R.color.red));
            servant2PowMod.setText("Power mod: " + (servant2.getPowerMod() * 100) + "%");
        }
        if (servant2.getArtsMOD() != 0) {
            servant2ArtMod.setTextColor(ContextCompat.getColor(this, R.color.red));
            servant2ArtMod.setText("Arts mod: " + (servant2.getArtsMOD() * 100) + "%");
        }
        if (servant2.getBusterMOD() != 0) {
            servant2BustMod.setTextColor(ContextCompat.getColor(this, R.color.red));
            servant2BustMod.setText("Buster mod: " + (servant2.getBusterMOD() * 100) + "%");
        }
        if (servant2.getQuickMOD() != 0) {
            servant2QckMod.setTextColor(ContextCompat.getColor(this, R.color.red));
            servant2QckMod.setText("Quick mod: " + (servant2.getQuickMOD() * 100) + "%");
        }
        if (servant2.getDmgPlusAdd() != 0) {
            servant2DMGPLS.setTextColor(ContextCompat.getColor(this, R.color.red));
            servant2DMGPLS.setText("DamagePlusAdd: " + (servant2.getDmgPlusAdd()));
        }

        if (servant3.getAtkMod() != 0) {
            servant3atkMod.setTextColor(ContextCompat.getColor(this, R.color.red));
            servant3atkMod.setText("ATK mod: " + (servant3.getAtkMod() * 100) + "%");
        }
        if (servant3.getCritDamageMod() != 0) {
            servant3CritMod.setTextColor(ContextCompat.getColor(this, R.color.red));
            servant3CritMod.setText("Crit mod: " + (servant3.getCritDamageMod() * 100) + "%");
        }
        if (servant3.getNpDamageMod() != 0) {
            servant3NPDMGmod.setTextColor(ContextCompat.getColor(this, R.color.red));
            servant3NPDMGmod.setText("NP damage mod: " + (servant3.getNpDamageMod() * 100) + "%");
        }
        if (servant3.getPowerMod() != 0) {
            servant3PowMod.setTextColor(ContextCompat.getColor(this, R.color.red));
            servant3PowMod.setText("Power mod: " + (servant3.getPowerMod() * 100) + "%");
        }
        if (servant3.getArtsMOD() != 0) {
            servant3ArtMod.setTextColor(ContextCompat.getColor(this, R.color.red));
            servant3ArtMod.setText("Arts mod: " + (servant3.getArtsMOD() * 100) + "%");
        }
        if (servant3.getBusterMOD() != 0) {
            servant3BustMod.setTextColor(ContextCompat.getColor(this, R.color.red));
            servant3BustMod.setText("Buster mod: " + (servant3.getBusterMOD() * 100) + "%");
        }
        if (servant3.getQuickMOD() != 0) {
            servant3QckMod.setTextColor(ContextCompat.getColor(this, R.color.red));
            servant3QckMod.setText("Quick mod: " + (servant3.getQuickMOD() * 100) + "%");
        }
        if (servant3.getDmgPlusAdd() != 0) {
            servant3DMGPLS.setTextColor(ContextCompat.getColor(this, R.color.red));
            servant3DMGPLS.setText("DamagePlusAdd: " + (servant3.getDmgPlusAdd()));
        }

        if (enemy.getDefMOD() != 0) {
            enemyDefMod.setTextColor(ContextCompat.getColor(this, R.color.red));
            enemyDefMod.setText("Defense mod: " + (enemy.getDefMOD() * 100) + "%");
        }
        if (enemy.getSpecialDef() != 0) {
            enemySpDefMod.setTextColor(ContextCompat.getColor(this, R.color.red));
            enemySpDefMod.setText("Special Defense mod: " + (enemy.getSpecialDef() * 100) + "%");
        }
        if (enemy.getDmgCut() != 0) {
            enemyDmgCut.setTextColor(ContextCompat.getColor(this, R.color.red));
            enemyDmgCut.setText("Damage Cut: " + (enemy.getDmgCut()));
        }
        if (enemy.getArtsDef() != 0) {
            enemyArtsDef.setTextColor(ContextCompat.getColor(this, R.color.red));
            enemyArtsDef.setText("Arts Resist: " + (enemy.getArtsDef() * 100) + "%");
        }
        if (enemy.getBusterDef() != 0) {
            enemyButserDef.setTextColor(ContextCompat.getColor(this, R.color.red));
            enemyButserDef.setText("Buster Resist: " + (enemy.getBusterDef() * 100) + "%");
        }
        if (enemy.getQuickDef() != 0) {
            enemyQuickDef.setTextColor(ContextCompat.getColor(this, R.color.red));
            enemyQuickDef.setText("Quick Resist: " + (enemy.getQuickDef() * 100) + "%");
        }

    }

    //will return an array with 2 numbers, high value and low value
    public int[] damageNums(Servant dealer, Servant enemy, String cardType, int cardNum, String charge) {
        int[] results = new int[2];
        double defChanges = 0, cardModReal = 0;
        int NPchargePerc = Integer.parseInt(charge) + chargeStack;
        if (isNP) {
            //put effect activation in here

            Log.d("RAGE", servant1.getName());
            double[] dmgArray;
            dmgArray = dealer.getNPdmgPattern();
            NPdmgMult = (int) dmgArray[dealer.getNPlvl() - 1];
            Log.d("NPLVL", dealer.getNPlvl() + "");
            dealer.activatePreEffect(NPchargePerc, enemy, dealer.getNPlvl());
            extraCardModifier = 1;
        }
        if (card1Type.equals("Buster"))
            firstcardBonus = .5;
        if (cardType.equals("Arts") || (isNP && hougu.get(dealer.getNPname() + "5").equals("Arts"))) {
            if (cardNum == 1)
                cardDV = 1.00;
            if (cardNum == 2)
                cardDV = 1.20;
            if (cardNum == 3)
                cardDV = 1.40;

            defChanges += enemy.getArtsDef();
            cardModReal += dealer.getArtsMOD();
            extraCardModifier = 1;
        }
        if (cardType.equals("Buster") || (isNP && hougu.get(dealer.getNPname() + "5").equals("Buster"))) {
            if (cardNum == 1)
                cardDV = 1.50;
            if (cardNum == 2)
                cardDV = 1.80;
            if (cardNum == 3)
                cardDV = 2.10;

            defChanges += enemy.getBusterDef();
            cardModReal += dealer.getBusterMOD();
            extraCardModifier = 1;
        }
        if (cardType.equals("Quick") || (isNP && hougu.get(dealer.getNPname() + "5").equals("Quick"))) {
            if (cardNum == 1)
                cardDV = .80;
            if (cardNum == 2)
                cardDV = .96;
            if (cardNum == 3)
                cardDV = 1.12;

            defChanges += enemy.getQuickDef();
            cardModReal += dealer.getQuickMOD();
            extraCardModifier = 1;
        }
        if (cardType.equals("extra")) {
            if (card1Type.equals(card2Type) && card2Type.equals(card3Type))
                extraCardModifier = 3.5;
            else
                extraCardModifier = 2;
            cardDV = 1;
        }
        if (!isNP)
            NPdmgMult = 1;

        double low = (dealer.getATK() * NPdmgMult * (firstcardBonus +
                (cardDV * (1 + cardModReal)))) * dealer.getClassMultiplier() * dealer.getClassAdv(enemy)
                * dealer.getAtrributeAdv(enemy) * .9 * .23 * (1 + (dealer.getAtkMod() + teamAtkBonus) - (enemy.getDefMOD() - defChanges))
                * criticalModifier * extraCardModifier * (1 - enemy.getSpecialDef()) *
                (1 + dealer.getPowerMod() + selfDamageMod + ((dealer.getCritDamageMod() + teamCritBonus) * isCrit) +
                        (dealer.getNpDamageMod() * isNPcard) * (1 + ((superEffectiveModifier - 1) * isSuperEffective)))
                + dealer.getDmgPlusAdd() + teamDmgAdd - enemy.getDmgCut() + (dealer.getATK() * busterChainMod);

        Log.d("enemygmgcut", enemy.getDmgCut() + "");
        //Log.d("teamdmgplus", teamDmgAdd + "");

        double high = (dealer.getATK() * NPdmgMult * (firstcardBonus +
                (cardDV * (1 + cardModReal)))) * dealer.getClassMultiplier() * dealer.getClassAdv(enemy)
                * dealer.getAtrributeAdv(enemy) * 1.1 * .23 * (1 + (dealer.getAtkMod() + teamAtkBonus) - (enemy.getDefMOD() - defChanges))
                * criticalModifier * extraCardModifier * (1 - enemy.getSpecialDef()) *
                (1 + dealer.getPowerMod() + selfDamageMod + ((dealer.getCritDamageMod() + teamCritBonus) * isCrit) +
                        (dealer.getNpDamageMod() * isNPcard) * (1 + ((superEffectiveModifier - 1) * isSuperEffective)))
                + dealer.getDmgPlusAdd() + teamDmgAdd - enemy.getDmgCut() + (dealer.getATK() * busterChainMod);
        int lowInt = (int) Math.round(low);
        int highInt = (int) Math.round(high);
        results[0] = lowInt;
        results[1] = highInt;
        if (isNP)
            dealer.activatePostEffect(NPchargePerc, enemy, dealer.getNPlvl());
        return results;
    }

    public void checkNP(String type) {
        if (type.equals("Buster") || type.equals("Quick") || type.equals("Arts"))
            isNP = false;
        else
            isNP = true;

    }

    public Servant getServantToSend(String numParse) {
        int servNum = Integer.parseInt(numParse);
        if (servNum == 1) {
            return servant1;
        }
        if (servNum == 2) {
            return servant2;
        }
        if (servNum == 3) {
            return servant3;
        }

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
