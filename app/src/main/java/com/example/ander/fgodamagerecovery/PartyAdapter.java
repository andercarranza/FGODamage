package com.example.ander.fgodamagerecovery;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;



import com.example.ander.fgodamagerecovery.Objects.Party;
import com.example.ander.fgodamagerecovery.Objects.Servant;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static android.content.Context.LAYOUT_INFLATER_SERVICE;

public class PartyAdapter extends ArrayAdapter {

    private final Activity context;
    private final ArrayList<Party> partyList;

    public PartyAdapter(Activity context, ArrayList<Party> partyList) {
        super(context, R.layout.listview_row, partyList);
        this.context = context;
        this.partyList = partyList;
    }

    public View getView(final int position, View view, ViewGroup parent) {
        final LayoutInflater inflater=context.getLayoutInflater();
        final View rowView=inflater.inflate(R.layout.listview_row, null,true);

        Log.d("test", "past inflater declarations");


        TextView servant1 = (TextView) rowView.findViewById(R.id.servant1);
        TextView servant2 = (TextView) rowView.findViewById(R.id.servant2);
        TextView servant3 = (TextView) rowView.findViewById(R.id.servant3);

        Servant servanta = partyList.get(position).getServant1();
        Servant servantb = partyList.get(position).getServant2();
        Servant servantc = partyList.get(position).getServant3();

        servant1.setText(servanta.getName() + " NP" + servanta.getNPlvl() + "   Skills: " + servanta.getSkill1lvl() + "/" + servanta.getSkill2lvl() + "/" + servanta.getSkill3lvl());
        servant2.setText(servantb.getName() + " NP" + servantb.getNPlvl() + "   Skills: " + servantb.getSkill1lvl() + "/" + servantb.getSkill2lvl() + "/" + servantb.getSkill3lvl());
        servant3.setText(servantc.getName() + " NP" + servantc.getNPlvl() + "   Skills: " + servantc.getSkill1lvl() + "/" + servantc.getSkill2lvl() + "/" + servantc.getSkill3lvl());

        Button deleteBtn = (Button) rowView.findViewById(R.id.deleteParty);
        Button editBtn = (Button) rowView.findViewById(R.id.editParty);
        Button selectBtn = (Button) rowView.findViewById(R.id.selectParty);

        Log.d("test", "about to setdeletebtn clicklistener");

        deleteBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View customView = inflater.inflate(R.layout.delete_popup,null);

                final PopupWindow mPopupWindow = new PopupWindow(
                        customView,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT
                );
                /*if(Build.VERSION.SDK_INT>=21){
                    mPopupWindow.setElevation(5.0f);
                */

                mPopupWindow.showAtLocation(rowView, Gravity.CENTER, 0, 0);
                Button yesBtn = (Button) customView.findViewById(R.id.yesbtn);
                Button noBtn = (Button) customView.findViewById(R.id.nobtn);
                yesBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        SharedPreferences appSharedPrefs = PreferenceManager.getDefaultSharedPreferences(context);
                        SharedPreferences.Editor prefsEditor = appSharedPrefs.edit();
                        Gson gson = new Gson();
                        Type type = new TypeToken<List<Party>>() {}.getType();
                        String jsonParties = appSharedPrefs.getString("PartyList", null);
                        final ArrayList<Party> partyDir = gson.fromJson(jsonParties, type);
                        partyDir.remove(position);
                        String partyJson = gson.toJson(partyDir);
                        //prefsEditor = appSharedPrefs.edit();
                        prefsEditor.remove("PartyList").commit();
                        prefsEditor.putString("PartyList", partyJson);
                        prefsEditor.commit();
                        Intent intent = context.getIntent();
                        context.finish();
                        context.startActivity(intent);
                    }
                });
                noBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Dismiss the popup window
                        mPopupWindow.dismiss();
                    }
                });
            }
        });

        editBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent passToEditSaved = new Intent(context, EditSavedClass.class);
                Bundle passThis = new Bundle();
                passThis.putInt("position", position);
                passToEditSaved.putExtras(passThis);
                passToEditSaved.putExtra("team", (Parcelable) partyList.get(position));
                context.startActivity(passToEditSaved);
            }

        });

        selectBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent passToSelectEnemy = new Intent(context, LoadEnemy.class);
                passToSelectEnemy.putExtra("team", (Parcelable) partyList.get(position));
                context.startActivity(passToSelectEnemy);
            }

        });
        return rowView;

    }




}
