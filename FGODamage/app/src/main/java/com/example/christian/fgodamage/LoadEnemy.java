package com.example.christian.fgodamage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Christian on 3/31/2018.
 */

public class LoadEnemy extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener{
    Spinner spinnerClass, spinnerServname;
    ArrayAdapter<String> classArray, nameArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enemy_select);

        spinnerClass = (Spinner) findViewById(R.id.serv_class);
        spinnerClass.setOnItemSelectedListener(this);

        classArray = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
        classArray.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerClass.setAdapter(classArray);

        classArray.add("Archer");
        classArray.add("Saber");
        classArray.setNotifyOnChange(true);

        spinnerClass.setSelection(0);

        spinnerServname = (Spinner) findViewById(R.id.serv_name);
        spinnerServname.setOnItemSelectedListener(this);

        nameArray = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);

        spinnerServname.setAdapter(nameArray);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id){
        int classSpinnerPosition = spinnerClass.getSelectedItemPosition();
        switch(classSpinnerPosition){
            case 0:
                fillArcherNames();
                break;
            case 1:
                fillSaberNames();
                break;
        }

    }

    private void fillArcherNames(){
        nameArray.clear();
        nameArray.notifyDataSetChanged();
        nameArray.add("Emiya");
        nameArray.add("Nobu");
        nameArray.add("Orion");
        nameArray.notifyDataSetChanged();
    }
    private void fillSaberNames(){
        nameArray.clear();
        nameArray.notifyDataSetChanged();
        nameArray.add("OG Saber");
        nameArray.add("Morded");
        nameArray.add("Rama");
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
