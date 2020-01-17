package it.sgp.tripplanner;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class loadTrip extends AppCompatActivity implements View.OnClickListener {
    TextView loadF,loadTo,loadS,loadE, loadn;
    Button loadDetails, loadH, loadTTD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_trip);

        int dd,mm,yy;

        loadDetails = findViewById(R.id.loadDetails);
        loadH = findViewById(R.id.loadH);
        loadTTD = findViewById(R.id.loadTTD);

        loadDetails = findViewById(R.id.loadDetails);
        loadE = findViewById(R.id.loadE);
        loadF = findViewById(R.id.loadF);
        loadTo = findViewById(R.id.loadTo);
        loadS = findViewById(R.id.loadS);
        loadn = findViewById(R.id.loadn);
        loadH = findViewById(R.id.loadH);
        loadTTD = findViewById(R.id.loadTTD);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
        SharedPreferences.Editor editor = pref.edit();


        dd=(pref.getInt("FromDKey",0));
        mm=(pref.getInt("FromMKey",0));
        yy=(pref.getInt("FromYKey",0));

        loadS.setText(dd + "/" + mm + "/" + yy);

        dd=pref.getInt("ToDKey",0);
        mm=pref.getInt("ToMKey",0);
        yy=pref.getInt("ToYKey",0);

        loadE.setText(dd + "/" + mm + "/" + yy);

        loadF.setText(pref.getString("fromPlaceKey", null));
        loadTo.setText(pref.getString("toPlaceKey", null));

        int num = pref.getInt("nopKey", 0);
        loadn.setText(num+ " ");

        loadDetails.setOnClickListener(this);
        loadH.setOnClickListener(this);
        loadTTD.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
      //  SharedPreferences.Editor editor = pref.edit();
        int a ;
        a=(int)pref.getInt("TravelModeKey", 0);

        switch (v.getId()){

            case R.id.loadDetails:{

                if(a==1) {
                    Intent in = new Intent(this, loadFlight.class);
                    startActivity(in);
                }

                else if(a==2){
                    Intent intent = new Intent(this,loadTrain.class);
                    startActivity(intent);
                }

                else {
                    Intent i = new Intent(this, loadCar.class);
                    startActivity(i);
                }

                break;
            }

            case R.id.loadH:{
                Intent i = new Intent(this,loadHotel.class);
                startActivity(i);
                break;
            }

            case R.id.loadTTD:{
                Intent intent = new Intent(this,loadTTD.class);
                startActivity(intent);
                break;
            }
        }
    }
}
