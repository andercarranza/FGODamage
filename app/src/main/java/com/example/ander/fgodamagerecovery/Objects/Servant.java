package com.example.ander.fgodamagerecovery.Objects;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

import com.example.ander.fgodamagerecovery.Calculate;

import java.util.List;

import static com.example.ander.fgodamagerecovery.Objects.Effects.effectsMap;
import static com.example.ander.fgodamagerecovery.Objects.Effects.hiddenTraits;
import static com.example.ander.fgodamagerecovery.Objects.FGODamage.servantsMap;
import static com.example.ander.fgodamagerecovery.Objects.FGODamage.upgradelist;
import static com.example.ander.fgodamagerecovery.Objects.Effects.damagePattern;
import static com.example.ander.fgodamagerecovery.Objects.Effects.hougu;

public class Servant implements Parcelable{
    private int ATK;
    //public ServantType servInfo;
    private String attribute;
    private double superEffectiveModifier;
    private int isPoisoned;
    private double busterDef = 0;
    private double artsDef = 0;
    private double quickDef = 0;
    private String name;
    private boolean isUpgraded = false;
    private String className;
    private String skill1, skill2, skill3;
    private double critDamageMod = 0, npDamageMod = 0, atkMod = 0, cardMOD = 0, powerMod = 0, artsMOD = 0, busterMOD = 0, quickMOD = 0, defenseIgnoreHolder = 0, defMOD = 0;
    private int dmgPlusAdd = 0;

    public void setCritDamageMod(double critDamageMod) {
        this.critDamageMod = critDamageMod;
    }

    public void setUpgrade(Boolean check)
    {
        this.isUpgraded = check;
    }

    protected Servant(Parcel in) {
        ATK = in.readInt();
        name = in.readString();
        attribute = in.readString();
        className = in.readString();
        skill1 = in.readString();
        skill2 = in.readString();
        skill3 = in.readString();
        critDamageMod = in.readDouble();
        npDamageMod = in.readDouble();
        atkMod = in.readDouble();
        cardMOD = in.readDouble();
        powerMod = in.readDouble();
        artsMOD = in.readDouble();
        busterMOD = in.readDouble();
        quickMOD = in.readDouble();
        dmgPlusAdd = in.readInt();
        superEffectiveModifier = in.readDouble();
        isPoisoned = in.readInt();
        busterDef = in.readDouble();
        artsDef = in.readDouble();
        quickDef = in.readDouble();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(ATK);
        dest.writeString(name);
        dest.writeString(attribute);
        dest.writeString(className);
        dest.writeString(skill1);
        dest.writeString(skill2);
        dest.writeString(skill3);
        dest.writeDouble(critDamageMod);
        dest.writeDouble(npDamageMod);
        dest.writeDouble(atkMod);
        dest.writeDouble(cardMOD);
        dest.writeDouble(powerMod);
        dest.writeDouble(artsMOD);
        dest.writeDouble(busterMOD);
        dest.writeDouble(quickMOD);
        dest.writeInt(dmgPlusAdd);
        dest.writeDouble(superEffectiveModifier);
        dest.writeInt(isPoisoned);
        dest.writeDouble(busterDef);
        dest.writeDouble(artsDef);
        dest.writeDouble(quickDef);
    }

    public static final Creator<Servant> CREATOR = new Creator<Servant>() {
        @Override
        public Servant createFromParcel(Parcel in) {
            return new Servant(in);
        }

        @Override
        public Servant[] newArray(int size) {
            return new Servant[size];
        }
    };

    public void activatePostEffect(int charge, Servant enemy, int NPlevel){
        String NPname = servantsMap.get(this.name + "5");
        //reset all preeffects that last only for NP (dont think this is necessary, only for ignore defense)
        if(this.defenseIgnoreHolder != 0)
        {
            enemy.setDefMOD(this.defenseIgnoreHolder);
            this.defenseIgnoreHolder = 0;
        }
        if(isUpgraded)
        {
            if(hougu.containsKey(NPname + "2u") && hougu.get(NPname + "2u").equals("True"))
            {
                String preEffect = hougu.get(NPname + "4u");
                applyEffect(preEffect, enemy, charge, false, NPlevel, true);
                return;
            }
        }
        if(hougu.get(NPname + "2").equals("True"))
        {
            String preEffect = hougu.get(NPname + "2");
            applyEffect(preEffect, enemy, charge, false, NPlevel, false);
            return;
        }
    }

