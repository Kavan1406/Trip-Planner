package it.sgp.tripplanner;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Flight extends AppCompatActivity implements View.OnClickListener {

    EditText depFrom,retFrom,depTo,retTo,dFNo,rFNo,rTime,dTime;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flight);

        depFrom = findViewById(R.id.depFrom);
        retFrom = findViewById(R.id.retFrom);
        depTo = findViewById(R.id.depTo);
        retTo = findViewById(R.id.retTo);
        dFNo = findViewById(R.id.dFNo);
        rFNo = findViewById(R.id.rFNo);
        rTime = findViewById(R.id.rTime);
        dTime = findViewById(R.id.dTime);
        save = findViewById(R.id.save);

        save.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.save: {

                String deF = "FromDeKey";
                String reF = "FromReKey";
                String deT = "ToDeKey";
                String reT = "ToReKey";
                String dF = "fNoDeKey";
                String rF = "fNoReKey";
                String dT = "TimeDeKey";
                String rT = "TimeReKey";

                String deFr = depFrom.getText().toString();
                String reFr = retFrom.getText().toString();
                String deTo = depTo.getText().toString();
                String reTo = retTo.getText().toString();
                String deFN = dFNo.getText().toString();
                String reFN = rFNo.getText().toString();
                int retTime = Integer.parseInt(rTime.getText().toString());
                int depTime = Integer.parseInt(dTime.getText().toString());

                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
                SharedPreferences.Editor editor = pref.edit();

                editor.putString(deF ,deFr );
                editor.putString(reF ,reFr );
                editor.putString(deT ,deTo );
                editor.putString(reT ,reTo );
                editor.putString(dF ,deFN );
                editor.putString(rF ,reFN );
                editor.putInt(dT, depTime);
                editor.putInt(rT, retTime);

                Toast.makeText(this, "Saved Succesfully!", Toast.LENGTH_LONG).show();

                editor.commit();

            }
        }
    }
}
