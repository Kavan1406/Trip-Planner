package it.sgp.tripplanner;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class loadHotel extends AppCompatActivity {

    TextView hotelName, ciTime, coTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_hotel);

        hotelName = findViewById(R.id.hotelName);
        ciTime = findViewById(R.id.ciTime);
        coTime = findViewById(R.id.coTime);

        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
        SharedPreferences.Editor editor = pref.edit();

        hotelName.setText(pref.getString("HotelNameKey", null));
        int cin= (pref.getInt("CheckInTimeKey" , 0));
        int cot =(pref.getInt("CheckOutTime" , 0));

        ciTime.setText(cin+" ");
        coTime.setText(cot+" ");
    }
}
