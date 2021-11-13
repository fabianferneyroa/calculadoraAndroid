package com.veterinaria.calculadorabotones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,bcero,bSuma,bIgual;
    private TextView txvRes;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b5=findViewById(R.id.btn5);
        b6=findViewById(R.id.btn6);
        b7=findViewById(R.id.btn7);
        b8=findViewById(R.id.btn8);
        b9=findViewById(R.id.btn9);
        bcero=findViewById(R.id.btnCero);
        bSuma=findViewById(R.id.btnSumar);
        bIgual=findViewById(R.id.btnIgual);
        txvRes=findViewById(R.id.textView2);


        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        bcero.setOnClickListener(this);
        bSuma.setOnClickListener(this);
        bIgual.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btn1:
                txvRes.setText(txvRes.getText()+"1");
                break;
            case R.id.btn2:
                txvRes.setText(txvRes.getText()+"2");
                break;
            case R.id.btn3:
                txvRes.setText(txvRes.getText()+"3");
                break;
            case R.id.btn4:
                txvRes.setText(txvRes.getText()+"4");
                break;
            case R.id.btn5:
                txvRes.setText(txvRes.getText()+"5");
                break;
            case R.id.btn6:
                txvRes.setText(txvRes.getText()+"6");
                break;
            case R.id.btn7:
                txvRes.setText(txvRes.getText()+"7");
                break;
            case R.id.btn8:
                txvRes.setText(txvRes.getText()+"8");
                break;
            case R.id.btn9:
                txvRes.setText(txvRes.getText()+"9");
                break;
            case R.id.btnCero:
                txvRes.setText(txvRes.getText()+"0");
                break;
            case R.id.btnSumar:
                txvRes.setText(txvRes.getText()+"+");
                break;
            case R.id.btnIgual:
                txvRes.setText(sumar(txvRes.getText().toString()));
                break;
        }


    }


    public String sumar(String operacion){
        int resul=0;

        String[]digitos= operacion.split("\\+");

        for (int i=0; i<digitos.length;i++){
            int num=Integer.parseInt(digitos[i]);
            resul=resul+num;
        }

        String suma=""+resul;

        return suma;
    }



} // cierre de la clase