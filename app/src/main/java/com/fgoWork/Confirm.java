
package com.fgoWork;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.fgoWork.EditServant1;
import com.fgoWork.LoadEnemy;
import com.google.gson.Gson;

import com.fgoWork.Objects.Party;
import com.fgoWork.Objects.Servant;
import com.google.gson.reflect.TypeToken;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Christian on 4/9/2018.
 */

public class Confirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm);
        Intent servantInfo = getIntent();
        //TextView enemyName = (TextView)findViewById(R.id.enemy_1);
        //TextView enemyClass = (TextView)findViewById(R.id.enemy_2);

        TextView servant1a = (TextView)findViewById(R.id.servant1a);
        TextView servant1b = (TextView)findViewById(R.id.servant1b);
        TextView servant1c = (TextView)findViewById(R.id.servant1c);
        TextView servant1d = (TextView)findViewById(R.id.servant1d);

        TextView servant2a = (TextView)findViewById(R.id.servant2a);
        TextView servant2b = (TextView)findViewById(R.id.servant2b);
        TextView servant2c = (TextView)findViewById(R.id.servant2c);
        TextView servant2d = (TextView)findViewById(R.id.servant2d);

        TextView servant3a = (TextView)findViewById(R.id.servant3a);
        TextView servant3b = (TextView)findViewById(R.id.servant3b);
        TextView servant3c = (TextView)findViewById(R.id.servant3c);
        TextView servant3d = (TextView)findViewById(R.id.servant3d);

        final Bundle recieved = servantInfo.getExtras();
        //enemyName.setText(recieved.getString("enemy_1"));
        //enemyClass.setText(recieved.getString("enemy_2"));
        final Servant servant1 = servantInfo.getParcelableExtra("serv_1a");
        final Servant servant2 = servantInfo.getParcelableExtra("serv_2a");
        final Servant servant3 = servantInfo.getParcelableExtra("serv_3a");

        servant1a.setText(servant1.getName() + " NP" + servant1.getNPlvl());
        servant1b.setText(servant1.getClassName());
        servant1c.setText("ATK: " + String.valueOf(servant1.getATK()));
        servant1d.setText("Skills: " + servant1.getSkill1lvl() + "/" + servant1.getSkill2lvl() + "/" + servant1.getSkill3lvl());

        servant2a.setText(servant2.getName() + " NP" + servant2.getNPlvl());
        servant2b.setText(servant2.getClassName());
        servant2c.setText("ATK: " + String.valueOf(servant2.getATK()));
        servant2d.setText("Skills: " + servant2.getSkill1lvl() + "/" + servant2.getSkill2lvl() + "/" + servant2.getSkill3lvl());

        servant3a.setText(servant3.getName() + " NP" + servant3.getNPlvl());
        servant3b.setText(servant3.getClassName());
        servant3c.setText("ATK: " + String.valueOf(servant3.getATK()));
        servant3d.setText("Skills: " + servant3.getSkill1lvl() + "/" + servant3.getSkill2lvl() + "/" + servant3.getSkill3lvl());

        //Button editEnemy = (Button)findViewById(R.id.editEnemyBtn);
        Button editServant1 = (Button)findViewById(R.id.editServant1Btn);
        Button editServant2 = (Button)findViewById(R.id.editServant2Btn);
        Button editServant3 = (Button)findViewById(R.id.editServant3Btn);
        //Button toCardSelect = (Button)findViewById(R.id.next);

        Button save = (Button)findViewById(R.id.next);
        Button enemySel = (Button)findViewById(R.id.enemy_select);
        final Intent passToSelectEnemy = new Intent(this, LoadEnemy.class);
        final Intent passToEditServant1 = new Intent(this, EditServant1.class);
        //final Intent passToEnemySelect = new Intent(this, LoadEnemy.class);
        final Context context = this;
        final Context appContext = this.getApplicationContext();
        //actual damage calculation (do after edit)
        save.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //try to load object
                //catch the right exception
                //if not there add object
                SharedPreferences appSharedPrefs = PreferenceManager.getDefaultSharedPreferences(appContext);
                SharedPreferences.Editor prefsEditor = appSharedPrefs.edit();
                Gson gson = new Gson();
                Type type = new TypeToken<List<Party>>(){}.getType();
                String jsonParties = appSharedPrefs.getString("PartyList", null);
                if(jsonParties != null){
                    ArrayList<Party> partyDir = gson.fromJson(jsonParties, type);
                    Party addingThis = new Party(servant1, servant2, servant3);
                    partyDir.add(addingThis);
                    String partyJson = gson.toJson(partyDir);
                    //prefsEditor = appSharedPrefs.edit();
                    prefsEditor.remove("PartyList").commit();
                    prefsEditor.putString("PartyList", partyJson);
                    prefsEditor.commit();
                    Toast.makeText(Confirm.this, "Team Saved!", Toast.LENGTH_LONG).show();
                    Log.d("Saving...", "Saved to found file");
                }
                else{
                    ArrayList<Party> partyDir = new ArrayList<>();
                    Party addingThis = new Party(servant1, servant2, servant3);
                    partyDir.add(addingThis);
                    String partyJson = gson.toJson(partyDir);
                    prefsEditor.putString("PartyList", partyJson);
                    prefsEditor.commit();
                    Toast.makeText(Confirm.this, "Team Saved!", Toast.LENGTH_LONG).show();
                    Log.d("Saving...", "Saved to new file");
                }

                Party addingThis = new Party(servant1, servant2, servant3);
                passToSelectEnemy.putExtra("team", (Parcelable) addingThis);
                startActivity(passToSelectEnemy);
            }
        });

        enemySel.setVisibility(View.INVISIBLE);




        final Bundle passThis = new Bundle();


        passToEditServant1.putExtra("serv_3a", servant3);
        passToEditServant1.putExtra("serv_2a", servant2);
        passToEditServant1.putExtra("serv_1a", servant1);

        //pass entire bundle of 4 servants with servant edit number
        /*editEnemy.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                   passToEditEnemy.putExtras(recieved);
                   startActivity(passToEditEnemy);
            }
        });*/
        editServant1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                passThis.putInt("serv_edit", 1);
                passToEditServant1.putExtras(passThis);
                startActivity(passToEditServant1);
            }
        });
        editServant2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                passThis.putInt("serv_edit", 2);
                passToEditServant1.putExtras(passThis);
                startActivity(passToEditServant1);
            }
        });
        editServant3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                passThis.putInt("serv_edit", 3);
                passToEditServant1.putExtras(passThis);
                startActivity(passToEditServant1);
            }
        });
        /*toCardSelect.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                //passThis.putInt("serv_edit", 3);
                passToConfirm2.putExtras(passThis);
                startActivity(passToConfirm2);
            }
        });*/
        //Log.d("servantName", servantInfo.getStringExtra("enemy_1"));
    }


}

