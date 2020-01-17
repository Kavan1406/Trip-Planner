package it.sgp.tripplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tripPlanner extends AppCompatActivity implements View.OnClickListener {

    Button newTrip, existing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_planner);

        newTrip =  findViewById(R.id.newTrip);
        existing = findViewById(R.id.existing);

            newTrip.setOnClickListener(this);
            existing.setOnClickListener(this);
        }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.newTrip:
                Intent in = new Intent(this, newTrip.class);
                startActivity(in);

                break;

            case R.id.existing:
                Intent intent = new Intent(this, loadTrip.class);
                startActivity(intent);

                break;
            default:
                break;
        }
    }
}
