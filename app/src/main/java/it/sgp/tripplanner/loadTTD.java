package it.sgp.tripplanner;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class loadTTD extends AppCompatActivity {

    TextView ttDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_ttd);

        ttDo = findViewById(R.id.ttDO);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
        SharedPreferences.Editor editor = pref.edit();

        ttDo.setText(pref.getString("ttdKey", null));
    }
}
