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
        String[] strNotas = {
                num_ad.getText().toString(),
                num_di.getText().toString(),
                num_pw.getText().toString(),
                num_e.getText().toString()
        };

        Double[] notas = new Double[strNotas.length];
        int i = 0;
        double res = 0;

        for(String n : strNotas){
            if(n.isEmpty()){
                Toast.makeText(this, "ERROR: Debes rellenar todos los campos", Toast.LENGTH_LONG).show();
                return;
            } else {
                notas[i]=Double.parseDouble(n);
                res += notas[i]/strNotas.length;
                i++;
            }
        }

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