    public void activatePreEffect(int charge, Servant enemy, int NPlevel){
        String NPname = servantsMap.get(this.name + "5");

        if(isUpgraded)
        {
            if(hougu.containsKey(NPname + "1u") && hougu.get(NPname + "1u").equals("True"))
            {
                String preEffect = hougu.get(NPname + "3u");
                applyEffect(preEffect, enemy, charge, true, NPlevel, true);
                return;
            }
        }
        if(hougu.get(NPname + "1").equals("True"))
        {
            String preEffect = hougu.get(NPname + "3");
            applyEffect(preEffect, enemy, charge, true, NPlevel, false);
            return;
        }
    }

    public void applyEffect(String effectName, Servant Enemy, int charge, boolean prePost, int NPlevel, boolean upgradeAccess){

        if(effectName.equals("Ignores Defense"))
        {
            String NPname = servantsMap.get(this.name + "5");
            if(hougu.get(NPname + "6").equals("PowerMod"))
            {
                if(servantsMap.get(Enemy.getName() + "3").equals("Female"))
                    this.powerMod += getModifierNum(charge, NPlevel, prePost, effectName, upgradeAccess);
            }
            this.defenseIgnoreHolder = Enemy.getDefMOD();
            Enemy.setDefMOD(0);
        }

        if(effectName.equals("NPdamageMod"))
        {
            this.npDamageMod += getModifierNum(charge, NPlevel, prePost, effectName, upgradeAccess);
        }

        if(effectName.equals("BusterUp"))
        {
            this.busterMOD += getModifierNum(charge, NPlevel, prePost, effectName, upgradeAccess);
        }

        if(effectName.equals("QuickUp"))
        {
            this.quickMOD += getModifierNum(charge, NPlevel, prePost, effectName, upgradeAccess);
        }

        if(effectName.equals("ArtsUp"))
        {
            this.artsMOD += getModifierNum(charge, NPlevel, prePost, effectName, upgradeAccess);
        }

        if(effectName.equals("CritUp"))
        {
            this.critDamageMod += getModifierNum(charge, NPlevel, prePost, effectName, upgradeAccess);
        }

        if(effectName.equals("NP Strength"))
        {

            String NPname = servantsMap.get(this.name + "5");
            this.npDamageMod += getModifierNum(charge, NPlevel, prePost, effectName, upgradeAccess);
            if(hougu.get(NPname + "6").equals("Servant"))
            {
                List<String> hiddenChecker = hiddenTraits.get("Servant");
                if(!hiddenChecker.contains(Enemy.getName()))
                {
                    this.superEffectiveModifier += getModifierNum(charge, NPlevel, prePost, effectName, false);
                }
            }
        }

        if(effectName.equals("TeamAtkBonus"))
        {
            Calculate.teamAtkBonus += getModifierNum(charge, NPlevel, prePost, effectName, upgradeAccess);
        }

        if(effectName.equals("Dmg Rcvd Plus"))
        {
            Calculate.teamDmgAdd += getModifierNum(charge, NPlevel, prePost, effectName, upgradeAccess);
        }

        if(effectName.equals("Buster Def Down"))
        {
            Enemy.setBusterDef(Enemy.getBusterDef() - getModifierNum(charge, NPlevel, prePost, effectName, upgradeAccess));
        }

        if(effectName.equals("Arts Def Down"))
        {
            Enemy.setArtsDef(Enemy.getArtsDef() - getModifierNum(charge, NPlevel, prePost, effectName, upgradeAccess));
        }

        if(effectName.equals("Quick Def Down"))
        {
            Enemy.setQuickDef(Enemy.getQuickDef() - getModifierNum(charge, NPlevel, prePost, effectName, upgradeAccess));
        }

        if(effectName.equals("AtkUp"))
        {
            this.atkMod += getModifierNum(charge, NPlevel, prePost, effectName, upgradeAccess);
        }

        if(effectName.equals("Defense Down"))
        {
            Enemy.setDefMOD(Enemy.getDefMOD() - getModifierNum(charge, NPlevel, prePost, effectName, upgradeAccess));
        }

        if(effectName.equals("Special Attack"))
        {
            String NPname = servantsMap.get(this.name + "5");
            String upgraded = "";
            if(upgradeAccess)
                upgraded = "u";
            List<String> attribute = hiddenTraits.get(hougu.get(NPname + "6" + upgraded));
            //move this so that it gets activated as well as the other one
            if(hougu.get(NPname + "6").equals("Servant"))
            {
                List<String> hiddenChecker = hiddenTraits.get("Servant");
                if(!hiddenChecker.contains(Enemy.getName()))
                {
                    this.superEffectiveModifier += getModifierNum(charge, NPlevel, prePost, effectName, false);
                }
            }
            else if(hougu.get(NPname + "6").equals("Poisoned"))
            {
                if(Enemy.isPoisoned == 1)
                    this.superEffectiveModifier += getModifierNum(charge, NPlevel, prePost, effectName, upgradeAccess);
            }
            else if(hougu.get(NPname + "6" + upgraded).equals("Female"))
            {
                if(servantsMap.get(Enemy.getName() + "3").equals("Female"))
                    this.superEffectiveModifier += getModifierNum(charge, NPlevel, prePost, effectName, upgradeAccess);
            }
            else if(hougu.get(NPname + "6" + upgraded).equals("Male"))
            {
                if(servantsMap.get(Enemy.getName() + "3").equals("Male"))
                    this.superEffectiveModifier += getModifierNum(charge, NPlevel, prePost, effectName, upgradeAccess);
            }
            else if(hougu.get(NPname + "6" + upgraded).equals("Dragon") || Calculate.dragonApplied)
            {
                this.superEffectiveModifier += getModifierNum(charge, NPlevel, prePost, effectName, upgradeAccess);
            }
            else if(attribute.contains(Enemy.getName()))
            {
                this.superEffectiveModifier += getModifierNum(charge, NPlevel, prePost, effectName, upgradeAccess);
            }
        }
    }

