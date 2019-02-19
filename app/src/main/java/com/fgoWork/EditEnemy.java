
package com.fgoWork.ander.fgodamagerecovery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.Toast;

public class EditEnemy extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    Spinner spinnerClass, spinnerServname;
    ArrayAdapter<String> classArray, nameArray;
    String enemyClass, enemyServant;
    int servantAttack, servant1c, servant2c, servant3c;
    String thisServ, servantClass, servant1a, servant1b, servant2a, servant2b, servant3a, servant3b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enemy_select);

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
        classArray.setNotifyOnChange(true);

        spinnerClass.setSelection(0);

        spinnerServname = (Spinner) findViewById(R.id.serv_name);
        spinnerServname.setOnItemSelectedListener(this);
        Button Next = (Button) findViewById(R.id.next);


        nameArray = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);

        //use getPosition for the ArrayAdapters

        Intent servantInfo = new Intent();

        Bundle received = servantInfo.getExtras();

        spinnerServname.setAdapter(nameArray);
        spinnerServname.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                enemyServant = spinnerServname.getSelectedItem().toString();

                //Servant enemy = new Servant(0, enemyServant, enemyClass);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });








        final Intent enemyToEdit = getIntent();
        final Intent display = new Intent(this, Confirm.class);

        //send bundle with edited servant back to confirm
        Next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //servantInfo.getExtras();
//                final String enemy_1 = enemyToEdit.getStringExtra("enemy_1");
//                final String enemy_2 = enemyToEdit.getStringExtra("enemy_2");
                //Log.d("servantName", s);
                Bundle servant = enemyToEdit.getExtras();
                servant1a = enemyToEdit.getStringExtra("serv_1a");
                servant1b = enemyToEdit.getStringExtra("serv_1b");
                servant1c = enemyToEdit.getIntExtra("serv_1c", -1);
                //Log.d("servantAttack", String.valueOf(servant1c));
                servant2a = enemyToEdit.getStringExtra("serv_2a");
                servant2b = enemyToEdit.getStringExtra("serv_2b");
                servant2c = enemyToEdit.getIntExtra("serv_2c", -1);
                //Log.d("servantAttack", String.valueOf(servant2c));
                servant3a = enemyToEdit.getStringExtra("serv_3a");
                servant3b = enemyToEdit.getStringExtra("serv_3b");
                servant3c = enemyToEdit.getIntExtra("serv_3c", -1);


                Bundle passThis = new Bundle();
                //add modified enemy
                passThis.putString("enemy_1", enemyServant);
                passThis.putString("enemy_2", enemyClass);
                //this.overridePendingTransition(0, 0);

                //pass the same servant info
                passThis.putString("serv_1a", servant1a);
                passThis.putString("serv_1b", servant1b);
                passThis.putInt("serv_1c", servant1c);
                passThis.putString("serv_3a", servant3a);
                passThis.putString("serv_3b", servant3b);
                passThis.putInt("serv_3c", servant3c);
                passThis.putString("serv_2a", servant2a);
                passThis.putString("serv_2b", servant2b);
                passThis.putInt("serv_2c", servant2c);
                passThis.putInt("serv_edit", 0);
                display.putExtras(passThis);
                startActivity(display);
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
                break;
            case 1:
                enemyClass = "Archer";
                fillArcherNames();
                break;
            case 2:
                enemyClass = "Lancer";
                fillLancerNames();
                break;
            case 3:
                enemyClass = "Rider";
                fillRiderNames();
                break;
            case 4:
                enemyClass = "Caster";
                fillCasterNames();
                break;
            case 5:
                enemyClass = "Assassin";
                fillAssassinNames();
                break;
            case 6:
                enemyClass = "Berserker";
                fillBerserkerNames();
                break;
            case 7:
                enemyClass = "Shielder";
                fillShielderNames();
                break;
            case 8:
                enemyClass = "Ruler";
                fillRulerNames();
                break;
            case 9:
                enemyClass = "Avenger";
                fillAvengerNames();
                break;
        }

    }

    private void fillArcherNames() {
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

    private void fillSaberNames() {
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

    private void fillLancerNames() {
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

    private void fillRiderNames() {
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

    private void fillCasterNames() {
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

    private void fillAssassinNames() {
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

    private void fillBerserkerNames() {
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

    private void fillShielderNames() {
        nameArray.clear();
        nameArray.notifyDataSetChanged();
        nameArray.add("Mash");


        nameArray.notifyDataSetChanged();
    }

    private void fillRulerNames() {
        nameArray.clear();
        nameArray.notifyDataSetChanged();
        nameArray.add("Jeanne d'Arc");
        nameArray.add("Amakusa Shirou");
        nameArray.add("Martha");
        nameArray.add("Sherlock Holmes");
        nameArray.add("Summer Martha");

        nameArray.notifyDataSetChanged();
    }

    private void fillAvengerNames() {
        nameArray.clear();
        nameArray.notifyDataSetChanged();
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
        Toast.makeText(this, "Selected Country :" + spinnerClass.getSelectedItem().toString() +
                "\nSelected Division :" + spinnerClass.getSelectedItem().toString() +
                "\nSelected District :" + spinnerClass.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
    }

}
