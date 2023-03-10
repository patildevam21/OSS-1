package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FrontScreen extends AppCompatActivity {
    CardView tmp;
    CardView weight;
    CardView length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_screen);
        tmp=findViewById(R.id.tmp);
        weight=findViewById(R.id.weight);
        length =findViewById(R.id.length);
        tmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FrontScreen.this,temperature.class));
            }
        });

        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FrontScreen.this,weightcon.class));
            }
        });

        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FrontScreen.this,lengthcon.class));
            }
        });

    }
}