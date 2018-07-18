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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm);
        Intent servantInfo = getIntent();
        TextView enemyName = (TextView)findViewById(R.id.enemy_1);
        TextView enemyClass = (TextView)findViewById(R.id.enemy_2);
<<<<<<< HEAD
        TextView enemyName = (TextView) findViewById(R.id.enemy_1);
        TextView enemyClass = (TextView) findViewById(R.id.enemy_2);
=======
>>>>>>> parent of 16e5b3a... update

        TextView servant1a = (TextView)findViewById(R.id.servant1a);
        TextView servant1b = (TextView)findViewById(R.id.servant1b);
        TextView servant1c = (TextView)findViewById(R.id.servant1c);
<<<<<<< HEAD
        TextView servant1a = (TextView) findViewById(R.id.servant1a);
        TextView servant1b = (TextView) findViewById(R.id.servant1b);
        TextView servant1c = (TextView) findViewById(R.id.servant1c);
=======
>>>>>>> parent of 16e5b3a... update

        TextView servant2a = (TextView)findViewById(R.id.servant2a);
        TextView servant2b = (TextView)findViewById(R.id.servant2b);
        TextView servant2c = (TextView)findViewById(R.id.servant2c);
<<<<<<< HEAD
        TextView servant2a = (TextView) findViewById(R.id.servant2a);
        TextView servant2b = (TextView) findViewById(R.id.servant2b);
        TextView servant2c = (TextView) findViewById(R.id.servant2c);
=======
>>>>>>> parent of 16e5b3a... update

        TextView servant3a = (TextView)findViewById(R.id.servant3a);
        TextView servant3b = (TextView)findViewById(R.id.servant3b);
        TextView servant3c = (TextView)findViewById(R.id.servant3c);
<<<<<<< HEAD
        TextView servant3a = (TextView) findViewById(R.id.servant3a);
        TextView servant3b = (TextView) findViewById(R.id.servant3b);
        TextView servant3c = (TextView) findViewById(R.id.servant3c);
=======
>>>>>>> parent of 16e5b3a... update

        final Bundle recieved = servantInfo.getExtras();
        enemyName.setText(recieved.getString("enemy_1"));

        public class Confirm extends AppCompatActivity {
        servant3b.setText(recieved.getString("serv_3b"));
        servant3c.setText("ATK: " + String.valueOf(recieved.getInt("serv_3c")));

<<<<<<< HEAD
    Button editEnemy = (Button)findViewById(R.id.editEnemyBtn);
    Button editServant1 = (Button)findViewById(R.id.editServant1Btn);
    Button editServant2 = (Button)findViewById(R.id.editServant2Btn);
    Button editServant3 = (Button)findViewById(R.id.editServant3Btn);
    Button editEnemy = (Button) findViewById(R.id.editEnemyBtn);
    Button editServant1 = (Button) findViewById(R.id.editServant1Btn);
    Button editServant2 = (Button) findViewById(R.id.editServant2Btn);
    Button editServant3 = (Button) findViewById(R.id.editServant3Btn);

    Button next = (Button)findViewById(R.id.next);
    Button next = (Button) findViewById(R.id.next);
    final Intent passToEditEnemy = new Intent(this, EditEnemy.class);
    final Intent passToEditServant1 = new Intent(this, LoadServants.class);
    final Intent passToEditServant1 = new Intent(this, EditServant1.class);
    //        final Intent passToEditServant2 = new Intent(this, LoadServants.class);
=======
        Button editEnemy = (Button)findViewById(R.id.editEnemyBtn);
        Button editServant1 = (Button)findViewById(R.id.editServant1Btn);
        Button editServant2 = (Button)findViewById(R.id.editServant2Btn);
        Button editServant3 = (Button)findViewById(R.id.editServant3Btn);

        Button next = (Button)findViewById(R.id.next);
        final Intent passToEditEnemy = new Intent(this, EditEnemy.class);
        final Intent passToEditServant1 = new Intent(this, LoadServants.class);
//        final Intent passToEditServant2 = new Intent(this, LoadServants.class);
>>>>>>> parent of 16e5b3a... update
//        final Intent passToEditServant3 = new Intent(this, LoadServants.class);
    final Intent passToConfirm2 = new Intent(this, Confirm2.class);

<<<<<<< HEAD
    //actual damage calculation (do after edit)
        next.setOnClickListener(new View.OnClickListener(){
        next.setOnClickListener(new View.OnClickListener() {
=======
        //actual damage calculation (do after edit)
        next.setOnClickListener(new View.OnClickListener(){
>>>>>>> parent of 16e5b3a... update
            public void onClick(View v) {
                passToConfirm2.putExtras(recieved);
                startActivity(passToConfirm2);
                @ -79,35 +79,33 @@ public class Confirm extends AppCompatActivity {
        passThis.putString("serv_1b", recieved.getString("serv_1b"));
        passThis.putInt("serv_1c", recieved.getInt("serv_1c"));
        passThis.putString("serv_2a", recieved.getString("serv_2a"));

        passThis.putInt("serv_2c", recieved.getInt("serv_2c"));passThis.putString("serv_2b", recieved.getString("serv_2b"));
<<<<<<< HEAD
        passThis.putInt("serv_2c", recieved.getInt("serv_2c"));
=======
>>>>>>> parent of 16e5b3a... update
        passThis.putString("enemy_1", recieved.getString("enemy_1"));
        passThis.putString("enemy_2", recieved.getString("enemy_2"));



<<<<<<< HEAD
                    //pass entire bundle of 4 servants with servant edit number
        editEnemy.setOnClickListener(new View.OnClickListener(){
                        editEnemy.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                passToEditEnemy.putExtras(recieved);
                                startActivity(passToEditEnemy);
                                passToEditEnemy.putExtras(recieved);
                                startActivity(passToEditEnemy);
                            }
                        });
                        editServant1.setOnClickListener(new View.OnClickListener(){
        editServant1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    passThis.putInt("serv_edit", 1);
                                    passToEditServant1.putExtras(passThis);
                                    startActivity(passToEditServant1);
                                }
                            });
        editServant2.setOnClickListener(new View.OnClickListener(){
                                editServant2.setOnClickListener(new View.OnClickListener() {
                                    public void onClick(View v) {
                                        passThis.putInt("serv_edit", 2);
                                        passToEditServant1.putExtras(passThis);
                                        startActivity(passToEditServant1);
                                    }
                                });
                                editServant3.setOnClickListener(new View.OnClickListener(){
        editServant3.setOnClickListener(new View.OnClickListener() {
                                        public void onClick(View v) {
                                            passThis.putInt("serv_edit", 3);
                                            passToEditServant1.putExtras(passThis);
=======
        //pass entire bundle of 4 servants with servant edit number
        editEnemy.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                   passToEditEnemy.putExtras(recieved);
                   startActivity(passToEditEnemy);
            }
        });
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
        //Log.d("servantName", servantInfo.getStringExtra("enemy_1"));
    }


}
>>>>>>> parent of 16e5b3a... update
