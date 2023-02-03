package com.svalero.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText campo1, campo2, campo3;
    TextView etiqueta1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video32);
        setContentView(R.layout.video33al36);

        etiqueta1 = (TextView) findViewById(R.id.texto);
        campo1 = (EditText) findViewById(R.id.edt1);
        campo2 = (EditText) findViewById(R.id.edt2);
        campo3 = (EditText) findViewById(R.id.edt3);;

    }

    public void onclick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                obtenerInfo();
                break;


        }
    }


    private void obtenerInfo() {
        int numero1 = Integer.parseInt(campo1.getText().toString());
        String pass = campo2.getText().toString();
        String parrafo = campo3.getText().toString();
        Toast.makeText(getApplicationContext(), "Dato numerico:" + numero1, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Dato password:" + pass, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Dato parrafo:" + parrafo, Toast.LENGTH_SHORT).show();
    }


}