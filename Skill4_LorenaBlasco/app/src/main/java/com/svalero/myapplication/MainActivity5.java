package com.svalero.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    TextView mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mensaje);
        mensaje = (TextView) findViewById(R.id.texto7);


        //Obtener dato enviado desde el Intent
        Bundle miBundle = this.getIntent().getExtras();
        if (miBundle != null) {
            //Recuperar el dato enviado
            String nombre = miBundle.getString("NOMBRE");
            mensaje.setText("Bienvendio: " + nombre);
        }
    }

    public void onClick(View view) {
        finish();
    }
}