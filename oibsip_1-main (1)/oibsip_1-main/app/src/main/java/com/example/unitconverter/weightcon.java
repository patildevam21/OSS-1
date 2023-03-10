package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class weightcon extends AppCompatActivity {

    EditText edit_txt1;
    TextView text_v1;
    RadioButton KtoG,GtoK,KtoP,PtoK;
    Button Convertbtn;
    Double y;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weightcon);
        edit_txt1=findViewById(R.id.edit_txt1);
        text_v1=findViewById(R.id.text_v1);
        KtoG=findViewById(R.id.KtoG);
        GtoK=findViewById(R.id.GtoK);
        KtoP=findViewById(R.id.KtoP);
        PtoK=findViewById(R.id.PtoK);
        Convertbtn=findViewById(R.id.Convertbtn);
        Convertbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit_txt1.getText().toString().isEmpty()) {
                    text_v1.setText("Kindly Enter weight");
                } else {
                    y = Double.parseDouble(String.valueOf(edit_txt1.getText()));
                    if (KtoG.isChecked()) {
                        y = y * 1000;
                        y = Double.parseDouble(new DecimalFormat("##.####").format(y));
                        text_v1.setText(String.valueOf(y) + " gram");
                    } else if (GtoK.isChecked()) {
                        y = y / 1000;
                        y = Double.parseDouble(new DecimalFormat("##.####").format(y));
                        text_v1.setText(String.valueOf(y) + " kilogram");
                    } else if (KtoP.isChecked()) {
                        y = y * 2.205;
                        y = Double.parseDouble(new DecimalFormat("##.####").format(y));
                        text_v1.setText(String.valueOf(y) + " pounds");
                    } else if (PtoK.isChecked()) {
                        y = y * 0.45359237;
                        y = Double.parseDouble(new DecimalFormat("##.####").format(y));
                        text_v1.setText(String.valueOf(y) + " kilogram");

                    }
                        else
                    {
                        edit_txt1.setText("Kindly select any one option");
                    }
                }
            }
        });


    }
}