    public double getModifierNum(int charge, int NPlevel, boolean prePost, String effectName, boolean upgradeAccess){
        double modifier = -1;
        String access;
        double [] accessArray;
        String NP = getNPname();


        if(prePost)
            access = "7";
        else
            access = "8";

        if(upgradeAccess)
            access += "u";

        if(hougu.get(NP + access).equals("NPLevel"))
        {
            accessArray = damagePattern.get(hougu.get(NP + "1" + access));
            modifier = accessArray[NPlevel];
        }
        else
        {
            accessArray = damagePattern.get(hougu.get(NP + access));
            modifier = accessArray[(charge/100) -1];
        }

        return modifier;
    }

    public double [] getNPdmgPattern(){
        double [] arrToReturn;
        Log.d("RAGE", "declared array");
        String NPname = servantsMap.get(this.name + "5");
        Log.d("RAGE", "got NP name");
        if(upgradelist.contains(NPname) && this.isUpgraded)
        {
            Log.d("RAGE", "inside if statement");
            if(hougu.containsKey(hougu.get(NPname + "0u")))
                arrToReturn = damagePattern.get(hougu.get(NPname + "0u"));
            else
                arrToReturn = damagePattern.get(hougu.get(NPname + "0"));
        }
        else
        {
            Log.d("RAGE", "inside else");
            arrToReturn = damagePattern.get(hougu.get(NPname + "0"));
        }
        Log.d("RAGE", "returning array");
        return arrToReturn;
    }

