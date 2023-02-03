package com.svalero.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    public static final String TAG = "Seguimiento";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video37);

        //Log informacion
        Log.i("INFO", "Valor información");
        //Log debug
        Log.d("DEBUG", "Valor debug");
        //Log error
        Log.e("ERROR", "Valor error");
        //Log warning
        Log.w("WARNING", "Valor warning");
        //Log verbose(PINTA MENSAJES)
        Log.v("VERBOSE", "Valor verbose");
        //Log custom
        Log.i("TAG", "Valor SEGUIMIENTO1");
        Log.i("TAG", "Valor SEGUIMIENTO2");
        Log.i("TAG", "Valor SEGUIMIENTO3");

    }
}
