package it.sgp.tripplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class billSplitter extends AppCompatActivity implements View.OnClickListener {

    Button Done;
    EditText PersonIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill_splitter);

        Done = (Button) findViewById(R.id.Done);
        Done.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        PersonIn = (EditText) findViewById(R.id.PersonIn);
        String text = PersonIn.getText().toString();
        int n = Integer.parseInt(text);

        if (n == 3) {
            Intent intent = new Intent(this, Per3.class);
            startActivity(intent);
        } else if (n == 4) {
            Intent intent = new Intent(this, Per4.class);
            startActivity(intent);
        } else if (n == 5) {
            Intent intent = new Intent(this, per5.class);
            startActivity(intent);
        }

        else {
            Toast.makeText(this, "Invalid Number!", Toast.LENGTH_LONG).show();
        }

    }
}