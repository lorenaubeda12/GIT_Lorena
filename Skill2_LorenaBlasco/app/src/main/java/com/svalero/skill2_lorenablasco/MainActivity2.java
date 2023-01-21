package com.svalero.skill2_lorenablasco;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    Button btnAnonimo, btnImplements, btnOnclick2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnAnonimo = findViewById(R.id.ANONIMA);
        btnImplements = findViewById(R.id.IMPLEMENTS);
        btnOnclick2 = findViewById(R.id.ONCLICK2);
        btnImplements.setOnClickListener(this::onClick);

        //Clase anonima

        btnAnonimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Desde la anonima", Toast.LENGTH_SHORT).show();
            }
        });


    }

    //IMPLEMENTANDO LA INTERFACE VIEW.ONCLICKLISTENER
    @Override
    public void onClick(View v) {
        if (v.getId() == btnImplements.getId()) {
            Toast.makeText(MainActivity2.this, "Desde el onclick del implements", Toast.LENGTH_SHORT).show();

        }
        if (v.getId() == btnOnclick2.getId()) {
            Toast.makeText(MainActivity2.this, "Desde el metodo onclick del implements", Toast.LENGTH_SHORT).show();
        }

      /* switch (v.getId()){
            case R.id.IMPLEMENTS:
                Toast.makeText(MainActivity2.this, "Desde el onclick del implements", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ANONIMA:
                Toast.makeText(MainActivity2.this, "Desde la anonima", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ONCLICK2:
                Toast.makeText(MainActivity2.this, "Desde el metodo onclick del implements", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ONCLICK:
                Toast.makeText(MainActivity2.this, "Desde el metodo onclick", Toast.LENGTH_SHORT).show();
                break;
        }*/
    }

    public void eventoBoton(View view) {
        Toast.makeText(MainActivity2.this, "Desde el metodo onclick", Toast.LENGTH_SHORT).show();
    }

}