    public double getBusterDef() {
        return busterDef;
    }

    public void setBusterDef(double busterDef) {
        this.busterDef = busterDef;
    }

    public double getArtsDef() {
        return artsDef;
    }

    public void setArtsDef(double artsDef) {
        this.artsDef = artsDef;
    }

    public double getQuickDef() {
        return quickDef;
    }

    public void setQuickDef(double quickDef) {
        this.quickDef = quickDef;
    }

    public double getSuperEffectiveModifier() {
        return superEffectiveModifier;
    }

    public void setSuperEffectiveModifier(double superEffectiveModifier) {
        this.superEffectiveModifier = superEffectiveModifier;
    }

    public int isPoisoned() {
        return isPoisoned;
    }

    public void setPoisoned(boolean poisoned) {
        isPoisoned = 1;
    }

    public double getArtsMOD() {
        return artsMOD;
    }

    public String getName(){ return this.name; }

    public int getATK(){ return this.ATK; }

    public void addArtsMOD(double c) {
        this.artsMOD += c;
    }

    public double getBusterMOD() {
        return this.busterMOD;
    }

    public void addBusterMOD(double c) {
        this.busterMOD += c;
    }

    public double getQuickMOD() {
        return this.quickMOD;
    }

    public void addQuickMOD(double c) {
        this.quickMOD += c;
    }

    public void addCritDamageMod(double c) {
        critDamageMod += c;
    }
    public double getCritDamageMod() {
        return critDamageMod;
    }

    public double getNpDamageMod() {
        return npDamageMod;
    }
    public void addNpDamageMod(double c) {
        npDamageMod += c;
    }

    public String getNPname(){
        return servantsMap.get(this.name + "5");
    }

    public double getAtkMod() {
        return atkMod;
    }
    public void addAtkMod(double c) {
        atkMod += c;
    }

    public double getCardMOD() {
        return cardMOD;
    }

    public double getDefMOD() {
        return defMOD;
    }

    public void setDefMOD(double defMOD) {
        this.defMOD = defMOD;
    }

    public void addCardMOD(double c) {
        cardMOD += c;
    }

    public double getPowerMod() {
        return powerMod;
    }

    public void addPowerMod(double c) {
        powerMod += c;
    }

    public int getDmgPlusAdd() {
        return dmgPlusAdd;
    }

    public void addDmgPlusAdd(int c) {
        dmgPlusAdd += c;
    }

    public Servant(int ATK, String name, String className) {
        this.ATK = ATK;
        this.attribute = FGODamage.servantsMap.get(name + "4");
        this.className = className;
        this.name = name;
        this.skill1 = FGODamage.servantsMap.get(name + "0");
        this.skill2 = FGODamage.servantsMap.get(name + "1");
        this.skill3 = FGODamage.servantsMap.get(name + "2");
        activateClassSkills(name);
    }

