package com.fgoWork;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;


public class MainMenu extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        Button savedTeams = (Button)findViewById(R.id.saved_btn);
        Button newTeam = (Button)findViewById(R.id.newteam_btn);
        Button faqNav = (Button)findViewById(R.id.faq_btn);

        final Intent startNewParty = new Intent(this, LoadServants.class);
        final Intent loadSavedParties = new Intent(this, SavedTeams.class);
        final Intent gotoFaq = new Intent(this, FAQpage.class);

        newTeam.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startNewParty.putExtra("servant", 1);
                startActivity(startNewParty);
            }
        });
        savedTeams.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                startActivity(loadSavedParties);
            }
        });
        faqNav.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                startActivity(gotoFaq);
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
}
