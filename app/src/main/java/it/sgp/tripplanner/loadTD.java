package it.sgp.tripplanner;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class loadTD extends AppCompatActivity {

    TextView loadTN, loadTNo, loadT, loadC, loadCN,loadSN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_td);

        loadTN = findViewById(R.id.loadTN);
        loadTNo = findViewById(R.id.loadTNo);
        loadT = findViewById(R.id.loadT);
        loadC = findViewById(R.id.loadC);
        loadCN = findViewById(R.id.loadCN);
        loadSN = findViewById(R.id.loadDSN);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
        SharedPreferences.Editor editor = pref.edit();

        loadTN.setText(pref.getString("deTNKey", null));
        loadTNo.setText(pref.getInt("deTNoKey", 0) + "");
        loadT.setText(pref.getInt("deTKey", 0) + "");
        loadC.setText(pref.getString("deClassKey", null));
        loadCN.setText(pref.getString("deCNKey", null));
        loadSN.setText(pref.getString("deSNKey", null));
        }
}