    public void activateClassSkills(String name){

        String nameMod = "6";

        while(servantsMap.containsKey(name + nameMod)){
            String classSkillName = servantsMap.get(name + nameMod);


            if(classSkillName.equals("Riding EX"))
                this.quickMOD += .12;

            if(classSkillName.equals("Riding A++"))
                this.quickMOD += .115;

            if(classSkillName.equals("Riding A+"))
                this.quickMOD += .11;

            if(classSkillName.equals("Riding A"))
                this.quickMOD += .1;

            if(classSkillName.equals("Riding B"))
                this.quickMOD += .08;

            if(classSkillName.equals("Riding C+"))
                this.quickMOD += .07;

            if(classSkillName.equals("Riding C"))
                this.quickMOD += .06;

            if(classSkillName.equals("Riding E"))
                this.quickMOD += .02;


            if(classSkillName.equals("Divinity A"))
                this.dmgPlusAdd += 200;

            if(classSkillName.equals("Divinity B"))
                this.dmgPlusAdd += 175;

            if(classSkillName.equals("Divinity C"))
                this.dmgPlusAdd += 150;

            if(classSkillName.equals("Divinity D"))
                this.dmgPlusAdd += 125;

            if(classSkillName.equals("Divinity E-"))
                this.dmgPlusAdd += 95;

            if(classSkillName.equals("Divinity E"))
                this.dmgPlusAdd += 100;



            if(classSkillName.equals("Madness Enhancement EX"))
                this.busterMOD += .12;

            if(classSkillName.equals("Madness Enhancement A+"))
                this.busterMOD += .11;

            if(classSkillName.equals("Madness Enhancement A"))
                this.busterMOD += .10;

            if(classSkillName.equals("Madness Enhancement B"))
                this.busterMOD += .08;

            if(classSkillName.equals("Madness Enhancement C"))
                this.busterMOD += .06;

            if(classSkillName.equals("Madness Enhancement D"))
                this.busterMOD += .04;

            if(classSkillName.equals("Madness Enhancement E"))
                this.busterMOD += .02;

            if(classSkillName.equals("Madness Enhancement E-"))
                this.busterMOD += .01;


            if(classSkillName.equals("Independent Action A+"))
                this.critDamageMod += .11;

            if(classSkillName.equals("Independent Action A"))
                this.critDamageMod += .1;

            if(classSkillName.equals("Independent Action B"))
                this.critDamageMod += .08;

            if(classSkillName.equals("Independent Action C"))
                this.critDamageMod += .06;


            if(classSkillName.equals("Oblivion Correction B"))
                this.critDamageMod += .08;

            if(classSkillName.equals("Oblivion Correction A"))
                this.critDamageMod += .1;


            if(classSkillName.equals("Independent Manifestation C"))
                this.critDamageMod += .06;


            if(classSkillName.equals("Connection to the Root A"))
            {
                this.busterMOD += .06;
                this.artsMOD += .06;
                this.quickMOD += .06;
            }


            if(classSkillName.equals("Core of the Goddesss EX"))
                this.dmgPlusAdd += 300;

            if(classSkillName.equals("Core of the Goddesss C"))
                this.dmgPlusAdd += 200;


            if(classSkillName.equals("Territory Creation A+"))
                this.artsMOD += .11;

            if(classSkillName.equals("Territory Creation A"))
                this.artsMOD += .1;

            if(classSkillName.equals("Territory Creation B"))
                this.artsMOD += .08;

            if(classSkillName.equals("Territory Creation C+"))
                this.artsMOD += .07;

            if(classSkillName.equals("Territory Creation C"))
                this.artsMOD += .06;

            if(classSkillName.equals("Territory Creation D"))
                this.artsMOD += .04;

            if(nameMod.equals("6"))
                nameMod = "7";
            if(nameMod.equals("7"))
                nameMod = "8";
            if(nameMod.equals("8"))
                nameMod = "9";
        }
    }

    public double getClassMultiplier() {
        if(className.equals("Saber"))
            return 1.0;
        if(className.equals("Archer"))
            return .95;
        if(className.equals("Lancer"))
            return 1.05;
        if(className.equals("Rider"))
            return 1.0;
        if(className.equals("Caster"))
            return 0.9;
        if(className.equals("Assassin"))
            return 0.9;
        if(className.equals("Berserker"))
            return 1.1;
        if(className.equals("Shielder"))
            return 1.0;
        if(className.equals("Ruler"))
            return 1.1;
        if(className.equals("AlterEgo"))
            return 1.0;
        if(className.equals("Avenger"))
            return 1.1;
        return -1.0;
    }

