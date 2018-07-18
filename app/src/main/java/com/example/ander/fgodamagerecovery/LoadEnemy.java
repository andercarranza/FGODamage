package com.example.ander.fgodamagerecovery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.Toast;


/**
 * Created by Christian on 3/31/2018.
 */

public class LoadEnemy extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    Spinner spinnerClass, spinnerServname;
    ArrayAdapter<String> classArray, nameArray;
    String enemyClass, enemyServant;

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

        //final Intent servantInfo = new Intent(getApplicationContext(), LoadServants.class);


        spinnerServname.setAdapter(nameArray);
        spinnerServname.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
<<<<<<< HEAD
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                enemyServant = spinnerServname.getSelectedItem().toString();
                Log.d("Test", "Does this work?");
                Log.d("Servants Name", enemyServant);
=======
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
            enemyServant  = spinnerServname.getSelectedItem().toString();
            Log.d("Test", "Does this work?");
            Log.d("Servants Name", enemyServant);
>>>>>>> upstream/master
                Toast.makeText
                        (getApplicationContext(), "Selected : " + enemyServant, Toast.LENGTH_SHORT)
                        .show();
                //Servant enemy = new Servant(0, enemyServant, enemyClass);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
<<<<<<< HEAD
<<<<<<< HEAD

        final Intent loadServants = new Intent(this, LoadServants.class);

        Next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                loadServants.putExtra("servant", 1);
                loadServants.putExtra("enemy_1", enemyServant);
                loadServants.putExtra("enemy_2", enemyClass);
                startActivity(loadServants);
                //this.overridePendingTransition(0, 0);
            }

        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
=======
        Intent servantInfo = getIntent();
        final Bundle received = servantInfo.getExtras();
        final Intent passer = new Intent(this, Confirm.class);
        if(servantInfo.hasExtra("EnemyEdit")){
            Button bottom = (Button)findViewById(R.id.next);
            bottom.setText("Confirm");
            String name = received.getString("enemy_1");
            String enClass = received.getString("enemy_2");
            int classPos = classArray.getPosition(enClass);
            spinnerClass.setSelection(classPos);
            fillNameArray();
            Log.d("Passed Name", name);
            int namePos = nameArray.getPosition(name);
            int testPos = nameArray.getPosition("Arturia");
            Log.d("Int set for namePos", " " + namePos);
            //Log.d("Int set for testPos", " " + testPos);
            spinnerServname.setSelection(namePos);

            bottom.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v) {
                    received.putString("enemy_1", enemyServant);
                    received.putString("enemy_2", enemyClass);
                    passer.putExtras(received);
                    startActivity(passer);
                }
            });
        }
=======
>>>>>>> parent of 238f979... Edit Pages now functional for all servants
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
<<<<<<< HEAD
        fillNameArray();
       // Log.d("Servants Class", enemyClass);
        /*Toast.makeText
                (getApplicationContext(), "Selected : " + enemyClass, Toast.LENGTH_SHORT)
                .show();*/
        enemyServant = (String) spinnerServname.getItemAtPosition(0);

    }

    private void fillNameArray(){
>>>>>>> upstream/master
=======
>>>>>>> parent of 238f979... Edit Pages now functional for all servants
        int classSpinnerPosition = spinnerClass.getSelectedItemPosition();
        switch (classSpinnerPosition) {
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
<<<<<<< HEAD
<<<<<<< HEAD
        // Log.d("Servants Class", enemyClass);
        Toast.makeText
                (getApplicationContext(), "Selected : " + enemyClass, Toast.LENGTH_SHORT)
                .show();
=======
>>>>>>> upstream/master
=======
       // Log.d("Servants Class", enemyClass);
        Toast.makeText
                (getApplicationContext(), "Selected : " + enemyClass, Toast.LENGTH_SHORT)
                .show();
>>>>>>> parent of 238f979... Edit Pages now functional for all servants

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
        nameArray.add("Morded");
        nameArray.add("Shiki Void");
        nameArray.add("Rama");
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

        nameArray.notifyDataSetChanged();
    }

    private void fillAvengerNames() {
        nameArray.clear();
        nameArray.notifyDataSetChanged();
        nameArray.add("Edmond Dantes");
        nameArray.add("Jeanne d'Arc (Alter)");
        nameArray.add("Angry Manjew");


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
