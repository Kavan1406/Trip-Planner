package it.sgp.tripplanner;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class newTrip extends AppCompatActivity implements View.OnClickListener {

    Button dd;
    Button tMode;
    Button ttd;
    Button booking;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_trip);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
        SharedPreferences.Editor editor = pref.edit();

        editor.clear();
        editor.commit();

        dd = findViewById(R.id.duration);
        tMode = findViewById(R.id.tMode);
        ttd = findViewById(R.id.ttd);
        booking =findViewById(R.id.booking);

        dd.setOnClickListener(this);
        tMode.setOnClickListener(this);
        ttd.setOnClickListener(this);
        booking.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.duration: {
                Intent in = new Intent(this,Duration.class);
                startActivity(in);

                break;
            }

            case R.id.tMode: {
                Intent intent = new Intent(this, tMode.class);
                startActivity(intent);

                break;
            }

            case R.id.ttd:{
                Intent intent = new Intent(this, ThingsToDo.class);
                startActivity(intent);

                break;
            }

            case R.id.booking:{
                Intent intent = new Intent(this, hotelBookings.class);
                startActivity(intent);

                break;
            }
            default:
                break;
        }
    }
}
