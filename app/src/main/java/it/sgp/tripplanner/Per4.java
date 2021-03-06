package it.sgp.tripplanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Per4 extends AppCompatActivity implements View.OnClickListener {

    Button done;
    EditText per1, per2, per3, per4;
    TextView t1, t2, t3, t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_per4);

        done = (Button) findViewById(R.id.done);
        done.setOnClickListener(this);
        per1 = (EditText) findViewById(R.id.per1);
        per2 = (EditText) findViewById(R.id.per2);
        per3 = (EditText) findViewById(R.id.per3);
        per4 = (EditText)findViewById(R.id.per4);
        t1 = (TextView) findViewById(R.id.t1);
        t2 = (TextView) findViewById(R.id.t2);
        t3 = (TextView) findViewById(R.id.t3);
        t4 = (TextView) findViewById(R.id.t4);
    }

    @Override
    public void onClick(View v) {
        float n1 = 0, n2 = 0, n3 = 0, n4 = 0;

        switch (v.getId()) {
            case R.id.done: {


                n1 = n1 + Integer.parseInt(per1.getText().toString());
                n2 = n2 + Integer.parseInt(per2.getText().toString());
                n3 = n3 + Integer.parseInt(per3.getText().toString());
                n4 = n4 + Integer.parseInt(per4.getText().toString());

                float res = (n1 + n2 + n3 + n4) / 4;

                n1 -= res;
                n2 -= res;
                n3 -= res;
                n4 -= res;

                t1.setText("Person 1 : " + String.format("%.02f", n1));
                t2.setText("Person 2 : " + String.format("%.02f", n2));
                t3.setText("Person 3 : " + String.format("%.02f", n3));
                t4.setText("Person 4 : " + String.format("%.02f", n4));

                break;
            }

            default:
                break;
        }
    }
}
