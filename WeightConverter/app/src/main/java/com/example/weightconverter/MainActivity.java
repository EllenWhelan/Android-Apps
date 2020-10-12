package com.example.weightconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void cnvPounds(View view){

        EditText weightInKg = (EditText) findViewById(R.id.edTxtKg);

        String strKg = weightInKg.getText().toString();

        Double dblKg = Double.parseDouble(strKg);

        Double PoundsAmount = dblKg * 2.20462;

        Toast.makeText(getApplicationContext(), "Weight in pounds = " + PoundsAmount + "lbs", Toast.LENGTH_LONG).show();
    }

    public void cnvKgs(View v){

        EditText weightInLbs = (EditText) findViewById(R.id.edtTxtLbs);

        String strLbs = weightInLbs.getText().toString();

        Double dblLbs = Double.parseDouble(strLbs);

        Double KgAmount = dblLbs * 0.453592;

        Toast.makeText(getApplicationContext(), "Weight in pounds = " + KgAmount + "kg", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}