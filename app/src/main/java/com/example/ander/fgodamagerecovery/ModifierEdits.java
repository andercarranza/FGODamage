package com.example.ander.fgodamagerecovery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ander.fgodamagerecovery.Objects.Servant;

public class ModifierEdits extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    Servant servant1, servant2, servant3, enemy;
    EditText servant1ATKmod, servant1CRITmod, servant1NPDMGmod, servant1POWERmod, servant1ARTSmod, servant1BUSTERmod, servant1QUICKmod, servant1DMGPLUSADD,
            servant2ATKmod, servant2CRITmod, servant2NPDMGmod, servant2POWERmod, servant2ARTSmod, servant2BUSTERmod, servant2QUICKmod, servant2DMGPLUSADD,
            servant3ATKmod, servant3CRITmod, servant3NPDMGmod, servant3POWERmod, servant3ARTSmod, servant3BUSTERmod, servant3QUICKmod, servant3DMGPLUSADD;
    Boolean errorFree = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modifieredit);
        Intent servantInfo = getIntent();
        final Bundle recieved = servantInfo.getExtras();
        enemy = servantInfo.getParcelableExtra("EnemyObj");
        servant1 = servantInfo.getParcelableExtra("serv_1a");
        servant2 = servantInfo.getParcelableExtra("serv_2a");
        servant3 = servantInfo.getParcelableExtra("serv_3a");
        TextView servant1NM = (TextView) findViewById(R.id.servant1NM);
        TextView servant2NM = (TextView) findViewById(R.id.servant2NM);
        TextView servant3NM = (TextView) findViewById(R.id.servant3NM);
        TextView enemyNM = (TextView) findViewById(R.id.enemyServ);

        servant1NM.setText(servant1.getName());
        servant2NM.setText(servant2.getName());
        servant3NM.setText(servant3.getName());
        enemyNM.setText(enemy.getName());

        Button recalculate = (Button) findViewById(R.id.recalcBtn);
        Button cardSelect = (Button) findViewById(R.id.cardSelBtn);

        servant1ATKmod = (EditText) findViewById(R.id.servant1ATKmodedit);
        servant1CRITmod = (EditText) findViewById(R.id.servant1CRITmodedit);
        servant1NPDMGmod = (EditText) findViewById(R.id.servant1NPDMGmodedit);
        servant1POWERmod = (EditText) findViewById(R.id.servant1POWERmodedit);
        servant1ARTSmod = (EditText) findViewById(R.id.servant1ARTSmodedit);
        servant1BUSTERmod = (EditText) findViewById(R.id.servant1BUSTERmodedit);
        servant1QUICKmod = (EditText) findViewById(R.id.servant1QUICKmodedit);
        servant1DMGPLUSADD = (EditText) findViewById(R.id.servant1DMGPLUSADDedit);

        servant2ATKmod = (EditText) findViewById(R.id.servant2ATKmodedit);
        servant2CRITmod = (EditText) findViewById(R.id.servant2CRITmodedit);
        servant2NPDMGmod = (EditText) findViewById(R.id.servant2NPDMGmodedit);
        servant2POWERmod = (EditText) findViewById(R.id.servant2POWERmodedit);
        servant2ARTSmod = (EditText) findViewById(R.id.servant2ARTSmodedit);
        servant2BUSTERmod = (EditText) findViewById(R.id.servant2BUSTERmodedit);
        servant2QUICKmod = (EditText) findViewById(R.id.servant2QUICKmodedit);
        servant2DMGPLUSADD = (EditText) findViewById(R.id.servant2DMGPLUSADDedit);

        servant3ATKmod = (EditText) findViewById(R.id.servant3ATKmodedit);
        servant3CRITmod = (EditText) findViewById(R.id.servant3CRITmodedit);
        servant3NPDMGmod = (EditText) findViewById(R.id.servant3NPDMGmodedit);
        servant3POWERmod = (EditText) findViewById(R.id.servant3POWERmodedit);
        servant3ARTSmod = (EditText) findViewById(R.id.servant3ARTSmodedit);
        servant3BUSTERmod = (EditText) findViewById(R.id.servant3BUSTERmodedit);
        servant3QUICKmod = (EditText) findViewById(R.id.servant3QUICKmodedit);
        servant3DMGPLUSADD = (EditText) findViewById(R.id.servant3DMGPLUSADDedit);

        setHints();

        final Intent recalc = new Intent(this, Calculate.class);
        final Intent selectCards = new Intent(this, CardSelect.class);

        recalculate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                retrieveInputs();
                recalc.putExtras(recieved);
                recalc.putExtra("EnemyObj", enemy);
                recalc.putExtra("Servant1Obj", servant1);
                recalc.putExtra("Servant2Obj", servant2);
                recalc.putExtra("Servant3Obj", servant3);
                startActivity(recalc);
            }
        });

        cardSelect.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //selectCards.putExtra("servant", 1);
                retrieveInputs();
                selectCards.putExtra("enemyObj", enemy);
                selectCards.putExtra("serv_1a", servant1);
                selectCards.putExtra("serv_2a", servant2);
                selectCards.putExtra("serv_3a", servant3);
                startActivity(selectCards);
                //this.overridePendingTransition(0, 0);
            }

        });

    }

    public void retrieveInputs() {
        if (!servant1ATKmod.getText().toString().equals("")) {
            servant1.setAtkMod(Double.parseDouble(servant1ATKmod.getText().toString()) / 100);
        }
        if (!servant1CRITmod.getText().toString().equals("")) {
            servant1.setCritDamageMod(Double.parseDouble(servant1CRITmod.getText().toString()) / 100);
        }
        if (!servant1NPDMGmod.getText().toString().equals("")) {
            servant1.setNpDamageMod(Double.parseDouble(servant1NPDMGmod.getText().toString()) / 100);
        }
        if (!servant1POWERmod.getText().toString().equals("")) {
            servant1.setPowerMod(Double.parseDouble(servant1POWERmod.getText().toString()) / 100);
        }
        if (!servant1ARTSmod.getText().toString().equals("")) {
            servant1.setArtsMOD(Double.parseDouble(servant1ARTSmod.getText().toString()) / 100);
        }
        if (!servant1BUSTERmod.getText().toString().equals("")) {
            servant1.setBusterMOD(Double.parseDouble(servant1BUSTERmod.getText().toString()) / 100);
        }
        if (!servant1QUICKmod.getText().toString().equals("")) {
            servant1.setQuickMOD(Double.parseDouble(servant1QUICKmod.getText().toString()) / 100);
        }
        if (!servant1DMGPLUSADD.getText().toString().equals("")) {
            servant1.setDmgPlusAdd(Integer.parseInt(servant1DMGPLUSADD.getText().toString()));
        }


        if (!servant2ATKmod.getText().toString().equals("")) {
            servant2.setAtkMod(Double.parseDouble(servant2ATKmod.getText().toString()) / 100);
        }
        if (!servant2CRITmod.getText().toString().equals("")) {
            servant2.setCritDamageMod(Double.parseDouble(servant2CRITmod.getText().toString()) / 100);
        }
        if (!servant2NPDMGmod.getText().toString().equals("")) {
            servant2.setNpDamageMod(Double.parseDouble(servant2NPDMGmod.getText().toString()) / 100);
        }
        if (!servant2POWERmod.getText().toString().equals("")) {
            servant2.setPowerMod(Double.parseDouble(servant2POWERmod.getText().toString()) / 100);
        }
        if (!servant2ARTSmod.getText().toString().equals("")) {
            servant2.setArtsMOD(Double.parseDouble(servant2ARTSmod.getText().toString()) / 100);
        }
        if (!servant2BUSTERmod.getText().toString().equals("")) {
            servant2.setBusterMOD(Double.parseDouble(servant2BUSTERmod.getText().toString()) / 100);
        }
        if (!servant2QUICKmod.getText().toString().equals("")) {
            servant2.setQuickMOD(Double.parseDouble(servant2QUICKmod.getText().toString()) / 100);
        }
        if (!servant2DMGPLUSADD.getText().toString().equals("")) {
            servant2.setDmgPlusAdd(Integer.parseInt(servant2DMGPLUSADD.getText().toString()));
        }


        if (!servant3ATKmod.getText().toString().equals("")) {
            servant3.setAtkMod(Double.parseDouble(servant3ATKmod.getText().toString()) / 100);
        }
        if (!servant3CRITmod.getText().toString().equals("")) {
            servant3.setCritDamageMod(Double.parseDouble(servant3CRITmod.getText().toString()) / 100);
        }
        if (!servant3NPDMGmod.getText().toString().equals("")) {
            servant3.setNpDamageMod(Double.parseDouble(servant3NPDMGmod.getText().toString()) / 100);
        }
        if (!servant3POWERmod.getText().toString().equals("")) {
            servant3.setPowerMod(Double.parseDouble(servant3POWERmod.getText().toString()) / 100);
        }
        if (!servant3ARTSmod.getText().toString().equals("")) {
            servant3.setArtsMOD(Double.parseDouble(servant3ARTSmod.getText().toString()) / 100);
        }
        if (!servant3BUSTERmod.getText().toString().equals("")) {
            servant3.setBusterMOD(Double.parseDouble(servant3BUSTERmod.getText().toString()) / 100);
        }
        if (!servant3QUICKmod.getText().toString().equals("")) {
            servant3.setQuickMOD(Double.parseDouble(servant3QUICKmod.getText().toString()) / 100);
        }
        if (!servant3DMGPLUSADD.getText().toString().equals("")) {
            servant3.setDmgPlusAdd(Integer.parseInt(servant3DMGPLUSADD.getText().toString()));
        }

    }

    public void setHints() {
        if (servant1.getAtkMod() != 0) {
            servant1ATKmod.setHint("" + (servant1.getAtkMod() * 100) + "%");
        }
        if (servant1.getCritDamageMod() != 0) {
            servant1CRITmod.setHint("" + (servant1.getCritDamageMod() * 100) + "%");
        }
        if (servant1.getNpDamageMod() != 0) {
            servant1NPDMGmod.setHint("" + (servant1.getNpDamageMod() * 100) + "%");
        }
        if (servant1.getPowerMod() != 0) {
            servant1POWERmod.setHint("" + (servant1.getPowerMod() * 100) + "%");
        }
        if (servant1.getArtsMOD() != 0) {
            servant1ARTSmod.setHint("" + (servant1.getArtsMOD() * 100) + "%");
        }
        if (servant1.getBusterMOD() != 0) {
            servant1BUSTERmod.setHint("" + (servant1.getBusterMOD() * 100) + "%");
        }
        if (servant1.getQuickMOD() != 0) {
            servant1QUICKmod.setHint("" + (servant1.getQuickMOD() * 100) + "%");
        }
        if (servant1.getDmgPlusAdd() != 0) {
            servant1DMGPLUSADD.setHint("" + (servant1.getDmgPlusAdd()));
        }

        if (servant2.getAtkMod() != 0) {
            servant2ATKmod.setHint("" + (servant2.getAtkMod() * 100) + "%");
        }
        if (servant2.getCritDamageMod() != 0) {
            servant2CRITmod.setHint("" + (servant2.getCritDamageMod() * 100) + "%");
        }
        if (servant2.getNpDamageMod() != 0) {
            servant2NPDMGmod.setHint("" + (servant2.getNpDamageMod() * 100) + "%");
        }
        if (servant2.getPowerMod() != 0) {
            servant2POWERmod.setHint("" + (servant2.getPowerMod() * 100) + "%");
        }
        if (servant2.getArtsMOD() != 0) {
            servant2ARTSmod.setHint("" + (servant2.getArtsMOD() * 100) + "%");
        }
        if (servant2.getBusterMOD() != 0) {
            servant2BUSTERmod.setHint("" + (servant2.getBusterMOD() * 100) + "%");
        }
        if (servant2.getQuickMOD() != 0) {
            servant2QUICKmod.setHint("" + (servant2.getQuickMOD() * 100) + "%");
        }
        if (servant2.getDmgPlusAdd() != 0) {
            servant2DMGPLUSADD.setHint("" + (servant2.getDmgPlusAdd()));
        }

        if (servant3.getAtkMod() != 0) {
            servant3ATKmod.setHint("" + (servant3.getAtkMod() * 100) + "%");
        }
        if (servant3.getCritDamageMod() != 0) {
            servant3CRITmod.setHint("" + (servant3.getCritDamageMod() * 100) + "%");
        }
        if (servant3.getNpDamageMod() != 0) {
            servant3NPDMGmod.setHint("" + (servant3.getNpDamageMod() * 100) + "%");
        }
        if (servant3.getPowerMod() != 0) {
            servant3POWERmod.setHint("" + (servant3.getPowerMod() * 100) + "%");
        }
        if (servant3.getArtsMOD() != 0) {
            servant3ARTSmod.setHint("" + (servant3.getArtsMOD() * 100) + "%");
        }
        if (servant3.getBusterMOD() != 0) {
            servant3BUSTERmod.setHint("" + (servant3.getBusterMOD() * 100) + "%");
        }
        if (servant3.getQuickMOD() != 0) {
            servant3QUICKmod.setHint("" + (servant3.getQuickMOD() * 100) + "%");
        }
        if (servant3.getDmgPlusAdd() != 0) {
            servant3DMGPLUSADD.setHint("" + (servant3.getDmgPlusAdd()));
        }

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
