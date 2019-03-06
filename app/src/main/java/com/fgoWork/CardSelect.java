package com.fgoWork;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

import com.fgoWork.Calculate;
import com.fgoWork.Objects.Servant;

import static com.fgoWork.Objects.FGODamage.servantsMap;

public class CardSelect extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener{
    Spinner card1, card2, card3, NPlevel1, NPlevel2, NPlevel3, charge1, charge2, charge3;
    ArrayAdapter<String> cardLineup, oneThruFive, chargePercent;
    Servant servant1, servant2, servant3, enemy;
    TextView text1,text2,text3, chargetxt1, chargetxt2, chargetxt3;
    CheckBox poisonedEnemy;
    //CheckBox check1, check2, check3;
    Button calculate;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_select);
        Intent servantInfo = getIntent();
        final Bundle recieved = servantInfo.getExtras();
        servant1 = servantInfo.getParcelableExtra("serv_1a");
        servant2 = servantInfo.getParcelableExtra("serv_2a");
        servant3 = servantInfo.getParcelableExtra("serv_3a");
        enemy = servantInfo.getParcelableExtra("enemyObj");

        Log.d("Defense", enemy.getDefMOD() + "");

        calculate = (Button)findViewById(R.id.next);
        poisonedEnemy = (CheckBox)findViewById(R.id.poisonedBox);
        //check2 = (CheckBox)findViewById(R.id.checkBox2);
        //check3 = (CheckBox)findViewById(R.id.checkBox3);
        //text1 = (TextView)findViewById(R.id.NP1label);
        //text2 = (TextView)findViewById(R.id.NP2label);
        //text3 = (TextView)findViewById(R.id.NP3label);
        card1 = (Spinner)findViewById(R.id.card1spinner);
        card2 = (Spinner)findViewById(R.id.card2spinner);
        card3 = (Spinner)findViewById(R.id.card3spinner);
        //NPlevel1 = (Spinner)findViewById(R.id.NPlvl1);
        //NPlevel2 = (Spinner)findViewById(R.id.NPlvl2);
        //NPlevel3 = (Spinner)findViewById(R.id.NPlvl3);
        charge1 = (Spinner)findViewById(R.id.charge1);
        charge2 = (Spinner)findViewById(R.id.charge2);
        charge3 = (Spinner)findViewById(R.id.charge3);
        chargetxt1 = (TextView)findViewById(R.id.overcharge1);
        chargetxt2 = (TextView)findViewById(R.id.overcharge2);
        chargetxt3 = (TextView)findViewById(R.id.overcharge3);

        if(servant1.getName().equals("Robin Hood") || servant2.getName().equals("Robin Hood") || servant3.getName().equals("Robin Hood"))
            poisonedEnemy.setVisibility(View.VISIBLE);

        cardLineup = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        cardLineup.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        card1.setAdapter(cardLineup);
        card2.setAdapter(cardLineup);
        card3.setAdapter(cardLineup);
        cardLineup.add(servant1.getName() + " - Buster");
        cardLineup.add(servant1.getName() + " - Arts");
        cardLineup.add(servant1.getName() + " - Quick");
        cardLineup.add(servant1.getName() + " - " + servantsMap.get(servant1.getName() + "5"));
        cardLineup.add(servant2.getName() + " - Buster");
        cardLineup.add(servant2.getName() + " - Arts");
        cardLineup.add(servant2.getName() + " - Quick");
        cardLineup.add(servant2.getName() + " - " + servantsMap.get(servant2.getName() + "5"));
        cardLineup.add(servant3.getName() + " - Buster");
        cardLineup.add(servant3.getName() + " - Arts");
        cardLineup.add(servant3.getName() + " - Quick");
        cardLineup.add(servant3.getName() + " - " + servantsMap.get(servant3.getName() + "5"));

        /*oneThruFive = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        oneThruFive.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        NPlevel1.setAdapter(oneThruFive);
        NPlevel2.setAdapter(oneThruFive);
        NPlevel3.setAdapter(oneThruFive);
        oneThruFive.add("1");
        oneThruFive.add("2");
        oneThruFive.add("3");
        oneThruFive.add("4");
        oneThruFive.add("5");*/

        chargePercent = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        chargePercent.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        charge1.setAdapter(chargePercent);
        charge2.setAdapter(chargePercent);
        charge3.setAdapter(chargePercent);
        chargePercent.add("100%");
        chargePercent.add("200%");
        chargePercent.add("300%");


        final Bundle passThis = new Bundle();
        //passThis.putString("enemy_1", recieved.getString("enemy_1"));
        //passThis.putString("enemy_2", recieved.getString("enemy_2"));


        card1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                int servNum = -1;
                if(card1.getSelectedItemPosition() <= 3 )
                    servNum = 1;
                else if(card1.getSelectedItemPosition() <= 7)
                    servNum = 2;
                else
                    servNum = 3;

                if(card1.getSelectedItemPosition() == 3 || card1.getSelectedItemPosition() == 7 || card1.getSelectedItemPosition() == 11)
                    set1Visible((card1.getSelectedItemPosition() % 3) + 1);
                else
                    set1InVisible();
                passThis.putString("card1Servant", "" + servNum);
                int cardType = card1.getSelectedItemPosition() + 1;
                switch(cardType % 4)
                {
                    case 1:
                        passThis.putString("card1Type", "Buster");
                        break;
                    case 2:
                        passThis.putString("card1Type", "Arts");
                        break;
                    case 3:
                        passThis.putString("card1Type", "Quick");
                        break;
                    case 0:
                        passThis.putString("card1Type", "NP");
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                passThis.putString("card1Servant", "1" );
                passThis.putString("card1Type", "Buster");
            }
        });

        card2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                int servNum = -1;
                if(card2.getSelectedItemPosition() <= 3 )
                    servNum = 1;
                else if(card2.getSelectedItemPosition() <= 7)
                    servNum = 2;
                else
                    servNum = 3;

                if(card2.getSelectedItemPosition() == 3 || card2.getSelectedItemPosition() == 7 || card2.getSelectedItemPosition() == 11)
                    set2Visible((card2.getSelectedItemPosition() % 3) + 1);
                else
                    set2InVisible();
                passThis.putString("card2Servant", "" + servNum);
                int cardType = card2.getSelectedItemPosition() + 1;
                switch(cardType % 4)
                {
                    case 1:
                        passThis.putString("card2Type", "Buster");
                        break;
                    case 2:
                        passThis.putString("card2Type", "Arts");
                        break;
                    case 3:
                        passThis.putString("card2Type", "Quick");
                        break;
                    case 0:
                        passThis.putString("card2Type", "NP");
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                passThis.putString("card2Servant", "1" );
                passThis.putString("card2Type", "Buster");
            }
        });

        card3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
                int servNum = -1;
                if(card3.getSelectedItemPosition() <= 3 )
                    servNum = 1;
                else if(card3.getSelectedItemPosition() <= 7)
                    servNum = 2;
                else
                    servNum = 3;

                if(card3.getSelectedItemPosition() == 3 || card3.getSelectedItemPosition() == 7 || card3.getSelectedItemPosition() == 11)
                    set3Visible((card3.getSelectedItemPosition() % 3) + 1);
                else
                    set3InVisible();
                passThis.putString("card3Servant", "" + servNum);
                int cardType = card3.getSelectedItemPosition() + 1;
                switch(cardType % 4)
                {
                    case 1:
                        passThis.putString("card3Type", "Buster");
                        break;
                    case 2:
                        passThis.putString("card3Type", "Arts");
                        break;
                    case 3:
                        passThis.putString("card3Type", "Quick");
                        break;
                    case 0:
                        passThis.putString("card3Type", "NP");
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                passThis.putString("card3Servant", "1" );
                passThis.putString("card3Type", "Buster");
            }
        });

        /*NPlevel1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int NPlvl = NPlevel1.getSelectedItemPosition() + 1;
                passThis.putString("card1Level", "" + NPlvl);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                passThis.putString("card1Level", "1");
            }
        });
        NPlevel2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int NPlvl = NPlevel2.getSelectedItemPosition() + 1;
                passThis.putString("card2Level", "" + NPlvl);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                passThis.putString("card2Level", "1");
            }
        });

        NPlevel3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int NPlvl = NPlevel3.getSelectedItemPosition() + 1;
                passThis.putString("card3Level", "" + NPlvl);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                passThis.putString("card3Level", "1");
            }
        });*/

        charge1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int charge = (charge1.getSelectedItemPosition() + 1) * 100;
                passThis.putString("card1Charge", "" + charge);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                passThis.putString("card1Charge", "100");
            }
        });
        charge2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int charge = (charge2.getSelectedItemPosition() + 1) * 100;
                passThis.putString("card2Charge", "" + charge);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                passThis.putString("card2Charge", "100");
            }
        });
        charge3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int charge = (charge3.getSelectedItemPosition() + 1) * 100;
                passThis.putString("card3Charge", "" + charge);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                passThis.putString("card3Charge", "100");
            }
        });

        poisonedEnemy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(poisonedEnemy.isChecked()){
                    enemy.setPoisoned(true);
                }else{
                    enemy.setPoisoned(false);
                }
            }
        });

        /*check1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(check1.isChecked()){
                    passThis.putString("card1Upgrade", "Yes");
                }else{
                    passThis.putString("card1Upgrade", "No");
                }
            }
        });

        check2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(check2.isChecked()){
                    passThis.putString("card2Upgrade", "Yes");
                }else{
                    passThis.putString("card2Upgrade", "No");
                }
            }
        });
        check3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(check3.isChecked()){
                    passThis.putString("card3Upgrade", "Yes");
                }else{
                    passThis.putString("card3Upgrade", "No");
                }
            }
        });

        if(check1.isChecked()){
            passThis.putString("card1Upgrade", "Yes");
        }else{
            passThis.putString("card1Upgrade", "No");
        }

        if(check2.isChecked()){
            passThis.putString("card2Upgrade", "Yes");
        }else{
            passThis.putString("card2Upgrade", "No");
        }

        if(check3.isChecked()){
            passThis.putString("card3Upgrade", "Yes");
        }else{
            passThis.putString("card3Upgrade", "No");
        }*/

        final Intent passToCalcPage = new Intent(this, Calculate.class);

        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //Servant enemy = new Servant(-1, passThis.getString("enemy_1"), passThis.getString("enemy_2"),0,0,0, 0, 0);
                /*Log.d("servant 1 nm", servant1);
                Log.d("servant 2 nm", servant2);
                Log.d("servant 3 nm", servant3);
                Servant servant1a = new Servant(passThis.getInt("serv_1c"), servant1 , passThis.getString("serv_1b"));
                Servant servant2a = new Servant(passThis.getInt("serv_2c"), servant2 , passThis.getString("serv_2b"));
                Servant servant3a = new Servant(passThis.getInt("serv_3c"), servant3 , passThis.getString("serv_3b"));*/
                passToCalcPage.putExtra("EnemyObj", enemy);
                passToCalcPage.putExtra("Servant1Obj", servant1);
                passToCalcPage.putExtra("Servant2Obj", servant2);
                passToCalcPage.putExtra("Servant3Obj", servant3);
                passToCalcPage.putExtras(passThis);
                startActivity(passToCalcPage);
            }
        });
    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void set1Visible(int servNum){
        //text1.setVisibility(View.VISIBLE);
        //NPlevel1.setVisibility(View.VISIBLE);
        charge1.setVisibility(View.VISIBLE);
        chargetxt1.setVisibility(View.VISIBLE);
        /*switch(servNum)
        {
            case 1:
                if(upgradelist.contains(servantsMap.get(servant1 + "5")))
                    check1.setVisibility(View.VISIBLE);
                else
                    check1.setVisibility(View.INVISIBLE);
                break;
            case 2:
                if(upgradelist.contains(servantsMap.get(servant2 + "5")))
                    check1.setVisibility(View.VISIBLE);
                else
                    check1.setVisibility(View.INVISIBLE);
                break;
            case 3:
                if(upgradelist.contains(servantsMap.get(servant3 + "5")))
                    check1.setVisibility(View.VISIBLE);
                else
                    check1.setVisibility(View.INVISIBLE);
                break;
        }*/
        //check1.setVisibility(View.VISIBLE);
    }

    public void set2Visible(int servNum){
        //text2.setVisibility(View.VISIBLE);
        //NPlevel2.setVisibility(View.VISIBLE);
        charge2.setVisibility(View.VISIBLE);
        chargetxt2.setVisibility(View.VISIBLE);
        /*
        switch(servNum)
        {
            case 1:
                if(upgradelist.contains(servantsMap.get(servant1 + "5")))
                    check2.setVisibility(View.VISIBLE);
                else
                    check2.setVisibility(View.INVISIBLE);
                break;
            case 2:
                if(upgradelist.contains(servantsMap.get(servant2 + "5")))
                    check2.setVisibility(View.VISIBLE);
                else
                    check2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                if(upgradelist.contains(servantsMap.get(servant3 + "5")))
                    check2.setVisibility(View.VISIBLE);
                else
                    check2.setVisibility(View.INVISIBLE);
                break;
        }*/
    }

    public void set3Visible(int servNum){
        //text3.setVisibility(View.VISIBLE);
        //NPlevel3.setVisibility(View.VISIBLE);
        charge3.setVisibility(View.VISIBLE);
        chargetxt3.setVisibility(View.VISIBLE);
        /*
        switch(servNum)
        {
            case 1:
                if(upgradelist.contains(servantsMap.get(servant1 + "5")))
                    check3.setVisibility(View.VISIBLE);
                else
                    check3.setVisibility(View.INVISIBLE);
                break;
            case 2:
                if(upgradelist.contains(servantsMap.get(servant2 + "5")))
                    check3.setVisibility(View.VISIBLE);
                else
                    check3.setVisibility(View.INVISIBLE);
                break;
            case 3:
                if(upgradelist.contains(servantsMap.get(servant3 + "5")))
                    check3.setVisibility(View.VISIBLE);
                else
                    check3.setVisibility(View.INVISIBLE);
                break;
        }*/
    }

    public void set1InVisible(){
        //text1.setVisibility(View.INVISIBLE);
        //NPlevel1.setVisibility(View.INVISIBLE);
        //check1.setVisibility(View.INVISIBLE);
        charge1.setVisibility(View.INVISIBLE);
        chargetxt1.setVisibility(View.INVISIBLE);
    }

    public void set2InVisible(){
        //text2.setVisibility(View.INVISIBLE);
        //NPlevel2.setVisibility(View.INVISIBLE);
        //check2.setVisibility(View.INVISIBLE);
        charge2.setVisibility(View.INVISIBLE);
        chargetxt2.setVisibility(View.INVISIBLE);
    }

    public void set3InVisible(){
        //text3.setVisibility(View.INVISIBLE);
        //NPlevel3.setVisibility(View.INVISIBLE);
        //check3.setVisibility(View.INVISIBLE);
        charge3.setVisibility(View.INVISIBLE);
        chargetxt3.setVisibility(View.INVISIBLE);
    }
}
