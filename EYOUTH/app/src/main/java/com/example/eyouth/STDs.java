package com.example.eyouth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class STDs extends AppCompatActivity {
    private Button button13;
    private Button button16;
    private Button button17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stds);

        button13 = (Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openstdsCM();
            }
        });

        button16 = (Button) findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSTDsMC();
            }
        });

        button17 = (Button) findViewById(R.id.button17);
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openselection();
            }
        });
    }

    public void openstdsCM() {
        Intent intent = new Intent(this, stdsCM.class);
        startActivity(intent);
    }

    public void openSTDsMC() {
        Intent intent = new Intent(this, stdsCM.class);
        startActivity(intent);
    }

    public void openselection() {
        Intent intent = new Intent(this, selection.class);
        startActivity(intent);
    }
}