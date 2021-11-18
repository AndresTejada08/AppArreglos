package com.example.apparreglos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {

    Button bttnDistrito, bttnAnexos, bttnAtras;
    Spinner spSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        bttnDistrito = (Button) findViewById(R.id.bttn_distritos);
        bttnAnexos = (Button) findViewById(R.id.bttn_anexos);
        bttnAtras = (Button) findViewById(R.id.bttn_atras);
        spSpinner = (Spinner) findViewById(R.id.sp_spinner);

        bttnDistrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(MainActivity2.this, R.array.distritos, android.R.layout.simple_list_item_1);
                spSpinner.setAdapter(adapter);
            }
        });

        bttnAnexos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(MainActivity2.this, R.array.anexos, android.R.layout.simple_list_item_1);
                spSpinner.setAdapter(adapter);
            }
        });

        bttnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento1 = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intento1);
            }
        });
    }
}