package com.example.ander.fgodamagerecovery.Objects;

import android.os.Parcel;
import android.os.Parcelable;

import static com.example.ander.fgodamagerecovery.Objects.Effects.effectsMap;
import static com.example.ander.fgodamagerecovery.Objects.FGODamage.servantsMap;
import static com.example.ander.fgodamagerecovery.Objects.FGODamage.upgradelist;
import static com.example.ander.fgodamagerecovery.Objects.Effects.damagePattern;
import static com.example.ander.fgodamagerecovery.Objects.Effects.hougu;

public class Servant implements Parcelable{
    private int ATK;
    //public ServantType servInfo;
    private String attribute;
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
            if(hougu.get(NPname + "2u").equals("True"))
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
            if(hougu.get(NPname + "1u").equals("True"))
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
            this.defenseIgnoreHolder = Enemy.getDefMOD();
            Enemy.setDefMOD(0);
        }

        if(effectName.equals("AtkUp"))
        {
            this.ATK += getModifierNum(charge, NPlevel, prePost, effectName, upgradeAccess);
        }

        if(effectName.equals("Defense Down"))
        {
            Enemy.setDefMOD(Enemy.getDefMOD() - getModifierNum(charge, NPlevel, prePost, effectName, upgradeAccess));
        }

        if(effectName.equals("Special Attack"))
        {

        }
    }

    public double getModifierNum(int charge, int NPlevel, boolean prePost, String effectName, boolean upgradeAccess){
        double modifier = -1;
        String access;
        double [] accessArray;



        if(prePost)
            access = "7";
        else
            access = "8";

        if(upgradeAccess)
            access += "u";

        if(hougu.get(effectName + access).equals("NPLevel"))
        {
            accessArray = damagePattern.get(effectName + "1" + access);
            modifier = accessArray[NPlevel];
        }
        else
        {
            accessArray = damagePattern.get(effectName + access);
            modifier = accessArray[(charge/100) -1];
        }

        return modifier;
    }

    public double [] getNPdmgPattern(){
        double [] arrToReturn;

        String NPname = servantsMap.get(this.name + "5");

        if(upgradelist.contains(NPname) && isUpgraded)
        {
            arrToReturn = damagePattern.get(hougu.get(NPname + "0u"));
        }
        else
            arrToReturn = damagePattern.get(hougu.get(NPname + "0"));

        return arrToReturn;
    }



    public double getArtsMOD() {
        return artsMOD;
    }

    public String getName(){ return this.name; }

    public int getATK(){ return this.ATK; }

    public void addArtsMOD(double c) {
        artsMOD += c;
    }

    public double getBusterMOD() {
        return busterMOD;
    }

    public void addBusterMOD(double c) {
        busterMOD += c;
    }

    public double getQuickMOD() {
        return quickMOD;
    }

    public void addQuickMOD(double c) {
        quickMOD += c;
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
    }
}
