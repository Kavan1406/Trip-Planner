package it.sgp.tripplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loadTrain extends AppCompatActivity implements View.OnClickListener {

    Button loadTD, loadTR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load_train);

        loadTD = findViewById(R.id.loadTD);
        loadTR = findViewById(R.id.loadTR);

        loadTR.setOnClickListener(this);
        loadTD.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.loadTD: {
                Intent intent = new Intent(this, loadTD.class);
                startActivity(intent);
                break;
            }

            case R.id.loadTR: {
                Intent intent = new Intent(this, loadTR.class);
                startActivity(intent);
                break;
            }

            default:
                break;
        }
    }
}
