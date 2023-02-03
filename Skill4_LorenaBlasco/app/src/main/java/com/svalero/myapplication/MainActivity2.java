package com.svalero.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    CheckBox checkBox1, checkBox2;
    RadioButton radioButton1, radioButton2;
    ToggleButton toggleButton;
    Switch switch1;
    TextView estado;
    TextView estado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video33al36);

        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        toggleButton = (ToggleButton) findViewById(R.id.tB1);
        estado = (TextView) findViewById(R.id.texto4);
        estado2 = (TextView) findViewById(R.id.texto5);
        switch1 = (Switch) findViewById(R.id.switch1);

    }

    public void onclick(View view) {
        if (view.getId() == R.id.button2) {
            validacion();
        }
        if (view.getId() == R.id.tB1) {
            if (toggleButton.isChecked() == true) {
                estado.setText("Boton Encendido");
            } else {
                estado.setText("Boton Apagado");
            }

        }
        if (view.getId() == R.id.switch1) {
            if (switch1.isChecked() == true) {
                estado2.setText("Switch activo");
            } else {
                estado2.setText("Switch inactivo");
            }
        }
    }


    private void validacion() {
        String cadena = "Seleccionado: ";
        if (checkBox1.isChecked() == true) {
            cadena += "opcion1";
        }
        if (checkBox2.isChecked() == true) {
            cadena += "opcion2";
        }
        String cadena2 = "Seleccionado: ";
        if (radioButton1.isChecked() == true) {
            cadena2 += "opcion1RB";
        }
        if (radioButton2.isChecked() == true) {
            cadena2 += "opcion2RB";
        }
        Toast.makeText(getApplicationContext(), cadena, Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), cadena2, Toast.LENGTH_SHORT).show();
    }


}
