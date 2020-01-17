package it.sgp.tripplanner;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Car extends AppCompatActivity implements View.OnClickListener {

    Button self ,rent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        self = findViewById(R.id.self);
        rent = findViewById(R.id.rent);

        self.setOnClickListener(this);
        rent.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
        SharedPreferences.Editor editor = pref.edit();

        switch (v.getId()){

            case R.id.self: {
                editor.putString("carKey","Self Drive Car");
                editor.commit();
                break;
            }

            case R.id.rent: {
                editor.putString("carKey","Rental Car");
                editor.commit();
                break;
            }
        }
    }
}
