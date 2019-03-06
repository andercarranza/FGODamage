
package com.fgoWork;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.fgoWork.Objects.Party;
import com.fgoWork.Objects.Servant;

import static com.fgoWork.Objects.FGODamage.servantsMap;
import static com.fgoWork.Objects.FGODamage.upgradelist;

//servantnumber not needed

public class EditServant1 extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener{
    int servantNumber, servantAttack, servant1c, servant2c, servant3c, skill1, skill2, skill3, upgradeInt, NPlvl;;
    Spinner spinnerClass, spinnerServname, spinnerNPlvl;
    String thisServ, servantClass, servant1a, servant1b, servant2a, servant2b, servant3a, servant3b;
    Servant servant1, servant2, servant3;
    EditText textBox;
    ArrayAdapter<String> classArray, nameArray, oneThruFive, oneThruTen;
    Spinner skill1LVL, skill2LVL, skill3LVL;
    TextView NPname;
    CheckBox NPupgrade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.servant_select);
        spinnerClass = (Spinner) findViewById(R.id.serv_class);
        spinnerClass.setOnItemSelectedListener(this);

        final Intent servantInfo = getIntent();
        servant1 = servantInfo.getParcelableExtra("serv_1a");
        servant2 = servantInfo.getParcelableExtra("serv_2a");
        servant3 = servantInfo.getParcelableExtra("serv_3a");

        classArray = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        classArray.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        NPupgrade = (CheckBox) findViewById(R.id.checkBox1);
        skill1LVL = (Spinner) findViewById(R.id.skill1Spinner);
        skill2LVL = (Spinner) findViewById(R.id.skill2Spinner);
        skill3LVL = (Spinner) findViewById(R.id.skill3Spinner);
        spinnerNPlvl = (Spinner) findViewById(R.id.NPlvlspinner);
        NPname = (TextView) findViewById(R.id.NPname);

        oneThruFive = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        oneThruFive.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        oneThruTen = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        oneThruTen.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        skill1LVL.setAdapter(oneThruTen);
        skill2LVL.setAdapter(oneThruTen);
        skill3LVL.setAdapter(oneThruTen);
        spinnerNPlvl.setAdapter(oneThruFive);
        oneThruFive.add("1");
        oneThruFive.add("2");
        oneThruFive.add("3");
        oneThruFive.add("4");
        oneThruFive.add("5");
        oneThruTen.add("1");
        oneThruTen.add("2");
        oneThruTen.add("3");
        oneThruTen.add("4");
        oneThruTen.add("5");
        oneThruTen.add("6");
        oneThruTen.add("7");
        oneThruTen.add("8");
        oneThruTen.add("9");
        oneThruTen.add("10");


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
        TextView nextServant =(TextView)findViewById(R.id.serv_select);
        Button Next = (Button) findViewById(R.id.next);
        textBox = (EditText)findViewById(R.id.serv_atk);

        spinnerServname.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                thisServ  = (String) parent.getItemAtPosition(position);
                NPname.setText(servantsMap.get(thisServ + "5") + " lvl:");
                if(upgradelist.contains(servantsMap.get(thisServ + "5")))
                    NPupgrade.setVisibility(View.VISIBLE);
                else
                    NPupgrade.setVisibility(View.INVISIBLE);
                //Servant enemy = new Servant(0, enemyServant, enemyClass);

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinnerNPlvl.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                NPlvl= position +1;
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                NPlvl = 1;
            }
        });

        skill1LVL.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                skill1 = position +1;
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                skill1 = 1;
            }
        });

        skill2LVL.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                skill2 = position +1;
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                skill2 = 1;
            }
        });
        skill3LVL.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                skill3 = position +1;
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                skill3 = 1;
            }
        });

        NPupgrade.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(NPupgrade.isChecked()){
                    upgradeInt = 1;
                }else{
                    upgradeInt = 0;
                }
            }
        });


        //servantInfo.getExtras();
        final String enemy_1 = servantInfo.getStringExtra("enemy_1");
        final String enemy_2 = servantInfo.getStringExtra("enemy_2");
        //Log.d("servantName", s);
        final Bundle servant = servantInfo.getExtras();
        final int position = servant.getInt("partyToChange");



        final int servantToEdit = servantInfo.getIntExtra("serv_edit", 0);
        final Intent display = new Intent(this, Confirm.class);
        final Intent backToEditSaved = new Intent(this, EditSavedClass.class);

        //display servant number
        switch (servantToEdit){
            case 1:
                nextServant.setText("Servant 1");
                spinnerClass.setSelection(getIndex(spinnerClass, servant1.getClassName()));
                fillNameArray();
                spinnerServname.setSelection(getIndex(spinnerServname, servant1.getName()));
                spinnerNPlvl.setSelection(servant1.getNPlvl() - 1);
                skill1LVL.setSelection(servant1.getSkill1lvl() - 1);
                skill2LVL.setSelection(servant1.getSkill2lvl() - 1);
                skill3LVL.setSelection(servant1.getSkill3lvl() - 1);
                textBox.setText(servant1.getATK() + "");
                if(servant1.isNPupgraded())
                    NPupgrade.setChecked(true);
                else
                    NPupgrade.setChecked(false);
                if(upgradelist.contains(servantsMap.get(servant1.getName() + "5")))
                    NPupgrade.setVisibility(View.VISIBLE);
                else
                    NPupgrade.setVisibility(View.INVISIBLE);
                break;
            case 2:
                nextServant.setText("Servant 2");
                spinnerClass.setSelection(getIndex(spinnerClass, servant2.getClassName()));
                fillNameArray();
                spinnerServname.setSelection(getIndex(spinnerServname, servant2.getName()));
                spinnerNPlvl.setSelection(servant2.getNPlvl() - 1);
                skill1LVL.setSelection(servant2.getSkill1lvl() - 1);
                skill2LVL.setSelection(servant2.getSkill2lvl() - 1);
                skill3LVL.setSelection(servant2.getSkill3lvl() - 1);
                textBox.setText(servant2.getATK() + "");
                if(servant2.isNPupgraded())
                    NPupgrade.setChecked(true);
                else
                    NPupgrade.setChecked(false);
                if(upgradelist.contains(servantsMap.get(servant2.getName() + "5")))
                    NPupgrade.setVisibility(View.VISIBLE);
                else
                    NPupgrade.setVisibility(View.INVISIBLE);
                break;
            case 3:
                nextServant.setText("Servant 3");
                spinnerClass.setSelection(getIndex(spinnerClass, servant3.getClassName()));
                fillNameArray();
                spinnerServname.setSelection(getIndex(spinnerServname, servant3.getName()));
                spinnerNPlvl.setSelection(servant3.getNPlvl() - 1);
                skill1LVL.setSelection(servant3.getSkill1lvl() - 1);
                skill2LVL.setSelection(servant3.getSkill2lvl() - 1);
                skill3LVL.setSelection(servant3.getSkill3lvl() - 1);
                textBox.setText(servant3.getATK() + "");
                if(servant3.isNPupgraded())
                    NPupgrade.setChecked(true);
                else
                    NPupgrade.setChecked(false);
                if(upgradelist.contains(servantsMap.get(servant3.getName() + "5")))
                    NPupgrade.setVisibility(View.VISIBLE);
                else
                    NPupgrade.setVisibility(View.INVISIBLE);
                break;
            default:
                break;
        }

        Next.setText("Confirm");

        //send bundle with edited servant back to confirm
        Next.setOnClickListener(new View.OnClickListener()
        {
            Bundle passThis = new Bundle();
            public void onClick(View v) {
                switch(servantToEdit) {
                    case 1:
                        try {
                            servantAttack = Integer.parseInt(textBox.getText().toString());
                        } catch (NumberFormatException exception){
                            Toast.makeText(EditServant1.this, "Invalid Attack Value", Toast.LENGTH_LONG).show();
                            break;
                        }
                        if (servantAttack == 0){
                            Toast.makeText(EditServant1.this, "Invalid Attack Value", Toast.LENGTH_LONG).show();
                            break;
                        }
                        //modify servant info
                        Servant servant1altered = new Servant(servantAttack, thisServ, servantClass,skill1,skill2,skill3, upgradeInt, NPlvl);
                        if(servantInfo.hasExtra("fromSaved"))
                        {
                            Log.d("inside found fromSaved", "executing code");
                            Party passingThis = new Party(servant1altered, servant2, servant3);
                            passThis.putInt("position", position);
                            backToEditSaved.putExtra("team", (Parcelable)passingThis);
                            backToEditSaved.putExtras(passThis);
                            startActivity(backToEditSaved);
                            break;
                        }
                        display.putExtra("serv_1a", servant1altered);
                        display.putExtra("serv_2a", servant2);
                        display.putExtra("serv_3a", servant3);
                        display.putExtras(passThis);
                        startActivity(display);
                        break;
                    case 2:
                        try {
                            servantAttack = Integer.parseInt(textBox.getText().toString());
                        } catch (NumberFormatException exception) {
                            Toast.makeText(EditServant1.this, "Invalid Attack Value", Toast.LENGTH_LONG).show();
                            break;
                        }
                        if (servantAttack == 0) {
                            Toast.makeText(EditServant1.this, "Invalid Attack Value", Toast.LENGTH_LONG).show();
                            break;
                        }
                        //modify servant info
                        Servant servant2altered = new Servant(servantAttack, thisServ, servantClass,skill1,skill2,skill3, upgradeInt, NPlvl);
                        if(servantInfo.hasExtra("fromSaved"))
                        {
                            Log.d("inside found fromSaved", "executing code");
                            Party passingThis = new Party(servant1, servant2altered, servant3);
                            passThis.putInt("position", position);
                            backToEditSaved.putExtra("team", (Parcelable)passingThis);
                            backToEditSaved.putExtras(passThis);
                            startActivity(backToEditSaved);
                            break;
                        }
                        display.putExtra("serv_1a", servant1);
                        display.putExtra("serv_2a", servant2altered);
                        display.putExtra("serv_3a", servant3);
                        display.putExtras(passThis);
                        startActivity(display);
                        break;
                    case 3:
                        try {
                            servantAttack = Integer.parseInt(textBox.getText().toString());
                        } catch (NumberFormatException exception) {
                            Toast.makeText(EditServant1.this, "Invalid Attack Value", Toast.LENGTH_LONG).show();
                            break;
                        }
                        if (servantAttack == 0) {
                            Toast.makeText(EditServant1.this, "Invalid Attack Value", Toast.LENGTH_LONG).show();
                            break;
                        }
                        //modify servant info
                        Servant servant3altered = new Servant(servantAttack, thisServ, servantClass,skill1,skill2,skill3, upgradeInt, NPlvl);
                        if(servantInfo.hasExtra("fromSaved"))
                        {
                            Log.d("inside found fromSaved", "executing code");
                            Party passingThis = new Party(servant1, servant2, servant3altered);
                            passThis.putInt("position", position);
                            backToEditSaved.putExtra("team", (Parcelable)passingThis);
                            backToEditSaved.putExtras(passThis);
                            startActivity(backToEditSaved);
                            break;
                        }
                        display.putExtra("serv_1a", servant1);
                        display.putExtra("serv_2a", servant2);
                        display.putExtra("serv_3a", servant3altered);
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
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
        fillNameArray();


        thisServ = (String) spinnerServname.getItemAtPosition(0);
        NPname.setText(servantsMap.get(thisServ + "5") + " lvl:");

    }

    private int getIndex(Spinner spinner, String myString){

        int index = 0;

        for (int i=0;i<spinner.getCount();i++){
            if (spinner.getItemAtPosition(i).equals(myString)){
                index = i;
            }
        }
        return index;
    }

    private void fillNameArray(){
        int classSpinnerPosition = spinnerClass.getSelectedItemPosition();
        switch(classSpinnerPosition){
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

    public void loadServants(View view){
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
        Toast.makeText(this, "Selected Country :"+spinnerClass.getSelectedItem().toString()+
                "\nSelected Division :"+spinnerClass.getSelectedItem().toString()+
                "\nSelected District :"+spinnerClass.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
    }




}

