package it.sgp.tripplanner;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class loadFlight extends AppCompatActivity {

    TextView depFr,depTo,dFlNo,dTim,rF,rT,rFlNo,rTim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_flight);

        depFr = findViewById(R.id.depFr);
        depTo = findViewById(R.id.depTo);
        dFlNo = findViewById(R.id.dFlNo);
        dTim = findViewById(R.id.dTim);
        rF = findViewById(R.id.rF);
        rT = findViewById(R.id.rT);
        rFlNo = findViewById(R.id.rFlNo);
        rTim = findViewById(R.id.rTim);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
        SharedPreferences.Editor editor = pref.edit();

        depFr.setText("    " + pref.getString("FromDeKey",null));
        rF.setText(" " + pref.getString("FromReKey",null));
        depTo.setText( pref.getString("ToDeKey",null));
        rT.setText(pref.getString("ToReKey",null));
        dFlNo.setText("   " + pref.getString("fNoDeKey",null));
        rFlNo.setText("  " + pref.getString("fNoReKey",null));
        rTim.setText(pref.getInt("TimeReKey",0)+ " Hrs.");
        dTim.setText(pref.getInt("TimeDeKey",0)+ " Hrs.");
    }
}
