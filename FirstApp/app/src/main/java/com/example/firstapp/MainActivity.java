package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
        Button btnInc, btnDec, btnRest;
        TextView txt;
        int value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnInc = findViewById(R.id.button);
        btnInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value++;
                settingText(value);
            }
        });
        btnDec = findViewById(R.id.button1);
        btnDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value--;
                settingText(value);
            }
        });
        btnRest = findViewById(R.id.button2);
        btnRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = 0;
                settingText(value);
            }
        });
        txt = findViewById(R.id.txt);

    }

    public void ResetIT(View view) {
        value = 0;
        settingText(value);
    }
    //TODO
    public void settingText(int val)
    {
        txt.setText(Integer.toString(val));
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button:
                value++;
                settingText(value);
            case R.id.button1:
                value--;
                settingText(value);
            case R.id.button2:
                value=0;
                settingText(value);

        }
    }
}