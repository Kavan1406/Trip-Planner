package it.sgp.tripplanner;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class hotelBookings extends AppCompatActivity implements View.OnClickListener {

    EditText hName, ciT, coT;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_bookings);

        hName = findViewById(R.id.hName);
        ciT = findViewById(R.id.ciT);
        coT = findViewById(R.id.coT);
        save = findViewById(R.id.save);

        save.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String hotelN = hName.getText().toString();
        int ciTime = Integer.parseInt(ciT.getText().toString());
        int coTime = Integer.parseInt(coT.getText().toString());

        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
        SharedPreferences.Editor editor = pref.edit();

        editor.putString("HotelNameKey", hotelN);
        editor.putInt("CheckInTimeKey", ciTime);
        editor.putInt("CheckOutTime", coTime);

        Toast.makeText(this, "Saved Succesfully!", Toast.LENGTH_LONG).show();

        editor.commit();
    }
}
