package it.sgp.tripplanner;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Duration extends AppCompatActivity implements View.OnClickListener {

    EditText nop,dd,mm,yy,ddt,mmt,yyt,fPlace,tPlace;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duration);

        nop = findViewById(R.id.nop);
        dd = findViewById(R.id.dd);
        mm = findViewById(R.id.mm);
        yy = findViewById(R.id.yy);
        ddt = findViewById(R.id.ddt);
        mmt = findViewById(R.id.mmt);
        yyt = findViewById(R.id.yyt);
        fPlace = findViewById(R.id.fPlace);
        tPlace = findViewById(R.id.tPlace);
        save = findViewById(R.id.save);

        save.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.save:{
                String fd = "FromDKey" ;
                String fm = "FromMKey";
                String fy = "FromYKey";
                String td = "ToDKey";
                String tm = "ToMKey";
                String ty = "ToYKey";
                String numOfPer = "nopKey";
                String frP = "fromPlaceKey";
                String toP = "toPlaceKey";

                int date = Integer.parseInt(dd.getText().toString());
                int month = Integer.parseInt(mm.getText().toString());
                int year = Integer.parseInt(yy.getText().toString());
                int Todate = Integer.parseInt(ddt.getText().toString());
                int Tomonth = Integer.parseInt(mmt.getText().toString());
                int Toyear = Integer.parseInt(yyt.getText().toString());
                int np = Integer.parseInt(nop.getText().toString());
                String fromP = fPlace.getText().toString();
                String toPl = tPlace.getText().toString();

                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
                SharedPreferences.Editor editor = pref.edit();

                editor.putInt(fd, date);
                editor.putInt(fm, month);
                editor.putInt(fy, year);
                editor.putInt(td, Todate);
                editor.putInt(tm, Tomonth);
                editor.putInt(ty, Toyear);

                editor.putInt(numOfPer, np);
                editor.putString(frP, fromP);
                editor.putString(toP, toPl);

                Toast.makeText(this, "Saved Succesfully!", Toast.LENGTH_LONG).show();

                editor.commit();

            }
        }
    }
}

