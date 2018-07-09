package com.example.ander.fgodamagerecovery.Objects;
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
    public static double teamBusterBonus = 0, teamAtkBonus = 0, teamArtsBonus = 0, teamQuickBonus = 0, teamNPBonus = 0, teamCritBonus = 0;
    public static int teamDamagePlus = 0;

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

        effects.put("Pursuit for the Unkown B0", "cardMOD");
        effects.put("Pursuit for the Unkown B1", ".15");
        effects.put("Pursuit for the Unkown B2", ".155");
        effects.put("Pursuit for the Unkown B3", ".16");
        effects.put("Pursuit for the Unkown B4", ".165");
        effects.put("Pursuit for the Unkown B5", ".17");
        effects.put("Pursuit for the Unkown B6", ".175");
        effects.put("Pursuit for the Unkown B7", ".18");
        effects.put("Pursuit for the Unkown B8", ".185");
        effects.put("Pursuit for the Unkown B9", ".19");
        effects.put("Pursuit for the Unkown B10", ".20");
        effects.put("Pursuit for the Unkown B11", "All");
        effects.put("Pursuit for the Unkown B12", "Self");

        effects.put("Iron Determination EX0", "atkMod");
        effects.put("Iron Determination EX1", ".30");
        effects.put("Iron Determination EX2", ".32");
        effects.put("Iron Determination EX3", ".34");
        effects.put("Iron Determination EX4", ".36");
        effects.put("Iron Determination EX5", ".38");
        effects.put("Iron Determination EX6", ".40");
        effects.put("Iron Determination EX7", ".42");
        effects.put("Iron Determination EX8", ".44");
        effects.put("Iron Determination EX9", ".46");
        effects.put("Iron Determination EX10", ".50");
        effects.put("Iron Determination EX11", "Attack");
        effects.put("Iron Determination EX12", "Self");

        effects.put("Guardian Beast B0", "cardMOD");
        effects.put("Guardian Beast B1", ".30");
        effects.put("Guardian Beast B2", ".32");
        effects.put("Guardian Beast B3", ".34");
        effects.put("Guardian Beast B4", ".36");
        effects.put("Guardian Beast B5", ".38");
        effects.put("Guardian Beast B6", ".40");
        effects.put("Guardian Beast B7", ".42");
        effects.put("Guardian Beast B8", ".44");
        effects.put("Guardian Beast B9", ".46");
        effects.put("Guardian Beast B10", ".50");
        effects.put("Guardian Beast B11", "Quick");
        effects.put("Guardian Beast B12", "Self");

        effects.put("Shamanism B0", "cardMOD");
        effects.put("Shamanism B1", ".30");
        effects.put("Shamanism B2", ".32");
        effects.put("Shamanism B3", ".34");
        effects.put("Shamanism B4", ".36");
        effects.put("Shamanism B5", ".38");
        effects.put("Shamanism B6", ".40");
        effects.put("Shamanism B7", ".42");
        effects.put("Shamanism B8", ".44");
        effects.put("Shamanism B9", ".46");
        effects.put("Shamanism B10", ".50");
        effects.put("Shamanism B11", "Arts");
        effects.put("Shamanism B12", "Self");

        effects.put("Bloody Devil B0", "cardMOD");
        effects.put("Bloody Devil B1", ".30");
        effects.put("Bloody Devil B2", ".32");
        effects.put("Bloody Devil B3", ".34");
        effects.put("Bloody Devil B4", ".36");
        effects.put("Bloody Devil B5", ".38");
        effects.put("Bloody Devil B6", ".40");
        effects.put("Bloody Devil B7", ".42");
        effects.put("Bloody Devil B8", ".44");
        effects.put("Bloody Devil B9", ".46");
        effects.put("Bloody Devil B10", ".50");
        effects.put("Bloody Devil B11", "Buster");
        effects.put("Bloody Devil B12", "Self");

        effects.put("Juezhao B0", "cardMOD");
        effects.put("Juezhao B1", ".30");
        effects.put("Juezhao B2", ".32");
        effects.put("Juezhao B3", ".34");
        effects.put("Juezhao B4", ".36");
        effects.put("Juezhao B5", ".38");
        effects.put("Juezhao B6", ".40");
        effects.put("Juezhao B7", ".42");
        effects.put("Juezhao B8", ".44");
        effects.put("Juezhao B9", ".46");
        effects.put("Juezhao B10", ".50");
        effects.put("Juezhao B11", "Arts");
        effects.put("Juezhao B12", "Self");

        effects.put("Mystic Eyes of Death Perception A0", "cardMOD");
        effects.put("Mystic Eyes of Death Perception A1", ".30");
        effects.put("Mystic Eyes of Death Perception A2", ".32");
        effects.put("Mystic Eyes of Death Perception A3", ".34");
        effects.put("Mystic Eyes of Death Perception A4", ".36");
        effects.put("Mystic Eyes of Death Perception A5", ".38");
        effects.put("Mystic Eyes of Death Perception A6", ".40");
        effects.put("Mystic Eyes of Death Perception A7", ".42");
        effects.put("Mystic Eyes of Death Perception A8", ".44");
        effects.put("Mystic Eyes of Death Perception A9", ".46");
        effects.put("Mystic Eyes of Death Perception A10", ".50");
        effects.put("Mystic Eyes of Death Perception A11", "Arts");
        effects.put("Mystic Eyes of Death Perception A12", "Self");

        effects.put("Mystic Eyes of Death Perception C0", "cardMOD");
        effects.put("Mystic Eyes of Death Perception C1", ".25");
        effects.put("Mystic Eyes of Death Perception C2", ".265");
        effects.put("Mystic Eyes of Death Perception C3", ".28");
        effects.put("Mystic Eyes of Death Perception C4", ".295");
        effects.put("Mystic Eyes of Death Perception C5", ".31");
        effects.put("Mystic Eyes of Death Perception C6", ".325");
        effects.put("Mystic Eyes of Death Perception C7", ".34");
        effects.put("Mystic Eyes of Death Perception C8", ".355");
        effects.put("Mystic Eyes of Death Perception C9", ".37");
        effects.put("Mystic Eyes of Death Perception C10", ".40");
        effects.put("Mystic Eyes of Death Perception C11", "Arts");
        effects.put("Mystic Eyes of Death Perception C12", "Self");

        effects.put("Magecraft B0", "cardMOD");
        effects.put("Magecraft B1", ".24");
        effects.put("Magecraft B2", ".256");
        effects.put("Magecraft B3", ".272");
        effects.put("Magecraft B4", ".288");
        effects.put("Magecraft B5", ".304");
        effects.put("Magecraft B6", ".32");
        effects.put("Magecraft B7", ".336");
        effects.put("Magecraft B8", ".352");
        effects.put("Magecraft B9", ".368");
        effects.put("Magecraft B10", ".40");
        effects.put("Magecraft B11", "Arts");
        effects.put("Magecraft B12", "Self");

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

        effects.put("Charisma A+0", "teamAtkBonus");
        effects.put("Charisma A+1", ".105");
        effects.put("Charisma A+2", ".116");
        effects.put("Charisma A+3", ".126");
        effects.put("Charisma A+4", ".137");
        effects.put("Charisma A+5", ".147");
        effects.put("Charisma A+6", ".158");
        effects.put("Charisma A+7", ".168");
        effects.put("Charisma A+8", ".179");
        effects.put("Charisma A+9", ".189");
        effects.put("Charisma A+10", ".21");
        effects.put("Charisma A+11", "Attack");
        effects.put("Charisma A+12", "All");

        effects.put("Charisma A0", "teamAtkBonus");
        effects.put("Charisma A1", ".10");
        effects.put("Charisma A2", ".11");
        effects.put("Charisma A3", ".12");
        effects.put("Charisma A4", ".13");
        effects.put("Charisma A5", ".14");
        effects.put("Charisma A6", ".15");
        effects.put("Charisma A7", ".16");
        effects.put("Charisma A8", ".17");
        effects.put("Charisma A9", ".18");
        effects.put("Charisma A10", ".20");
        effects.put("Charisma A11", "Attack");
        effects.put("Charisma A12", "All");

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

        effects.put("Mana Burst A+0", "cardMOD");
        effects.put("Mana Burst A+1", ".35");
        effects.put("Mana Burst A+2", ".37");
        effects.put("Mana Burst A+3", ".39");
        effects.put("Mana Burst A+4", ".41");
        effects.put("Mana Burst A+5", ".43");
        effects.put("Mana Burst A+6", ".45");
        effects.put("Mana Burst A+7", ".47");
        effects.put("Mana Burst A+8", ".49");
        effects.put("Mana Burst A+9", ".51");
        effects.put("Mana Burst A+10", ".55");
        effects.put("Mana Burst A+11", "Buster");
        effects.put("Mana Burst A+12", "Self");

        effects.put("Mana Burst A-0", "cardMOD");
        effects.put("Mana Burst A-1", ".25");
        effects.put("Mana Burst A-2", ".27");
        effects.put("Mana Burst A-3", ".29");
        effects.put("Mana Burst A-4", ".31");
        effects.put("Mana Burst A-5", ".33");
        effects.put("Mana Burst A-6", ".35");
        effects.put("Mana Burst A-7", ".37");
        effects.put("Mana Burst A-8", ".39");
        effects.put("Mana Burst A-9", ".41");
        effects.put("Mana Burst A-10", ".45");
        effects.put("Mana Burst A-11", "Buster");
        effects.put("Mana Burst A-12", "Self");

        effects.put("Shukuchi B0", "cardMOD");
        effects.put("Shukuchi B1", ".30");
        effects.put("Shukuchi B2", ".32");
        effects.put("Shukuchi B3", ".34");
        effects.put("Shukuchi B4", ".36");
        effects.put("Shukuchi B5", ".38");
        effects.put("Shukuchi B6", ".40");
        effects.put("Shukuchi B7", ".42");
        effects.put("Shukuchi B8", ".44");
        effects.put("Shukuchi B9", ".46");
        effects.put("Shukuchi B10", ".50");
        effects.put("Shukuchi B11", "Quick");
        effects.put("Shukuchi B12", "Self");

        effects.put("Primordial Rune (Scat)0", "cardMOD");
        effects.put("Primordial Rune (Scat)1", ".30");
        effects.put("Primordial Rune (Scat)2", ".32");
        effects.put("Primordial Rune (Scat)3", ".34");
        effects.put("Primordial Rune (Scat)4", ".36");
        effects.put("Primordial Rune (Scat)5", ".38");
        effects.put("Primordial Rune (Scat)6", ".40");
        effects.put("Primordial Rune (Scat)7", ".42");
        effects.put("Primordial Rune (Scat)8", ".44");
        effects.put("Primordial Rune (Scat)9", ".46");
        effects.put("Primordial Rune (Scat)10", ".50");
        effects.put("Primordial Rune (Scat)11", "Quick");
        effects.put("Primordial Rune (Scat)12", "Ally");

        effects.put("Wisdom of Dun Scaith A+0", "critDamageMod");
        effects.put("Wisdom of Dun Scaith A+1", ".30");
        effects.put("Wisdom of Dun Scaith A+2", ".32");
        effects.put("Wisdom of Dun Scaith A+3", ".34");
        effects.put("Wisdom of Dun Scaith A+4", ".36");
        effects.put("Wisdom of Dun Scaith A+5", ".38");
        effects.put("Wisdom of Dun Scaith A+6", ".40");
        effects.put("Wisdom of Dun Scaith A+7", ".42");
        effects.put("Wisdom of Dun Scaith A+8", ".44");
        effects.put("Wisdom of Dun Scaith A+9", ".46");
        effects.put("Wisdom of Dun Scaith A+10", ".50");
        effects.put("Wisdom of Dun Scaith A+11", "Crits");
        effects.put("Wisdom of Dun Scaith A+12", "Self");

        effects.put("Protection of World's End A0", "critDamageMod");
        effects.put("Protection of World's End A1", ".30");
        effects.put("Protection of World's End A2", ".32");
        effects.put("Protection of World's End A3", ".34");
        effects.put("Protection of World's End A4", ".36");
        effects.put("Protection of World's End A5", ".38");
        effects.put("Protection of World's End A6", ".40");
        effects.put("Protection of World's End A7", ".42");
        effects.put("Protection of World's End A8", ".44");
        effects.put("Protection of World's End A9", ".46");
        effects.put("Protection of World's End A10", ".50");
        effects.put("Protection of World's End A11", "Crits");
        effects.put("Protection of World's End A12", "Self");

        effects.put("Murder on a Misty Night A0", "cardMOD");
        effects.put("Murder on a Misty Night A1", ".30");
        effects.put("Murder on a Misty Night A2", ".32");
        effects.put("Murder on a Misty Night A3", ".34");
        effects.put("Murder on a Misty Night A4", ".36");
        effects.put("Murder on a Misty Night A5", ".38");
        effects.put("Murder on a Misty Night A6", ".40");
        effects.put("Murder on a Misty Night A7", ".42");
        effects.put("Murder on a Misty Night A8", ".44");
        effects.put("Murder on a Misty Night A9", ".46");
        effects.put("Murder on a Misty Night A10", ".50");
        effects.put("Murder on a Misty Night A11", "Quick");
        effects.put("Murder on a Misty Night A12", "Self");

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

        effects.put("Charisma C+0", "teamAtkBonus");
        effects.put("Charisma C+1", ".085");
        effects.put("Charisma C+2", ".094");
        effects.put("Charisma C+3", ".102");
        effects.put("Charisma C+4", ".111");
        effects.put("Charisma C+5", ".119");
        effects.put("Charisma C+6", ".128");
        effects.put("Charisma C+7", ".136");
        effects.put("Charisma C+8", ".145");
        effects.put("Charisma C+9", ".153");
        effects.put("Charisma C+10", ".17");
        effects.put("Charisma C+11", "Attack");
        effects.put("Charisma C+12", "All");

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

        effects.put("Shining Cloud B0", "atkMod");
        effects.put("Shining Cloud B1", ".15");
        effects.put("Shining Cloud B2", ".16");
        effects.put("Shining Cloud B3", ".17");
        effects.put("Shining Cloud B4", ".18");
        effects.put("Shining Cloud B5", ".19");
        effects.put("Shining Cloud B6", ".20");
        effects.put("Shining Cloud B7", ".21");
        effects.put("Shining Cloud B8", ".22");
        effects.put("Shining Cloud B9", ".23");
        effects.put("Shining Cloud B10", ".25");
        effects.put("Shining Cloud B11", "Attack");
        effects.put("Shining Cloud B12", "Self");

        effects.put("Valor A+0", "atkMod");
        effects.put("Valor A+1", ".105");
        effects.put("Valor A+2", ".126");
        effects.put("Valor A+3", ".146");
        effects.put("Valor A+4", ".167");
        effects.put("Valor A+5", ".187");
        effects.put("Valor A+6", ".208");
        effects.put("Valor A+7", ".228");
        effects.put("Valor A+8", ".249");
        effects.put("Valor A+9", ".269");
        effects.put("Valor A+10", ".31");
        effects.put("Valor A+11", "Attack");
        effects.put("Valor A+12", "Self");

        effects.put("Valor B0", "atkMod");
        effects.put("Valor B1", ".09");
        effects.put("Valor B2", ".108");
        effects.put("Valor B3", ".126");
        effects.put("Valor B4", ".144");
        effects.put("Valor B5", ".162");
        effects.put("Valor B6", ".18");
        effects.put("Valor B7", ".198");
        effects.put("Valor B8", ".216");
        effects.put("Valor B9", ".234");
        effects.put("Valor B10", ".27");
        effects.put("Valor B11", "Attack");
        effects.put("Valor B12", "Self");

        effects.put("Protection of Muse (Fake) EX0", "teamArtsBonus");
        effects.put("Protection of Muse (Fake) EX1", ".22");
        effects.put("Protection of Muse (Fake) EX2", ".242");
        effects.put("Protection of Muse (Fake) EX3", ".264");
        effects.put("Protection of Muse (Fake) EX4", ".286");
        effects.put("Protection of Muse (Fake) EX5", ".308");
        effects.put("Protection of Muse (Fake) EX6", ".33");
        effects.put("Protection of Muse (Fake) EX7", ".352");
        effects.put("Protection of Muse (Fake) EX8", ".374");
        effects.put("Protection of Muse (Fake) EX9", ".396");
        effects.put("Protection of Muse (Fake) EX10", ".44");
        effects.put("Protection of Muse (Fake) EX11", "Arts");
        effects.put("Protection of Muse (Fake) EX12", "All");

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

        effects.put("Beast Slayer B+0", "powerMod");
        effects.put("Beast Slayer B+1", ".4");
        effects.put("Beast Slayer B+2", ".42");
        effects.put("Beast Slayer B+3", ".44");
        effects.put("Beast Slayer B+4", ".46");
        effects.put("Beast Slayer B+5", ".48");
        effects.put("Beast Slayer B+6", ".5");
        effects.put("Beast Slayer B+7", ".52");
        effects.put("Beast Slayer B+8", ".54");
        effects.put("Beast Slayer B+9", ".56");
        effects.put("Beast Slayer B+10", ".60");
        effects.put("Beast Slayer B+11", "Special");
        effects.put("Beast Slayer B+12", "Self");

        effects.put("Human Body Comprehension A0", "powerMod");
        effects.put("Human Body Comprehension A1", ".3");
        effects.put("Human Body Comprehension A2", ".32");
        effects.put("Human Body Comprehension A3", ".34");
        effects.put("Human Body Comprehension A4", ".36");
        effects.put("Human Body Comprehension A5", ".38");
        effects.put("Human Body Comprehension A6", ".4");
        effects.put("Human Body Comprehension A7", ".42");
        effects.put("Human Body Comprehension A8", ".44");
        effects.put("Human Body Comprehension A9", ".46");
        effects.put("Human Body Comprehension A10", ".50");
        effects.put("Human Body Comprehension A11", "Special");
        effects.put("Human Body Comprehension A12", "Self");

        effects.put("Galactic Meteor Sword C0", "powerMod");
        effects.put("Galactic Meteor Sword C1", ".3");
        effects.put("Galactic Meteor Sword C2", ".32");
        effects.put("Galactic Meteor Sword C3", ".34");
        effects.put("Galactic Meteor Sword C4", ".36");
        effects.put("Galactic Meteor Sword C5", ".38");
        effects.put("Galactic Meteor Sword C6", ".4");
        effects.put("Galactic Meteor Sword C7", ".42");
        effects.put("Galactic Meteor Sword C8", ".44");
        effects.put("Galactic Meteor Sword C9", ".46");
        effects.put("Galactic Meteor Sword C10", ".50");
        effects.put("Galactic Meteor Sword C11", "Special");
        effects.put("Galactic Meteor Sword C12", "Self");

        effects.put("Transient Dream A0", "cardMOD");
        effects.put("Transient Dream A1", ".3");
        effects.put("Transient Dream A2", ".32");
        effects.put("Transient Dream A3", ".34");
        effects.put("Transient Dream A4", ".36");
        effects.put("Transient Dream A5", ".38");
        effects.put("Transient Dream A6", ".4");
        effects.put("Transient Dream A7", ".42");
        effects.put("Transient Dream A8", ".44");
        effects.put("Transient Dream A9", ".46");
        effects.put("Transient Dream A10", ".50");
        effects.put("Transient Dream A11", "Buster");
        effects.put("Transient Dream A12", "Self");

        effects.put("Grace of the Holy Grail A+0", "cardMOD");
        effects.put("Grace of the Holy Grail A+1", ".3");
        effects.put("Grace of the Holy Grail A+2", ".32");
        effects.put("Grace of the Holy Grail A+3", ".34");
        effects.put("Grace of the Holy Grail A+4", ".36");
        effects.put("Grace of the Holy Grail A+5", ".38");
        effects.put("Grace of the Holy Grail A+6", ".4");
        effects.put("Grace of the Holy Grail A+7", ".42");
        effects.put("Grace of the Holy Grail A+8", ".44");
        effects.put("Grace of the Holy Grail A+9", ".46");
        effects.put("Grace of the Holy Grail A+10", ".50");
        effects.put("Grace of the Holy Grail A+11", "Crits");
        effects.put("Grace of the Holy Grail A+12", "Self");

        effects.put("Conqueror of Lightning EX0", "cardMOD");
        effects.put("Conqueror of Lightning EX1", ".3");
        effects.put("Conqueror of Lightning EX2", ".32");
        effects.put("Conqueror of Lightning EX3", ".34");
        effects.put("Conqueror of Lightning EX4", ".36");
        effects.put("Conqueror of Lightning EX5", ".38");
        effects.put("Conqueror of Lightning EX6", ".4");
        effects.put("Conqueror of Lightning EX7", ".42");
        effects.put("Conqueror of Lightning EX8", ".44");
        effects.put("Conqueror of Lightning EX9", ".46");
        effects.put("Conqueror of Lightning EX10", ".50");
        effects.put("Conqueror of Lightning EX11", "Buster");
        effects.put("Conqueror of Lightning EX12", "Self");

        effects.put("Vow to the Goddess B0", "powerMod");
        effects.put("Vow to the Goddess B1", ".4");
        effects.put("Vow to the Goddess B2", ".42");
        effects.put("Vow to the Goddess B3", ".44");
        effects.put("Vow to the Goddess B4", ".46");
        effects.put("Vow to the Goddess B5", ".48");
        effects.put("Vow to the Goddess B6", ".5");
        effects.put("Vow to the Goddess B7", ".52");
        effects.put("Vow to the Goddess B8", ".54");
        effects.put("Vow to the Goddess B9", ".56");
        effects.put("Vow to the Goddess B10", ".60");
        effects.put("Vow to the Goddess B11", "Special");
        effects.put("Vow to the Goddess B12", "Self");

        effects.put("Executioner A++0", "powerMod");
        effects.put("Executioner A++1", ".4");
        effects.put("Executioner A++2", ".42");
        effects.put("Executioner A++3", ".44");
        effects.put("Executioner A++4", ".46");
        effects.put("Executioner A++5", ".48");
        effects.put("Executioner A++6", ".5");
        effects.put("Executioner A++7", ".52");
        effects.put("Executioner A++8", ".54");
        effects.put("Executioner A++9", ".56");
        effects.put("Executioner A++10", ".60");
        effects.put("Executioner A++11", "Special");
        effects.put("Executioner A++12", "Self");

        effects.put("Human Study B0", "powerMod");
        effects.put("Human Study B1", ".4");
        effects.put("Human Study B2", ".42");
        effects.put("Human Study B3", ".44");
        effects.put("Human Study B4", ".46");
        effects.put("Human Study B5", ".48");
        effects.put("Human Study B6", ".5");
        effects.put("Human Study B7", ".52");
        effects.put("Human Study B8", ".54");
        effects.put("Human Study B9", ".56");
        effects.put("Human Study B10", ".60");
        effects.put("Human Study B11", "Special");
        effects.put("Human Study B12", "Self");

        effects.put("Punish the Unfaithful A+0", "powerMod");
        effects.put("Punish the Unfaithful A+1", ".50");
        effects.put("Punish the Unfaithful A+2", ".55");
        effects.put("Punish the Unfaithful A+3", ".60");
        effects.put("Punish the Unfaithful A+4", ".65");
        effects.put("Punish the Unfaithful A+5", ".70");
        effects.put("Punish the Unfaithful A+6", ".75");
        effects.put("Punish the Unfaithful A+7", ".80");
        effects.put("Punish the Unfaithful A+8", ".85");
        effects.put("Punish the Unfaithful A+9", ".90");
        effects.put("Punish the Unfaithful A+10", "1.00");
        effects.put("Punish the Unfaithful A+11", "Special");
        effects.put("Punish the Unfaithful A+12", "Self");

        effects.put("God-Slayer B0", "powerMod");
        effects.put("God-Slayer B1", ".50");
        effects.put("God-Slayer B2", ".55");
        effects.put("God-Slayer B3", ".60");
        effects.put("God-Slayer B4", ".65");
        effects.put("God-Slayer B5", ".70");
        effects.put("God-Slayer B6", ".75");
        effects.put("God-Slayer B7", ".80");
        effects.put("God-Slayer B8", ".85");
        effects.put("God-Slayer B9", ".90");
        effects.put("God-Slayer B10", "1.00");
        effects.put("God-Slayer B11", "Special");
        effects.put("God-Slayer B12", "Self");

        effects.put("Unifying the Nation by Force A0", "powerMod");
        effects.put("Unifying the Nation by Force A1", ".50");
        effects.put("Unifying the Nation by Force A2", ".55");
        effects.put("Unifying the Nation by Force A3", ".60");
        effects.put("Unifying the Nation by Force A4", ".65");
        effects.put("Unifying the Nation by Force A5", ".70");
        effects.put("Unifying the Nation by Force A6", ".75");
        effects.put("Unifying the Nation by Force A7", ".80");
        effects.put("Unifying the Nation by Force A8", ".85");
        effects.put("Unifying the Nation by Force A9", ".90");
        effects.put("Unifying the Nation by Force A10", "1.00");
        effects.put("Unifying the Nation by Force A11", "Special");
        effects.put("Unifying the Nation by Force A12", "Self");

        effects.put("Warrior's Blessing A0", "critDamageMod");
        effects.put("Warrior's Blessing A1", ".50");
        effects.put("Warrior's Blessing A2", ".55");
        effects.put("Warrior's Blessing A3", ".60");
        effects.put("Warrior's Blessing A4", ".65");
        effects.put("Warrior's Blessing A5", ".70");
        effects.put("Warrior's Blessing A6", ".75");
        effects.put("Warrior's Blessing A7", ".80");
        effects.put("Warrior's Blessing A8", ".85");
        effects.put("Warrior's Blessing A9", ".90");
        effects.put("Warrior's Blessing A10", "1.00");
        effects.put("Warrior's Blessing A11", "Crits");
        effects.put("Warrior's Blessing A12", "Self");

        effects.put("Chinese Martial Arts A++0", "critDamageMod");
        effects.put("Chinese Martial Arts A++1", ".50");
        effects.put("Chinese Martial Arts A++2", ".55");
        effects.put("Chinese Martial Arts A++3", ".60");
        effects.put("Chinese Martial Arts A++4", ".65");
        effects.put("Chinese Martial Arts A++5", ".70");
        effects.put("Chinese Martial Arts A++6", ".75");
        effects.put("Chinese Martial Arts A++7", ".80");
        effects.put("Chinese Martial Arts A++8", ".85");
        effects.put("Chinese Martial Arts A++9", ".90");
        effects.put("Chinese Martial Arts A++10", "1.00");
        effects.put("Chinese Martial Arts A++11", "Crits");
        effects.put("Chinese Martial Arts A++12", "Self");

        effects.put("Marksmanship B0", "critDamageMod");
        effects.put("Marksmanship B1", ".50");
        effects.put("Marksmanship B2", ".55");
        effects.put("Marksmanship B3", ".60");
        effects.put("Marksmanship B4", ".65");
        effects.put("Marksmanship B5", ".70");
        effects.put("Marksmanship B6", ".75");
        effects.put("Marksmanship B7", ".80");
        effects.put("Marksmanship B8", ".85");
        effects.put("Marksmanship B9", ".90");
        effects.put("Marksmanship B10", "1.00");
        effects.put("Marksmanship B11", "Crits");
        effects.put("Marksmanship B12", "Self");

        effects.put("Marksmanship A++0", "critDamageMod");
        effects.put("Marksmanship A++1", ".60");
        effects.put("Marksmanship A++2", ".66");
        effects.put("Marksmanship A++3", ".72");
        effects.put("Marksmanship A++4", ".78");
        effects.put("Marksmanship A++5", ".84");
        effects.put("Marksmanship A++6", ".90");
        effects.put("Marksmanship A++7", ".96");
        effects.put("Marksmanship A++8", "1.02");
        effects.put("Marksmanship A++9", "1.08");
        effects.put("Marksmanship A++10", "1.20");
        effects.put("Marksmanship A++11", "Crits");
        effects.put("Marksmanship A++12", "Self");

        effects.put("Tactics B0", "teamNPBonus");
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
        effects.put("Tactics B11", "npDamage");
        effects.put("Tactics B12", "All");

        effects.put("Tactics C0", "teamNPBonus");
        effects.put("Tactics C1", ".08");
        effects.put("Tactics C2", ".088");
        effects.put("Tactics C3", ".096");
        effects.put("Tactics C4", ".104");
        effects.put("Tactics C5", ".112");
        effects.put("Tactics C6", ".12");
        effects.put("Tactics C7", ".128");
        effects.put("Tactics C8", ".136");
        effects.put("Tactics C9", ".144");
        effects.put("Tactics C10", ".16");
        effects.put("Tactics C11", "npDamage");
        effects.put("Tactics C12", "All");

        effects.put("Tactics C+0", "teamNPBonus");
        effects.put("Tactics C+1", ".085");
        effects.put("Tactics C+2", ".094");
        effects.put("Tactics C+3", ".102");
        effects.put("Tactics C+4", ".111");
        effects.put("Tactics C+5", ".119");
        effects.put("Tactics C+6", ".128");
        effects.put("Tactics C+7", ".136");
        effects.put("Tactics C+8", ".145");
        effects.put("Tactics C+9", ".153");
        effects.put("Tactics C+10", ".17");
        effects.put("Tactics C+11", "npDamage");
        effects.put("Tactics C+12", "All");

        effects.put("Voyager of the Storm A0", "Multiple");
        effects.put("Voyager of the Storm A1", ".08");
        effects.put("Voyager of the Storm A2", ".088");
        effects.put("Voyager of the Storm A3", ".096");
        effects.put("Voyager of the Storm A4", ".104");
        effects.put("Voyager of the Storm A5", ".112");
        effects.put("Voyager of the Storm A6", ".12");
        effects.put("Voyager of the Storm A7", ".128");
        effects.put("Voyager of the Storm A8", ".136");
        effects.put("Voyager of the Storm A9", ".144");
        effects.put("Voyager of the Storm A10", ".16");
        effects.put("Voyager of the Storm A11", "Multiple");
        effects.put("Voyager of the Storm A12", "All");
        effects.put("Voyager of the Storm A13", "teamNPBonus");
        effects.put("Voyager of the Storm A14", "teamAtkBonus");
        effects.put("Voyager of the Storm A15", "npDamage");
        effects.put("Voyager of the Storm A16", "Attack");

        effects.put("Dragon Witch EX0", "Multiple");
        effects.put("Dragon Witch EX1", ".10");
        effects.put("Dragon Witch EX2", ".11");
        effects.put("Dragon Witch EX3", ".12");
        effects.put("Dragon Witch EX4", ".13");
        effects.put("Dragon Witch EX5", ".14");
        effects.put("Dragon Witch EX6", ".15");
        effects.put("Dragon Witch EX7", ".16");
        effects.put("Dragon Witch EX8", ".17");
        effects.put("Dragon Witch EX9", ".18");
        effects.put("Dragon Witch EX10", ".20");
        effects.put("Dragon Witch EX11", "Multiple");
        effects.put("Dragon Witch EX12", "All");
        effects.put("Dragon Witch EX13", "teamAtkBonus");
        effects.put("Dragon Witch EX14", "teamAtkBonus");
        effects.put("Dragon Witch EX15", "Attack");
        effects.put("Dragon Witch EX16", "Dragon");

        effects.put("Mana Burst (Flame) A0", "Multiple");
        effects.put("Mana Burst (Flame) A1", ".20");
        effects.put("Mana Burst (Flame) A2", ".21");
        effects.put("Mana Burst (Flame) A3", ".22");
        effects.put("Mana Burst (Flame) A4", ".23");
        effects.put("Mana Burst (Flame) A5", ".24");
        effects.put("Mana Burst (Flame) A6", ".25");
        effects.put("Mana Burst (Flame) A7", ".26");
        effects.put("Mana Burst (Flame) A8", ".27");
        effects.put("Mana Burst (Flame) A9", ".28");
        effects.put("Mana Burst (Flame) A10", ".30");
        effects.put("Mana Burst (Flame) A1-2", ".10");
        effects.put("Mana Burst (Flame) A2-2", ".11");
        effects.put("Mana Burst (Flame) A3-2", ".12");
        effects.put("Mana Burst (Flame) A4-2", ".13");
        effects.put("Mana Burst (Flame) A5-2", ".14");
        effects.put("Mana Burst (Flame) A6-2", ".15");
        effects.put("Mana Burst (Flame) A7-2", ".16");
        effects.put("Mana Burst (Flame) A8-2", ".17");
        effects.put("Mana Burst (Flame) A9-2", ".18");
        effects.put("Mana Burst (Flame) A10-2", ".20");
        effects.put("Mana Burst (Flame) A11", "Multiple");
        effects.put("Mana Burst (Flame) A12", "Self");
        effects.put("Mana Burst (Flame) A13", "cardMOD");
        effects.put("Mana Burst (Flame) A14", "npDamageMod");
        effects.put("Mana Burst (Flame) A15", "Buster");
        effects.put("Mana Burst (Flame) A16", "npDamage");

        effects.put("Berserk A0", "Multiple");
        effects.put("Berserk A1", ".20");
        effects.put("Berserk A2", ".21");
        effects.put("Berserk A3", ".22");
        effects.put("Berserk A4", ".23");
        effects.put("Berserk A5", ".24");
        effects.put("Berserk A6", ".25");
        effects.put("Berserk A7", ".26");
        effects.put("Berserk A8", ".27");
        effects.put("Berserk A9", ".28");
        effects.put("Berserk A10", ".30");
        effects.put("Berserk A1-2", ".10");
        effects.put("Berserk A2-2", ".11");
        effects.put("Berserk A3-2", ".12");
        effects.put("Berserk A4-2", ".13");
        effects.put("Berserk A5-2", ".14");
        effects.put("Berserk A6-2", ".15");
        effects.put("Berserk A7-2", ".16");
        effects.put("Berserk A8-2", ".17");
        effects.put("Berserk A9-2", ".18");
        effects.put("Berserk A10-2", ".20");
        effects.put("Berserk A11", "Multiple");
        effects.put("Berserk A12", "Self");
        effects.put("Berserk A13", "atkMod");
        effects.put("Berserk A14", "npDamageMod");
        effects.put("Berserk A15", "Attack");
        effects.put("Berserk A16", "npDamage");

        effects.put("Mana Burst (Flame) B0", "Multiple");
        effects.put("Mana Burst (Flame) B1", ".15");
        effects.put("Mana Burst (Flame) B2", ".16");
        effects.put("Mana Burst (Flame) B3", ".17");
        effects.put("Mana Burst (Flame) B4", ".18");
        effects.put("Mana Burst (Flame) B5", ".19");
        effects.put("Mana Burst (Flame) B6", ".20");
        effects.put("Mana Burst (Flame) B7", ".21");
        effects.put("Mana Burst (Flame) B8", ".22");
        effects.put("Mana Burst (Flame) B9", ".23");
        effects.put("Mana Burst (Flame) B10", ".25");
        effects.put("Mana Burst (Flame) B1-2", ".08");
        effects.put("Mana Burst (Flame) B2-2", ".087");
        effects.put("Mana Burst (Flame) B3-2", ".094");
        effects.put("Mana Burst (Flame) B4-2", ".101");
        effects.put("Mana Burst (Flame) B5-2", ".108");
        effects.put("Mana Burst (Flame) B6-2", ".115");
        effects.put("Mana Burst (Flame) B7-2", ".122");
        effects.put("Mana Burst (Flame) B8-2", ".129");
        effects.put("Mana Burst (Flame) B9-2", ".136");
        effects.put("Mana Burst (Flame) B10-2", ".15");
        effects.put("Mana Burst (Flame) B11", "Multiple");
        effects.put("Mana Burst (Flame) B12", "Self");
        effects.put("Mana Burst (Flame) B13", "cardMOD");
        effects.put("Mana Burst (Flame) B14", "npDamageMod");
        effects.put("Mana Burst (Flame) B15", "Buster");
        effects.put("Mana Burst (Flame) B16", "npDamage");

        effects.put("Voyager of the Storm A+0", "Multiple");
        effects.put("Voyager of the Storm A+1", ".085");
        effects.put("Voyager of the Storm A+2", ".094");
        effects.put("Voyager of the Storm A+3", ".102");
        effects.put("Voyager of the Storm A+4", ".111");
        effects.put("Voyager of the Storm A+5", ".119");
        effects.put("Voyager of the Storm A+6", ".128");
        effects.put("Voyager of the Storm A+7", ".136");
        effects.put("Voyager of the Storm A+8", ".145");
        effects.put("Voyager of the Storm A+9", ".153");
        effects.put("Voyager of the Storm A+10", ".17");
        effects.put("Voyager of the Storm A+11", "Multiple");
        effects.put("Voyager of the Storm A+12", "All");
        effects.put("Voyager of the Storm A+13", "teamNPBonus");
        effects.put("Voyager of the Storm A+14", "teamAtkBonus");
        effects.put("Voyager of the Storm A+15", "npDamage");
        effects.put("Voyager of the Storm A+16", "Attack");

        effects.put("Combination C0", "atkMod");
        effects.put("Combination C1", ".20");
        effects.put("Combination C2", ".21");
        effects.put("Combination C3", ".22");
        effects.put("Combination C4", ".23");
        effects.put("Combination C5", ".24");
        effects.put("Combination C6", ".25");
        effects.put("Combination C7", ".26");
        effects.put("Combination C8", ".27");
        effects.put("Combination C9", ".28");
        effects.put("Combination C10", ".30");
        effects.put("Combination C11", "Attack");
        effects.put("Combination C12", "Self");

        effects.put("Whim of the Goddess A(Stheno)0", "Multiple");
        effects.put("Whim of the Goddess A(Stheno)1", ".10");
        effects.put("Whim of the Goddess A(Stheno)2", ".11");
        effects.put("Whim of the Goddess A(Stheno)3", ".12");
        effects.put("Whim of the Goddess A(Stheno)4", ".13");
        effects.put("Whim of the Goddess A(Stheno)5", ".14");
        effects.put("Whim of the Goddess A(Stheno)6", ".15");
        effects.put("Whim of the Goddess A(Stheno)7", ".16");
        effects.put("Whim of the Goddess A(Stheno)8", ".17");
        effects.put("Whim of the Goddess A(Stheno)9", ".18");
        effects.put("Whim of the Goddess A(Stheno)10", ".20");
        effects.put("Whim of the Goddess A(Stheno)11", "Multiple");
        effects.put("Whim of the Goddess A(Stheno)12", "All");
        effects.put("Whim of the Goddess A(Stheno)13", "teamAtkBonus");
        effects.put("Whim of the Goddess A(Stheno)14", "teamPowerBonus");
        effects.put("Whim of the Goddess A(Stheno)15", "Attack");
        effects.put("Whim of the Goddess A(Stheno)16", "Special");

        effects.put("Tactician's Command A+0", "Multiple");
        effects.put("Tactician's Command A+1", ".20");
        effects.put("Tactician's Command A+2", ".21");
        effects.put("Tactician's Command A+3", ".22");
        effects.put("Tactician's Command A+4", ".23");
        effects.put("Tactician's Command A+5", ".24");
        effects.put("Tactician's Command A+6", ".25");
        effects.put("Tactician's Command A+7", ".26");
        effects.put("Tactician's Command A+8", ".27");
        effects.put("Tactician's Command A+9", ".28");
        effects.put("Tactician's Command A+10", ".30");
        effects.put("Tactician's Command A+1-2", "200");
        effects.put("Tactician's Command A+2-2", "230");
        effects.put("Tactician's Command A+3-2", "260");
        effects.put("Tactician's Command A+4-2", "290");
        effects.put("Tactician's Command A+5-2", "320");
        effects.put("Tactician's Command A+6-2", "350");
        effects.put("Tactician's Command A+7-2", "380");
        effects.put("Tactician's Command A+8-2", "410");
        effects.put("Tactician's Command A+9-2", "440");
        effects.put("Tactician's Command A+10-2", "500");
        effects.put("Tactician's Command A+11", "Multiple");
        effects.put("Tactician's Command A+12", "All");
        effects.put("Tactician's Command A+13", "teamAtkBonus");
        effects.put("Tactician's Command A+14", "teamDamagePlus");
        effects.put("Tactician's Command A+15", "Attack");
        effects.put("Tactician's Command A+16", "DamagePlus");

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

        effects.put("Flowers for the Earth A0", "atkMod");
        effects.put("Flowers for the Earth A1", ".30");
        effects.put("Flowers for the Earth A2", ".31");
        effects.put("Flowers for the Earth A3", ".32");
        effects.put("Flowers for the Earth A4", ".33");
        effects.put("Flowers for the Earth A5", ".34");
        effects.put("Flowers for the Earth A6", ".35");
        effects.put("Flowers for the Earth A7", ".36");
        effects.put("Flowers for the Earth A8", ".37");
        effects.put("Flowers for the Earth A9", ".38");
        effects.put("Flowers for the Earth A10", ".40");
        effects.put("Flowers for the Earth A11", "Attack");
        effects.put("Flowers for the Earth A12", "Ally");

        effects.put("Mind's Eye (Fake) A0", "critDamageMod");
        effects.put("Mind's Eye (Fake) A1", ".20");
        effects.put("Mind's Eye (Fake) A2", ".22");
        effects.put("Mind's Eye (Fake) A3", ".24");
        effects.put("Mind's Eye (Fake) A4", ".26");
        effects.put("Mind's Eye (Fake) A5", ".28");
        effects.put("Mind's Eye (Fake) A6", ".30");
        effects.put("Mind's Eye (Fake) A7", ".32");
        effects.put("Mind's Eye (Fake) A8", ".34");
        effects.put("Mind's Eye (Fake) A9", ".36");
        effects.put("Mind's Eye (Fake) A10", ".40");
        effects.put("Mind's Eye (Fake) A11", "Crits");
        effects.put("Mind's Eye (Fake) A12", "Self");

        effects.put("Mind's Eye (Fake) B0", "critDamageMod");
        effects.put("Mind's Eye (Fake) B1", ".18");
        effects.put("Mind's Eye (Fake) B2", ".198");
        effects.put("Mind's Eye (Fake) B3", ".216");
        effects.put("Mind's Eye (Fake) B4", ".234");
        effects.put("Mind's Eye (Fake) B5", ".252");
        effects.put("Mind's Eye (Fake) B6", ".27");
        effects.put("Mind's Eye (Fake) B7", ".288");
        effects.put("Mind's Eye (Fake) B8", ".306");
        effects.put("Mind's Eye (Fake) B9", ".324");
        effects.put("Mind's Eye (Fake) B10", ".36");
        effects.put("Mind's Eye (Fake) B11", "Crits");
        effects.put("Mind's Eye (Fake) B12", "Self");

        effects.put("Mind's Eye (Fake) B-0", "critDamageMod");
        effects.put("Mind's Eye (Fake) B-1", ".17");
        effects.put("Mind's Eye (Fake) B-2", ".187");
        effects.put("Mind's Eye (Fake) B-3", ".204");
        effects.put("Mind's Eye (Fake) B-4", ".221");
        effects.put("Mind's Eye (Fake) B-5", ".238");
        effects.put("Mind's Eye (Fake) B-6", ".255");
        effects.put("Mind's Eye (Fake) B-7", ".272");
        effects.put("Mind's Eye (Fake) B-8", ".289");
        effects.put("Mind's Eye (Fake) B-9", ".306");
        effects.put("Mind's Eye (Fake) B-10", ".34");
        effects.put("Mind's Eye (Fake) B-11", "Crits");
        effects.put("Mind's Eye (Fake) B-12", "Self");

        effects.put("Mind's Eye (Fake) C0", "critDamageMod");
        effects.put("Mind's Eye (Fake) C1", ".16");
        effects.put("Mind's Eye (Fake) C2", ".176");
        effects.put("Mind's Eye (Fake) C3", ".192");
        effects.put("Mind's Eye (Fake) C4", ".208");
        effects.put("Mind's Eye (Fake) C5", ".224");
        effects.put("Mind's Eye (Fake) C6", ".24");
        effects.put("Mind's Eye (Fake) C7", ".256");
        effects.put("Mind's Eye (Fake) C8", ".272");
        effects.put("Mind's Eye (Fake) C9", ".288");
        effects.put("Mind's Eye (Fake) C10", ".32");
        effects.put("Mind's Eye (Fake) C11", "Crits");
        effects.put("Mind's Eye (Fake) C12", "Self");

        effects.put("Discerning Eye A0", "critDamageMod");
        effects.put("Discerning Eye A1", ".20");
        effects.put("Discerning Eye A2", ".23");
        effects.put("Discerning Eye A3", ".26");
        effects.put("Discerning Eye A4", ".29");
        effects.put("Discerning Eye A5", ".32");
        effects.put("Discerning Eye A6", ".35");
        effects.put("Discerning Eye A7", ".38");
        effects.put("Discerning Eye A8", ".41");
        effects.put("Discerning Eye A9", ".44");
        effects.put("Discerning Eye A10", ".50");
        effects.put("Discerning Eye A11", "Crits");
        effects.put("Discerning Eye A12", "Ally");

        effects.put("Self-Modification A0", "critDamageMod");
        effects.put("Self-Modification A1", ".20");
        effects.put("Self-Modification A2", ".23");
        effects.put("Self-Modification A3", ".26");
        effects.put("Self-Modification A4", ".29");
        effects.put("Self-Modification A5", ".32");
        effects.put("Self-Modification A6", ".35");
        effects.put("Self-Modification A7", ".38");
        effects.put("Self-Modification A8", ".41");
        effects.put("Self-Modification A9", ".44");
        effects.put("Self-Modification A10", ".50");
        effects.put("Self-Modification A11", "Crits");
        effects.put("Self-Modification A12", "Self");

        effects.put("Self-Modification EX0", "critDamageMod");
        effects.put("Self-Modification EX1", ".20");
        effects.put("Self-Modification EX2", ".23");
        effects.put("Self-Modification EX3", ".26");
        effects.put("Self-Modification EX4", ".29");
        effects.put("Self-Modification EX5", ".32");
        effects.put("Self-Modification EX6", ".35");
        effects.put("Self-Modification EX7", ".38");
        effects.put("Self-Modification EX8", ".41");
        effects.put("Self-Modification EX9", ".44");
        effects.put("Self-Modification EX10", ".50");
        effects.put("Self-Modification EX11", "Crits");
        effects.put("Self-Modification EX12", "Self");

        effects.put("The Demonic King A0", "critDamageMod");
        effects.put("The Demonic King A1", ".20");
        effects.put("The Demonic King A2", ".23");
        effects.put("The Demonic King A3", ".26");
        effects.put("The Demonic King A4", ".29");
        effects.put("The Demonic King A5", ".32");
        effects.put("The Demonic King A6", ".35");
        effects.put("The Demonic King A7", ".38");
        effects.put("The Demonic King A8", ".41");
        effects.put("The Demonic King A9", ".44");
        effects.put("The Demonic King A10", ".50");
        effects.put("The Demonic King A11", "Crits");
        effects.put("The Demonic King A12", "Self");

        effects.put("Human Observation A0", "teamCritBonus");
        effects.put("Human Observation A1", ".10");
        effects.put("Human Observation A2", ".13");
        effects.put("Human Observation A3", ".16");
        effects.put("Human Observation A4", ".19");
        effects.put("Human Observation A5", ".22");
        effects.put("Human Observation A6", ".25");
        effects.put("Human Observation A7", ".28");
        effects.put("Human Observation A8", ".31");
        effects.put("Human Observation A9", ".34");
        effects.put("Human Observation A10", ".40");
        effects.put("Human Observation A11", "Crits");
        effects.put("Human Observation A12", "All");

        effects.put("Rune Spell B0", "critDamageMod");
        effects.put("Rune Spell B1", ".18");
        effects.put("Rune Spell B2", ".207");
        effects.put("Rune Spell B3", ".234");
        effects.put("Rune Spell B4", ".261");
        effects.put("Rune Spell B5", ".288");
        effects.put("Rune Spell B6", ".315");
        effects.put("Rune Spell B7", ".342");
        effects.put("Rune Spell B8", ".369");
        effects.put("Rune Spell B9", ".396");
        effects.put("Rune Spell B10", ".45");
        effects.put("Rune Spell B11", "Crits");
        effects.put("Rune Spell B12", "Self");

        effects.put("Rune Spell A0", "critDamageMod");
        effects.put("Rune Spell A1", ".20");
        effects.put("Rune Spell A2", ".23");
        effects.put("Rune Spell A3", ".26");
        effects.put("Rune Spell A4", ".29");
        effects.put("Rune Spell A5", ".32");
        effects.put("Rune Spell A6", ".35");
        effects.put("Rune Spell A7", ".38");
        effects.put("Rune Spell A8", ".41");
        effects.put("Rune Spell A9", ".44");
        effects.put("Rune Spell A10", ".50");
        effects.put("Rune Spell A11", "Crits");
        effects.put("Rune Spell A12", "Self");

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

        effects.put("Angel's Outcry EX0", "atkMod");
        effects.put("Angel's Outcry EX1", ".30");
        effects.put("Angel's Outcry EX2", ".32");
        effects.put("Angel's Outcry EX3", ".34");
        effects.put("Angel's Outcry EX4", ".36");
        effects.put("Angel's Outcry EX5", ".38");
        effects.put("Angel's Outcry EX6", ".40");
        effects.put("Angel's Outcry EX7", ".42");
        effects.put("Angel's Outcry EX8", ".44");
        effects.put("Angel's Outcry EX9", ".46");
        effects.put("Angel's Outcry EX10", ".50");
        effects.put("Angel's Outcry EX11", "Attack");
        effects.put("Angel's Outcry EX12", "Ally");

        effects.put("Valor A0", "atkMod");
        effects.put("Valor A1", ".10");
        effects.put("Valor A2", ".12");
        effects.put("Valor A3", ".14");
        effects.put("Valor A4", ".16");
        effects.put("Valor A5", ".18");
        effects.put("Valor A6", ".20");
        effects.put("Valor A7", ".22");
        effects.put("Valor A8", ".24");
        effects.put("Valor A9", ".26");
        effects.put("Valor A10", ".30");
        effects.put("Valor A11", "Attack");
        effects.put("Valor A12", "Self");

        effects.put("Pirate's Glory B0", "atkMod");
        effects.put("Pirate's Glory B1", ".09");
        effects.put("Pirate's Glory B2", ".108");
        effects.put("Pirate's Glory B3", ".126");
        effects.put("Pirate's Glory B4", ".144");
        effects.put("Pirate's Glory B5", ".162");
        effects.put("Pirate's Glory B6", ".18");
        effects.put("Pirate's Glory B7", ".198");
        effects.put("Pirate's Glory B8", ".216");
        effects.put("Pirate's Glory B9", ".234");
        effects.put("Pirate's Glory B10", ".27");
        effects.put("Pirate's Glory B11", "Attack");
        effects.put("Pirate's Glory B12", "Self");

        effects.put("Septem Colles A0", "cardMOD");
        effects.put("Septem Colles A1", ".10");
        effects.put("Septem Colles A2", ".12");
        effects.put("Septem Colles A3", ".14");
        effects.put("Septem Colles A4", ".16");
        effects.put("Septem Colles A5", ".18");
        effects.put("Septem Colles A6", ".20");
        effects.put("Septem Colles A7", ".22");
        effects.put("Septem Colles A8", ".24");
        effects.put("Septem Colles A9", ".26");
        effects.put("Septem Colles A10", ".30");
        effects.put("Septem Colles A11", "Buster");
        effects.put("Septem Colles A12", "Ally");

        effects.put("Monstrous Strength B0", "atkMod");
        effects.put("Monstrous Strength B1", ".10");
        effects.put("Monstrous Strength B2", ".12");
        effects.put("Monstrous Strength B3", ".14");
        effects.put("Monstrous Strength B4", ".16");
        effects.put("Monstrous Strength B5", ".18");
        effects.put("Monstrous Strength B6", ".20");
        effects.put("Monstrous Strength B7", ".22");
        effects.put("Monstrous Strength B8", ".24");
        effects.put("Monstrous Strength B9", ".26");
        effects.put("Monstrous Strength B10", ".30");
        effects.put("Monstrous Strength B11", "Attack");
        effects.put("Monstrous Strength B12", "Self");


        effects.put("Monstrous Strength C-0", "atkMod");
        effects.put("Monstrous Strength C-1", ".08");
        effects.put("Monstrous Strength C-2", ".10");
        effects.put("Monstrous Strength C-3", ".12");
        effects.put("Monstrous Strength C-4", ".14");
        effects.put("Monstrous Strength C-5", ".16");
        effects.put("Monstrous Strength C-6", ".18");
        effects.put("Monstrous Strength C-7", ".20");
        effects.put("Monstrous Strength C-8", ".22");
        effects.put("Monstrous Strength C-9", ".24");
        effects.put("Monstrous Strength C-10", ".28");
        effects.put("Monstrous Strength C-11", "Attack");
        effects.put("Monstrous Strength C-12", "Self");

        effects.put("Jekyll 1 0", "atkMod");
        effects.put("Jekyll 1 1", ".05");
        effects.put("Jekyll 1 2", ".06");
        effects.put("Jekyll 1 3", ".07");
        effects.put("Jekyll 1 4", ".08");
        effects.put("Jekyll 1 5", ".09");
        effects.put("Jekyll 1 6", ".10");
        effects.put("Jekyll 1 7", ".11");
        effects.put("Jekyll 1 8", ".12");
        effects.put("Jekyll 1 9", ".13");
        effects.put("Jekyll 1 10", ".15");
        effects.put("Jekyll 1 11", "Attack");
        effects.put("Jekyll 1 12", "Self");

        effects.put("Jekyll 3 0", "critDamageMod");
        effects.put("Jekyll 3 1", ".05");
        effects.put("Jekyll 3 2", ".06");
        effects.put("Jekyll 3 3", ".07");
        effects.put("Jekyll 3 4", ".08");
        effects.put("Jekyll 3 5", ".09");
        effects.put("Jekyll 3 6", ".10");
        effects.put("Jekyll 3 7", ".11");
        effects.put("Jekyll 3 8", ".12");
        effects.put("Jekyll 3 9", ".13");
        effects.put("Jekyll 3 10", ".15");
        effects.put("Jekyll 3 11", "Crits");
        effects.put("Jekyll 3 12", "Self");

        effects.put("Hyde 1 0", "atkMod");
        effects.put("Hyde 1 1", ".25");
        effects.put("Hyde 1 2", ".26");
        effects.put("Hyde 1 3", ".27");
        effects.put("Hyde 1 4", ".28");
        effects.put("Hyde 1 5", ".29");
        effects.put("Hyde 1 6", ".30");
        effects.put("Hyde 1 7", ".31");
        effects.put("Hyde 1 8", ".32");
        effects.put("Hyde 1 9", ".33");
        effects.put("Hyde 1 10", ".35");
        effects.put("Hyde 1 11", "Attack");
        effects.put("Hyde 1 12", "Self");

        effects.put("Hyde 3 0", "critDamageMod");
        effects.put("Hyde 3 1", ".25");
        effects.put("Hyde 3 2", ".26");
        effects.put("Hyde 3 3", ".27");
        effects.put("Hyde 3 4", ".28");
        effects.put("Hyde 3 5", ".29");
        effects.put("Hyde 3 6", ".30");
        effects.put("Hyde 3 7", ".31");
        effects.put("Hyde 3 8", ".32");
        effects.put("Hyde 3 9", ".33");
        effects.put("Hyde 3 10", ".35");
        effects.put("Hyde 3 11", "Crits");
        effects.put("Hyde 3 12", "Self");

        //a IS froma asterios, dont know why it has the same values as b, need to double check this, dont know what above is from
        effects.put("Monstrous Strength A0", "atkMod");
        effects.put("Monstrous Strength A1", ".10");
        effects.put("Monstrous Strength A2", ".12");
        effects.put("Monstrous Strength A3", ".14");
        effects.put("Monstrous Strength A4", ".16");
        effects.put("Monstrous Strength A5", ".18");
        effects.put("Monstrous Strength A6", ".20");
        effects.put("Monstrous Strength A7", ".22");
        effects.put("Monstrous Strength A8", ".24");
        effects.put("Monstrous Strength A9", ".26");
        effects.put("Monstrous Strength A10", ".30");
        effects.put("Monstrous Strength A11", "Attack");
        effects.put("Monstrous Strength A12", "Self");

        effects.put("Grace of the Goddess EX0", "atkMod");
        effects.put("Grace of the Goddess EX1", ".20");
        effects.put("Grace of the Goddess EX2", ".20");
        effects.put("Grace of the Goddess EX3", ".20");
        effects.put("Grace of the Goddess EX4", ".20");
        effects.put("Grace of the Goddess EX5", ".20");
        effects.put("Grace of the Goddess EX6", ".20");
        effects.put("Grace of the Goddess EX7", ".20");
        effects.put("Grace of the Goddess EX8", ".20");
        effects.put("Grace of the Goddess EX9", ".20");
        effects.put("Grace of the Goddess EX10", ".20");
        effects.put("Grace of the Goddess EX11", "Attack");
        effects.put("Grace of the Goddess EX12", "Self");

        effects.put("Sadistic Streak A0", "atkMod");
        effects.put("Sadistic Streak A1", ".10");
        effects.put("Sadistic Streak A2", ".12");
        effects.put("Sadistic Streak A3", ".14");
        effects.put("Sadistic Streak A4", ".16");
        effects.put("Sadistic Streak A5", ".18");
        effects.put("Sadistic Streak A6", ".20");
        effects.put("Sadistic Streak A7", ".22");
        effects.put("Sadistic Streak A8", ".24");
        effects.put("Sadistic Streak A9", ".26");
        effects.put("Sadistic Streak A10", ".30");
        effects.put("Sadistic Streak A11", "Attack");
        effects.put("Sadistic Streak A12", "Self");

        effects.put("Monstrous Strength A+0", "atkMod");
        effects.put("Monstrous Strength A+1", ".30");
        effects.put("Monstrous Strength A+2", ".32");
        effects.put("Monstrous Strength A+3", ".34");
        effects.put("Monstrous Strength A+4", ".38");
        effects.put("Monstrous Strength A+5", ".38");
        effects.put("Monstrous Strength A+6", ".40");
        effects.put("Monstrous Strength A+7", ".42");
        effects.put("Monstrous Strength A+8", ".44");
        effects.put("Monstrous Strength A+9", ".46");
        effects.put("Monstrous Strength A+10", ".50");
        effects.put("Monstrous Strength A+11", "Attack");
        effects.put("Monstrous Strength A+12", "Self");

        effects.put("Fox's Wedding EX0", "cardMOD");
        effects.put("Fox's Wedding EX1", ".30");
        effects.put("Fox's Wedding EX2", ".32");
        effects.put("Fox's Wedding EX3", ".34");
        effects.put("Fox's Wedding EX4", ".38");
        effects.put("Fox's Wedding EX5", ".38");
        effects.put("Fox's Wedding EX6", ".40");
        effects.put("Fox's Wedding EX7", ".42");
        effects.put("Fox's Wedding EX8", ".44");
        effects.put("Fox's Wedding EX9", ".46");
        effects.put("Fox's Wedding EX10", ".50");
        effects.put("Fox's Wedding EX11", "Arts");
        effects.put("Fox's Wedding EX12", "Ally");

        effects.put("Warrior's Roar B0", "teamBusterBonus");
        effects.put("Warrior's Roar B1", ".15");
        effects.put("Warrior's Roar B2", ".16");
        effects.put("Warrior's Roar B3", ".17");
        effects.put("Warrior's Roar B4", ".18");
        effects.put("Warrior's Roar B5", ".19");
        effects.put("Warrior's Roar B6", ".20");
        effects.put("Warrior's Roar B7", ".21");
        effects.put("Warrior's Roar B8", ".22");
        effects.put("Warrior's Roar B9", ".23");
        effects.put("Warrior's Roar B10", ".25");
        effects.put("Warrior's Roar B11", "Buster");
        effects.put("Warrior's Roar B12", "All");

        effects.put("Mechanical Armor EX0", "atkMod");
        effects.put("Mechanical Armor EX1", ".15");
        effects.put("Mechanical Armor EX2", ".16");
        effects.put("Mechanical Armor EX3", ".17");
        effects.put("Mechanical Armor EX4", ".18");
        effects.put("Mechanical Armor EX5", ".19");
        effects.put("Mechanical Armor EX6", ".20");
        effects.put("Mechanical Armor EX7", ".21");
        effects.put("Mechanical Armor EX8", ".22");
        effects.put("Mechanical Armor EX9", ".23");
        effects.put("Mechanical Armor EX10", ".25");
        effects.put("Mechanical Armor EX11", "Attack");
        effects.put("Mechanical Armor EX12", "Self");

        effects.put("Overload D0", "npDamageMod");
        effects.put("Overload D1", ".15");
        effects.put("Overload D2", ".16");
        effects.put("Overload D3", ".17");
        effects.put("Overload D4", ".18");
        effects.put("Overload D5", ".19");
        effects.put("Overload D6", ".20");
        effects.put("Overload D7", ".21");
        effects.put("Overload D8", ".22");
        effects.put("Overload D9", ".23");
        effects.put("Overload D10", ".25");
        effects.put("Overload D11", "npDamage");
        effects.put("Overload D12", "Self");

        effects.put("Overload C0", "npDamageMod");
        effects.put("Overload C1", ".20");
        effects.put("Overload C2", ".21");
        effects.put("Overload C3", ".22");
        effects.put("Overload C4", ".23");
        effects.put("Overload C5", ".24");
        effects.put("Overload C6", ".25");
        effects.put("Overload C7", ".26");
        effects.put("Overload C8", ".27");
        effects.put("Overload C9", ".28");
        effects.put("Overload C10", ".30");
        effects.put("Overload C11", "npDamage");
        effects.put("Overload C12", "Self");

        effects.put("Protection of Andrasta A0", "teamArtsBonus");
        effects.put("Protection of Andrasta A1", ".10");
        effects.put("Protection of Andrasta A2", ".11");
        effects.put("Protection of Andrasta A3", ".12");
        effects.put("Protection of Andrasta A4", ".13");
        effects.put("Protection of Andrasta A5", ".14");
        effects.put("Protection of Andrasta A6", ".15");
        effects.put("Protection of Andrasta A7", ".16");
        effects.put("Protection of Andrasta A8", ".17");
        effects.put("Protection of Andrasta A9", ".18");
        effects.put("Protection of Andrasta A10", ".20");
        effects.put("Protection of Andrasta A11", "Arts");
        effects.put("Protection of Andrasta A12", "All");

        effects.put("Elemental A+0", "teamArtsBonus");
        effects.put("Elemental A+1", ".10");
        effects.put("Elemental A+2", ".11");
        effects.put("Elemental A+3", ".12");
        effects.put("Elemental A+4", ".13");
        effects.put("Elemental A+5", ".14");
        effects.put("Elemental A+6", ".15");
        effects.put("Elemental A+7", ".16");
        effects.put("Elemental A+8", ".17");
        effects.put("Elemental A+9", ".18");
        effects.put("Elemental A+10", ".20");
        effects.put("Elemental A+11", "Arts");
        effects.put("Elemental A+12", "All");

        effects.put("Whim of the Goddess A0", "cardMOD");
        effects.put("Whim of the Goddess A1", ".20");
        effects.put("Whim of the Goddess A2", ".21");
        effects.put("Whim of the Goddess A3", ".22");
        effects.put("Whim of the Goddess A4", ".23");
        effects.put("Whim of the Goddess A5", ".24");
        effects.put("Whim of the Goddess A6", ".25");
        effects.put("Whim of the Goddess A7", ".26");
        effects.put("Whim of the Goddess A8", ".27");
        effects.put("Whim of the Goddess A9", ".28");
        effects.put("Whim of the Goddess A10", ".30");
        effects.put("Whim of the Goddess A11", "Arts");
        effects.put("Whim of the Goddess A12", "Self");

        effects.put("Prelati's Encouragement B0", "cardMOD");
        effects.put("Prelati's Encouragement B1", ".20");
        effects.put("Prelati's Encouragement B2", ".22");
        effects.put("Prelati's Encouragement B3", ".24");
        effects.put("Prelati's Encouragement B4", ".26");
        effects.put("Prelati's Encouragement B5", ".28");
        effects.put("Prelati's Encouragement B6", ".30");
        effects.put("Prelati's Encouragement B7", ".32");
        effects.put("Prelati's Encouragement B8", ".34");
        effects.put("Prelati's Encouragement B9", ".36");
        effects.put("Prelati's Encouragement B10", ".40");
        effects.put("Prelati's Encouragement B11", "Buster");
        effects.put("Prelati's Encouragement B12", "Self");

        effects.put("Uncrowned Arms Mastery0", "critDamageMod");
        effects.put("Uncrowned Arms Mastery1", ".20");
        effects.put("Uncrowned Arms Mastery2", ".22");
        effects.put("Uncrowned Arms Mastery3", ".24");
        effects.put("Uncrowned Arms Mastery4", ".26");
        effects.put("Uncrowned Arms Mastery5", ".28");
        effects.put("Uncrowned Arms Mastery6", ".30");
        effects.put("Uncrowned Arms Mastery7", ".32");
        effects.put("Uncrowned Arms Mastery8", ".34");
        effects.put("Uncrowned Arms Mastery9", ".36");
        effects.put("Uncrowned Arms Mastery10", ".40");
        effects.put("Uncrowned Arms Mastery11", "Crits");
        effects.put("Uncrowned Arms Mastery12", "Self");

        effects.put("Disappearing Reason D0", "critDamageMod");
        effects.put("Disappearing Reason D1", ".20");
        effects.put("Disappearing Reason D2", ".22");
        effects.put("Disappearing Reason D3", ".24");
        effects.put("Disappearing Reason D4", ".26");
        effects.put("Disappearing Reason D5", ".28");
        effects.put("Disappearing Reason D6", ".30");
        effects.put("Disappearing Reason D7", ".32");
        effects.put("Disappearing Reason D8", ".34");
        effects.put("Disappearing Reason D9", ".36");
        effects.put("Disappearing Reason D10", ".40");
        effects.put("Disappearing Reason D11", "Crits");
        effects.put("Disappearing Reason D12", "Self");

        effects.put("Mana Burst (Pumpkin) A0", "cardMOD");
        effects.put("Mana Burst (Pumpkin) A1", ".25");
        effects.put("Mana Burst (Pumpkin) A2", ".27");
        effects.put("Mana Burst (Pumpkin) A3", ".29");
        effects.put("Mana Burst (Pumpkin) A4", ".31");
        effects.put("Mana Burst (Pumpkin) A5", ".33");
        effects.put("Mana Burst (Pumpkin) A6", ".35");
        effects.put("Mana Burst (Pumpkin) A7", ".37");
        effects.put("Mana Burst (Pumpkin) A8", ".39");
        effects.put("Mana Burst (Pumpkin) A9", ".41");
        effects.put("Mana Burst (Pumpkin) A10", ".45");
        effects.put("Mana Burst (Pumpkin) A11", "Buster");
        effects.put("Mana Burst (Pumpkin) A12", "Self");

        effects.put("Imperial Privilege A0", "atkMod");
        effects.put("Imperial Privilege A1", ".10");
        effects.put("Imperial Privilege A2", ".12");
        effects.put("Imperial Privilege A3", ".14");
        effects.put("Imperial Privilege A4", ".16");
        effects.put("Imperial Privilege A5", ".18");
        effects.put("Imperial Privilege A6", ".20");
        effects.put("Imperial Privilege A7", ".22");
        effects.put("Imperial Privilege A8", ".24");
        effects.put("Imperial Privilege A9", ".26");
        effects.put("Imperial Privilege A10", ".30");
        effects.put("Imperial Privilege A11", "Attack");
        effects.put("Imperial Privilege A12", "Self");

        effects.put("Enchant A0", "teamBusterBonus");
        effects.put("Enchant A1", ".20");
        effects.put("Enchant A2", ".22");
        effects.put("Enchant A3", ".24");
        effects.put("Enchant A4", ".26");
        effects.put("Enchant A5", ".28");
        effects.put("Enchant A6", ".30");
        effects.put("Enchant A7", ".32");
        effects.put("Enchant A8", ".34");
        effects.put("Enchant A9", ".36");
        effects.put("Enchant A10", ".40");
        effects.put("Enchant A11", "Buster");
        effects.put("Enchant A12", "All");

        effects.put("Beyond Arcadia B0", "teamQuickBonus");
        effects.put("Beyond Arcadia B1", ".18");
        effects.put("Beyond Arcadia B2", ".198");
        effects.put("Beyond Arcadia B3", ".216");
        effects.put("Beyond Arcadia B4", ".234");
        effects.put("Beyond Arcadia B5", ".252");
        effects.put("Beyond Arcadia B6", ".27");
        effects.put("Beyond Arcadia B7", ".288");
        effects.put("Beyond Arcadia B8", ".306");
        effects.put("Beyond Arcadia B9", ".324");
        effects.put("Beyond Arcadia B10", ".36");
        effects.put("Beyond Arcadia B11", "Quick");
        effects.put("Beyond Arcadia B12", "All");

        effectsMap = Collections.unmodifiableMap(effects);

    }

    public Effects(String effectName) {
        this.effectName = effectName;
    }

    public static void activateSkill(String skillName, int level, Servant thisServant)
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
                {
                    if(effectsMap.get(skillName + "11").equals("Arts"))
                        thisServant.addArtsMOD(Double.parseDouble(effectsMap.get(skillName + Integer.toString(level))));
                    if(effectsMap.get(skillName + "11").equals("Buster"))
                        thisServant.addBusterMOD(Double.parseDouble(effectsMap.get(skillName + Integer.toString(level))));
                    if(effectsMap.get(skillName + "11").equals("Quick"))
                        thisServant.addQuickMOD(Double.parseDouble(effectsMap.get(skillName + Integer.toString(level))));
                }
            if(effectsMap.get(skillName + "0").equals("atkMod"))
            {
                thisServant.addAtkMod(Double.parseDouble(effectsMap.get(skillName + Integer.toString(level))));
            }

            if(effectsMap.get(skillName + "0").equals("critDamageMod"))
            {
                thisServant.addCritDamageMod(Double.parseDouble(effectsMap.get(skillName + Integer.toString(level))));
            }

            if(effectsMap.get(skillName + "0").equals("npDamageMod"))
            {
                thisServant.addNpDamageMod(Double.parseDouble(effectsMap.get(skillName + Integer.toString(level))));
            }
        }
        if(effectsMap.get(skillName + "12").equals("All"))
        {
            if(effectsMap.get(skillName + "0").equals("teamBusterBonus"))
            {
                teamBusterBonus += Double.parseDouble(effectsMap.get(skillName + Integer.toString(level)));
            }

            if(effectsMap.get(skillName + "0").equals("teamArtsBonus"))
            {
                teamArtsBonus += Double.parseDouble(effectsMap.get(skillName + Integer.toString(level)));
            }

            if(effectsMap.get(skillName + "0").equals("teamQuickBonus"))
            {
                teamQuickBonus += Double.parseDouble(effectsMap.get(skillName + Integer.toString(level)));
            }

            if(effectsMap.get(skillName + "0").equals("teamAtkBonus"))
            {
                teamAtkBonus += Double.parseDouble(effectsMap.get(skillName + Integer.toString(level)));
            }

            if(effectsMap.get(skillName + "0").equals("teamNPBonus"))
            {
                teamNPBonus += Double.parseDouble(effectsMap.get(skillName + Integer.toString(level)));
            }

            if(effectsMap.get(skillName + "0").equals("teamCritBonus"))
            {
                teamCritBonus += Double.parseDouble(effectsMap.get(skillName + Integer.toString(level)));
            }

            if(effectsMap.get(skillName + "0").equals("teamDamagePlus"))
            {
                teamDamagePlus += Integer.parseInt(effectsMap.get(skillName + Integer.toString(level)));
            }
        }
        if(effectsMap.get(skillName + "12").equals("Ally"))
        {}
        if(effectsMap.get(skillName + "12").equals("Enemy"))
        {}
    }
}