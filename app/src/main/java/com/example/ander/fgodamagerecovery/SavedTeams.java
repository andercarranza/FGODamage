package com.example.ander.fgodamagerecovery;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ander.fgodamagerecovery.Objects.Party;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class SavedTeams extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saved_parties);
        ActionBar actionBar = getActionBar();
        ListView listView;
        final Context appContext = this.getApplicationContext();
        SharedPreferences appSharedPrefs = PreferenceManager.getDefaultSharedPreferences(appContext);
        SharedPreferences.Editor prefsEditor = appSharedPrefs.edit();
        Gson gson = new Gson();
        Type type = new TypeToken<List<Party>>() {
        }.getType();
        String jsonParties = appSharedPrefs.getString("PartyList", null);
        final ArrayList<Party> partyDir = gson.fromJson(jsonParties, type);
        PartyAdapter whatever = new PartyAdapter(this, partyDir);
        Log.d("test", "past declring party adatper");
        listView = (ListView) findViewById(R.id.all_parties_listview);
        listView.setAdapter(whatever); //casues problems if there are no teams saved
        final Intent passToSelectEnemy = new Intent(this, LoadEnemy.class);
        Log.d("test", "about to set listview clicklistener");
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                passToSelectEnemy.putExtra("team", (Parcelable) partyDir.get(position));
                startActivity(passToSelectEnemy);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.loadservsmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {


            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
