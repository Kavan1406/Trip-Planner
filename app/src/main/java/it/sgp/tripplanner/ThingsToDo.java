package it.sgp.tripplanner;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ThingsToDo extends AppCompatActivity implements View.OnClickListener {

    EditText ttdo;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);

        ttdo = findViewById(R.id.ttdo);
        save = findViewById(R.id.save);

        save.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.save: {
                String ttd = ttdo.getText().toString();

                SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0);
                SharedPreferences.Editor editor = pref.edit();

                editor.putString("ttdKey", ttd);

                Toast.makeText(this, "Saved Succesfully!", Toast.LENGTH_LONG).show();

                editor.commit();
            }
        }
    }
}
