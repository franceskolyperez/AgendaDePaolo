package com.franceskoly.agendadepaolo.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.franceskoly.agendadepaolo.R;
import com.franceskoly.agendadepaolo.ui.PersonaActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnPersona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configVista();
    }

    private void configVista() {
        btnPersona = findViewById(R.id.Actividad_btnPersona);
        btnPersona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), PersonaActivity.class));
            }
        });
    }
}
