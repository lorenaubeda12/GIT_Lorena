package com.svalero.skill2_lorenablasco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Toast.makeText(getApplicationContext(), "Hola esto es un toast", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), "Hola esto es un toast2", Toast.LENGTH_LONG).show();

    }
}