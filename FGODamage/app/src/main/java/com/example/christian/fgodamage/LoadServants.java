package com.example.christian.fgodamage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Christian on 4/9/2018.
 */

public class LoadServants extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener{
    int servantNumber;
    Spinner spinnerClass, spinnerServname;
    ArrayAdapter<String> classArray, nameArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.servant_select);

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
        TextView nextServant =(TextView)findViewById(R.id.serv_select);
        Button Next = (Button) findViewById(R.id.next);

        Intent servantInfo = getIntent();
        Bundle servant = servantInfo.getExtras();

        //retrieve servant number
        if(servant!=null)
        {
            servantNumber = (int) servant.get("servant");
        }

        //display servant number
        switch (servantNumber){
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
        Next.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                switch(servantNumber) {
                    case 1:
                        loadNextServant.putExtra("servant", 2);
                        startActivity(loadNextServant);
                        break;
                    case 2:
                        loadNextServant.putExtra("servant", 3);
                        startActivity(loadNextServant);
                        break;
                    case 3:
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
        int classSpinnerPosition = spinnerClass.getSelectedItemPosition();
        switch(classSpinnerPosition){
            case 0:
                fillSaberNames();
                break;
            case 1:
                fillArcherNames();
                break;
            case 2:
                fillLancerNames();
                break;
            case 3:
                fillRiderNames();
                break;
            case 4:
                fillCasterNames();
                break;
            case 5:
                fillAssassinNames();
                break;
            case 6:
                fillBerserkerNames();
                break;
            case 7:
                fillShielderNames();
                break;
            case 8:
                fillRulerNames();
                break;
            case 9:
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
        nameArray.add("Morded");
        nameArray.add("Shiki Void");
        nameArray.add("Rama");
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

        nameArray.notifyDataSetChanged();
    }

    private void fillAvengerNames(){
        nameArray.clear();
        nameArray.notifyDataSetChanged();
        nameArray.add("Edmond Dantes");
        nameArray.add("Jeanne d'Arc (Alter)");
        nameArray.add("Angry Manjew");


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