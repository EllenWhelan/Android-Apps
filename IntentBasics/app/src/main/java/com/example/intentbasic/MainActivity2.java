package com.example.intentbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void goBack(View view){
        Intent i2 =new Intent( MainActivity2.this, MainActivity.class);
        MainActivity2.this.startActivity(i2);

    }
}