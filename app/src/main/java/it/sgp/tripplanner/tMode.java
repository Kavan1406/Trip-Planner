package it.sgp.tripplanner;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tMode extends AppCompatActivity implements View.OnClickListener {

   Button flight,train,car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t_mode);

        flight = findViewById(R.id.flight);
        train = findViewById(R.id.train);
        car = findViewById(R.id.car);

        flight.setOnClickListener(this);
        train.setOnClickListener(this);
        car.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        int num=0;
        switch (v.getId()) {

            case R.id.flight: {
                num=1;
                Intent in = new Intent(this, Flight.class);
                startActivity(in);

                break;
            }

            case R.id.train: {
                num=2;
                Intent intent = new Intent(this, Train.class);
                startActivity(intent);

                break;
            }

            case R.id.car: {
                num = 3;
                Intent i = new Intent(this, Car.class);
                startActivity(i);

                break;
            }

            default:
                break;
        }
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt("TravelModeKey", num);
        editor.commit();
    }
}
