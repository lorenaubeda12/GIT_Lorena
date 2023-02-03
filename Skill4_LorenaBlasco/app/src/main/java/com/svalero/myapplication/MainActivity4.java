package com.svalero.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    TextView texto;
    EditText campoNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videos39al42);

        campoNombre = (EditText) findViewById(R.id.campoNombre);
        texto = (TextView) findViewById(R.id.etiquetaNombre);
    }

    public void evento(View view) {
        switch (view.getId()) {
            case R.id.button3:
                String nombre = campoNombre.getText().toString();
                texto.setText("Bienvenido: " + nombre);
                Toast.makeText(this, "El nombre es: " + nombre, Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                //Intent intencion para llamar otros objectos (Donde estoy, donde quiero ir)
                Intent miIntent = new Intent(MainActivity4.this, MainActivity5.class);
                //Objeto Bundle para enviar datos
                Bundle miBundle = new Bundle();
                miBundle.putString("NOMBRE", campoNombre.getText().toString());

                //Añadir el objeto Bundle al Intent ya que hace de puente para enviar este objeto
                miIntent.putExtras(miBundle);
                startActivity(miIntent);
                break;
        }
    }
}
