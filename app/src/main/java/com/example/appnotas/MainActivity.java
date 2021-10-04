package com.example.appnotas;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txt_res;
    private EditText num_ad, num_di, num_pw, num_e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_res = (TextView) findViewById(R.id.txt_res);
        num_ad = (EditText) findViewById(R.id.num_ad);
        num_di = (EditText) findViewById(R.id.num_di);
        num_pw = (EditText) findViewById(R.id.num_pw);
        num_e = (EditText) findViewById(R.id.num_e);

    }

    public void evaluar(View vista){
        double n1 = Double.parseDouble(num_ad.getText().toString());
        double n2 = Double.parseDouble(num_di.getText().toString());
        double n3 = Double.parseDouble(num_pw.getText().toString());
        double n4 = Double.parseDouble(num_e.getText().toString());

        double res = (n1+n2+n3+n4)/4;

        if(res>=5 && res<=10){
            txt_res.setText("APROBADO");
            txt_res.setTextColor(Color.GREEN);
        } else if(res<5 && res>=0){
            txt_res.setText("SUSPENSO");
            txt_res.setTextColor(Color.RED);
        } else {
            Toast.makeText(this, "Error en la media", Toast.LENGTH_LONG).show();
        }
    }

}