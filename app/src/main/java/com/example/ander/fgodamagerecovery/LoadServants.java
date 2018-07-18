package com.example.ander.fgodamagerecovery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Christian on 4/9/2018.
 */

public class LoadServants extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    int servantNumber, servantAttack, servant1c, servant2c;
    Spinner spinnerClass, spinnerServname;
    String thisServ, servantClass, servant1a, servant1b, servant2a, servant2b;
    EditText textBox;
    ArrayAdapter<String> classArray, nameArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.servant_select);
        Log.d("Test", "Does this work?");
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

        nameArray = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);

        spinnerServname.setAdapter(nameArray);
        TextView nextServant = (TextView) findViewById(R.id.serv_select);
        Button Next = (Button) findViewById(R.id.next);
        textBox = (EditText) findViewById(R.id.serv_atk);

        spinnerServname.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                thisServ = (String) parent.getItemAtPosition(position);

                //Servant enemy = new Servant(0, enemyServant, enemyClass);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        final Intent servantInfo = getIntent();
        //servantInfo.getExtras();
        final String enemy_1 = servantInfo.getStringExtra("enemy_1");
        final String enemy_2 = servantInfo.getStringExtra("enemy_2");
        //Log.d("servantName", s);
        Bundle servant = servantInfo.getExtras();
        if (servantInfo.hasExtra("serv_1a")) {
            servant1a = servantInfo.getStringExtra("serv_1a");
            servant1b = servantInfo.getStringExtra("serv_1b");
            servant1c = servantInfo.getIntExtra("serv_1c", -1);
            //Log.d("servantAttack", String.valueOf(servant1c));
        }
        if (servantInfo.hasExtra("serv_2a")) {
            servant2a = servantInfo.getStringExtra("serv_2a");
            servant2b = servantInfo.getStringExtra("serv_2b");
            servant2c = servantInfo.getIntExtra("serv_2c", -1);
            //Log.d("servantAttack", String.valueOf(servant2c));
        }
        //retrieve servant number
        if (servant != null) {
            servantNumber = (int) servant.get("servant");
        }

        //display servant number
        switch (servantNumber) {
            case 1:
                nextServant.setText("Servant 1");
                break;
            case 2:
                nextServant.setText("Servant 2");
                break;
            case 3:
                nextServant.setText("Servant 3");
                break;
            default:
                break;
        }

        final Intent loadNextServant = new Intent(this, LoadServants.class);
        final Intent display = new Intent(this, Confirm.class);


        //next button restarts activity for next servant
        //might have to readd previous info each time
        Next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //initial run, servants 1-3 empty
                switch (servantNumber) {
                    case 1:
                        try {
                            servantAttack = Integer.parseInt(textBox.getText().toString());
                        } catch (NumberFormatException exception) {
                            Toast.makeText(LoadServants.this, "Invalid Attack Value", Toast.LENGTH_LONG).show();
                            break;
                        }
                        if (servantAttack == 0) {
                            Toast.makeText(LoadServants.this, "Invalid Attack Value", Toast.LENGTH_LONG).show();
                            break;
                        }
                        loadNextServant.putExtra("servant", 2);
                        loadNextServant.putExtra("serv_1a", thisServ);
                        loadNextServant.putExtra("serv_1b", servantClass);
                        loadNextServant.putExtra("serv_1c", servantAttack);
                        loadNextServant.putExtra("enemy_1", enemy_1);
                        loadNextServant.putExtra("enemy_2", enemy_2);
                        startActivity(loadNextServant);
                        break;
                    case 2:
                        try {
                            servantAttack = Integer.parseInt(textBox.getText().toString());
                        } catch (NumberFormatException exception) {
                            Toast.makeText(LoadServants.this, "Invalid Attack Value", Toast.LENGTH_LONG).show();
                            break;
                        }
                        if (servantAttack == 0) {
                            Toast.makeText(LoadServants.this, "Invalid Attack Value", Toast.LENGTH_LONG).show();
                            break;
                        }

                        loadNextServant.putExtra("servant", 3);
                        loadNextServant.putExtra("serv_2a", thisServ);
                        loadNextServant.putExtra("serv_2b", servantClass);
                        loadNextServant.putExtra("serv_2c", servantAttack);
                        loadNextServant.putExtra("serv_1a", servant1a);
                        loadNextServant.putExtra("serv_1b", servant1b);
                        loadNextServant.putExtra("serv_1c", servant1c);
                        loadNextServant.putExtra("enemy_1", enemy_1);
                        loadNextServant.putExtra("enemy_2", enemy_2);
                        startActivity(loadNextServant);
                        break;
                    case 3:
                        try {
                            servantAttack = Integer.parseInt(textBox.getText().toString());
                        } catch (NumberFormatException exception) {
                            Toast.makeText(LoadServants.this, "Invalid Attack Value", Toast.LENGTH_LONG).show();
                            break;
                        }
                        if (servantAttack == 0) {
                            Toast.makeText(LoadServants.this, "Invalid Attack Value", Toast.LENGTH_LONG).show();
                            break;
                        }
                        Bundle passThis = new Bundle();
                        passThis.putString("serv_3a", thisServ);
                        passThis.putString("serv_3b", servantClass);
                        passThis.putInt("serv_3c", servantAttack);
                        passThis.putString("serv_1a", servant1a);
                        passThis.putString("serv_1b", servant1b);
                        passThis.putInt("serv_1c", servant1c);
                        passThis.putString("serv_2a", servant2a);
                        passThis.putString("serv_2b", servant2b);
                        passThis.putInt("serv_2c", servant2c);
                        passThis.putString("enemy_1", enemy_1);
                        passThis.putString("enemy_2", enemy_2);
                        passThis.putInt("serv_edit", 0);
                        display.putExtras(passThis);
                        startActivity(display);
                        break;
                    default:
                        //
                        break;
                }
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        int classSpinnerPosition = spinnerClass.getSelectedItemPosition();
        switch (classSpinnerPosition) {
            case 0:
                servantClass = "Saber";
                fillSaberNames();
                break;
            case 1:
                servantClass = "Archer";
                fillArcherNames();
                break;
            case 2:
                servantClass = "Lancer";
                fillLancerNames();
                break;
            case 3:
                servantClass = "Rider";
                fillRiderNames();
                break;
            case 4:
                servantClass = "Caster";
                fillCasterNames();
                break;
            case 5:
                servantClass = "Assassin";
                fillAssassinNames();
                break;
            case 6:
                servantClass = "Berserker";
                fillBerserkerNames();
                break;
            case 7:
                servantClass = "Shielder";
                fillShielderNames();
                break;
            case 8:
                servantClass = "Ruler";
                fillRulerNames();
                break;
            case 9:
                servantClass = "Avenger";
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

    public void loadServants(View view) {
        Intent loadServants = new Intent(this, LoadServants.class);
        loadServants.putExtra("servant", 1);
        startActivity(loadServants);
        //this.overridePendingTransition(0, 0);

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

//CHANGES
//deleted dupe code in bundle additions
//changed edit button to map to editservant1
//finished editservant1 for editing servants 1-3

//FIX
//confirm layout screen (servant 2 class not showing sometimes)
//editenemy overhaul

//everything after is actual damage calculations



