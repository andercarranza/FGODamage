package com.example.ander.fgodamagerecovery;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

public class FAQpage  extends Activity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faqpage);

        TextView link = (TextView)findViewById(R.id.faqQ1ans);
        link.setMovementMethod(LinkMovementMethod.getInstance());

        Button backBtn = (Button)findViewById(R.id.backBtn);

        final Intent mainMenu = new Intent(this, MainMenu.class);
        backBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                startActivity(mainMenu);
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