    public double getAtrributeAdv(Servant o)
    {
        if(this.attribute.equals("Man"))
        {
            if(o.getAttribute().equals("Sky"))
                return 1.1;
            if(o.getAttribute().equals("Earth"))
                return 0.9;
            else
                return 1.0;
        }
        if(this.attribute.equals("Sky"))
        {
            if(o.getAttribute().equals("Earth"))
                return 1.1;
            if(o.getAttribute().equals("Man"))
                return 0.9;
            else
                return 1.0;
        }
        if(this.attribute.equals("Earth"))
        {
            if(o.getAttribute().equals("Man"))
                return 1.1;
            if(o.getAttribute().equals("Sky"))
                return 0.9;
            else
                return 1.0;
        }
        if(this.attribute.equals("Star"))
        {
            if(o.getAttribute().equals("Beast"))
                return 1.1;
            else
                return 1.0;
        }
        if(this.attribute.equals("Beast"))
        {
            if(o.getAttribute().equals("Beast"))
                return 0.0;
            if(o.getAttribute().equals("Star"))
                return 1.1;
            else
                return 1.0;
        }
        return -1;
    }

    public double getClassAdv(Servant enemy){
        if(this.className.equals("Saber")){
            if(enemy.getClassName().equals("Archer") || enemy.getClassName().equals("Ruler"))
                return .5;
            if(enemy.getClassName().equals("Lancer") || enemy.getClassName().equals("AlterEgo") || enemy.getClassName().equals("Berserker"))
                return 2.0;
            else
                return 1.0;
        }
        if(this.className.equals("Archer")){
            if(enemy.getClassName().equals("Lancer") || enemy.getClassName().equals("Ruler"))
                return .5;
            if(enemy.getClassName().equals("Saber") || enemy.getClassName().equals("AlterEgo") || enemy.getClassName().equals("Berserker"))
                return 2.0;
            else
                return 1.0;
        }
        if(this.className.equals("Lancer")){
            if(enemy.getClassName().equals("Saber") || enemy.getClassName().equals("Ruler"))
                return .5;
            if(enemy.getClassName().equals("Archer") || enemy.getClassName().equals("AlterEgo") || enemy.getClassName().equals("Berserker"))
                return 2.0;
            else
                return 1.0;
        }
        if(this.className.equals("Rider")){
            if(enemy.getClassName().equals("Assassin") || enemy.getClassName().equals("Ruler"))
                return .5;
            if(enemy.getClassName().equals("Caster") || enemy.getClassName().equals("Beast") || enemy.getClassName().equals("Berserker"))
                return 2.0;
            else
                return 1.0;
        }
        if(this.className.equals("Caster")){
            if(enemy.getClassName().equals("Rider") || enemy.getClassName().equals("Ruler"))
                return .5;
            if(enemy.getClassName().equals("Assassin") || enemy.getClassName().equals("Beast") || enemy.getClassName().equals("Berserker"))
                return 2.0;
            else
                return 1.0;
        }
        if(this.className.equals("Assassin")){
            if(enemy.getClassName().equals("Caster") || enemy.getClassName().equals("Ruler"))
                return .5;
            if(enemy.getClassName().equals("Rider") || enemy.getClassName().equals("Beast") || enemy.getClassName().equals("Berserker"))
                return 2.0;
            else
                return 1.0;
        }
        if(this.className.equals("Berserker")){
            if(enemy.getClassName().equals("Shielder"))
                return 1.5;
            else
                return 1.0;
        }
        if(this.className.equals("Shielder")){
            return 1.0;
        }
        if(this.className.equals("Ruler")){
            if(enemy.getClassName().equals("Avenger"))
                return .5;
            if(enemy.getClassName().equals("Berserker"))
                return 2.0;
            else
                return 1.0;
        }
        if(this.className.equals("AlterEgo")){
            if(enemy.getClassName().equals("Assassin") || enemy.getClassName().equals("Rider")
                    || enemy.getClassName().equals("Caster")|| enemy.getClassName().equals("Berserker"))
                return 2.0;
            else
                return 1.0;
        }
        if(this.className.equals("Avenger")){
            if(enemy.getClassName().equals("Berserker") || enemy.getClassName().equals("Ruler"))
                return 2.0;
            else
                return 1.0;
        }
        return -1;
    }

    public String getClassName() {
        return className;
    }

    public String getAttribute() {
        return attribute;
    }

    @Override
    public int describeContents() {
        return 0;
    }

}
