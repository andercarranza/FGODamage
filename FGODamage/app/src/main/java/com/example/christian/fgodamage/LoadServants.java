package com.example.christian.fgodamage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Christian on 4/9/2018.
 */

public class LoadServants extends AppCompatActivity {
    int servantNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.servant_select);

        TextView nextServant =(TextView)findViewById(R.id.serv_select);
        Button Next = (Button) findViewById(R.id.next);

        Intent servantInfo = getIntent();
        Bundle servant = servantInfo.getExtras();

        //retrieve servant number
        if(servant!=null)
        {
            servantNumber = (int) servant.get("servant");
        }

        //display servant number
        switch (servantNumber){
            case 1:
                nextServant.setText("Servant 1");
                break;
            case 2:
                nextServant.setText("Servant 2");
                break;
            case 3:
                nextServant.setText("Servant 3");
                break;
            default:
                break;
        }

        final Intent loadNextServant = new Intent(this, LoadServants.class);
        final Intent display = new Intent(this, Confirm.class);

        //next button restarts activity for next servant
        Next.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                switch(servantNumber) {
                    case 1:
                        loadNextServant.putExtra("servant", 2);
                        startActivity(loadNextServant);
                        break;
                    case 2:
                        loadNextServant.putExtra("servant", 3);
                        startActivity(loadNextServant);
                        break;
                    case 3:
                        startActivity(display);
                        break;
                    default:
                        //
                        break;
                }
            }
        });

    }




}