package com.example.ander.fgodamagerecovery.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Ander
 */
public class Effects {
    private String effectName;

    public static final Map <String, String> effectsMap;
    public static final Map <String, double[]> damagePattern;
    public static final Map <String, String> hougu;
    public static final Map <String, List<String>> hiddenTraits;
    public static double teamBusterBonus = 0, teamAtkBonus = 0, teamArtsBonus = 0, teamQuickBonus = 0, teamNPBonus = 0, teamCritBonus = 0;
    public static int teamDamagePlus = 0;

    static{


        {
            Map<String, String> effects = new HashMap<String, String>();

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

        Map<String, List<String>> filedUnder = new HashMap<String, List<String>>();
        List<String> list1 = new ArrayList<String>();
        list1.add("Arturia");
        list1.add("Arturia Alter");
        list1.add("Arturia Lily");
        list1.add("Seigfried");
        list1.add("Arturia");
        list1.add("Liz");
        list1.add("Kiyohime");
        list1.add("Liz (Halloween)");
        list1.add("Arturia Alter (Santa)");
        list1.add("Mordred");
        list1.add("Arturia Alter (Lancer)");
        list1.add("Mysterious Heroine X");
        list1.add("Shuten-Douji");
        list1.add("Arturia Pendragon (Lancer)");
        list1.add("Arturia (Summer)");
        list1.add("Mordred (Summer)");
        list1.add("Kiyohime (Summer)");
        list1.add("Liz (Brave)");
        list1.add("MHX Alter");
        list1.add("Arthur");
        list1.add("Arturia Alter (Rider)");
        list1.add("Sieg");
        filedUnder.put("Dragon", list1);

        //for enuma elish, but these are NOT affected by it
        List<String> list2 = new ArrayList<String>();
        list2.add("Romulus");
        list2.add("Wolfgang Amadeus Mozart");
        list2.add("Francis Drake");
        list2.add("Nikola Tesla");
        list2.add("Mysterious Heroine X");
        list2.add("Shiki Void");
        list2.add("Shiki");
        list2.add("Tiamat");
        list2.add("Goetia");
        list2.add("MHX Alter");
        list2.add("Kiara");
        list2.add("Sherlock Holmes");
        list2.add("Abagail Williams");
        filedUnder.put("Servant", list2);

        //riding
        List<String> list3 = new ArrayList<String>();
        list3.add("Mash");
        list3.add("Arturia");
        list3.add("Arturia Lily");
        list3.add("Nero");
        list3.add("Siegfried");
        list3.add("Caesar");
        list3.add("Altera");
        list3.add("Gilles Saber");
        list3.add("Chevalier d'Eon");
        list3.add("Medusa");
        list3.add("Georgios");
        list3.add("Boudica");
        list3.add("Ushiwakamaru");
        list3.add("Alexander");
        list3.add("Marie Antoinette");
        list3.add("Martha");
        list3.add("Hektor");
        list3.add("Francis Drake");
        list3.add("Okita Souji");
        list3.add("Fergus");
        list3.add("Arturia Alter (Santa)");
        list3.add("Mordred");
        list3.add("Arturia Alter (Lancer)");
        list3.add("Karna");
        list3.add("Mysterious Heroine X");
        list3.add("Brynhild");
        list3.add("Nero Bride");
        list3.add("Astolfo");
        list3.add("Queen Medb");
        list3.add("Rama");
        list3.add("Billy the Kid");
        list3.add("Iskandar");
        list3.add("Minamoto-no-Raikou");
        list3.add("Ozymandias");
        list3.add("Arturia Pendragon (Lancer)");
        list3.add("Lancelot (Saber)");
        list3.add("Gawain");
        list3.add("Tamamo (Summer)");
        list3.add("Quetzalcoatl");
        list3.add("Arthur");
        list3.add("Melt");
        list3.add("Suzuka Gozen");
        list3.add("Nero (Caster)");
        list3.add("Arturia Alter (Rider)");
        filedUnder.put("Riding", list3);

        List<String> list4 = new ArrayList<String>();
        list4.add("Arturia");
        list4.add("Arturia Alter");
        list4.add("Arturia Lily");
        list4.add("Arturia Alter (Santa)");
        list4.add("Arturia Alter (Lancer)");
        list4.add("Mysterious Heroine X");
        list4.add("Arturia Pendragon (Lancer)");
        list4.add("Arturia (Summer)");
        list4.add("MHX Alter");
        list4.add("Arthur");
        list4.add("Arturia Alter (Rider)");
        list4.add("Mysterious Heroine XX");
        filedUnder.put("Arthur", list4);

        List<String> list5 = new ArrayList<String>();
        list5.add("Mash");
        list5.add("Arturia");
        list5.add("Arturia Lily");
        list5.add("Siegfried");
        list5.add("Gilgamesh");
        list5.add("Atlante");
        list5.add("Euryale");
        list5.add("Arash");
        list5.add("Cu Chulainn");
        list5.add("Cu Chulainn (Prototype)");
        list5.add("Medusa");
        list5.add("Medea");
        list5.add("Mephistopholes");
        list5.add("Cu Chulainn (Caster)");
        list5.add("Stheno");
        list5.add("Phantom of the Opera");
        list5.add("Carmilla");
        list5.add("Heracles");
        list5.add("Lancelot");
        list5.add("Vlad III");
        list5.add("Asterios");
        list5.add("Kiyohime");
        list5.add("Tamamo Cat");
        list5.add("Orion");
        list5.add("Tamamo");
        list5.add("David");
        list5.add("Medea Lily");
        list5.add("Diarmuid Ua Duibhne");
        list5.add("Fergus");
        list5.add("Jack the Ripper");
        list5.add("Mordred");
        list5.add("Arturia Alter (Lancer)");
        list5.add("Henry Jekyll & Hyde");
        list5.add("Frankenstein");
        list5.add("Solomon");
        list5.add("Arjuna");
        list5.add("Karna");
        list5.add("Fionn mac Cumhaill");
        list5.add("Brynhild");
        list5.add("Beowulf");
        list5.add("Astolfo");
        list5.add("Gilgamesh (Child)");
        list5.add("Cu Chulainn (Alter)");
        list5.add("Queen Medb");
        list5.add("Rama");
        list5.add("Irisviel");
        list5.add("Shuten-Douji");
        list5.add("Minamoto-no-Raikou");
        list5.add("Kintoki Rider");
        list5.add("Ibaraki-Douji");
        list5.add("Ozymandias");
        list5.add("Arturia Pendragon (Lancer)");
        list5.add("Nitocris (Caster)");
        list5.add("Lancelot (Saber)");
        list5.add("Tristan");
        list5.add("Gawain");
        list5.add("Tamamo (Summer)");
        list5.add("Arturia (Summer)");
        list5.add("Mordred (Summer)");
        list5.add("Kiyohime (Summer)");
        list5.add("Kuro");
        list5.add("Liz (Brave)");
        list5.add("Vlad III (EXTRA)");
        list5.add("Ishtar");
        list5.add("Enkidu");
        list5.add("Quetzalcoatl");
        list5.add("Medusa (Loli)");
        list5.add("Gorgon");
        list5.add("Jaguar Warrior");
        list5.add("Merlin");
        list5.add("Shinjuku Avenger");
        list5.add("Arthur");
        list5.add("Melt");
        list5.add("Passionlip");
        list5.add("Suzuka Gozen");
        list5.add("Penthesilea");
        list5.add("Paul Bunyan");
        list5.add("Frankenstein (Summer)");
        list5.add("Nitocris (Assassin)");
        filedUnder.put("Sky/Earth", list5);

        List<String> list6 = new ArrayList<String>();
        list6.add("Caesar");
        list6.add("Altera");
        list6.add("Gilgamesh");
        list6.add("Euryale");
        list6.add("Cu Chulainn");
        list6.add("Cu Chulainn (Prototype)");
        list6.add("Medusa");
        list6.add("Alexander");
        list6.add("Martha");
        list6.add("Cu Chulainn (Caster)");
        list6.add("Stheno");
        list6.add("Heracles");
        list6.add("Sakata Kintoki");
        list6.add("Tamamo");
        list6.add("Arjuna");
        list6.add("Karna");
        list6.add("Fionn mac Cumhaill");
        list6.add("Brynhild");
        list6.add("Gilgamesh (Child)");
        list6.add("Rama");
        list6.add("Iskandar");
        list6.add("Irisviel");
        list6.add("Shuten-Douji");
        list6.add("Xuanzang Sanzang");
        list6.add("Minamoto-no-Raikou");
        list6.add("Kintoki Rider");
        list6.add("Ozymandias");
        list6.add("Nitocris (Caster)");
        list6.add("Tamamo (Summer)");
        list6.add("Cleopatra");
        list6.add("Ishtar");
        list6.add("Quetzalcoatl");
        list6.add("Gilgamesh (Caster)");
        list6.add("Medusa (Loli)");
        list6.add("Tiamat");
        list6.add("Melt");
        list6.add("Passsionlip");
        list6.add("Suzuka Gozen");
        list6.add("Penthesilea");
        list6.add("Nitocris (Assassin)");
        filedUnder.put("Divine", list6);

        List<String> list7 = new ArrayList<String>();
        list7.add("Arturia");
        list7.add("Arturia Alter");
        list7.add("Arturia Lily");
        list7.add("Nero");
        list7.add("Jeanne d'Arc");
        list7.add("Okita Souji");
        list7.add("Arturia Alter (Santa)");
        list7.add("Mordred");
        list7.add("Arturia Alter (Lancer)");
        list7.add("Mysterious Heroine X");
        list7.add("Nero Bride");
        list7.add("Jeanne d'Arc (Alter)");
        list7.add("Arturia Pendragon (Lancer)");
        list7.add("Arturia (Summer)");
        list7.add("Mordred (Summer)");
        list7.add("Jeanne Alter (Santa)");
        list7.add("MHX Alter");
        list7.add("Nero (Caster)");
        list7.add("Arturia Alter (Rider)");
        list7.add("Okita Souji (Alter)");
        filedUnder.put("Saber Face", list7);

        List<String> list8 = new ArrayList<String>();
        list8.add("Siegfried");
        list8.add("Caesar");
        list8.add("Gilles Saber");
        list8.add("Emiya");
        list8.add("Robin Hood");
        list8.add("Arash");
        list8.add("Cu Chulainn");
        list8.add("Benkei");
        list8.add("Georgios");
        list8.add("Ushiwakamaru");
        list8.add("Wolfgang Amadeus Mozart");
        list8.add("Zhuge Liang");
        list8.add("Cu Chulainn (Caster)");
        list8.add("Sakata Kintoki");
        list8.add("Vlad III");
        list8.add("Diarmuid Ua Duibhne");
        list8.add("Fergus");
        list8.add("Nikola Tesla");
        list8.add("Paracelsus");
        list8.add("Henry Jekyll & Hyde");
        list8.add("Karna");
        list8.add("Beowulf");
        list8.add("Cu Chulainn (Alter)");
        list8.add("Rama");
        list8.add("Geronimo");
        list8.add("Iskandar");
        list8.add("Emiya (Assassin)");
        list8.add("Kintoki Rider");
        list8.add("Ozymandias");
        list8.add("Lancelot (Saber)");
        list8.add("Gawain");
        list8.add("Tawara Touta");
        list8.add("Bedivere");
        list8.add("Gilgamesh (Caster)");
        list8.add("King Hassan");
        list8.add("Arthur");
        filedUnder.put("Beloved", list8);

        List<String> list9 = new ArrayList<String>();
        list9.add("Shuten-Douji");
        list9.add("Ibaraki-Douji");
        list9.add("Tomoe");
        list9.add("Skeleton");
        list9.add("Zombie");
        list9.add("Ghost");
        list9.add("Werewolf");
        list9.add("Lamia");
        list9.add("Daemon");
        list9.add("Gazer");
        list9.add("Bicorn");
        list9.add("Oni");
        list9.add("Sea Fiend");
        list9.add("Hermit Crab");
        filedUnder.put("Demonic", list9);

        List<String> list10 = new ArrayList<String>();


        hiddenTraits = Collections.unmodifiableMap(filedUnder);

        Map <String, double[]> patterns = new HashMap<String, double[]>();
        double [] arr = {0,0,0,0,0};
        patterns.put("0", arr);
        double [] arr1 = {3,4,4.5,4.75,5};
        patterns.put("1", arr1);
        double [] arr2 = {4.00,5.00,5.50,5.75,6.00};
        patterns.put("2", arr2);
        double [] arr3 = {4.50,5.50,6.00,6.25,6.50};
        patterns.put("3", arr3);
        double [] arr4 = {3.00,4.50,5.25,5.625,6.00};
        patterns.put("4", arr4);
        double [] arr5 = {4.00,5.50,6.25,6.625,7.00};
        patterns.put("5", arr5);
        double [] arr6 = {4.50,6.00,6.75,7.125,7.50};
        patterns.put("6", arr6);
        double [] arr7 = {6.00,7.50,8.25,8.625,9.00};
        patterns.put("7", arr7);
        double [] arr8 = {3,4,4.5,4.75,5};
        patterns.put("8", arr8);
        double [] arr9 = {12.00,16.00,18.00,19.00,20.00};
        patterns.put("9", arr9);
        double [] arr10 = {9.00,12.00,13.50,14.25,15.00};
        patterns.put("10", arr10);
        double [] arr11 = {6.00,8.00,9.00,9.50,10.00};
        patterns.put("11", arr11);
        double [] arr12 = {8.00,10.00,11.00,11.50,12.00};
        patterns.put("12", arr12);
        double [] arr13 = {9,9,9,9,9};
        patterns.put("13", arr13);
        double [] arr14 = {12.00,12.00,12.00,12.00,12.00};
        patterns.put("14", arr14);
        double [] arr15 = {8.00,10.00,11.00,11.50,12.00};
        patterns.put("15", arr15);
        double [] arr16 = {4.50,6.00,6.75,7.125,7.50};
        patterns.put("16", arr16);
        double [] arr17 = {16.00,20.00,22.00,23.00,24.00};
        patterns.put("17", arr17);
        double [] arr18 = {12.00,15.00,16.50,17.25,18.00};
        patterns.put("18", arr18);
        double [] arr19 = {14.00,18.00,20.00,21.00,22.00};
        patterns.put("19", arr19);
        double [] arr20 = {7.00,9.00,10.00,10.50,11.00};
        patterns.put("20", arr20);
        double [] arr21 = {9.00,11.00,12.00,12.50,13.00};
        patterns.put("21", arr21);
        double [] arr22 = {1.50,1.625,1.75,1.875,2.00};
        patterns.put("22", arr22);
        double [] arr23 = {.10,.15,.20,.25,.30};
        patterns.put("23", arr23);
        double [] arr24 = {.20,.25,.30,.35,.40};
        patterns.put("24", arr24);
        double [] arr25 = {.10,.20,.25,.275,.30};
        patterns.put("25", arr25);
        double [] arr26 = {.30,.30,.30,.30,.30};
        patterns.put("26", arr26);
        double [] arr27 = {2.00,2.125,2.25,2.375,2.50};
        patterns.put("27", arr27);
        double [] arr28 = {1.30,1.40,1.45,1.475,1.50};
        patterns.put("28", arr28);
        double [] arr29 = {1.50,2.00,2.25,2.375,2.50};
        patterns.put("29", arr29);
        double [] arr30 = {.00,1.00,2.00,3.00,4.00};
        patterns.put("30", arr30);
        double [] arr31 = {.00,2.00,4.00,6.00,8.00};
        patterns.put("31", arr31);
        double [] arr32 = {.20,.20,.20,.20,.20};
        patterns.put("32", arr32);
        double [] arr33 = {.30,.40,.45,.475,.50};
        patterns.put("33", arr33);
        double [] arr34 = {1.20,1.325,1.45,1.575,1.70};
        patterns.put("34", arr34);
        double [] arr35 = {.50,.55,.575,.588,.60};
        patterns.put("35", arr35);
        double [] arr36 = {.50,.625,.75,.875,1.00};
        patterns.put("36", arr36);
        double [] arr37 = {1.80,1.90,2.00,2.10,2.20};
        patterns.put("37", arr37);
        double [] arr38 = {.10,.125,.15,.175,.20};
        patterns.put("38", arr38);
        double [] arr39 = {.20,.30,.40,.50,.60};
        patterns.put("39", arr39);
        double [] arr40 = {.40,.50,.60,.70,.80};
        patterns.put("40", arr40);
        double [] arr41 = {.30,.40,.50,.60,.70};
        patterns.put("41", arr41);
        double [] arr42 = {.10,.20,.30,.40,.50};
        patterns.put("42", arr42);
        double [] arr43 = {.10,.10,.10,.10,.10};
        patterns.put("43", arr43);
        double [] arr44 = {.10,.30,.50,.70,.90};
        patterns.put("44", arr44);
        double [] arr45 = {1000,1500,2000,2500,3000};
        patterns.put("45", arr45);
        double [] arr46 = {.50,.75,.875,.938,1};
        patterns.put("46", arr46);

        damagePattern = Collections.unmodifiableMap(patterns);

        Map <String, String> noble = new HashMap<String, String>();

        noble.put("Unlimited Blade Works0","1");
        noble.put("Unlimited Blade Works0u","2");
        noble.put("Unlimited Blade Works1","True");
        noble.put("Unlimited Blade Works2","false");
        noble.put("Unlimited Blade Works3","Ignores Defense");
        noble.put("Unlimited Blade Works4","none");
        noble.put("Unlimited Blade Works5","Buster");

        noble.put("Excalibur0","1");
        noble.put("Excalibur0u","2");
        noble.put("Excalibur1","false");
        noble.put("Excalibur2","false");
        noble.put("Excalibur3","none");
        noble.put("Excalibur4","none");
        noble.put("Excalibur5","Buster");

        noble.put("Excalibur Morgan0","3");
        noble.put("Excalibur Morgan1","false");
        noble.put("Excalibur Morgan2","false");
        noble.put("Excalibur Morgan3","none");
        noble.put("Excalibur Morgan4","none");
        noble.put("Excalibur Morgan5","Buster");

        noble.put("Caliburn0","4");
        noble.put("Caliburn0u","5");
        noble.put("Caliburn1","false");
        noble.put("Caliburn2","false");
        noble.put("Caliburn3","none");
        noble.put("Caliburn4","none");
        noble.put("Caliburn5","Buster");

        noble.put("Laus Saint Claudius0","6");
        noble.put("Laus Saint Claudius0u","7");
        noble.put("Laus Saint Claudius1","True");
        noble.put("Laus Saint Claudius2","True");
        noble.put("Laus Saint Claudius3","Ignores Defense");
        noble.put("Laus Saint Claudius4","Defense Down");
        noble.put("Laus Saint Claudius5","Arts");
        noble.put("Laus Saint Claudius8","24");

        noble.put("Balmung0","1");
        noble.put("Balmung0u","2");
        noble.put("Balmung1","True");
        noble.put("Balmung2","false");
        noble.put("Balmung3","Special Attack");
        noble.put("Balmung4","1");
        noble.put("Balmung5","Buster");
        noble.put("Balmung6","Dragon");
        noble.put("Balmung7","22");

        noble.put("Crocea Mors0","9");
        noble.put("Crocea Mors1","False");
        noble.put("Crocea Mors2","False");
        noble.put("Crocea Mors3","none");
        noble.put("Crocea Mors4","none");
        noble.put("Crocea Mors5","Quick");

        noble.put("Photon Ray0","1");
        noble.put("Photon Ray0u","2");
        noble.put("Photon Ray1","False");
        noble.put("Photon Ray2","True");
        noble.put("Photon Ray3","null");
        noble.put("Photon Ray4","Defense Down");
        noble.put("Photon Ray5","Buster");
        noble.put("Photon Ray8","23");
        noble.put("Photon Ray2u","True");
        noble.put("Photon Ray4u","Defense Down");
        noble.put("Photon Ray8u","24");

        noble.put("Saint War Order0","0");
        noble.put("Saint War Order1","True");
        noble.put("Saint War Order2","False");
        noble.put("Saint War Order3","AtkUp");
        noble.put("Saint War Order4","Null");
        noble.put("Saint War Order5","Arts");
        noble.put("Saint War Order7","NPLevel");
        noble.put("Saint War Order17","46");

        noble.put("Fleur de Lis0","0");
        noble.put("Fleur de Lis1","False");
        noble.put("Fleur de Lis2","True");
        noble.put("Fleur de Lis3","Null");
        noble.put("Fleur de Lis4","Defense Down");
        noble.put("Fleur de Lis5","Arts");
        noble.put("Fleur de Lis8","25");


        //has 2 pre effects
        noble.put("Enuma Elish0","1");
        noble.put("Enuma Elish0u","2");
        noble.put("Enuma Elish1","True");
        noble.put("Enuma Elish2","False");
        noble.put("Enuma Elish3","Special Attack");
        noble.put("Enuma Elish4","Null");
        noble.put("Enuma Elish5","Buster");
        noble.put("Enuma Elish6","Servant");
        noble.put("Enuma Elish7","21");
        noble.put("Enuma Elish1u","True");
        noble.put("Enuma Elish3u","NP Strength");
        noble.put("Enuma Elish7u","26");

        noble.put("Yew Bow0","10");
        noble.put("Yew Bow1","True");
        noble.put("Yew Bow2","False");
        noble.put("Yew Bow3","Special Attack");
        noble.put("Yew Bow4","Null");
        noble.put("Yew Bow5","Arts");
        noble.put("Yew Bow6","Poisoned");
        noble.put("Yew Bow7","27");

        noble.put("Phoebus Catastrophe0","11");
        noble.put("Phoebus Catastrophe0u","12");
        noble.put("Phoebus Catastrophe1","False");
        noble.put("Phoebus Catastrophe2","False");
        noble.put("Phoebus Catastrophe3","False");
        noble.put("Phoebus Catastrophe4","False");
        noble.put("Phoebus Catastrophe5","Quick");

        //Euryales special attack is not overcharge dependant
        noble.put("Eye of the Euryale0","12");
        noble.put("Eye of the Euryale0u","13");
        noble.put("Eye of the Euryale1","True");
        noble.put("Eye of the Euryale2","False");
        noble.put("Eye of the Euryale3","Special Attack");
        noble.put("Eye of the Euryale4","Null");
        noble.put("Eye of the Euryale5","Arts");
        noble.put("Eye of the Euryale6","Male");
        noble.put("Eye of the Euryale7","NPLevel");
        noble.put("Eye of the Euryale17","28");
        noble.put("Eye of the Euryale1u","True");
        noble.put("Eye of the Euryale3u","Special Attack");
        noble.put("Eye of the Euryale6u","Male");
        noble.put("Eye of the Euryale7u","NPLevel");
        noble.put("Eye of the Euryale17u","29");

        noble.put("Stella0","11");
        noble.put("Stella0u","15");
        noble.put("Stella1","True");
        noble.put("Stella1u","True");
        noble.put("Stella2","False");
        noble.put("Stella3","NPdamageMod");
        noble.put("Stella3u","NPdamageMod");
        noble.put("Stella4","Null");
        noble.put("Stella5","Buster");
        noble.put("Stella7","30");
        noble.put("Stella7u","31");

        noble.put("Gae Bolg0","9");
        noble.put("Gae Bolg1","False");
        noble.put("Gae Bolg2","True");
        noble.put("Gae Bolg3","Null");
        noble.put("Gae Bolg4","Defense Down");
        noble.put("Gae Bolg5","Quick");
        noble.put("Gae Bolg8","23");

        noble.put("Bathory Erzsebet0","1");
        noble.put("Bathory Erzsebet0u","2");
        noble.put("Bathory Erzsebet1","False");
        noble.put("Bathory Erzsebet2","False");
        noble.put("Bathory Erzsebet3","Null");
        noble.put("Bathory Erzsebet4","Null");
        noble.put("Bathory Erzsebet5","Buster");

        noble.put("Gohyaku Rakan Fudarakutokai0","0");
        noble.put("Gohyaku Rakan Fudarakutokai1","False");
        noble.put("Gohyaku Rakan Fudarakutokai2","False");
        noble.put("Gohyaku Rakan Fudarakutokai3","Null");
        noble.put("Gohyaku Rakan Fudarakutokai4","Null");
        noble.put("Gohyaku Rakan Fudarakutokai5","Arts");

        noble.put("Thermopylae Enomotia0","0");
        noble.put("Thermopylae Enomotia1","0");
        noble.put("Thermopylae Enomotia2","0");
        noble.put("Thermopylae Enomotia3","0");
        noble.put("Thermopylae Enomotia4","0");
        noble.put("Thermopylae Enomotia5","Buster");

        noble.put("Magna Voluisse Magnum0","1");
        noble.put("Magna Voluisse Magnum1","0");
        noble.put("Magna Voluisse Magnum2","True");
        noble.put("Magna Voluisse Magnum3","0");
        noble.put("Magna Voluisse Magnum4","TeamAtkBonus");
        noble.put("Magna Voluisse Magnum5","Buster");
        noble.put("Magna Voluisse Magnum8","23");

        noble.put("Bellerophon0","11");
        noble.put("Bellerophon1","1");
        noble.put("Bellerophon2","1");
        noble.put("Bellerophon3","1");
        noble.put("Bellerophon4","1");
        noble.put("Bellerophon5","Quick");

        noble.put("Ascalon0","10");
        noble.put("Ascalon1","10");
        noble.put("Ascalon2","10");
        noble.put("Ascalon3","10");
        noble.put("Ascalon4","10");
        noble.put("Ascalon5","Arts");

        noble.put("Queen Anne's Revenge0","1");
        noble.put("Queen Anne's Revenge1","10");
        noble.put("Queen Anne's Revenge2","10");
        noble.put("Queen Anne's Revenge3","10");
        noble.put("Queen Anne's Revenge4","10");
        noble.put("Queen Anne's Revenge5","Buster");

        //all allies
        noble.put("Chariot of Boudica0","0");
        noble.put("Chariot of Boudica1","0");
        noble.put("Chariot of Boudica2","0");
        noble.put("Chariot of Boudica3","0");
        noble.put("Chariot of Boudica4","0");
        noble.put("Chariot of Boudica5","Arts");
        noble.put("Chariot of Boudica2u","True");
        noble.put("Chariot of Boudica4u","TeamAtkBonus");
        noble.put("Chariot of Boudica8u","24");

        noble.put("Dan-No-Ura Hassou Tobi0","9");
        noble.put("Dan-No-Ura Hassou Tobi0u","17");
        noble.put("Dan-No-Ura Hassou Tobi1","9");
        noble.put("Dan-No-Ura Hassou Tobi2","9");
        noble.put("Dan-No-Ura Hassou Tobi3","9");
        noble.put("Dan-No-Ura Hassou Tobi4","9");
        noble.put("Dan-No-Ura Hassou Tobi5","Quick");

        noble.put("Bucephalus0","11");
        noble.put("Bucephalus0u","15");
        noble.put("Bucephalus1","11");
        noble.put("Bucephalus2","11");
        noble.put("Bucephalus3","11");
        noble.put("Bucephalus4","11");
        noble.put("Bucephalus5","Quick");

        noble.put("Guillotene Breaker0","11");
        noble.put("Guillotene Breaker0u","15");
        noble.put("Guillotene Breaker1","11");
        noble.put("Guillotene Breaker2","11");
        noble.put("Guillotene Breaker3","11");
        noble.put("Guillotene Breaker4","11");
        noble.put("Guillotene Breaker5","Quick");
        noble.put("Guillotene Breaker2u","True");
        noble.put("Guillotene Breaker4u","CritUp");
        noble.put("Guillotene Breaker8u","32");

        noble.put("Tarasque0","1");
        noble.put("Tarasque0u","2");
        noble.put("Tarasque1","11");
        noble.put("Tarasque2","True");
        noble.put("Tarasque3","11");
        noble.put("Tarasque4","Defense Down");
        noble.put("Tarasque5","Buster");
        noble.put("Tarasque8","24");
        noble.put("Tarasque1u","True");
        noble.put("Tarasque3u","BusterUp");
        noble.put("Tarasque7u","32");

        noble.put("Rule Breaker0","6");
        noble.put("Rule Breaker0u","7");
        noble.put("Rule Breaker1","11");
        noble.put("Rule Breaker2","11");
        noble.put("Rule Breaker3","11");
        noble.put("Rule Breaker4","11");
        noble.put("Rule Breaker5","Arts");

        noble.put("Prelati's Spellbook0","11");
        noble.put("Prelati's Spellbook1","11");
        noble.put("Prelati's Spellbook2","11");
        noble.put("Prelati's Spellbook3","11");
        noble.put("Prelati's Spellbook4","11");
        noble.put("Prelati's Spellbook5","Buster");

        noble.put("Marchen Meines Lebens0","0");
        noble.put("Marchen Meines Lebens1","0");
        noble.put("Marchen Meines Lebens2","True");
        noble.put("Marchen Meines Lebens3","0");
        noble.put("Marchen Meines Lebens4","TeamAtkBonus");
        noble.put("Marchen Meines Lebens5","Arts");
        noble.put("Marchen Meines Lebens8","24");

        noble.put("First Folio0","1");
        noble.put("First Folio0u","2");
        noble.put("First Folio1","0");
        noble.put("First Folio2","0");
        noble.put("First Folio3","0");
        noble.put("First Folio4","0");
        noble.put("First Folio5","Buster");

        noble.put("Ticktock Bomb0","1");
        noble.put("Ticktock Bomb0u","2");
        noble.put("Ticktock Bomb1","True");
        noble.put("Ticktock Bomb2","0");
        noble.put("Ticktock Bomb3","Ignores Defense");
        noble.put("Ticktock Bomb4","0");
        noble.put("Ticktock Bomb5","Buster");

        noble.put("Requiem for Death0","0");
        noble.put("Requiem for Death1","0");
        noble.put("Requiem for Death2","True");
        noble.put("Requiem for Death3","0");
        noble.put("Requiem for Death4","Defense Down");
        noble.put("Requiem for Death5","Arts");
        noble.put("Requiem for Death8","24");

        noble.put("Unreturning Formation0","0");
        noble.put("Unreturning Formation1","0");
        noble.put("Unreturning Formation2","True");
        noble.put("Unreturning Formation3","0");
        noble.put("Unreturning Formation4","Defense Down");
        noble.put("Unreturning Formation5","Arts");
        noble.put("Unreturning Formation8","25");
        noble.put("Unreturning Formation2u","True");
        noble.put("Unreturning Formation4u","Defense Down");
        noble.put("Unreturning Formation8u","33");

        noble.put("Wicker Man0","1");
        noble.put("Wicker Man1","1");
        noble.put("Wicker Man2","True");
        noble.put("Wicker Man3","1");
        noble.put("Wicker Man4","Defense Down");
        noble.put("Wicker Man5","Buster");
        noble.put("Wicker Man8","25");

        noble.put("Tsubame Gaeshi0","9");
        noble.put("Tsubame Gaeshi1","1");
        noble.put("Tsubame Gaeshi2","1");
        noble.put("Tsubame Gaeshi3","1");
        noble.put("Tsubame Gaeshi4","1");
        noble.put("Tsubame Gaeshi5","Quick");

        noble.put("Zabaniya0","9");
        noble.put("Zabaniya1","9");
        noble.put("Zabaniya2","9");
        noble.put("Zabaniya3","9");
        noble.put("Zabaniya4","9");
        noble.put("Zabaniya5","Quick");

        noble.put("Smile of the Stheno0","0");
        noble.put("Smile of the Stheno1","0");
        noble.put("Smile of the Stheno2","True");
        noble.put("Smile of the Stheno3","0");
        noble.put("Smile of the Stheno4","Defense Down");
        noble.put("Smile of the Stheno5","Buster");
        noble.put("Smile of the Stheno8","32");

        noble.put("All I Do Is Kill0","9");
        noble.put("All I Do Is Kill0u","17");
        noble.put("All I Do Is Kill1","0");
        noble.put("All I Do Is Kill2","0");
        noble.put("All I Do Is Kill3","0");
        noble.put("All I Do Is Kill4","0");
        noble.put("All I Do Is Kill5","Quick");

        noble.put("L'amour Espoir0","11");
        noble.put("L'amour Espoir0u","15");
        noble.put("L'amour Espoir1","0");
        noble.put("L'amour Espoir2","True");
        noble.put("L'amour Espoir3","0");
        noble.put("L'amour Espoir4","Defense Down");
        noble.put("L'amour Espoir5","Buster");
        noble.put("L'amour Espoir8","24");
        noble.put("L'amour Espoir2u","True");
        noble.put("L'amour Espoir4u","Defense Down");
        noble.put("L'amour Espoir8u","33");

        noble.put("Christine Christine0","6");
        noble.put("Christine Christine0u","7");
        noble.put("Christine Christine1","True");
        noble.put("Christine Christine2","0");
        noble.put("Christine Christine3","Ignores Defense");
        noble.put("Christine Christine4","0");
        noble.put("Christine Christine5","Arts");

        noble.put("Mata Hari0","0");
        noble.put("Mata Hari1","0");
        noble.put("Mata Hari2","True");
        noble.put("Mata Hari3","0");
        noble.put("Mata Hari4","Defense Down");
        noble.put("Mata Hari5","Arts");
        noble.put("Mata Hari8","24");

        noble.put("Phantom Maiden0","11");
        noble.put("Phantom Maiden0u","15");
        noble.put("Phantom Maiden1","True");
        noble.put("Phantom Maiden2","True");
        noble.put("Phantom Maiden3","Special Attack");
        noble.put("Phantom Maiden4","AtkUp");
        noble.put("Phantom Maiden5","Buster");
        noble.put("Phantom Maiden6","Female");
        noble.put("Phantom Maiden7","34");
        noble.put("Phantom Maiden8","32");
        noble.put("Phantom Maiden1u","True");
        noble.put("Phantom Maiden3u","Special Attack");
        noble.put("Phantom Maiden6u","Female");
        noble.put("Phantom Maiden7u","22");

        noble.put("Nine Lives0","11");
        noble.put("Nine Lives1","11");
        noble.put("Nine Lives2","True");
        noble.put("Nine Lives3","11");
        noble.put("Nine Lives4","Defense Down");
        noble.put("Nine Lives5","Buster");
        noble.put("Nine Lives8","23");

        noble.put("Knight of Owner0","11");
        noble.put("Knight of Owner1","True");
        noble.put("Knight of Owner2","11");
        noble.put("Knight of Owner3","AtkUp");
        noble.put("Knight of Owner4","11");
        noble.put("Knight of Owner5","Quick");
        noble.put("Knight of Owner7","23");

        noble.put("God Force0","11");
        noble.put("God Force1","11");
        noble.put("God Force2","11");
        noble.put("God Force3","11");
        noble.put("God Force4","11");
        noble.put("God Force5","Buster");

        noble.put("Crying Warmonger0","1");
        noble.put("Crying Warmonger0u","2");
        noble.put("Crying Warmonger1","True");
        noble.put("Crying Warmonger2","11");
        noble.put("Crying Warmonger3","Ignores Defense");
        noble.put("Crying Warmonger4","11");
        noble.put("Crying Warmonger5","Buster");

        noble.put("Golden Spark0","11");
        noble.put("Golden Spark1","True");
        noble.put("Golden Spark2","11");
        noble.put("Golden Spark3","Ignores Defense");
        noble.put("Golden Spark4","11");
        noble.put("Golden Spark5","Buster");

        noble.put("Kazikli Bey0","11");
        noble.put("Kazikli Bey0u","10");
        noble.put("Kazikli Bey1","11");
        noble.put("Kazikli Bey2","11");
        noble.put("Kazikli Bey3","11");
        noble.put("Kazikli Bey4","11");
        noble.put("Kazikli Bey5","Arts");

        noble.put("Chaos Labyrinth0","0");
        noble.put("Chaos Labyrinth1","11");
        noble.put("Chaos Labyrinth2","True");
        noble.put("Chaos Labyrinth3","11");
        noble.put("Chaos Labyrinth4","Defense Down");
        noble.put("Chaos Labyrinth5","Arts");
        noble.put("Chaos Labyrinth8","23");
        noble.put("Chaos Labyrinth2u","True");
        noble.put("Chaos Labyrinth4u","Defense Down");
        noble.put("Chaos Labyrinth8u","35");

        noble.put("Flucticulus Diana0","0");
        noble.put("Flucticulus Diana1","0");
        noble.put("Flucticulus Diana2","0");
        noble.put("Flucticulus Diana3","0");
        noble.put("Flucticulus Diana4","0");
        noble.put("Flucticulus Diana5","Arts");

        noble.put("Athanatoi Ten Thousand0","1");
        noble.put("Athanatoi Ten Thousand0u","2");
        noble.put("Athanatoi Ten Thousand1","0");
        noble.put("Athanatoi Ten Thousand2","True");
        noble.put("Athanatoi Ten Thousand3","0");
        noble.put("Athanatoi Ten Thousand4","Defense Down");
        noble.put("Athanatoi Ten Thousand5","Buster");
        noble.put("Athanatoi Ten Thousand8","23");

        noble.put("Tenshin Kashou Zanmai0","1");
        noble.put("Tenshin Kashou Zanmai1","0");
        noble.put("Tenshin Kashou Zanmai2","0");
        noble.put("Tenshin Kashou Zanmai3","0");
        noble.put("Tenshin Kashou Zanmai4","0");
        noble.put("Tenshin Kashou Zanmai5","Buster");

        noble.put("Bloodbath Crown0","1");
        noble.put("Bloodbath Crown1","True");
        noble.put("Bloodbath Crown2","1");
        noble.put("Bloodbath Crown3","AtkUp");
        noble.put("Bloodbath Crown4","1");
        noble.put("Bloodbath Crown5","Buster");
        noble.put("Bloodbath Crown7","33");

        noble.put("Sansan Nikkou Hiruyasumi Shuchi Nikurin0","10");
        noble.put("Sansan Nikkou Hiruyasumi Shuchi Nikurin0u","11");
        noble.put("Sansan Nikkou Hiruyasumi Shuchi Nikurin1","1");
        noble.put("Sansan Nikkou Hiruyasumi Shuchi Nikurin2","1");
        noble.put("Sansan Nikkou Hiruyasumi Shuchi Nikurin3","1");
        noble.put("Sansan Nikkou Hiruyasumi Shuchi Nikurin4","1");
        noble.put("Sansan Nikkou Hiruyasumi Shuchi Nikurin5","Quick");

        noble.put("Luminosite Eternelle0","0");
        noble.put("Luminosite Eternelle1","1");
        noble.put("Luminosite Eternelle2","1");
        noble.put("Luminosite Eternelle3","1");
        noble.put("Luminosite Eternelle4","1");
        noble.put("Luminosite Eternelle5","Arts");

        noble.put("Tri-Star Amore Mio0","10");
        noble.put("Tri-Star Amore Mio0u","18");
        noble.put("Tri-Star Amore Mio1","0");
        noble.put("Tri-Star Amore Mio2","0");
        noble.put("Tri-Star Amore Mio3","0");
        noble.put("Tri-Star Amore Mio4","0");
        noble.put("Tri-Star Amore Mio5","Arts");

        noble.put("Bathory Halloween Erzsebet0","1");
        noble.put("Bathory Halloween Erzsebet1","True");
        noble.put("Bathory Halloween Erzsebet2","0");
        noble.put("Bathory Halloween Erzsebet3","Ignores Defense");
        noble.put("Bathory Halloween Erzsebet4","0");
        noble.put("Bathory Halloween Erzsebet5","Buster");

        noble.put("Suiten Nikkou Amaterasu Yano Shizu-Ishi0","0");
        noble.put("Suiten Nikkou Amaterasu Yano Shizu-Ishi1","1");
        noble.put("Suiten Nikkou Amaterasu Yano Shizu-Ishi2","1");
        noble.put("Suiten Nikkou Amaterasu Yano Shizu-Ishi3","1");
        noble.put("Suiten Nikkou Amaterasu Yano Shizu-Ishi4","1");
        noble.put("Suiten Nikkou Amaterasu Yano Shizu-Ishi5","Arts");

        noble.put("Hamesh Avanim0","11");
        noble.put("Hamesh Avanim1","1");
        noble.put("Hamesh Avanim2","1");
        noble.put("Hamesh Avanim3","1");
        noble.put("Hamesh Avanim4","1");
        noble.put("Hamesh Avanim5","Buster");

        noble.put("Durindana0","1");
        noble.put("Durindana0u","2");
        noble.put("Durindana1","True");
        noble.put("Durindana2","True");
        noble.put("Durindana3","Ignores Defense");
        noble.put("Durindana4","Defense Down");
        noble.put("Durindana5","Buster");
        noble.put("Durindana8","24");

        noble.put("Golden Wild Hunt0","1");
        noble.put("Golden Wild Hunt0u","2");
        noble.put("Golden Wild Hunt1","1");
        noble.put("Golden Wild Hunt2","1");
        noble.put("Golden Wild Hunt3","1");
        noble.put("Golden Wild Hunt4","1");
        noble.put("Golden Wild Hunt5","Buster");


        //need to make special case for this one, low hp more dmg
        noble.put("Caribbean Free Bird0","9");
        noble.put("Caribbean Free Bird0u","17");
        noble.put("Caribbean Free Bird1","1");
        noble.put("Caribbean Free Bird2","1");
        noble.put("Caribbean Free Bird3","1");
        noble.put("Caribbean Free Bird4","1");
        noble.put("Caribbean Free Bird5","Quick");

        noble.put("Pain Breaker0","0");
        noble.put("Pain Breaker1","1");
        noble.put("Pain Breaker2","1");
        noble.put("Pain Breaker3","1");
        noble.put("Pain Breaker4","1");
        noble.put("Pain Breaker5","Arts");

        noble.put("Mumyou Sandanzuki0","9");
        noble.put("Mumyou Sandanzuki1","True");
        noble.put("Mumyou Sandanzuki2","True");
        noble.put("Mumyou Sandanzuki3","Ignores Defense");
        noble.put("Mumyou Sandanzuki4","Defense Down");
        noble.put("Mumyou Sandanzuki5","Quick");
        noble.put("Mumyou Sandanzuki8","33");

        noble.put("Three Thousand Worlds0","1");
        noble.put("Three Thousand Worlds1","True");
        noble.put("Three Thousand Worlds2","9");
        noble.put("Three Thousand Worlds3","Special Attack");
        noble.put("Three Thousand Worlds4","9");
        noble.put("Three Thousand Worlds5","Buster");
        noble.put("Three Thousand Worlds6","Riding");
        noble.put("Three Thousand Worlds7","22");

        noble.put("Gae Bolg Alternative0","9");
        noble.put("Gae Bolg Alternative0u","17");
        noble.put("Gae Bolg Alternative1","9");
        noble.put("Gae Bolg Alternative2","9");
        noble.put("Gae Bolg Alternative3","9");
        noble.put("Gae Bolg Alternative4","9");
        noble.put("Gae Bolg Alternative5","Quick");

        noble.put("Gae Dearg & Gae Buidhe0","9");
        noble.put("Gae Dearg & Gae Buidhe0u","17");
        noble.put("Gae Dearg & Gae Buidhe1","9");
        noble.put("Gae Dearg & Gae Buidhe2","9");
        noble.put("Gae Dearg & Gae Buidhe3","9");
        noble.put("Gae Dearg & Gae Buidhe4","9");
        noble.put("Gae Dearg & Gae Buidhe5","Quick");

        noble.put("Caladbolg0","1");
        noble.put("Caladbolg0u","2");
        noble.put("Caladbolg1","9");
        noble.put("Caladbolg2","True");
        noble.put("Caladbolg3","9");
        noble.put("Caladbolg4","Defense Down");
        noble.put("Caladbolg5","Buster");
        noble.put("Caladbolg8","32");

        noble.put("Nursery Rhyme0","6");
        noble.put("Nursery Rhyme0u","7");
        noble.put("Nursery Rhyme1","9");
        noble.put("Nursery Rhyme2","True");
        noble.put("Nursery Rhyme3","9");
        noble.put("Nursery Rhyme4","Defense Down");
        noble.put("Nursery Rhyme5","Arts");
        noble.put("Nursery Rhyme8","32");

        noble.put("Maria the Ripper0","9");
        noble.put("Maria the Ripper0u","19");
        noble.put("Maria the Ripper1","True");
        noble.put("Maria the Ripper2","9");
        //noble.put("Maria the Ripper3","Special Attack");
        noble.put("Maria the Ripper3","Ignores Defense");
        noble.put("Maria the Ripper4","9");
        noble.put("Maria the Ripper5","Quick");
        noble.put("Maria the Ripper6","PowerMod");
        noble.put("Maria the Ripper7","36");

        noble.put("Clarent Blood Arthur0","1");
        noble.put("Clarent Blood Arthur0u","2");
        noble.put("Clarent Blood Arthur1","True");
        noble.put("Clarent Blood Arthur2","9");
        noble.put("Clarent Blood Arthur3","Special Attack");
        noble.put("Clarent Blood Arthur4","9");
        noble.put("Clarent Blood Arthur5","Buster");
        noble.put("Clarent Blood Arthur6","Arthur");
        noble.put("Clarent Blood Arthur7","37");

        noble.put("System Keraunos0","1");
        noble.put("System Keraunos0u","2");
        noble.put("System Keraunos1","True");
        noble.put("System Keraunos2","1");
        noble.put("System Keraunos3","Special Attack");
        noble.put("System Keraunos4","1");
        noble.put("System Keraunos5","Buster");
        noble.put("System Keraunos6","Sky/Earth");
        noble.put("System Keraunos7","22");

        noble.put("Rhongomyniad0","1");
        noble.put("Rhongomyniad0u","2");
        noble.put("Rhongomyniad1","1");
        noble.put("Rhongomyniad2","1");
        noble.put("Rhongomyniad3","1");
        noble.put("Rhongomyniad4","1");
        noble.put("Rhongomyniad5","Buster");

        noble.put("Sword of Paracelsus0","1");
        noble.put("Sword of Paracelsus0u","2");
        noble.put("Sword of Paracelsus1","1");
        noble.put("Sword of Paracelsus2","1");
        noble.put("Sword of Paracelsus3","1");
        noble.put("Sword of Paracelsus4","1");
        noble.put("Sword of Paracelsus5","Arts");

        noble.put("Dimension of Steam0","1");
        noble.put("Dimension of Steam0u","2");
        noble.put("Dimension of Steam1","1");
        noble.put("Dimension of Steam2","True");
        noble.put("Dimension of Steam3","1");
        noble.put("Dimension of Steam4","Defense Down");
        noble.put("Dimension of Steam5","Buster");
        noble.put("Dimension of Steam8","38");

        noble.put("Dangerous Game0","0");
        noble.put("Dangerous Game1","1");
        noble.put("Dangerous Game2","True");
        noble.put("Dangerous Game3","1");
        noble.put("Dangerous Game4","BusterUp");
        noble.put("Dangerous Game5","Buster");
        noble.put("Dangerous Game8","39");
        noble.put("Dangerous Game2u","True");
        noble.put("Dangerous Game4u","BusterUp");
        noble.put("Dangerous Game8u","40");

        noble.put("Blasted Tree0","20");
        noble.put("Blasted Tree0u","21");
        noble.put("Blasted Tree1","0");
        noble.put("Blasted Tree2","0");
        noble.put("Blasted Tree3","0");
        noble.put("Blasted Tree4","0");
        noble.put("Blasted Tree5","Quick");

        noble.put("Pashupata0","1");
        noble.put("Pashupata0u","2");
        noble.put("Pashupata1","0");
        noble.put("Pashupata2","True");
        noble.put("Pashupata3","0");
        noble.put("Pashupata4","Defense Down");
        noble.put("Pashupata5","Buster");
        noble.put("Pashupata8","24");

        noble.put("Vasavi Shakti0","1");
        noble.put("Vasavi Shakti0u","2");
        noble.put("Vasavi Shakti1","True");
        noble.put("Vasavi Shakti2","false");
        noble.put("Vasavi Shakti3","Special Attack");
        noble.put("Vasavi Shakti4","000");
        noble.put("Vasavi Shakti5","Buster");
        noble.put("Vasavi Shakti6","Divine");
        noble.put("Vasavi Shakti7","22");
        noble.put("Vasavi Shakti2u","True");
        noble.put("Vasavi Shakti4u","Buster Def Down");
        noble.put("Vasavi Shakti8u","32");

        noble.put("Secret Calibur0","9");
        noble.put("Secret Calibur0u","17");
        noble.put("Secret Calibur1","True");
        noble.put("Secret Calibur2","0");
        noble.put("Secret Calibur3","Special Attack");
        noble.put("Secret Calibur4","0");
        noble.put("Secret Calibur5","Quick");
        noble.put("Secret Calibur6","Saber Face");
        noble.put("Secret Calibur7","22");

        noble.put("Mac an Luin0","6");
        noble.put("Mac an Luin0u","7");
        noble.put("Mac an Luin1","0");
        noble.put("Mac an Luin2","0");
        noble.put("Mac an Luin3","0");
        noble.put("Mac an Luin4","0");
        noble.put("Mac an Luin5","Arts");

        noble.put("Brynhild Romantia0","11");
        noble.put("Brynhild Romantia0u","12");
        noble.put("Brynhild Romantia1","True");
        noble.put("Brynhild Romantia2","0");
        noble.put("Brynhild Romantia3","Special Attack");
        noble.put("Brynhild Romantia4","0");
        noble.put("Brynhild Romantia5","Buster");
        noble.put("Brynhild Romantia6","Beloved");
        noble.put("Brynhild Romantia7","22");

        noble.put("Grendel Buster0","11");
        noble.put("Grendel Buster0u","20");
        noble.put("Grendel Buster1","0");
        noble.put("Grendel Buster2","0");
        noble.put("Grendel Buster3","0");
        noble.put("Grendel Buster4","0");
        noble.put("Grendel Buster5","Buster");

        noble.put("Fax Caelestis0","10");
        noble.put("Fax Caelestis0u","18");
        noble.put("Fax Caelestis1","fff");
        noble.put("Fax Caelestis2","True");
        noble.put("Fax Caelestis3","fff");
        noble.put("Fax Caelestis4","Defense Down");
        noble.put("Fax Caelestis5","Arts");
        noble.put("Fax Caelestis8","24");

        noble.put("Mukushiki - Kara no Kyoukai0","6");
        noble.put("Mukushiki - Kara no Kyoukai1","True");
        noble.put("Mukushiki - Kara no Kyoukai2","0");
        noble.put("Mukushiki - Kara no Kyoukai3","Ignores Defense");
        noble.put("Mukushiki - Kara no Kyoukai4","0");
        noble.put("Mukushiki - Kara no Kyoukai5","Buster");

        noble.put("Yuishiki - Chokushi no Magan0","10");
        noble.put("Yuishiki - Chokushi no Magan1","True");
        noble.put("Yuishiki - Chokushi no Magan2","0");
        noble.put("Yuishiki - Chokushi no Magan3","Ignores Defense");
        noble.put("Yuishiki - Chokushi no Magan4","0");
        noble.put("Yuishiki - Chokushi no Magan5","Arts");

        noble.put("Twin Arm - Big Crunch0","1");
        noble.put("Twin Arm - Big Crunch0u","2");
        noble.put("Twin Arm - Big Crunch1","0");
        noble.put("Twin Arm - Big Crunch2","0");
        noble.put("Twin Arm - Big Crunch3","0");
        noble.put("Twin Arm - Big Crunch4","0");
        noble.put("Twin Arm - Big Crunch5","Buster");

        noble.put("Hippogriff0","11");
        noble.put("Hippogriff0u","12");
        noble.put("Hippogriff1","True");
        noble.put("Hippogriff2","0");
        noble.put("Hippogriff3","Ignores Defense");
        noble.put("Hippogriff4","0");
        noble.put("Hippogriff5","Quick");

        noble.put("Gate of Babylon0","1");
        noble.put("Gate of Babylon0u","2");
        noble.put("Gate of Babylon1","0");
        noble.put("Gate of Babylon2","0");
        noble.put("Gate of Babylon3","0");
        noble.put("Gate of Babylon4","0");
        noble.put("Gate of Babylon5","Buster");

        noble.put("Enfer Chateau d'If0","11");
        noble.put("Enfer Chateau d'If1","0");
        noble.put("Enfer Chateau d'If2","True");
        noble.put("Enfer Chateau d'If3","0");
        noble.put("Enfer Chateau d'If4","Defense Down");
        noble.put("Enfer Chateau d'If5","Quick");
        noble.put("Enfer Chateau d'If8","24");

        noble.put("Nightingale Pledge0","0");
        noble.put("Nightingale Pledge1","0");
        noble.put("Nightingale Pledge2","0");
        noble.put("Nightingale Pledge3","0");
        noble.put("Nightingale Pledge4","0");
        noble.put("Nightingale Pledge5","Arts");

        noble.put("Curruid Coinchenn0","11");
        noble.put("Curruid Coinchenn1","True");
        noble.put("Curruid Coinchenn2","0");
        noble.put("Curruid Coinchenn3","AtkUp");
        noble.put("Curruid Coinchenn4","0");
        noble.put("Curruid Coinchenn5","Buster");
        noble.put("Curruid Coinchenn7","41");

        noble.put("Chariot My Love0","11");
        noble.put("Chariot My Love0u","12");
        noble.put("Chariot My Love1","True");
        noble.put("Chariot My Love2","11");
        noble.put("Chariot My Love3","Special Attack");
        noble.put("Chariot My Love4","11");
        noble.put("Chariot My Love5","Buster");
        noble.put("Chariot My Love6","Male");
        noble.put("Chariot My Love7","22");

        noble.put("Sanat Kumara0","6");
        noble.put("Sanat Kumara0u","7");
        noble.put("Sanat Kumara1","11");
        noble.put("Sanat Kumara2","True");
        noble.put("Sanat Kumara3","11");
        noble.put("Sanat Kumara4","Defense Down");
        noble.put("Sanat Kumara5","Arts");
        noble.put("Sanat Kumara8","42");


        noble.put("Brahmastra0","11");
        noble.put("Brahmastra1","True");
        noble.put("Brahmastra2","6");
        noble.put("Brahmastra3","Special Attack");
        noble.put("Brahmastra4","6");
        noble.put("Brahmastra5","Buster");
        noble.put("Brahmastra6","Demonic");
        noble.put("Brahmastra7","22");

        noble.put("Shen Qiang Wu Er Da0","10");
        noble.put("Shen Qiang Wu Er Da1","True");
        noble.put("Shen Qiang Wu Er Da2","True");
        noble.put("Shen Qiang Wu Er Da3","Ignores Defense");
        noble.put("Shen Qiang Wu Er Da4","Defense Down");
        noble.put("Shen Qiang Wu Er Da5","Arts");
        noble.put("Shen Qiang Wu Er Da8","32");

        noble.put("World Faith Domination0","6");
        noble.put("World Faith Domination0u","7");
        noble.put("World Faith Domination1","6");
        noble.put("World Faith Domination2","6");
        noble.put("World Faith Domination3","6");
        noble.put("World Faith Domination4","6");
        noble.put("World Faith Domination5","Arts");

        noble.put("Tsago Degi Naleya0","5");
        noble.put("Tsago Degi Naleya0u","7");
        noble.put("Tsago Degi Naleya1","6");
        noble.put("Tsago Degi Naleya2","6");
        noble.put("Tsago Degi Naleya3","6");
        noble.put("Tsago Degi Naleya4","6");
        noble.put("Tsago Degi Naleya5","Arts");

        noble.put("Thunderer0","9");
        noble.put("Thunderer0u","17");
        noble.put("Thunderer1","6");
        noble.put("Thunderer2","6");
        noble.put("Thunderer3","6");
        noble.put("Thunderer4","6");
        noble.put("Thunderer5","Quick");

        noble.put("La Grondement Du Haine0","11");
        noble.put("La Grondement Du Haine1","6");
        noble.put("La Grondement Du Haine2","6");
        noble.put("La Grondement Du Haine3","6");
        noble.put("La Grondement Du Haine4","6");
        noble.put("La Grondement Du Haine5","Buster");

        //special case...fuck this guy btw he needs like 5 different hardcoded methods that cant be reused
        noble.put("Verg Avesta0","6");
        noble.put("Verg Avesta1","6");
        noble.put("Verg Avesta2","6");
        noble.put("Verg Avesta3","6");
        noble.put("Verg Avesta4","6");
        noble.put("Verg Avesta5","Quick");

        noble.put("Ionioi Hetairoi0","1");
        noble.put("Ionioi Hetairoi0u","2");
        noble.put("Ionioi Hetairoi1","fff");
        noble.put("Ionioi Hetairoi2","True");
        noble.put("Ionioi Hetairoi3","Dff");
        noble.put("Ionioi Hetairoi4","Defense Down");
        noble.put("Ionioi Hetairoi5","Buster");
        noble.put("Ionioi Hetairoi8","22");

        noble.put("Chronos Rose0","10");
        noble.put("Chronos Rose0u","18");
        noble.put("Chronos Rose1","aaa");
        noble.put("Chronos Rose2","6");
        noble.put("Chronos Rose3","aaa");
        noble.put("Chronos Rose4","6");
        noble.put("Chronos Rose5","Arts");
        noble.put("Chronos Rose1u","True");
        noble.put("Chronos Rose3u","Ignores Defense");

        noble.put("Zabaniya Hundred0","10");
        noble.put("Zabaniya Hundred0u","18");
        noble.put("Zabaniya Hundred1","10");
        noble.put("Zabaniya Hundred2","10");
        noble.put("Zabaniya Hundred3","10");
        noble.put("Zabaniya Hundred4","10");
        noble.put("Zabaniya Hundred5","Arts");
        noble.put("Zabaniya Hundred2u","True");
        noble.put("Zabaniya Hundred4u","Arts Def Down");
        noble.put("Zabaniya Hundred8u","32");

        noble.put("Song of Grail0","0");
        noble.put("Song of Grail1","10");
        noble.put("Song of Grail2","10");
        noble.put("Song of Grail3","10");
        noble.put("Song of Grail4","10");
        noble.put("Song of Grail5","Arts");

        noble.put("Senshi Bankou - Shinpen Kidoku0","6");
        noble.put("Senshi Bankou - Shinpen Kidoku1","10");
        noble.put("Senshi Bankou - Shinpen Kidoku2","True");
        noble.put("Senshi Bankou - Shinpen Kidoku3","10");
        noble.put("Senshi Bankou - Shinpen Kidoku4","Defense Down");
        noble.put("Senshi Bankou - Shinpen Kidoku5","Arts");
        noble.put("Senshi Bankou - Shinpen Kidoku8","43");

        noble.put("Five Elements Mountain Buddha Palm0","11");
        noble.put("Five Elements Mountain Buddha Palm0u","12");
        noble.put("Five Elements Mountain Buddha Palm1","6");
        noble.put("Five Elements Mountain Buddha Palm2","6");
        noble.put("Five Elements Mountain Buddha Palm3","6");
        noble.put("Five Elements Mountain Buddha Palm4","6");
        noble.put("Five Elements Mountain Buddha Palm5","Buster");

        noble.put("Vengeful Lightning of the Ox-King0","1");
        noble.put("Vengeful Lightning of the Ox-King1","6");
        noble.put("Vengeful Lightning of the Ox-King2","6");
        noble.put("Vengeful Lightning of the Ox-King3","6");
        noble.put("Vengeful Lightning of the Ox-King4","6");
        noble.put("Vengeful Lightning of the Ox-King5","Buster");

        noble.put("Golden Drive, Good Night0","9");
        noble.put("Golden Drive, Good Night1","True");
        noble.put("Golden Drive, Good Night2","6");
        noble.put("Golden Drive, Good Night3","QuickUp");
        noble.put("Golden Drive, Good Night4","6");
        noble.put("Golden Drive, Good Night5","Quick");
        noble.put("Golden Drive, Good Night7","44");

        noble.put("Great Grudge of Rashomon0","10");
        noble.put("Great Grudge of Rashomon1","9");
        noble.put("Great Grudge of Rashomon2","True");
        noble.put("Great Grudge of Rashomon3","9");
        noble.put("Great Grudge of Rashomon4","Defense Down");
        noble.put("Great Grudge of Rashomon5","Buster");
        noble.put("Great Grudge of Rashomon8","41");

        noble.put("Immortal Chaos Brigade0","11");
        noble.put("Immortal Chaos Brigade0u","12");
        noble.put("Immortal Chaos Brigade1","9");
        noble.put("Immortal Chaos Brigade2","9");
        noble.put("Immortal Chaos Brigade3","9");
        noble.put("Immortal Chaos Brigade4","9");
        noble.put("Immortal Chaos Brigade5","Quick");
        noble.put("Immortal Chaos Brigade2u","True");
        noble.put("Immortal Chaos Brigade4u","Defense Down");
        noble.put("Immortal Chaos Brigade8u","32");

        noble.put("Ramesseum Tentyris0","10");
        noble.put("Ramesseum Tentyris1","9");
        noble.put("Ramesseum Tentyris2","True");
        noble.put("Ramesseum Tentyris3","9");
        noble.put("Ramesseum Tentyris4","Defense Down");
        noble.put("Ramesseum Tentyris5","Buster");
        noble.put("Ramesseum Tentyris8","39");

        noble.put("Rhongomyniad0","1");
        noble.put("Rhongomyniad1","9");
        noble.put("Rhongomyniad2","9");
        noble.put("Rhongomyniad3","9");
        noble.put("Rhongomyniad4","9");
        noble.put("Rhongomyniad5","Buster");

        noble.put("Dark Mirror Treasury0","6");
        noble.put("Dark Mirror Treasury0u","7");
        noble.put("Dark Mirror Treasury1","9");
        noble.put("Dark Mirror Treasury2","9");
        noble.put("Dark Mirror Treasury3","9");
        noble.put("Dark Mirror Treasury4","9");
        noble.put("Dark Mirror Treasury5","Arts");

        noble.put("Arondight Overload0","10");
        noble.put("Arondight Overload1","True");
        noble.put("Arondight Overload2","True");
        noble.put("Arondight Overload3","ArtsUp");
        noble.put("Arondight Overload4","Dmg Rcvd Plus");
        noble.put("Arondight Overload5","Arts");
        noble.put("Arondight Overload7","26");
        noble.put("Arondight Overload8","45");

        noble.put("Failnaught0","9");
        noble.put("Failnaught0u","17");
        noble.put("Failnaught1","10");
        noble.put("Failnaught2","10");
        noble.put("Failnaught3","10");
        noble.put("Failnaught4","10");
        noble.put("Failnaught5","Quick");
        noble.put("Failnaught2u","True");
        noble.put("Failnaught4u","Ignores Defense");

        noble.put("Excalibur Galatine0","1");
        noble.put("Excalibur Galatine1","10");
        noble.put("Excalibur Galatine2","10");
        noble.put("Excalibur Galatine3","10");
        noble.put("Excalibur Galatine4","10");
        noble.put("Excalibur Galatine5","Buster");


        hougu = Collections.unmodifiableMap(noble);

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

    public static void activateNPeffect(String NPname, int level, int charge, int effNum){


    }
}