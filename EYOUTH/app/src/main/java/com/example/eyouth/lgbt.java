package com.example.eyouth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lgbt extends AppCompatActivity {
    private Button button18;
    private Button button19;
    private Button button20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lgbt);

        button18 = (Button) findViewById(R.id.button18);
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openlgbtso();
            }
        });

        button19 = (Button) findViewById(R.id.button19);
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openlgbtgi();
            }
        });

        button20 = (Button) findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openselection();
            }
        });
    }

    public void openlgbtso() {
        Intent intent = new Intent(this, lgbtso.class);
        startActivity(intent);
    }

    public void openlgbtgi() {
        Intent intent = new Intent(this, lgbtgi.class);
        startActivity(intent);
    }

    public void openselection() {
        Intent intent = new Intent(this, selection.class);
        startActivity(intent);
    }
}