package com.example.checkbox2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etnValor1, etnValor2;
    private TextView tvResultado;
    private CheckBox chkSumar, chkRestar, chkMultiplicar, chkDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnValor1= findViewById(R.id.etn_valor1);
        etnValor2= findViewById(R.id.etn_valor2);
        tvResultado=findViewById(R.id.tv_resultado);
        chkSumar=findViewById(R.id.chk_sumar);
        chkRestar=findViewById(R.id.chk_restar);
        chkMultiplicar=findViewById(R.id.chk_multiplicar);
        chkDividir=findViewById(R.id.chk_dividir);
    }

    public void operacion (View view){

        float n1 = Float.parseFloat(etnValor1.getText().toString());
        float n2 = Float.parseFloat(etnValor2.getText().toString());
        String resultado="";

        if (chkSumar.isChecked()==true){
            float sum = n1+n2;
            resultado="La suma es: "+sum;
        }
        if (chkRestar.isChecked()==true){
            float res = n1-n2;
            resultado=resultado+"  La resta es: "+res;
        }
        if (chkMultiplicar.isChecked()==true){
            float mul = n1*n2;
            resultado=resultado+"  La multiplicacion es: "+mul;
        }
        if (chkDividir.isChecked()==true){
            float div = n1/n2;
            resultado=resultado+"  La division es: "+div;
        }

        tvResultado.setText(resultado);

    }
}