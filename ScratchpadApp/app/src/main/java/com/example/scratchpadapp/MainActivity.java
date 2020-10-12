package com.example.scratchpadapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
    private EditText memoText;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        memoText = findViewById(R.id.memoText);
        saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!memoText.getText().toString().equals(""))
                {
                    String userInput = memoText.getText().toString();
                    writeToFile(userInput);
                    Toast.makeText(MainActivity.this, "Saved!", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
    private void writeToFile(String userInput)
    {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(openFileOutput("memo.txt",
                    Context.MODE_PRIVATE));
            outputStreamWriter.write(userInput);
            outputStreamWriter.close();

        } catch(FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private String readFromFile() throws IOException {
        String result = "";
        InputStream inputStream = openFileInput("memo.txt");
        if(inputStream != null)
        {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String temp = "";
            StringBuilder stringBuilder = new StringBuilder();

            while((temp = bufferedReader.readLine()) != null)
            {
                stringBuilder.append(temp);
                stringBuilder.append("\n");
            }

            inputStream.close();
            result = stringBuilder.toString();
        }
        return result;
    }
}