package com.example.ander.fgodamagerecovery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ander.fgodamagerecovery.Objects.Servant;

public class CustomDEFENSE extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    Servant servant1, servant2, servant3, enemy;
    EditText enemyDefMod, enemySpDef, enemyDmgCut, artsDef, busterDef, quickDef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_defenses);
        Intent servantInfo = getIntent();
        servant1 = servantInfo.getParcelableExtra("serv_1a");
        servant2 = servantInfo.getParcelableExtra("serv_2a");
        servant3 = servantInfo.getParcelableExtra("serv_3a");
        enemy = servantInfo.getParcelableExtra("enemyObj");

        TextView enemyNM = (TextView) findViewById(R.id.enemyServ);
        Button next = (Button) findViewById(R.id.next);

        enemyDefMod = (EditText) findViewById(R.id.enemyDefMod);
        enemySpDef = (EditText) findViewById(R.id.enemySpDef);
        enemyDmgCut = (EditText) findViewById(R.id.enemyDmgCut);
        artsDef = (EditText) findViewById(R.id.artsDef);
        busterDef= (EditText) findViewById(R.id.busterDef);
        quickDef = (EditText) findViewById(R.id.quickDef);

        enemyNM.setText(enemy.getName());

        final Intent selectCards = new Intent(this, CardSelect.class);

        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //selectCards.putExtra("servant", 1);
                retrieveInputs();
                selectCards.putExtra("enemyObj", enemy);
                selectCards.putExtra("serv_1a", servant1);
                selectCards.putExtra("serv_2a", servant2);
                selectCards.putExtra("serv_3a", servant3);
                startActivity(selectCards);
                //this.overridePendingTransition(0, 0);
            }

        });
    }

    public void retrieveInputs(){
        if(!enemyDefMod.getText().toString().equals(""))
        {
            enemy.setDefMOD(Double.parseDouble(enemyDefMod.getText().toString()) / 100);
        }
        if(!enemySpDef.getText().toString().equals(""))
        {
            enemy.setSpecialDef(Double.parseDouble(enemySpDef.getText().toString()) / 100);
        }
        if(!enemyDmgCut.getText().toString().equals(""))
        {
            enemy.setDmgCut(Integer.parseInt(enemyDmgCut.getText().toString()));
        }
        if(!artsDef.getText().toString().equals(""))
        {
            enemy.setArtsDef(Double.parseDouble(artsDef.getText().toString()) / 100);
        }
        if(!busterDef.getText().toString().equals(""))
        {
            enemy.setBusterDef(Double.parseDouble(busterDef.getText().toString()) / 100);
        }
        if(!quickDef.getText().toString().equals(""))
        {
            enemy.setQuickDef(Double.parseDouble(quickDef.getText().toString()) / 100);
        }

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
}
