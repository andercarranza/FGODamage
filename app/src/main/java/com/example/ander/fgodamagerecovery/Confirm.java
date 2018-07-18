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
        TextView enemyName = (TextView) findViewById(R.id.enemy_1);
        TextView enemyClass = (TextView) findViewById(R.id.enemy_2);

        TextView servant1a = (TextView) findViewById(R.id.servant1a);
        TextView servant1b = (TextView) findViewById(R.id.servant1b);
        TextView servant1c = (TextView) findViewById(R.id.servant1c);

        TextView servant2a = (TextView) findViewById(R.id.servant2a);
        TextView servant2b = (TextView) findViewById(R.id.servant2b);
        TextView servant2c = (TextView) findViewById(R.id.servant2c);

        TextView servant3a = (TextView) findViewById(R.id.servant3a);
        TextView servant3b = (TextView) findViewById(R.id.servant3b);
        TextView servant3c = (TextView) findViewById(R.id.servant3c);

        final Bundle recieved = servantInfo.getExtras();
        enemyName.setText(recieved.getString("enemy_1"));
        enemyClass.setText(recieved.getString("enemy_2"));

        servant1a.setText(recieved.getString("serv_1a"));
        servant1b.setText(recieved.getString("serv_1b"));
        servant1c.setText("ATK: " + String.valueOf(recieved.getInt("serv_1c")));

        servant2a.setText(recieved.getString("serv_2a"));
        servant2b.setText(recieved.getString("serv_2b"));
        servant2c.setText("ATK: " + String.valueOf(recieved.getInt("serv_2c")));

        servant3a.setText(recieved.getString("serv_3a"));
        servant3b.setText(recieved.getString("serv_3b"));
        servant3c.setText("ATK: " + String.valueOf(recieved.getInt("serv_3c")));

        Button editEnemy = (Button) findViewById(R.id.editEnemyBtn);
        Button editServant1 = (Button) findViewById(R.id.editServant1Btn);
        Button editServant2 = (Button) findViewById(R.id.editServant2Btn);
        Button editServant3 = (Button) findViewById(R.id.editServant3Btn);

<<<<<<< HEAD
        Button next = (Button) findViewById(R.id.next);
        final Intent passToEditEnemy = new Intent(this, EditEnemy.class);
        final Intent passToEditServant1 = new Intent(this, EditServant1.class);
//        final Intent passToEditServant2 = new Intent(this, LoadServants.class);
//        final Intent passToEditServant3 = new Intent(this, LoadServants.class);
=======
        Button next = (Button)findViewById(R.id.next);
        final Intent passToEditEnemy = new Intent(this, LoadEnemy.class);
        final Intent passToEditServant1 = new Intent(this, LoadServants.class);
        final Intent passToEditServant2 = new Intent(this, LoadServants.class);
        final Intent passToEditServant3 = new Intent(this, LoadServants.class);
>>>>>>> upstream/master
        final Intent passToConfirm2 = new Intent(this, Confirm2.class);

        //actual damage calculation (do after edit)
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                passToConfirm2.putExtras(recieved);
                startActivity(passToConfirm2);
            }
        });


        final Bundle passThis = new Bundle();
        passThis.putString("serv_3a", recieved.getString("serv_3a"));
        passThis.putString("serv_3b", recieved.getString("serv_3b"));
        passThis.putInt("serv_3c", recieved.getInt("serv_3c"));
        passThis.putString("serv_1a", recieved.getString("serv_1a"));
        passThis.putString("serv_1b", recieved.getString("serv_1b"));
        passThis.putInt("serv_1c", recieved.getInt("serv_1c"));
        passThis.putString("serv_2a", recieved.getString("serv_2a"));
        passThis.putInt("serv_2c", recieved.getInt("serv_2c"));
        passThis.putString("enemy_1", recieved.getString("enemy_1"));
        passThis.putString("enemy_2", recieved.getString("enemy_2"));


        //pass entire bundle of 4 servants with servant edit number
        editEnemy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
<<<<<<< HEAD
                passToEditEnemy.putExtras(recieved);
                startActivity(passToEditEnemy);
=======
                   passToEditEnemy.putExtras(recieved);
                   passToEditEnemy.putExtra("EnemyEdit", "1");
                   startActivity(passToEditEnemy);
>>>>>>> upstream/master
            }
        });
        editServant1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
<<<<<<< HEAD
                passThis.putInt("serv_edit", 1);
                passToEditServant1.putExtras(passThis);
=======
                recieved.putInt("servant", 1);
                passToEditServant1.putExtra("servant_editnum","1");
                passToEditServant1.putExtras(recieved);
>>>>>>> upstream/master
                startActivity(passToEditServant1);
            }
        });
        editServant2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
<<<<<<< HEAD
                passThis.putInt("serv_edit", 2);
                passToEditServant1.putExtras(passThis);
                startActivity(passToEditServant1);
=======
                recieved.putInt("servant", 2);
                passToEditServant2.putExtra("servant_editnum","2");
                passToEditServant2.putExtras(recieved);
                startActivity(passToEditServant2);
>>>>>>> upstream/master
            }
        });
        editServant3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
<<<<<<< HEAD
                passThis.putInt("serv_edit", 3);
                passToEditServant1.putExtras(passThis);
                startActivity(passToEditServant1);
=======
                recieved.putInt("servant", 3);
                passToEditServant3.putExtra("servant_editnum","3");
                passToEditServant3.putExtras(recieved);
                startActivity(passToEditServant3);
>>>>>>> upstream/master
            }
        });
        //Log.d("servantName", servantInfo.getStringExtra("enemy_1"));
    }


}
