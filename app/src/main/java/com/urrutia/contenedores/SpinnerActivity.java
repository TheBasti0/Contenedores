package com.urrutia.contenedores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {

    Spinner spinner_Xml, spinner_Java;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);


        spinner_Xml = findViewById(R.id.spinner_Xml);
        spinner_Java = findViewById(R.id.spinner_Java);

        ArrayAdapter<CharSequence> adaptador =
                ArrayAdapter.createFromResource(SpinnerActivity.this,R.array.planets_array,
                        android.R.layout.simple_spinner_item);

        spinner_Xml.setAdapter(adaptador);

        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Santiago");
        ciudades.add("Concepcion");
        ciudades.add("Temuco");

        ArrayAdapter<String> adaptador2 = new ArrayAdapter<>(SpinnerActivity.this,
                android.R.layout.simple_spinner_item,ciudades);

        spinner_Java.setAdapter(adaptador2);

    }
}