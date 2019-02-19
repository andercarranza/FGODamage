
package com.fgoWork.ander.fgodamagerecovery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Button;

import com.fgoWork.ander.fgodamagerecovery.Objects.Party;
import com.fgoWork.ander.fgodamagerecovery.Objects.Servant;
import com.toptoche.searchablespinnerlibrary.SearchableSpinner;


/**
 * Created by Christian on 3/31/2018.
 */

public class LoadEnemy extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener{
    Spinner spinnerClass, spinnerServname, spinnerCustom;
    ArrayAdapter<String> classArray, nameArray, classArrayAlter;
    String enemyClass, enemyServant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enemy_select);


        Intent servantInfo = getIntent();
        Party unPack = servantInfo.getParcelableExtra("team");
        final Servant servant1 = unPack.getServant1();
        final Servant servant2 = unPack.getServant2();
        final Servant servant3 = unPack.getServant3();

        spinnerClass = (Spinner) findViewById(R.id.serv_class);
        spinnerClass.setOnItemSelectedListener(this);

        classArray = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        classArray.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerClass.setAdapter(classArray);

        classArray.add("Saber");
        classArray.add("Archer");
        classArray.add("Lancer");
        classArray.add("Rider");
        classArray.add("Caster");
        classArray.add("Assassin");
        classArray.add("Berserker");
        classArray.add("Shielder");
        classArray.add("Ruler");
        classArray.add("Avenger");
        classArray.add("All");
        classArray.setNotifyOnChange(true);

        spinnerClass.setSelection(0);

        spinnerCustom = (Spinner) findViewById(R.id.customClass);
        spinnerCustom.setOnItemSelectedListener(this);

        classArrayAlter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        classArrayAlter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerCustom.setAdapter(classArrayAlter);
        classArrayAlter.add("Saber");
        classArrayAlter.add("Archer");
        classArrayAlter.add("Lancer");
        classArrayAlter.add("Rider");
        classArrayAlter.add("Caster");
        classArrayAlter.add("Assassin");
        classArrayAlter.add("Berserker");
        classArrayAlter.add("Shielder");
        classArrayAlter.add("Ruler");
        classArrayAlter.add("Avenger");
        classArrayAlter.setNotifyOnChange(true);

        spinnerCustom.setSelection(0);



        spinnerCustom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                enemyClass = spinnerCustom.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerServname = (SearchableSpinner) findViewById(R.id.serv_name);
        spinnerServname.setOnItemSelectedListener(this);
        Button Next = (Button) findViewById(R.id.next);
        Button custom = (Button) findViewById(R.id.custom);

        nameArray = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);

        //final Intent servantInfo = new Intent(getApplicationContext(), LoadServants.class);



        spinnerServname.setAdapter(nameArray);
        spinnerServname.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
            enemyServant  = spinnerServname.getSelectedItem().toString();
                //Servant enemy = new Servant(0, enemyServant, enemyClass);

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        final Intent selectCards = new Intent(this, CardSelect.class);
        final Intent customDef = new Intent(this, CustomDEFENSE.class);

        Next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //selectCards.putExtra("servant", 1);
                Servant enemy = new Servant(-1, enemyServant, enemyClass,0,0,0, 0, 0);
                selectCards.putExtra("enemyObj", enemy);
                selectCards.putExtra("serv_1a", servant1);
                selectCards.putExtra("serv_2a", servant2);
                selectCards.putExtra("serv_3a", servant3);
                startActivity(selectCards);
                //this.overridePendingTransition(0, 0);
            }

        });

        custom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //selectCards.putExtra("servant", 1);
                Servant enemy = new Servant(-1, enemyServant, enemyClass,0,0,0, 0, 0);
                customDef.putExtra("enemyObj", enemy);
                customDef.putExtra("serv_1a", servant1);
                customDef.putExtra("serv_2a", servant2);
                customDef.putExtra("serv_3a", servant3);
                startActivity(customDef);
                //this.overridePendingTransition(0, 0);
            }

        });

    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
        fillNameArray();


        enemyServant = (String) spinnerServname.getItemAtPosition(0);

    }

    private void fillNameArray(){
        int classSpinnerPosition = spinnerClass.getSelectedItemPosition();
        switch(classSpinnerPosition){
            case 0:
                enemyClass = "Saber";
                fillSaberNames();
                spinnerCustom.setVisibility(View.INVISIBLE);
                break;
            case 1:
                enemyClass = "Archer";
                fillArcherNames();
                spinnerCustom.setVisibility(View.INVISIBLE);
                break;
            case 2:
                enemyClass = "Lancer";
                fillLancerNames();
                spinnerCustom.setVisibility(View.INVISIBLE);
                break;
            case 3:
                enemyClass = "Rider";
                fillRiderNames();
                spinnerCustom.setVisibility(View.INVISIBLE);
                break;
            case 4:
                enemyClass = "Caster";
                fillCasterNames();
                spinnerCustom.setVisibility(View.INVISIBLE);
                break;
            case 5:
                enemyClass = "Assassin";
                fillAssassinNames();
                spinnerCustom.setVisibility(View.INVISIBLE);
                break;
            case 6:
                enemyClass = "Berserker";
                fillBerserkerNames();
                spinnerCustom.setVisibility(View.INVISIBLE);
                break;
            case 7:
                enemyClass = "Shielder";
                fillShielderNames();
                spinnerCustom.setVisibility(View.INVISIBLE);
                break;
            case 8:
                enemyClass = "Ruler";
                fillRulerNames();
                spinnerCustom.setVisibility(View.INVISIBLE);
                break;
            case 9:
                enemyClass = "Avenger";
                fillAvengerNames();
                spinnerCustom.setVisibility(View.INVISIBLE);
                break;
            case 10:
                enemyClass = "All";
                spinnerCustom.setVisibility(View.VISIBLE);
                fillAllNames();
                break;
        }

    }



    private void fillArcherNames(){
        nameArray.clear();
        nameArray.notifyDataSetChanged();
        nameArray.add("Emiya");
        nameArray.add("Gilgamesh");
        nameArray.add("Robin Hood");
        nameArray.add("Atlante");
        nameArray.add("Euryale");
        nameArray.add("Arash");
        nameArray.add("David");
        nameArray.add("Oda Nobunaga");
        nameArray.add("Orion");
        nameArray.add("Nikola Tesla");
        nameArray.add("Arjuna");
        nameArray.add("Gilgamesh (Child)");
        nameArray.add("Billy The Kid");
        nameArray.add("Tristan");
        nameArray.add("Tawara Touta");
        nameArray.add("Archuria");
        nameArray.add("Summer Anne & Mary");
        nameArray.add("Kuro");
        nameArray.add("Ishtar");
        nameArray.add("Moriarty");
        nameArray.add("Emiya Alter");
        nameArray.notifyDataSetChanged();
    }
    private void fillSaberNames(){
        nameArray.clear();
        nameArray.notifyDataSetChanged();
        nameArray.add("Arturia");
        nameArray.add("Arturia Alter");
        nameArray.add("Arturia Lily");
        nameArray.add("Nero");
        nameArray.add("Seigfried");
        nameArray.add("Caesar");
        nameArray.add("Altera");
        nameArray.add("Gilles Saber");
        nameArray.add("Chevalier d'Eon");
        nameArray.add("Okita Souji");
        nameArray.add("Fergus");
        nameArray.add("Nero Bride");
        nameArray.add("Mordred");
        nameArray.add("Shiki Void");
        nameArray.add("Rama");
        nameArray.add("Lancelot (Saber)");
        nameArray.add("Gawain");
        nameArray.add("Bedivere");
        nameArray.add("Brave Liz");
        nameArray.add("Musashi");
        nameArray.add("Arthur Pendragon");
        nameArray.notifyDataSetChanged();
    }

    private void fillLancerNames(){
        nameArray.clear();
        nameArray.notifyDataSetChanged();
        nameArray.add("Cu Chulainn");
        nameArray.add("Liz");
        nameArray.add("Benkei");
        nameArray.add("Cu Chulainn (Prototype)");
        nameArray.add("Leonidas");
        nameArray.add("Romulus");
        nameArray.add("Hektor");
        nameArray.add("Scathach");
        nameArray.add("Diarmud Ua Duibhne");
        nameArray.add("Arturia Alter (Lancer)");
        nameArray.add("Fionn mac Cumhaill");
        nameArray.add("Brynhild");
        nameArray.add("Li Shuwen");
        nameArray.add("Arturia (Lancer)");
        nameArray.add("Summer Tamamo");
        nameArray.add("Summer Kiyohime");
        nameArray.add("Vlad (Extra)");
        nameArray.add("Santa Jeanne Alter");
        nameArray.add("Enkidu");
        nameArray.add("Medusa (Lancer)");
        nameArray.add("Jaguar Warrior");
        nameArray.notifyDataSetChanged();
    }

    private void fillRiderNames(){
        nameArray.clear();
        nameArray.notifyDataSetChanged();
        nameArray.add("Medusa");
        nameArray.add("Georgios");
        nameArray.add("Edward Teach");
        nameArray.add("Boudica");
        nameArray.add("Ushiwakamaru");
        nameArray.add("Alexander");
        nameArray.add("Marie Antoinette");
        nameArray.add("Martha");
        nameArray.add("Francis Drake");
        nameArray.add("Anne Bonny & Mary Read");
        nameArray.add("Arturia Alter (Santa)");
        nameArray.add("Astolfo");
        nameArray.add("Queen Medb");
        nameArray.add("Iskandar");
        nameArray.add("Kintoki Rider");
        nameArray.add("Ozymandias");
        nameArray.add("Summer Mordred");
        nameArray.add("Quetzalcoatl");

        nameArray.notifyDataSetChanged();
    }

    private void fillCasterNames(){
        nameArray.clear();
        nameArray.notifyDataSetChanged();
        nameArray.add("Medea");
        nameArray.add("Gilles de Rais");
        nameArray.add("Hans Christian Andersen");
        nameArray.add("William Shakespeare");
        nameArray.add("Mephistopheles");
        nameArray.add("Wolfgang Amadeus Mozart");
        nameArray.add("Zhuge Liang");
        nameArray.add("Cu Chulainn (Caster)");
        nameArray.add("Liz (Halloween)");
        nameArray.add("Tamamo");
        nameArray.add("Medea (Lily)");
        nameArray.add("Nursery Rhyme");
        nameArray.add("Paracelsus");
        nameArray.add("Charles Babbage");
        nameArray.add("Helena Blavatsky");
        nameArray.add("Thomas Edison");
        nameArray.add("Geronimo");
        nameArray.add("Irisviel");
        nameArray.add("Xuanzang Sanzang");
        nameArray.add("Nitocris");
        nameArray.add("Leonardo da Vinci");
        nameArray.add("Summer Marie");
        nameArray.add("Illyasviel");
        nameArray.add("Gilgamesh (Caster)");
        nameArray.add("Merlin");

        nameArray.notifyDataSetChanged();
    }

    private void fillAssassinNames(){
        nameArray.clear();
        nameArray.notifyDataSetChanged();
        nameArray.add("Sasaki Kojirou");
        nameArray.add("Hassan of the Cursed Arm");
        nameArray.add("Stheno");
        nameArray.add("Jing Ke");
        nameArray.add("Charles-Henri Sanson");
        nameArray.add("Phantom of the Opera");
        nameArray.add("Mata Hari");
        nameArray.add("Carmilla");
        nameArray.add("Jack the Ripper");
        nameArray.add("Henry Jekyll & Hyde");
        nameArray.add("Mysterious Heroine X");
        nameArray.add("Shiki");
        nameArray.add("Emiya (Assassin)");
        nameArray.add("Hassan Hundred Persona");
        nameArray.add("Shuten-Douji");
        nameArray.add("Fuuma Koutarou");
        nameArray.add("Hassan Serenity");
        nameArray.add("Summer Scathach");
        nameArray.add("Cleopatra");
        nameArray.add("First Hassan");
        nameArray.add("Shinjuku Assassin");

        nameArray.notifyDataSetChanged();
    }

    private void fillBerserkerNames(){
        nameArray.clear();
        nameArray.notifyDataSetChanged();
        nameArray.add("Heracles");
        nameArray.add("Lancelot");
        nameArray.add("Lu Bu Fengxian");
        nameArray.add("Spartacus");
        nameArray.add("Sakata Kintoki");
        nameArray.add("Vlad III");
        nameArray.add("Asterios");
        nameArray.add("Caligula");
        nameArray.add("Darius III");
        nameArray.add("Kiyohime");
        nameArray.add("Eric Bloodaxe");
        nameArray.add("Tamamo Cat");
        nameArray.add("Frankenstein");
        nameArray.add("Beowulf");
        nameArray.add("Nightingale");
        nameArray.add("Cu Chulainn (Alter)");
        nameArray.add("Raikou");
        nameArray.add("Ibaraki-Douji");
        nameArray.add("MHX Alter");
        nameArray.add("Hijikata Toshizo");
        nameArray.add("Chacha");

        nameArray.notifyDataSetChanged();
    }

    private void fillShielderNames(){
        nameArray.clear();
        nameArray.notifyDataSetChanged();
        nameArray.add("Mash");


        nameArray.notifyDataSetChanged();
    }

    private void fillRulerNames(){
        nameArray.clear();
        nameArray.notifyDataSetChanged();
        nameArray.add("Jeanne d'Arc");
        nameArray.add("Amakusa Shirou");
        nameArray.add("Martha");
        nameArray.add("Sherlock Holmes");
        nameArray.add("Summer Martha");

        nameArray.notifyDataSetChanged();
    }

    private void fillAvengerNames(){
        nameArray.clear();
        nameArray.notifyDataSetChanged();
        nameArray.add("Edmond Dantes");
        nameArray.add("Jeanne d'Arc (Alter)");
        nameArray.add("Angra Mainyu");
        nameArray.add("Gorgon");
        nameArray.add("Shinjuku Avenger");

        nameArray.notifyDataSetChanged();
    }

    private void fillAllNames() {
        nameArray.clear();
        nameArray.notifyDataSetChanged();
        nameArray.add("Hand");
        nameArray.add("Door");
        nameArray.add("Skeleton");
        nameArray.add("Dragon Tooth Warrior");
        nameArray.add("Soldier/Zombie/Pirate");
        nameArray.add("Amazoness");
        nameArray.add("Ghost");
        nameArray.add("Wyvern");
        nameArray.add("Dragon");
        nameArray.add("Werewolf");
        nameArray.add("Werejaguar");
        nameArray.add("Goblin");
        nameArray.add("Centaur");
        nameArray.add("Chimera");
        nameArray.add("Lamia/Naga");
        nameArray.add("Daemon");
        nameArray.add("Demon Pillars");
        nameArray.add("Homunculus");
        nameArray.add("Golem");
        nameArray.add("Automata/Doll/Gear");
        nameArray.add("Helter Skelter");
        nameArray.add("Mechanized Infantry");
        nameArray.add("Book");
        nameArray.add("Soul Eater");
        nameArray.add("Gazer/Spotter");
        nameArray.add("Bicorn");
        nameArray.add("Spriggan");
        nameArray.add("Oni/Kazekoshimaru/Gikuimaru/Gourikimaru");
        nameArray.add("Hassan Variants");
        nameArray.add("Knight Enforcer");
        nameArray.add("Sphinx");
        nameArray.add("Malika Sphinx");
        nameArray.add("Ifreeta");
        nameArray.add("Mindless");
        nameArray.add("Blade-Wing");
        nameArray.add("Sea Devil");
        nameArray.add("Automatic Defense System");
        nameArray.add("Crabs");
        nameArray.add("Boar");


        nameArray.add("Emiya");
        nameArray.add("Gilgamesh");
        nameArray.add("Robin Hood");
        nameArray.add("Atlante");
        nameArray.add("Euryale");
        nameArray.add("Arash");
        nameArray.add("David");
        nameArray.add("Oda Nobunaga");
        nameArray.add("Orion");
        nameArray.add("Nikola Tesla");
        nameArray.add("Arjuna");
        nameArray.add("Gilgamesh (Child)");
        nameArray.add("Billy The Kid");
        nameArray.add("Tristan");
        nameArray.add("Tawara Touta");
        nameArray.add("Archuria");
        nameArray.add("Summer Anne & Mary");
        nameArray.add("Kuro");
        nameArray.add("Ishtar");
        nameArray.add("Moriarty");
        nameArray.add("Emiya Alter");


        nameArray.add("Arturia");
        nameArray.add("Arturia Alter");
        nameArray.add("Arturia Lily");
        nameArray.add("Nero");
        nameArray.add("Seigfried");
        nameArray.add("Caesar");
        nameArray.add("Altera");
        nameArray.add("Gilles Saber");
        nameArray.add("Chevalier d'Eon");
        nameArray.add("Okita Souji");
        nameArray.add("Fergus");
        nameArray.add("Nero Bride");
        nameArray.add("Mordred");
        nameArray.add("Shiki Void");
        nameArray.add("Rama");
        nameArray.add("Lancelot (Saber)");
        nameArray.add("Gawain");
        nameArray.add("Bedivere");
        nameArray.add("Brave Liz");
        nameArray.add("Musashi");
        nameArray.add("Arthur Pendragon");


        nameArray.add("Cu Chulainn");
        nameArray.add("Liz");
        nameArray.add("Benkei");
        nameArray.add("Cu Chulainn (Prototype)");
        nameArray.add("Leonidas");
        nameArray.add("Romulus");
        nameArray.add("Hektor");
        nameArray.add("Scathach");
        nameArray.add("Diarmud Ua Duibhne");
        nameArray.add("Arturia Alter (Lancer)");
        nameArray.add("Fionn mac Cumhaill");
        nameArray.add("Brynhild");
        nameArray.add("Li Shuwen");
        nameArray.add("Arturia (Lancer)");
        nameArray.add("Summer Tamamo");
        nameArray.add("Summer Kiyohime");
        nameArray.add("Vlad (Extra)");
        nameArray.add("Santa Jeanne Alter");
        nameArray.add("Enkidu");
        nameArray.add("Medusa (Lancer)");
        nameArray.add("Jaguar Warrior");


        nameArray.add("Medusa");
        nameArray.add("Georgios");
        nameArray.add("Edward Teach");
        nameArray.add("Boudica");
        nameArray.add("Ushiwakamaru");
        nameArray.add("Alexander");
        nameArray.add("Marie Antoinette");
        nameArray.add("Martha");
        nameArray.add("Francis Drake");
        nameArray.add("Anne Bonny & Mary Read");
        nameArray.add("Arturia Alter (Santa)");
        nameArray.add("Astolfo");
        nameArray.add("Queen Medb");
        nameArray.add("Iskandar");
        nameArray.add("Kintoki Rider");
        nameArray.add("Ozymandias");
        nameArray.add("Summer Mordred");
        nameArray.add("Quetzalcoatl");


        nameArray.add("Medea");
        nameArray.add("Gilles de Rais");
        nameArray.add("Hans Christian Andersen");
        nameArray.add("William Shakespeare");
        nameArray.add("Mephistopheles");
        nameArray.add("Wolfgang Amadeus Mozart");
        nameArray.add("Zhuge Liang");
        nameArray.add("Cu Chulainn (Caster)");
        nameArray.add("Liz (Halloween)");
        nameArray.add("Tamamo");
        nameArray.add("Medea (Lily)");
        nameArray.add("Nursery Rhyme");
        nameArray.add("Paracelsus");
        nameArray.add("Charles Babbage");
        nameArray.add("Helena Blavatsky");
        nameArray.add("Thomas Edison");
        nameArray.add("Geronimo");
        nameArray.add("Irisviel");
        nameArray.add("Xuanzang Sanzang");
        nameArray.add("Nitocris");
        nameArray.add("Leonardo da Vinci");
        nameArray.add("Summer Marie");
        nameArray.add("Illyasviel");
        nameArray.add("Gilgamesh (Caster)");
        nameArray.add("Merlin");


        nameArray.add("Sasaki Kojirou");
        nameArray.add("Hassan of the Cursed Arm");
        nameArray.add("Stheno");
        nameArray.add("Jing Ke");
        nameArray.add("Charles-Henri Sanson");
        nameArray.add("Phantom of the Opera");
        nameArray.add("Mata Hari");
        nameArray.add("Carmilla");
        nameArray.add("Jack the Ripper");
        nameArray.add("Henry Jekyll & Hyde");
        nameArray.add("Mysterious Heroine X");
        nameArray.add("Shiki");
        nameArray.add("Emiya (Assassin)");
        nameArray.add("Hassan Hundred Persona");
        nameArray.add("Shuten-Douji");
        nameArray.add("Fuuma Koutarou");
        nameArray.add("Hassan Serenity");
        nameArray.add("Summer Scathach");
        nameArray.add("Cleopatra");
        nameArray.add("First Hassan");
        nameArray.add("Shinjuku Assassin");


        nameArray.add("Heracles");
        nameArray.add("Lancelot");
        nameArray.add("Lu Bu Fengxian");
        nameArray.add("Spartacus");
        nameArray.add("Sakata Kintoki");
        nameArray.add("Vlad III");
        nameArray.add("Asterios");
        nameArray.add("Caligula");
        nameArray.add("Darius III");
        nameArray.add("Kiyohime");
        nameArray.add("Eric Bloodaxe");
        nameArray.add("Tamamo Cat");
        nameArray.add("Frankenstein");
        nameArray.add("Beowulf");
        nameArray.add("Nightingale");
        nameArray.add("Cu Chulainn (Alter)");
        nameArray.add("Raikou");
        nameArray.add("Ibaraki-Douji");
        nameArray.add("MHX Alter");
        nameArray.add("Hijikata Toshizo");
        nameArray.add("Chacha");


        nameArray.add("Mash");


        nameArray.add("Jeanne d'Arc");
        nameArray.add("Amakusa Shirou");
        nameArray.add("Martha");
        nameArray.add("Sherlock Holmes");
        nameArray.add("Summer Martha");


        nameArray.add("Edmond Dantes");
        nameArray.add("Jeanne d'Arc (Alter)");
        nameArray.add("Angra Mainyu");
        nameArray.add("Gorgon");
        nameArray.add("Shinjuku Avenger");

        nameArray.notifyDataSetChanged();
    }



    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {
    }
}
