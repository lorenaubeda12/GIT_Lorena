package com.svalero.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    TextView texto, estado;
    EditText campoNombre;
    Spinner comboDias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.videos39al42);

        campoNombre = (EditText) findViewById(R.id.campoNombre);
        texto = (TextView) findViewById(R.id.etiquetaNombre);

        //Spinner relleno con array de strings simple
        estado = (TextView) findViewById(R.id.texto8);
        comboDias = (Spinner) findViewById(R.id.spinner1);

/*

        //Traer datos de opciones.xml que contiene los valores que iran dentro del spinner(primero array y despues el tipo de elemento que es spinner)
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.combo_dias, android.R.layout.simple_spinner_item);
        comboDias.setAdapter(adapter);

        //Añadir un evento al spinner para que cuando se seleccione un elemento se muestre en el TextView(Array simple)
        comboDias.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(), "Seleccionado: " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
                String mensaje = getString(R.string.mensaje);
                estado.setText(mensaje + parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                estado.setText("No se ha seleccionado nada");
            }


        });*/


      /*  //Spinner relleno con arrayList
        ArrayList<String> listaComboDias = new ArrayList<String>();
        listaComboDias.add("Seleccion:");
        listaComboDias.add("Lunes");
        listaComboDias.add("Martes");
        listaComboDias.add("Miércoles");
        listaComboDias.add("Jueves");
        listaComboDias.add("Viernes");
        listaComboDias.add("Sábado");
        listaComboDias.add("Domingo");



        //Traer datos del arrayList de arriba contiene los valores que iran dentro del spinner(primero nuesta posicion, lo que vamos a rellenar y el array que usaremos)
        ArrayAdapter<CharSequence> adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, listaComboDias);
        comboDias.setAdapter(adapter2);

        //Añadir un evento al spinner para que cuando se seleccione un elemento se muestre en el TextView(ArrayList)
        comboDias.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(), "Seleccionado: " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
                String mensaje = getString(R.string.mensaje);
                estado.setText(mensaje + parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                estado.setText("No se ha seleccionado nada");
            }


        });*/


        //Spinner relleno con simulacion de db
        ArrayList<String> comboDiasList = new ArrayList<String>();
        comboDiasList.add("Haz tu selección:");
        //Rellenar el array con los datos
        for (int i = 0; i < 10; i++) {
            comboDiasList.add("Opción " + i);
        }
        //Traer datos del arrayList de arriba contiene los valores que iran dentro del spinner(primero nuesta posicion, lo que vamos a rellenar y el array que usaremos)
        ArrayAdapter<CharSequence> adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, comboDiasList);
        comboDias.setAdapter(adapter2);

        //Añadir un evento al spinner para que cuando se seleccione un elemento se muestre en el TextView(ArrayList)
        comboDias.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(), "Seleccionado: " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
                String mensaje = getString(R.string.mensaje);
                estado.setText(mensaje + parent.getItemAtPosition(position).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                estado.setText("No se ha seleccionado nada");
            }


        });
    }

    public void evento(View view) {
        switch (view.getId()) {
            case R.id.button3:
                String nombre = campoNombre.getText().toString();
                String saludo = getString(R.string.Bienvenido);
                texto.setText(saludo + nombre);
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
