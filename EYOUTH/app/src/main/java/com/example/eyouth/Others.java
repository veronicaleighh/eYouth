package com.example.eyouth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Others extends AppCompatActivity {
    private Button button35;
    private Button button36;
    private Button button37;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);

        button35 = (Button) findViewById(R.id.button35);
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOthersMF();
            }
        });

        button36 = (Button) findViewById(R.id.button36);
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openOthersT();
            }
        });

        button37 = (Button) findViewById(R.id.button37);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openselection();
            }
        });
    }

    public void openOthersMF() {
        Intent intent = new Intent(this, OthersMF.class);
        startActivity(intent);
    }

    public void openOthersT() {
        Intent intent = new Intent(this, OthersT.class);
        startActivity(intent);
    }

    public void openselection() {
        Intent intent = new Intent(this, selection.class);
        startActivity(intent);
    }
}