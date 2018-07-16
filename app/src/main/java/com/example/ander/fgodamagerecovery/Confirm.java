package com.example.ander.fgodamagerecovery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Christian on 4/9/2018.
 */

public class Confirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm);
        Intent servantInfo = getIntent();
        TextView enemyName = (TextView)findViewById(R.id.enemy_1);
        TextView enemyClass = (TextView)findViewById(R.id.enemy_2);
        TextView servant1a = (TextView)findViewById(R.id.servant1a);
        TextView servant1b = (TextView)findViewById(R.id.servant1b);
        TextView servant1c = (TextView)findViewById(R.id.servant1c);
        final Bundle recieved = servantInfo.getExtras();
        enemyName.setText(recieved.getString("enemy_1"));
        enemyClass.setText(recieved.getString("enemy_2"));
        servant1a.setText(recieved.getString("serv_1a"));
        servant1b.setText(recieved.getString("serv_1b"));
        servant1c.setText("ATK: " + String.valueOf(recieved.getInt("serv_1c")));
        Button editEnemy = (Button)findViewById(R.id.editEnemyBtn);
        Button editServant1 = (Button)findViewById(R.id.editServant1Btn);
        Button next = (Button)findViewById(R.id.next);
        final Intent passToEditEnemy = new Intent(this, EditEnemy.class);
        final Intent passToEditServant1 = new Intent(this, EditServant1.class);
        final Intent passToConfirm2 = new Intent(this, Confirm2.class);
        editEnemy.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                   passToEditEnemy.putExtras(recieved);
                   startActivity(passToEditEnemy);
            }
        });
        editServant1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                passToEditServant1.putExtras(recieved);
                startActivity(passToEditServant1);
            }
        });
        next.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                passToConfirm2.putExtras(recieved);
                startActivity(passToConfirm2);
            }
        });
        //Log.d("servantName", servantInfo.getStringExtra("enemy_1"));
    }


}
