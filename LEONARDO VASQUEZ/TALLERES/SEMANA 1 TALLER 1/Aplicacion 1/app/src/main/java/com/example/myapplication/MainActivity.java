package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etn_valor1, etn_valor2;
    private TextView tv_resultado;
    private RadioButton rbSumar, rbRestar, rbMultiplicar, rbDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etn_valor1 = findViewById(R.id.etn_valor1);
        etn_valor2 = findViewById(R.id.etn_valor2);
        tv_resultado = findViewById(R.id.tv_resultado);

    }

    public void sumar (View view){

        String valor1 = etn_valor1.getText().toString();
        String valor2 = etn_valor2.getText().toString();
        float n1 = Float.parseFloat(valor1);
        float n2 = Float.parseFloat(valor2);

        float sum = n1+n2;

        String resul = String.valueOf(sum);
        tv_resultado.setText(resul);

    }

    public void restar (View view){

        String valor1 = etn_valor1.getText().toString();
        String valor2 = etn_valor2.getText().toString();
        float n1 = Float.parseFloat(valor1);
        float n2 = Float.parseFloat(valor2);

        float res = n1-n2;

        String resul = String.valueOf(res);
        tv_resultado.setText(resul);

    }

    public void multiplicar (View view){

        String valor1 = etn_valor1.getText().toString();
        String valor2 = etn_valor2.getText().toString();
        float n1 = Float.parseFloat(valor1);
        float n2 = Float.parseFloat(valor2);

        float mul = n1*n2;

        String resul = String.valueOf(mul);
        tv_resultado.setText(resul);

    }

    public void dividir (View view){

        String valor1 = etn_valor1.getText().toString();
        String valor2 = etn_valor2.getText().toString();
        float n1 = Float.parseFloat(valor1);
        float n2 = Float.parseFloat(valor2);

        float div = n1/n2;

        String resul = String.valueOf(div);
        tv_resultado.setText(resul);

    }
}