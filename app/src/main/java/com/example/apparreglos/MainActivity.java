package com.example.apparreglos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Button bttnPaises, bttnDepartamentos, bttnSiguiente;
    ListView lvVista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bttnPaises = (Button) findViewById(R.id.bttn_distritos);
        bttnDepartamentos = (Button) findViewById(R.id.bttn_anexos);
        bttnSiguiente = (Button) findViewById(R.id.bttn_siguiente);
        lvVista = (ListView) findViewById(R.id.lv_vista);

        bttnPaises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(MainActivity.this, R.array.paises, android.R.layout.simple_list_item_1);
                lvVista.setAdapter(adapter);
            }
        });

        bttnDepartamentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(MainActivity.this, R.array.departamentos, android.R.layout.simple_list_item_1);
                lvVista.setAdapter(adapter);
            }
        });

        bttnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento1 = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intento1);
            }
        });
    }
}