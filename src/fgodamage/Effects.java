/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fgodamage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ander
 */
public class Effects {
    private String effectName;
    
    public static final Map <String, String> effectsMap;
    public static double teamBusterBonus = 0, teamAtkBonus = 0, teamArtsBonus = 0, teamQuickBonus = 0;

    static{
        Map <String, String> effects = new HashMap<String, String>();
        
        effects.put("Magecraft C-0", "cardMOD");
        effects.put("Magecraft C-1", ".21");
        effects.put("Magecraft C-2", ".224");
        effects.put("Magecraft C-3", ".238");
        effects.put("Magecraft C-4", ".252");
        effects.put("Magecraft C-5", ".266");
        effects.put("Magecraft C-6", ".28");
        effects.put("Magecraft C-7", ".294");
        effects.put("Magecraft C-8", ".308");
        effects.put("Magecraft C-9", ".322");
        effects.put("Magecraft C-10", ".35");
        effects.put("Magecraft C-11", "Arts");
        effects.put("Magecraft C-12", "Self");
        
        effects.put("Charisma B0", "teamAtkBonus");
        effects.put("Charisma B1", ".09");
        effects.put("Charisma B2", ".099");
        effects.put("Charisma B3", ".108");
        effects.put("Charisma B4", ".117");
        effects.put("Charisma B5", ".126");
        effects.put("Charisma B6", ".135");
        effects.put("Charisma B7", ".144");
        effects.put("Charisma B8", ".153");
        effects.put("Charisma B9", ".162");
        effects.put("Charisma B10", ".18");
        effects.put("Charisma B11", "Attack");
        effects.put("Charisma B12", "All");
        
        effects.put("Mana Burst A0", "cardMOD");
        effects.put("Mana Burst A1", ".30");
        effects.put("Mana Burst A2", ".32");
        effects.put("Mana Burst A3", ".34");
        effects.put("Mana Burst A4", ".36");
        effects.put("Mana Burst A5", ".38");
        effects.put("Mana Burst A6", ".40");
        effects.put("Mana Burst A7", ".42");
        effects.put("Mana Burst A8", ".44");
        effects.put("Mana Burst A9", ".46");
        effects.put("Mana Burst A10", ".50");
        effects.put("Mana Burst A11", "Buster");
        effects.put("Mana Burst A12", "Self");
        
        effects.put("Charisma E0", "teamAtkBonus");
        effects.put("Charisma E1", ".06");
        effects.put("Charisma E2", ".066");
        effects.put("Charisma E3", ".072");
        effects.put("Charisma E4", ".078");
        effects.put("Charisma E5", ".084");
        effects.put("Charisma E6", ".09");
        effects.put("Charisma E7", ".096");
        effects.put("Charisma E8", ".102");
        effects.put("Charisma E9", ".108");
        effects.put("Charisma E10", ".12");
        effects.put("Charisma E11", "Attack");
        effects.put("Charisma E12", "All");
        
        effects.put("Charisma C0", "teamAtkBonus");
        effects.put("Charisma C1", ".08");
        effects.put("Charisma C2", ".088");
        effects.put("Charisma C3", ".096");
        effects.put("Charisma C4", ".104");
        effects.put("Charisma C5", ".112");
        effects.put("Charisma C6", ".12");
        effects.put("Charisma C7", ".128");
        effects.put("Charisma C8", ".136");
        effects.put("Charisma C9", ".144");
        effects.put("Charisma C10", ".16");
        effects.put("Charisma C11", "Attack");
        effects.put("Charisma C12", "All");
        
        effects.put("Imperial Privilege EX0", "atkMod");
        effects.put("Imperial Privilege EX1", ".22");
        effects.put("Imperial Privilege EX2", ".242");
        effects.put("Imperial Privilege EX3", ".264");
        effects.put("Imperial Privilege EX4", ".286");
        effects.put("Imperial Privilege EX5", ".308");
        effects.put("Imperial Privilege EX6", ".33");
        effects.put("Imperial Privilege EX7", ".352");
        effects.put("Imperial Privilege EX8", ".374");
        effects.put("Imperial Privilege EX9", ".396");
        effects.put("Imperial Privilege EX10", ".44");
        effects.put("Imperial Privilege EX11", "Attack");
        effects.put("Imperial Privilege EX12", "Self");
        
        effects.put("Dragon Slayer A0", "powerMod");
        effects.put("Dragon Slayer A1", ".5");
        effects.put("Dragon Slayer A2", ".53");
        effects.put("Dragon Slayer A3", ".56");
        effects.put("Dragon Slayer A4", ".59");
        effects.put("Dragon Slayer A5", ".62");
        effects.put("Dragon Slayer A6", ".65");
        effects.put("Dragon Slayer A7", ".68");
        effects.put("Dragon Slayer A8", ".71");
        effects.put("Dragon Slayer A9", ".74");
        effects.put("Dragon Slayer A10", ".80");
        effects.put("Dragon Slayer A11", "Special");
        effects.put("Dragon Slayer A12", "Self");
        
        effects.put("Tactics B0", "npDamageMod");
        effects.put("Tactics B1", ".09");
        effects.put("Tactics B2", ".099");
        effects.put("Tactics B3", ".108");
        effects.put("Tactics B4", ".117");
        effects.put("Tactics B5", ".126");
        effects.put("Tactics B6", ".135");
        effects.put("Tactics B7", ".144");
        effects.put("Tactics B8", ".153");
        effects.put("Tactics B9", ".162");
        effects.put("Tactics B10", ".18");
        effects.put("Tactics B11", "Attack");
        effects.put("Tactics B12", "All");
        
        effects.put("Incitement EX0", "critDamageMod");
        effects.put("Incitement EX1", ".20");
        effects.put("Incitement EX2", ".22");
        effects.put("Incitement EX3", ".24");
        effects.put("Incitement EX4", ".26");
        effects.put("Incitement EX5", ".28");
        effects.put("Incitement EX6", ".30");
        effects.put("Incitement EX7", ".32");
        effects.put("Incitement EX8", ".34");
        effects.put("Incitement EX9", ".36");
        effects.put("Incitement EX10", ".40");
        effects.put("Incitement EX11", "Crits");
        effects.put("Incitement EX12", "Ally");
        
        effects.put("Crest of the Star0", "atkMod");
        effects.put("Crest of the Star1", ".10");
        effects.put("Crest of the Star2", ".12");
        effects.put("Crest of the Star3", ".14");
        effects.put("Crest of the Star4", ".16");
        effects.put("Crest of the Star5", ".18");
        effects.put("Crest of the Star6", ".20");
        effects.put("Crest of the Star7", ".22");
        effects.put("Crest of the Star8", ".24");
        effects.put("Crest of the Star9", ".26");
        effects.put("Crest of the Star10", ".30");
        effects.put("Crest of the Star11", "Attack");
        effects.put("Crest of the Star12", "Self");
        
        
        effectsMap = Collections.unmodifiableMap(effects);

    }
    
    public Effects(String effectName) {
        this.effectName = effectName;
    }
    
    public static void activateSkill(String skillName, int level)
    {
        
        if(!effectsMap.containsKey(skillName + "0"))
        {
            return;
        }
        if(effectsMap.get(skillName + "12").equals("Self"))
        {
            if(FGODamage.cardType.equals(effectsMap.get(skillName + "11")))
                //FGODamage.(effectsMap.get(skillName + "0")) += Double.parseDouble(effectsMap.get(skillName + Integer.toString(level))); 
                if(effectsMap.get(skillName + "0").equals("cardMOD"))
                    FGODamage.cardMOD += Double.parseDouble(effectsMap.get(skillName + Integer.toString(level))); 
        }
        if(effectsMap.get(skillName + "12").equals("All"))
        {}
        if(effectsMap.get(skillName + "12").equals("Ally"))
        {}
        if(effectsMap.get(skillName + "12").equals("Enemy"))
        {}
    }
}
