package it.sgp.tripplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button tPlanner;
    Button bSplitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tPlanner = (Button)findViewById(R.id.tPlanner);
        tPlanner.setOnClickListener(this);

        bSplitter = (Button)findViewById(R.id.bSplitter);
        bSplitter.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.bSplitter: {
                Intent in = new Intent(this, billSplitter.class);
                startActivity(in);

                break;
            }

            case R.id.tPlanner: {
                Intent intent = new Intent(this, tripPlanner.class);
                startActivity(intent);

                break;
            }
            default:
                break;
        }
    }
}