package it.sgp.tripplanner;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class loadTR extends AppCompatActivity {

    TextView loadDN, loadDNo, loadDT, loadDC, loadSN,loadDSN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_tr);

        loadDN = findViewById(R.id.loadDN);
        loadDNo = findViewById(R.id.loadDNo);
        loadDT = findViewById(R.id.loadDT);
        loadDC = findViewById(R.id.loadDC);
        loadDSN = findViewById(R.id.loadDSN);
        loadSN = findViewById(R.id.LoadSN);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
        SharedPreferences.Editor editor = pref.edit();

        loadDN.setText(pref.getString("reTNKey", null));
        loadDNo.setText(pref.getInt("reTNoKey", 0) + "");
        loadDT.setText(pref.getInt("reTKey", 0) + "");
        loadDC.setText(pref.getString("reClassKey", null));
        loadDSN.setText(pref.getString("reCNKey", null));
        loadSN.setText(pref.getString("reSNKey", null));
    }
}
