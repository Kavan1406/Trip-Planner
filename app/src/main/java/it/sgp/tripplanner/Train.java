package it.sgp.tripplanner;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Train extends AppCompatActivity implements View.OnClickListener {

    EditText dTName,rTName,dTime,rTime,dSNo,rSNo,dTNo,rTNo,dCNo,rCNo,dClass,rClass;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train);

        dTName = findViewById(R.id.dTName);
         rTName = findViewById(R.id.rTName);
         dTime = findViewById(R.id.dTime);
         rTime = findViewById(R.id.rTime);
         dSNo = findViewById(R.id.dSNo);
         rSNo = findViewById(R.id.rSNo);
         dTNo = findViewById(R.id.dTNo);
         rTNo = findViewById(R.id.rTNo);
         dCNo = findViewById(R.id.dCNo);
         rCNo = findViewById(R.id.rCNo);
         dClass = findViewById(R.id.dClass);
         rClass = findViewById(R.id.rClass);
         save = findViewById(R.id.save);

         save.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.save:{

                String deTN = "deTNKey";
                String reTN = "reTNKey";
                String deTime = "deTKey";
                String reTime = "reTKey";
                String deSN = "deSNKey";
                String reSN = "reSNKey";
                String deCN = "deCNKey";
                String reCN = "reCNKey";
                String reTNo = "reTNoKey";
                String deTNo = "deTNoKey";
                String deClass = "deClassKey";
                String reClass = "reClassKey";

                String deTName = dTName.getText().toString();
                String reTName = rTName.getText().toString();
                int deT = Integer.parseInt(dTime.getText().toString());
                int reT = Integer.parseInt(rTime.getText().toString());
                String deSNo = dSNo.getText().toString();
                String reSNo = rSNo.getText().toString();
                String reCNo = rCNo.getText().toString();
                String deCNo = dCNo.getText().toString();
                int reTNum = Integer.parseInt(rTNo.getText().toString());
                int deTNum =Integer.parseInt( dTNo.getText().toString());
                String deCl = dClass.getText().toString();
                String reCl = rClass.getText().toString();

                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
                SharedPreferences.Editor editor = pref.edit();

                editor.putString(deTN ,deTName );
                editor.putString(reTN ,reTName );
                editor.putString(deSN ,deSNo );
                editor.putString(reSN ,reSNo );
                editor.putString(deCN ,deCNo );
                editor.putString(reCN ,reCNo );
                editor.putString(deClass ,deCl );
                editor.putString(reClass ,reCl );
                editor.putInt(deTime, deT);
                editor.putInt(reTNo, reTNum);
                editor.putInt(deTNo,deTNum);
                editor.putInt(reTime, reT);

                Toast.makeText(this, "Saved Succesfully!", Toast.LENGTH_LONG).show();

                editor.commit();


            }
        }
    }
}
