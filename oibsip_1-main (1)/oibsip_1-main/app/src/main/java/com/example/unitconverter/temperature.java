package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class temperature extends AppCompatActivity {
Button Converttmp;
EditText entertmp;
TextView anstmp;
RadioButton FtoC,CtoF;
Double x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        Converttmp=findViewById(R.id.Converttmp);
        entertmp=findViewById(R.id.entertmp);
        anstmp=findViewById(R.id.anstmp);
        FtoC=findViewById(R.id.FtoC);
        CtoF=findViewById(R.id.CtoF);
        Converttmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(entertmp.getText().toString().isEmpty()){
                    anstmp.setText("Kindly Enter Temperature");
                }
                else
                {
                    x=Double.parseDouble(String.valueOf(entertmp.getText()));
                    if(CtoF.isChecked()){
                        x=(x*9)/5+32;
                        x=Double.parseDouble(new DecimalFormat("##.####").format(x));
                        anstmp.setText(String.valueOf(x)+" Degree F");
                    }
                    else if(FtoC.isChecked()){
                        x=(x-32)*5/9;
                        x=Double.parseDouble(new DecimalFormat("##.####").format(x));
                        anstmp.setText(String.valueOf(x)+" Degree C");
                    }
                    else
                    {
                        entertmp.setText("Kindly select any one option");
                    }
                }

            }
        });

    }
}