package com.example.eyouth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BirthControl extends AppCompatActivity {
    private Button button2;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth_control);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBirthControlIC();
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBirthControlHM();
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBirthControlBM();
            }
        });

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBirthControlPM();
            }
        });

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBirthControlOM();
            }
        });

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openselection();
            }
        });
    }

    public void openBirthControlIC() {
        Intent intent = new Intent(this, BirthControlIC.class);
        startActivity(intent);
    }

    public void openBirthControlHM() {
        Intent intent = new Intent(this, BirthControlHM.class);
        startActivity(intent);
    }

    public void openBirthControlBM() {
        Intent intent = new Intent(this, BirthControlBM.class);
        startActivity(intent);
    }

    public void openBirthControlPM() {
        Intent intent = new Intent(this, BirthControlPM.class);
        startActivity(intent);
    }

    public void openBirthControlOM() {
        Intent intent = new Intent(this, BirthControlOM.class);
        startActivity(intent);
    }

    public void openselection() {
        Intent intent = new Intent(this, selection.class);
        startActivity(intent);
    }
}